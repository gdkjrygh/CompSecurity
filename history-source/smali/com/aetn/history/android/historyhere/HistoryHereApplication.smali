.class public Lcom/aetn/history/android/historyhere/HistoryHereApplication;
.super Landroid/app/Application;
.source "HistoryHereApplication.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/aetn/history/android/historyhere/HistoryHereApplication$GeoAddressLookup;,
        Lcom/aetn/history/android/historyhere/HistoryHereApplication$GeoLookupRequestReceiver;,
        Lcom/aetn/history/android/historyhere/HistoryHereApplication$OnConfigLoadedListener;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String;

.field private static mConfiguration:Lcom/aetn/history/android/historyhere/model/Configuration;

.field public static mCurrentLocation:Landroid/location/Location;


# instance fields
.field configErrorListener:Lcom/android/volley/Response$ErrorListener;

.field configSuccessListener:Lcom/android/volley/Response$Listener;

.field public currentAppVersionName:Ljava/lang/String;

.field private currentSearchFormattedAddress:Ljava/lang/String;

.field private currentSearchLatitude:D

.field private currentSearchLongitude:D

.field private currentSearchString:Ljava/lang/String;

.field public currentlyRequestingPoiData:Z

.field dialog:Landroid/app/ProgressDialog;

.field private geoLookupRequestFilter:Landroid/content/IntentFilter;

.field private geoLookupRequestReceiver:Lcom/aetn/history/android/historyhere/HistoryHereApplication$GeoLookupRequestReceiver;

.field public initedSearch:Z

.field private mConfigLoadedListener:Lcom/aetn/history/android/historyhere/HistoryHereApplication$OnConfigLoadedListener;

.field private mContext:Landroid/content/Context;

.field private preferencesChangedTF:Z

.field public showDetailInMapId:Ljava/lang/String;

.field public showDetailInMapPoiDetail:Lcom/aetn/history/android/historyhere/model/POI;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 46
    const-class v0, Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 42
    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    .line 51
    const-string v0, ""

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->showDetailInMapId:Ljava/lang/String;

    .line 53
    iput-boolean v1, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->initedSearch:Z

    .line 60
    iput-boolean v1, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->preferencesChangedTF:Z

    .line 69
    iput-boolean v1, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->currentlyRequestingPoiData:Z

    .line 76
    const-string v0, ""

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->currentAppVersionName:Ljava/lang/String;

    .line 444
    new-instance v0, Lcom/aetn/history/android/historyhere/HistoryHereApplication$2;

    invoke-direct {v0, p0}, Lcom/aetn/history/android/historyhere/HistoryHereApplication$2;-><init>(Lcom/aetn/history/android/historyhere/HistoryHereApplication;)V

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->configSuccessListener:Lcom/android/volley/Response$Listener;

    .line 464
    new-instance v0, Lcom/aetn/history/android/historyhere/HistoryHereApplication$3;

    invoke-direct {v0, p0}, Lcom/aetn/history/android/historyhere/HistoryHereApplication$3;-><init>(Lcom/aetn/history/android/historyhere/HistoryHereApplication;)V

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->configErrorListener:Lcom/android/volley/Response$ErrorListener;

    return-void
.end method

.method static synthetic access$000(Lcom/aetn/history/android/historyhere/HistoryHereApplication;)Lcom/aetn/history/android/historyhere/HistoryHereApplication$GeoLookupRequestReceiver;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    .prologue
    .line 42
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->geoLookupRequestReceiver:Lcom/aetn/history/android/historyhere/HistoryHereApplication$GeoLookupRequestReceiver;

    return-object v0
.end method

.method static synthetic access$100()Ljava/lang/String;
    .locals 1

    .prologue
    .line 42
    sget-object v0, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->TAG:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$200(Lcom/aetn/history/android/historyhere/HistoryHereApplication;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    .prologue
    .line 42
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->currentSearchString:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$202(Lcom/aetn/history/android/historyhere/HistoryHereApplication;Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/HistoryHereApplication;
    .param p1, "x1"    # Ljava/lang/String;

    .prologue
    .line 42
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->currentSearchString:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$300()Lcom/aetn/history/android/historyhere/model/Configuration;
    .locals 1

    .prologue
    .line 42
    sget-object v0, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->mConfiguration:Lcom/aetn/history/android/historyhere/model/Configuration;

    return-object v0
.end method

.method static synthetic access$302(Lcom/aetn/history/android/historyhere/model/Configuration;)Lcom/aetn/history/android/historyhere/model/Configuration;
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/model/Configuration;

    .prologue
    .line 42
    sput-object p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->mConfiguration:Lcom/aetn/history/android/historyhere/model/Configuration;

    return-object p0
.end method

.method static synthetic access$400(Lcom/aetn/history/android/historyhere/HistoryHereApplication;)Lcom/aetn/history/android/historyhere/HistoryHereApplication$OnConfigLoadedListener;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    .prologue
    .line 42
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->mConfigLoadedListener:Lcom/aetn/history/android/historyhere/HistoryHereApplication$OnConfigLoadedListener;

    return-object v0
.end method

.method public static getConfiguration()Lcom/aetn/history/android/historyhere/model/Configuration;
    .locals 1

    .prologue
    .line 475
    sget-object v0, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->mConfiguration:Lcom/aetn/history/android/historyhere/model/Configuration;

    return-object v0
.end method


# virtual methods
.method public clearAddressBar()V
    .locals 1

    .prologue
    .line 142
    const-string v0, ""

    invoke-virtual {p0, v0}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->setCurrentSearchFormattedAddress(Ljava/lang/String;)V

    .line 143
    return-void
.end method

.method public clearPreviousSearchValues()V
    .locals 3

    .prologue
    .line 137
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->clearAddressBar()V

    .line 138
    sget-object v0, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "clearPreviousSearchValues(): showDetailInMapPoiDetail"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->showDetailInMapPoiDetail:Lcom/aetn/history/android/historyhere/model/POI;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    return-void
.end method

.method createBasicAuthHeader(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;
    .locals 6
    .param p1, "username"    # Ljava/lang/String;
    .param p2, "password"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 435
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 436
    .local v2, "headerMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ":"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 438
    .local v1, "credentials":Ljava/lang/String;
    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v3

    const/4 v4, 0x2

    invoke-static {v3, v4}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v0

    .line 439
    .local v0, "base64EncodedCredentials":Ljava/lang/String;
    const-string v3, "Authorization"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Basic "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 441
    return-object v2
.end method

.method public doGeoLookup(Ljava/lang/String;Landroid/content/Context;)V
    .locals 3
    .param p1, "address"    # Ljava/lang/String;
    .param p2, "context"    # Landroid/content/Context;

    .prologue
    .line 120
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/aetn/history/android/historyhere/utils/ConnectionManager;->isNetworkAvailable(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 121
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->manageConnectionNotAvailable()V

    .line 131
    :goto_0
    return-void

    .line 125
    :cond_0
    new-instance v0, Lcom/aetn/history/android/historyhere/HistoryHereApplication$GeoLookupRequestReceiver;

    invoke-direct {v0, p0}, Lcom/aetn/history/android/historyhere/HistoryHereApplication$GeoLookupRequestReceiver;-><init>(Lcom/aetn/history/android/historyhere/HistoryHereApplication;)V

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->geoLookupRequestReceiver:Lcom/aetn/history/android/historyhere/HistoryHereApplication$GeoLookupRequestReceiver;

    .line 126
    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "geo lookup requested"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->geoLookupRequestFilter:Landroid/content/IntentFilter;

    .line 127
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->geoLookupRequestReceiver:Lcom/aetn/history/android/historyhere/HistoryHereApplication$GeoLookupRequestReceiver;

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->geoLookupRequestFilter:Landroid/content/IntentFilter;

    invoke-virtual {p0, v0, v1}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 129
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0d0066

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p2, v0}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->showMessageBox(Landroid/content/Context;Ljava/lang/String;)V

    .line 130
    new-instance v0, Lcom/aetn/history/android/historyhere/HistoryHereApplication$GeoAddressLookup;

    invoke-direct {v0, p0}, Lcom/aetn/history/android/historyhere/HistoryHereApplication$GeoAddressLookup;-><init>(Lcom/aetn/history/android/historyhere/HistoryHereApplication;)V

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {v0, v1}, Lcom/aetn/history/android/historyhere/HistoryHereApplication$GeoAddressLookup;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0
.end method

.method public doPoiSearch()V
    .locals 10

    .prologue
    const/4 v9, 0x1

    .line 149
    sget-object v0, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->TAG:Ljava/lang/String;

    const-string v7, ">>>>>>>>doPoiSearch"

    invoke-static {v0, v7}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/aetn/history/android/historyhere/utils/ConnectionManager;->isNetworkAvailable(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 152
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->manageConnectionNotAvailable()V

    .line 163
    :goto_0
    return-void

    .line 155
    :cond_0
    iput-boolean v9, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->initedSearch:Z

    .line 156
    iput-boolean v9, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->currentlyRequestingPoiData:Z

    .line 157
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->getCurrentSearchLatitude()D

    move-result-wide v1

    .line 158
    .local v1, "lat":D
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->getCurrentSearchLongitude()D

    move-result-wide v3

    .line 159
    .local v3, "lng":D
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->getRadiusAsMeters()J

    move-result-wide v5

    .line 160
    .local v5, "radius":J
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->getMaxResults()I

    move-result v8

    .line 161
    .local v8, "maxResults":I
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;

    move-result-object v0

    const-string v7, ""

    invoke-virtual/range {v0 .. v8}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getPoiList(DDJLjava/lang/String;I)V

    goto :goto_0
.end method

.method public doPoiSearch(DD)V
    .locals 0
    .param p1, "lat"    # D
    .param p3, "lng"    # D

    .prologue
    .line 167
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->setCurrentSearchLocation(DD)V

    .line 168
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->doPoiSearch()V

    .line 169
    return-void
.end method

.method public getCurrentSearchLatitude()D
    .locals 2

    .prologue
    .line 243
    iget-wide v0, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->currentSearchLatitude:D

    return-wide v0
.end method

.method public getCurrentSearchLongitude()D
    .locals 2

    .prologue
    .line 239
    iget-wide v0, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->currentSearchLongitude:D

    return-wide v0
.end method

.method public getLocalyticsKey()Ljava/lang/String;
    .locals 4

    .prologue
    .line 196
    invoke-static {}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->getConfiguration()Lcom/aetn/history/android/historyhere/model/Configuration;

    move-result-object v1

    iget-object v1, v1, Lcom/aetn/history/android/historyhere/model/Configuration;->localytics:Lcom/aetn/history/android/historyhere/model/Configuration$Localytics;

    iget-object v1, v1, Lcom/aetn/history/android/historyhere/model/Configuration$Localytics;->prod:Lcom/aetn/history/android/historyhere/model/Configuration$Values;

    iget-object v0, v1, Lcom/aetn/history/android/historyhere/model/Configuration$Values;->appID:Ljava/lang/String;

    .line 197
    .local v0, "key":Ljava/lang/String;
    sget-object v1, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getLocalyticsKey:dev:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->getConfiguration()Lcom/aetn/history/android/historyhere/model/Configuration;

    move-result-object v3

    iget-object v3, v3, Lcom/aetn/history/android/historyhere/model/Configuration;->localytics:Lcom/aetn/history/android/historyhere/model/Configuration$Localytics;

    iget-object v3, v3, Lcom/aetn/history/android/historyhere/model/Configuration$Localytics;->dev:Lcom/aetn/history/android/historyhere/model/Configuration$Values;

    iget-object v3, v3, Lcom/aetn/history/android/historyhere/model/Configuration$Values;->appID:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 198
    sget-object v1, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getLocalyticsKey:prod:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->getConfiguration()Lcom/aetn/history/android/historyhere/model/Configuration;

    move-result-object v3

    iget-object v3, v3, Lcom/aetn/history/android/historyhere/model/Configuration;->localytics:Lcom/aetn/history/android/historyhere/model/Configuration$Localytics;

    iget-object v3, v3, Lcom/aetn/history/android/historyhere/model/Configuration$Localytics;->prod:Lcom/aetn/history/android/historyhere/model/Configuration$Values;

    iget-object v3, v3, Lcom/aetn/history/android/historyhere/model/Configuration$Values;->appID:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 199
    sget-object v1, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getLocalyticsKey:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 200
    return-object v0
.end method

.method public getMaxResults()I
    .locals 1

    .prologue
    .line 205
    const/16 v0, 0xc8

    return v0
.end method

.method public getRadiusAsMeters()J
    .locals 4

    .prologue
    .line 213
    const/16 v0, 0x32

    .line 214
    .local v0, "radius":I
    sget-object v1, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "the pref for radius is: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 215
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/utils/Utils;->convertMilesToMeters(I)I

    move-result v1

    int-to-long v1, v1

    return-wide v1
.end method

.method public hideMessageBox()V
    .locals 2

    .prologue
    .line 280
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->dialog:Landroid/app/ProgressDialog;

    if-eqz v0, :cond_1

    .line 281
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->dialog:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 282
    sget-object v0, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->TAG:Ljava/lang/String;

    const-string v1, "dismiss the dialog"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 283
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->dialog:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    .line 284
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->dialog:Landroid/app/ProgressDialog;

    .line 289
    :cond_0
    :goto_0
    return-void

    .line 287
    :cond_1
    sget-object v0, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->TAG:Ljava/lang/String;

    const-string v1, "dialog was null or was not showing"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public isOnline()Z
    .locals 5

    .prologue
    .line 185
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->mContext:Landroid/content/Context;

    const-string v3, "connectivity"

    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    .line 186
    .local v0, "cm":Landroid/net/ConnectivityManager;
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v2

    invoke-virtual {v2}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v1, 0x1

    .line 187
    .local v1, "isOnline":Z
    :goto_0
    sget-object v2, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "app.isOnline(): "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 188
    return v1

    .line 186
    .end local v1    # "isOnline":Z
    :cond_0
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public loadConfig(Lcom/aetn/history/android/historyhere/HistoryHereApplication$OnConfigLoadedListener;)V
    .locals 6
    .param p1, "listener"    # Lcom/aetn/history/android/historyhere/HistoryHereApplication$OnConfigLoadedListener;

    .prologue
    .line 397
    invoke-virtual {p0, p1}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->setOnConfigLoadedListener(Lcom/aetn/history/android/historyhere/HistoryHereApplication$OnConfigLoadedListener;)V

    .line 405
    const-string v3, "https://mobile-a.akamaihd.net/configs/historyhere/android/History/3_0/config.json"

    .line 407
    .local v3, "configURL":Ljava/lang/String;
    sget-object v1, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "loadConfig(): load it from here:"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 408
    const/4 v0, 0x0

    .line 411
    .local v0, "stringRequest":Lcom/android/volley/toolbox/StringRequest;
    new-instance v0, Lcom/aetn/history/android/historyhere/HistoryHereApplication$1;

    .end local v0    # "stringRequest":Lcom/android/volley/toolbox/StringRequest;
    const/4 v2, 0x0

    iget-object v4, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->configSuccessListener:Lcom/android/volley/Response$Listener;

    iget-object v5, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->configErrorListener:Lcom/android/volley/Response$ErrorListener;

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/aetn/history/android/historyhere/HistoryHereApplication$1;-><init>(Lcom/aetn/history/android/historyhere/HistoryHereApplication;ILjava/lang/String;Lcom/android/volley/Response$Listener;Lcom/android/volley/Response$ErrorListener;)V

    .line 422
    .restart local v0    # "stringRequest":Lcom/android/volley/toolbox/StringRequest;
    sget-object v1, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->TAG:Ljava/lang/String;

    const-string v2, "loadConfig(): use prod:"

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 428
    sget-object v1, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "loadConfig(): stringRequest:"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 430
    if-eqz v0, :cond_0

    .line 431
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->mContext:Landroid/content/Context;

    invoke-static {v1}, Lcom/aetn/history/android/historyhere/model/HttpRequestManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/HttpRequestManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/model/HttpRequestManager;->getRequestQueue()Lcom/android/volley/RequestQueue;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/android/volley/RequestQueue;->add(Lcom/android/volley/Request;)Lcom/android/volley/Request;

    .line 432
    :cond_0
    return-void
.end method

.method public manageConnectionNotAvailable()V
    .locals 2

    .prologue
    .line 180
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0d0041

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->showToast(Ljava/lang/String;I)V

    .line 182
    return-void
.end method

.method public onCreate()V
    .locals 4

    .prologue
    .line 90
    invoke-super {p0}, Landroid/app/Application;->onCreate()V

    .line 91
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->mContext:Landroid/content/Context;

    .line 92
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->mConfigLoadedListener:Lcom/aetn/history/android/historyhere/HistoryHereApplication$OnConfigLoadedListener;

    .line 96
    :try_start_0
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    iget-object v1, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->currentAppVersionName:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 101
    :goto_0
    invoke-static {p0}, Lcom/aetn/history/android/historyhere/utils/TextUtils;->initFonts(Landroid/content/Context;)V

    .line 103
    return-void

    .line 97
    :catch_0
    move-exception v0

    .line 98
    .local v0, "e":Landroid/content/pm/PackageManager$NameNotFoundException;
    sget-object v1, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->TAG:Ljava/lang/String;

    invoke-virtual {v0}, Landroid/content/pm/PackageManager$NameNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public onTerminate()V
    .locals 2

    .prologue
    .line 108
    invoke-super {p0}, Landroid/app/Application;->onTerminate()V

    .line 109
    sget-object v0, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->TAG:Ljava/lang/String;

    const-string v1, ">>>>>>onTerminate"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    return-void
.end method

.method public setCurrentSearchFormattedAddress(Ljava/lang/String;)V
    .locals 0
    .param p1, "address"    # Ljava/lang/String;

    .prologue
    .line 219
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->currentSearchFormattedAddress:Ljava/lang/String;

    .line 220
    return-void
.end method

.method public setCurrentSearchLatitude(D)V
    .locals 0
    .param p1, "lat"    # D

    .prologue
    .line 231
    iput-wide p1, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->currentSearchLatitude:D

    .line 232
    return-void
.end method

.method public setCurrentSearchLocation(DD)V
    .locals 0
    .param p1, "lat"    # D
    .param p3, "lng"    # D

    .prologue
    .line 226
    invoke-virtual {p0, p1, p2}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->setCurrentSearchLatitude(D)V

    .line 227
    invoke-virtual {p0, p3, p4}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->setCurrentSearchLongitude(D)V

    .line 228
    return-void
.end method

.method public setCurrentSearchLongitude(D)V
    .locals 0
    .param p1, "lng"    # D

    .prologue
    .line 235
    iput-wide p1, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->currentSearchLongitude:D

    .line 236
    return-void
.end method

.method public setOnConfigLoadedListener(Lcom/aetn/history/android/historyhere/HistoryHereApplication$OnConfigLoadedListener;)V
    .locals 0
    .param p1, "listener"    # Lcom/aetn/history/android/historyhere/HistoryHereApplication$OnConfigLoadedListener;

    .prologue
    .line 393
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->mConfigLoadedListener:Lcom/aetn/history/android/historyhere/HistoryHereApplication$OnConfigLoadedListener;

    .line 394
    return-void
.end method

.method public setTargetedMapPoi(Lcom/aetn/history/android/historyhere/model/POI;)V
    .locals 0
    .param p1, "detail"    # Lcom/aetn/history/android/historyhere/model/POI;

    .prologue
    .line 249
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->showDetailInMapPoiDetail:Lcom/aetn/history/android/historyhere/model/POI;

    .line 250
    return-void
.end method

.method public showFeedback()V
    .locals 6

    .prologue
    .line 253
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.SEND"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 254
    .local v0, "emailIntent":Landroid/content/Intent;
    const-string v1, "text/html"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 255
    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 256
    const-string v1, "android.intent.extra.EMAIL"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f0d0048

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    .line 257
    const-string v1, "android.intent.extra.SUBJECT"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0d004a

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " (version "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->currentAppVersionName:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ")"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 258
    const-string v1, "android.intent.extra.TEXT"

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0d0049

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 259
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 260
    return-void
.end method

.method public showMessageBox(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "message"    # Ljava/lang/String;

    .prologue
    .line 270
    :try_start_0
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->hideMessageBox()V

    .line 271
    const-string v1, ""

    const/4 v2, 0x1

    invoke-static {p1, v1, p2, v2}, Landroid/app/ProgressDialog;->show(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Landroid/app/ProgressDialog;

    move-result-object v1

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->dialog:Landroid/app/ProgressDialog;

    .line 272
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->dialog:Landroid/app/ProgressDialog;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/app/ProgressDialog;->setCancelable(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 276
    :goto_0
    return-void

    .line 273
    :catch_0
    move-exception v0

    .line 274
    .local v0, "e":Ljava/lang/Exception;
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method public showToast(Ljava/lang/String;I)V
    .locals 3
    .param p1, "msg"    # Ljava/lang/String;
    .param p2, "duration"    # I

    .prologue
    .line 292
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 293
    .local v0, "context":Landroid/content/Context;
    move-object v1, p1

    .line 295
    .local v1, "text":Ljava/lang/CharSequence;
    invoke-static {v0, v1, p2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v2

    .line 296
    .local v2, "toast":Landroid/widget/Toast;
    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    .line 297
    return-void
.end method
