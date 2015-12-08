.class public Lcom/thetransitapp/droid/data/BaseOnlineSource;
.super Ljava/lang/Object;
.source "BaseOnlineSource.java"


# static fields
.field private static final DEBUG_API_ENDPOINT:Ljava/lang/String;


# instance fields
.field private baseURL:Ljava/lang/String;
    .annotation runtime Lroboguice/inject/InjectResource;
        value = 0x7f0a0066
    .end annotation
.end field

.field private buildNumber:Ljava/lang/String;
    .annotation runtime Lroboguice/inject/InjectResource;
        value = 0x7f0a002c
    .end annotation
.end field

.field private databaseHelper:Lcom/thetransitapp/droid/data/TransitDatabaseHelper;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private feedManager:Lcom/thetransitapp/droid/controller/FeedManager;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private lastURL:Ljava/lang/String;

.field private final withCredentails:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 33
    const/4 v0, 0x0

    sput-object v0, Lcom/thetransitapp/droid/data/BaseOnlineSource;->DEBUG_API_ENDPOINT:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0
    .param p1, "withCredentails"    # Z

    .prologue
    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    iput-boolean p1, p0, Lcom/thetransitapp/droid/data/BaseOnlineSource;->withCredentails:Z

    .line 52
    return-void
.end method


# virtual methods
.method protected execute(Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 2
    .param p1, "url"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 105
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lcom/thetransitapp/droid/data/BaseOnlineSource;->execute(Ljava/lang/String;Ljava/lang/String;I)Lorg/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method protected execute(Ljava/lang/String;Ljava/lang/String;I)Lorg/json/JSONObject;
    .locals 12
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "cacheKey"    # Ljava/lang/String;
    .param p3, "count"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 109
    const/4 v8, 0x0

    .line 111
    .local v8, "result":Ljava/lang/String;
    if-eqz p2, :cond_0

    .line 112
    iget-object v9, p0, Lcom/thetransitapp/droid/data/BaseOnlineSource;->databaseHelper:Lcom/thetransitapp/droid/data/TransitDatabaseHelper;

    invoke-virtual {v9, p2}, Lcom/thetransitapp/droid/data/TransitDatabaseHelper;->getCache(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 115
    :cond_0
    if-nez v8, :cond_6

    .line 116
    iput-object p1, p0, Lcom/thetransitapp/droid/data/BaseOnlineSource;->lastURL:Ljava/lang/String;

    .line 117
    const-string v9, "Calling URL"

    invoke-static {v9, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 118
    new-instance v7, Lorg/apache/http/client/methods/HttpGet;

    invoke-direct {v7, p1}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V

    .line 120
    .local v7, "request":Lorg/apache/http/client/methods/HttpGet;
    iget-boolean v9, p0, Lcom/thetransitapp/droid/data/BaseOnlineSource;->withCredentails:Z

    if-eqz v9, :cond_1

    .line 121
    const-string v9, "Authorization"

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "Basic "

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/thetransitapp/droid/data/BaseOnlineSource;->getAuth()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v7, v9, v10}, Lorg/apache/http/client/methods/HttpGet;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    :cond_1
    invoke-virtual {p0}, Lcom/thetransitapp/droid/data/BaseOnlineSource;->getUserAgent()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Landroid/net/http/AndroidHttpClient;->newInstance(Ljava/lang/String;)Landroid/net/http/AndroidHttpClient;

    move-result-object v0

    .line 125
    .local v0, "client":Landroid/net/http/AndroidHttpClient;
    invoke-static {v7}, Landroid/net/http/AndroidHttpClient;->modifyRequestToAcceptGzipResponse(Lorg/apache/http/HttpRequest;)V

    .line 128
    :try_start_0
    invoke-virtual {v0, v7}, Landroid/net/http/AndroidHttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v5

    .line 129
    .local v5, "httpResponse":Lorg/apache/http/HttpResponse;
    invoke-interface {v5}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v9

    invoke-interface {v9}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v1

    .line 131
    .local v1, "code":I
    const/16 v9, 0x12c

    if-lt v1, v9, :cond_4

    const/16 v9, 0x190

    if-ge v1, v9, :cond_4

    .line 132
    invoke-virtual {v0}, Landroid/net/http/AndroidHttpClient;->close()V

    .line 134
    const/4 v9, 0x5

    if-le p3, v9, :cond_3

    .line 135
    new-instance v9, Lorg/apache/http/HttpException;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v11

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v11, " infinite redirect"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v9, v10}, Lorg/apache/http/HttpException;-><init>(Ljava/lang/String;)V

    throw v9
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 158
    .end local v1    # "code":I
    .end local v5    # "httpResponse":Lorg/apache/http/HttpResponse;
    :catch_0
    move-exception v3

    .line 159
    .local v3, "e":Ljava/lang/Exception;
    :goto_0
    if-eqz v0, :cond_2

    .line 160
    invoke-virtual {v0}, Landroid/net/http/AndroidHttpClient;->close()V

    .line 163
    :cond_2
    throw v3

    .line 137
    .end local v3    # "e":Ljava/lang/Exception;
    .restart local v1    # "code":I
    .restart local v5    # "httpResponse":Lorg/apache/http/HttpResponse;
    :cond_3
    :try_start_1
    const-string v9, "Location"

    invoke-interface {v5, v9}, Lorg/apache/http/HttpResponse;->getFirstHeader(Ljava/lang/String;)Lorg/apache/http/Header;

    move-result-object v9

    invoke-interface {v9}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v9

    add-int/lit8 v2, p3, 0x1

    .end local p3    # "count":I
    .local v2, "count":I
    :try_start_2
    invoke-virtual {p0, v9, p2, p3}, Lcom/thetransitapp/droid/data/BaseOnlineSource;->execute(Ljava/lang/String;Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    move-result-object v9

    move p3, v2

    .line 173
    .end local v0    # "client":Landroid/net/http/AndroidHttpClient;
    .end local v1    # "code":I
    .end local v2    # "count":I
    .end local v5    # "httpResponse":Lorg/apache/http/HttpResponse;
    .end local v7    # "request":Lorg/apache/http/client/methods/HttpGet;
    .restart local p3    # "count":I
    :goto_1
    return-object v9

    .line 139
    .restart local v0    # "client":Landroid/net/http/AndroidHttpClient;
    .restart local v1    # "code":I
    .restart local v5    # "httpResponse":Lorg/apache/http/HttpResponse;
    .restart local v7    # "request":Lorg/apache/http/client/methods/HttpGet;
    :cond_4
    const/16 v9, 0x190

    if-lt v1, v9, :cond_5

    .line 140
    :try_start_3
    invoke-virtual {v0}, Landroid/net/http/AndroidHttpClient;->close()V

    .line 142
    new-instance v9, Lorg/apache/http/HttpException;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v11

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v9, v10}, Lorg/apache/http/HttpException;-><init>(Ljava/lang/String;)V

    throw v9

    .line 145
    :cond_5
    invoke-interface {v5}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v4

    .line 147
    .local v4, "entity":Lorg/apache/http/HttpEntity;
    if-eqz v4, :cond_6

    .line 149
    invoke-static {v4}, Landroid/net/http/AndroidHttpClient;->getUngzippedContent(Lorg/apache/http/HttpEntity;)Ljava/io/InputStream;

    move-result-object v6

    .line 150
    .local v6, "instream":Ljava/io/InputStream;
    invoke-static {v6}, Lcom/thetransitapp/droid/util/ServiceUtility;->convertStreamToString(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v8

    .line 151
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V

    .line 152
    invoke-virtual {v0}, Landroid/net/http/AndroidHttpClient;->close()V

    .line 154
    if-eqz p2, :cond_6

    .line 155
    iget-object v9, p0, Lcom/thetransitapp/droid/data/BaseOnlineSource;->databaseHelper:Lcom/thetransitapp/droid/data/TransitDatabaseHelper;

    invoke-virtual {v9, p2, v8}, Lcom/thetransitapp/droid/data/TransitDatabaseHelper;->saveCache(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 168
    .end local v0    # "client":Landroid/net/http/AndroidHttpClient;
    .end local v1    # "code":I
    .end local v4    # "entity":Lorg/apache/http/HttpEntity;
    .end local v5    # "httpResponse":Lorg/apache/http/HttpResponse;
    .end local v6    # "instream":Ljava/io/InputStream;
    .end local v7    # "request":Lorg/apache/http/client/methods/HttpGet;
    :cond_6
    :try_start_4
    new-instance v9, Lorg/json/JSONObject;

    invoke-direct {v9, v8}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_1

    .line 169
    :catch_1
    move-exception v3

    .line 170
    .local v3, "e":Lorg/json/JSONException;
    const-string v9, "BaseOnlineSource"

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "Fail to parse JSON at "

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v11, p0, Lcom/thetransitapp/droid/data/BaseOnlineSource;->lastURL:Ljava/lang/String;

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 173
    new-instance v9, Lorg/json/JSONObject;

    invoke-direct {v9}, Lorg/json/JSONObject;-><init>()V

    goto :goto_1

    .line 158
    .end local v3    # "e":Lorg/json/JSONException;
    .end local p3    # "count":I
    .restart local v0    # "client":Landroid/net/http/AndroidHttpClient;
    .restart local v1    # "code":I
    .restart local v2    # "count":I
    .restart local v5    # "httpResponse":Lorg/apache/http/HttpResponse;
    .restart local v7    # "request":Lorg/apache/http/client/methods/HttpGet;
    :catch_2
    move-exception v3

    move p3, v2

    .end local v2    # "count":I
    .restart local p3    # "count":I
    goto :goto_0
.end method

.method public getAuth()Ljava/lang/String;
    .locals 4

    .prologue
    .line 185
    const-string v1, ""

    .line 187
    .local v1, "userName":Ljava/lang/String;
    invoke-static {}, Lorg/OpenUDID/OpenUDID_manager;->isInitialized()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 188
    invoke-static {}, Lorg/OpenUDID/OpenUDID_manager;->getOpenUDID()Ljava/lang/String;

    move-result-object v1

    .line 191
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v3, ":"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "DT0xK3QnVf2T9I4PSv0k"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 192
    .local v0, "credentials":Ljava/lang/String;
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v2

    const/4 v3, 0x2

    invoke-static {v2, v3}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v2

    return-object v2
.end method

.method public getBannedTransitParameters(Z)Ljava/lang/String;
    .locals 1
    .param p1, "forNearbyRequest"    # Z

    .prologue
    .line 89
    iget-object v0, p0, Lcom/thetransitapp/droid/data/BaseOnlineSource;->feedManager:Lcom/thetransitapp/droid/controller/FeedManager;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/controller/FeedManager;->isReady()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 90
    iget-object v0, p0, Lcom/thetransitapp/droid/data/BaseOnlineSource;->feedManager:Lcom/thetransitapp/droid/controller/FeedManager;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/controller/FeedManager;->getClosestBundle()Lcom/thetransitapp/droid/model/TransitBundle;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/thetransitapp/droid/model/TransitBundle;->getBannedTransitParameters(Z)Ljava/lang/String;

    move-result-object v0

    .line 93
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getBaseURL(ZLcom/google/android/gms/maps/model/LatLng;)Ljava/lang/String;
    .locals 6
    .param p1, "planner"    # Z
    .param p2, "location"    # Lcom/google/android/gms/maps/model/LatLng;

    .prologue
    .line 55
    sget-object v4, Lcom/thetransitapp/droid/data/BaseOnlineSource;->DEBUG_API_ENDPOINT:Ljava/lang/String;

    if-eqz v4, :cond_0

    .line 56
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "http://"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v5, Lcom/thetransitapp/droid/data/BaseOnlineSource;->DEBUG_API_ENDPOINT:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 85
    :goto_0
    return-object v3

    .line 58
    :cond_0
    const/4 v0, 0x0

    .line 60
    .local v0, "bundle":Lcom/thetransitapp/droid/model/TransitBundle;
    if-nez p2, :cond_1

    .line 61
    iget-object v4, p0, Lcom/thetransitapp/droid/data/BaseOnlineSource;->feedManager:Lcom/thetransitapp/droid/controller/FeedManager;

    invoke-virtual {v4}, Lcom/thetransitapp/droid/controller/FeedManager;->getClosestBundle()Lcom/thetransitapp/droid/model/TransitBundle;

    move-result-object v0

    .line 69
    :goto_1
    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/TransitBundle;->getServer()Lcom/thetransitapp/droid/model/TransitServer;

    move-result-object v4

    if-eqz v4, :cond_5

    .line 70
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/TransitBundle;->getServer()Lcom/thetransitapp/droid/model/TransitServer;

    move-result-object v2

    .line 71
    .local v2, "server":Lcom/thetransitapp/droid/model/TransitServer;
    const-string v3, "http://"

    .line 73
    .local v3, "url":Ljava/lang/String;
    if-eqz v2, :cond_5

    .line 74
    if-eqz p1, :cond_3

    .line 75
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/TransitServer;->getPlannerRegion()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/TransitServer;->getPlannerRegion()Ljava/lang/String;

    move-result-object v4

    :goto_2
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 80
    :goto_3
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v5, ".thetransitapp.com"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 81
    goto :goto_0

    .line 63
    .end local v2    # "server":Lcom/thetransitapp/droid/model/TransitServer;
    .end local v3    # "url":Ljava/lang/String;
    :cond_1
    new-instance v1, Landroid/location/Location;

    const-string v4, "Transit"

    invoke-direct {v1, v4}, Landroid/location/Location;-><init>(Ljava/lang/String;)V

    .line 64
    .local v1, "bundleLocation":Landroid/location/Location;
    iget-wide v4, p2, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    invoke-virtual {v1, v4, v5}, Landroid/location/Location;->setLatitude(D)V

    .line 65
    iget-wide v4, p2, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    invoke-virtual {v1, v4, v5}, Landroid/location/Location;->setLongitude(D)V

    .line 66
    iget-object v4, p0, Lcom/thetransitapp/droid/data/BaseOnlineSource;->feedManager:Lcom/thetransitapp/droid/controller/FeedManager;

    invoke-virtual {v4, v1}, Lcom/thetransitapp/droid/controller/FeedManager;->closestBundleToLocation(Landroid/location/Location;)Lcom/thetransitapp/droid/model/TransitBundle;

    move-result-object v0

    goto :goto_1

    .line 75
    .end local v1    # "bundleLocation":Landroid/location/Location;
    .restart local v2    # "server":Lcom/thetransitapp/droid/model/TransitServer;
    .restart local v3    # "url":Ljava/lang/String;
    :cond_2
    const-string v4, "api"

    goto :goto_2

    .line 77
    :cond_3
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/TransitServer;->getAppRegion()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/TransitServer;->getAppRegion()Ljava/lang/String;

    move-result-object v4

    :goto_4
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_3

    :cond_4
    const-string v4, "api"

    goto :goto_4

    .line 85
    .end local v2    # "server":Lcom/thetransitapp/droid/model/TransitServer;
    .end local v3    # "url":Ljava/lang/String;
    :cond_5
    iget-object v3, p0, Lcom/thetransitapp/droid/data/BaseOnlineSource;->baseURL:Ljava/lang/String;

    goto/16 :goto_0
.end method

.method public getFeed(Lcom/thetransitapp/droid/model/Route;)Lcom/thetransitapp/droid/model/Feed;
    .locals 1
    .param p1, "route"    # Lcom/thetransitapp/droid/model/Route;

    .prologue
    .line 97
    iget-object v0, p0, Lcom/thetransitapp/droid/data/BaseOnlineSource;->feedManager:Lcom/thetransitapp/droid/controller/FeedManager;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/controller/FeedManager;->isReady()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 98
    iget-object v0, p0, Lcom/thetransitapp/droid/data/BaseOnlineSource;->feedManager:Lcom/thetransitapp/droid/controller/FeedManager;

    invoke-virtual {v0, p1}, Lcom/thetransitapp/droid/controller/FeedManager;->getFeed(Lcom/thetransitapp/droid/model/Route;)Lcom/thetransitapp/droid/model/Feed;

    move-result-object v0

    .line 101
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getLastURL()Ljava/lang/String;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/thetransitapp/droid/data/BaseOnlineSource;->lastURL:Ljava/lang/String;

    return-object v0
.end method

.method public getUserAgent()Ljava/lang/String;
    .locals 5

    .prologue
    .line 177
    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 178
    .local v1, "osVersion":Ljava/lang/String;
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 180
    .local v0, "model":Ljava/lang/String;
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Transit/"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Lcom/thetransitapp/droid/data/BaseOnlineSource;->buildNumber:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " Android/"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 181
    .local v2, "ua":Ljava/lang/String;
    return-object v2
.end method
