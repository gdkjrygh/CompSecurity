.class public Lcom/rsa/mobilesdk/sdk/LocationRetriever;
.super Ljava/lang/Object;
.source "LocationRetriever.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/rsa/mobilesdk/sdk/LocationRetriever$LocationUpdateListener;,
        Lcom/rsa/mobilesdk/sdk/LocationRetriever$OnLocationDataChangedListener;
    }
.end annotation


# static fields
.field private static final LOCATION_UPDATE_MIN_DISTANCE:I = 0xa

.field private static final LOCATION_UPDATE_MIN_TIME:I = 0x7530

.field private static final MESSAGE_SILENCE_EXPIRED:I = 0x4b1

.field private static final MESSAGE_TIMEOUT:I = 0x4b0


# instance fields
.field private final TAG:Ljava/lang/String;

.field private mBestLocationAge_ms:J

.field private mContext:Landroid/content/Context;

.field private mGPSDenied:Z

.field private mGPSProvider:Landroid/location/LocationProvider;

.field private mLastKnownLocation:Landroid/location/Location;

.field private mLocationDataListener:Lcom/rsa/mobilesdk/sdk/LocationRetriever$OnLocationDataChangedListener;

.field private mLocationDataStatus:I

.field private mLocationInfoBuffer:Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;

.field private mLocationListener:Lcom/rsa/mobilesdk/sdk/LocationRetriever$LocationUpdateListener;

.field private mLocationManager:Landroid/location/LocationManager;

.field private mMaxAccuracy:I

.field private mMaxLocationAge_ms:J

.field private mMaxTimeout_ms:J

.field private mNetworkDenied:Z

.field private mNetworkProvider:Landroid/location/LocationProvider;

.field private mSilenceExpiredHandler:Landroid/os/Handler;

.field private mSilentPeriod_ms:J

.field private mTimeoutHandler:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    const-wide/16 v2, 0x0

    const/4 v1, 0x0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    const-string v0, "LocationRetriever"

    iput-object v0, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->TAG:Ljava/lang/String;

    .line 36
    iput-object v1, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mLocationManager:Landroid/location/LocationManager;

    .line 37
    iput-object v1, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mGPSProvider:Landroid/location/LocationProvider;

    .line 38
    iput-object v1, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mNetworkProvider:Landroid/location/LocationProvider;

    .line 39
    iput-object v1, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mContext:Landroid/content/Context;

    .line 41
    iput-wide v2, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mMaxTimeout_ms:J

    .line 42
    iput-wide v2, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mBestLocationAge_ms:J

    .line 43
    iput-wide v2, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mMaxLocationAge_ms:J

    .line 44
    iput v4, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mMaxAccuracy:I

    .line 45
    iput-wide v2, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mSilentPeriod_ms:J

    .line 47
    iput-object v1, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mLastKnownLocation:Landroid/location/Location;

    .line 48
    iput-object v1, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mLocationListener:Lcom/rsa/mobilesdk/sdk/LocationRetriever$LocationUpdateListener;

    .line 49
    iput v4, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mLocationDataStatus:I

    .line 61
    iput-object v1, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mLocationDataListener:Lcom/rsa/mobilesdk/sdk/LocationRetriever$OnLocationDataChangedListener;

    .line 66
    new-instance v0, Lcom/rsa/mobilesdk/sdk/LocationRetriever$1;

    invoke-direct {v0, p0}, Lcom/rsa/mobilesdk/sdk/LocationRetriever$1;-><init>(Lcom/rsa/mobilesdk/sdk/LocationRetriever;)V

    iput-object v0, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mTimeoutHandler:Landroid/os/Handler;

    .line 76
    new-instance v0, Lcom/rsa/mobilesdk/sdk/LocationRetriever$2;

    invoke-direct {v0, p0}, Lcom/rsa/mobilesdk/sdk/LocationRetriever$2;-><init>(Lcom/rsa/mobilesdk/sdk/LocationRetriever;)V

    iput-object v0, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mSilenceExpiredHandler:Landroid/os/Handler;

    .line 270
    return-void
.end method

.method static synthetic access$000(Lcom/rsa/mobilesdk/sdk/LocationRetriever;)V
    .locals 0
    .param p0, "x0"    # Lcom/rsa/mobilesdk/sdk/LocationRetriever;

    .prologue
    .line 20
    invoke-direct {p0}, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->handleTimeout()V

    return-void
.end method

.method static synthetic access$100(Lcom/rsa/mobilesdk/sdk/LocationRetriever;)V
    .locals 0
    .param p0, "x0"    # Lcom/rsa/mobilesdk/sdk/LocationRetriever;

    .prologue
    .line 20
    invoke-direct {p0}, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->handleSilenceExpired()V

    return-void
.end method

.method static synthetic access$1000(Lcom/rsa/mobilesdk/sdk/LocationRetriever;)V
    .locals 0
    .param p0, "x0"    # Lcom/rsa/mobilesdk/sdk/LocationRetriever;

    .prologue
    .line 20
    invoke-direct {p0}, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->putResult()V

    return-void
.end method

.method static synthetic access$300(Lcom/rsa/mobilesdk/sdk/LocationRetriever;Landroid/location/Location;)V
    .locals 0
    .param p0, "x0"    # Lcom/rsa/mobilesdk/sdk/LocationRetriever;
    .param p1, "x1"    # Landroid/location/Location;

    .prologue
    .line 20
    invoke-direct {p0, p1}, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->resolveLocation(Landroid/location/Location;)V

    return-void
.end method

.method static synthetic access$400(Lcom/rsa/mobilesdk/sdk/LocationRetriever;)Landroid/location/Location;
    .locals 1
    .param p0, "x0"    # Lcom/rsa/mobilesdk/sdk/LocationRetriever;

    .prologue
    .line 20
    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mLastKnownLocation:Landroid/location/Location;

    return-object v0
.end method

.method static synthetic access$500(Lcom/rsa/mobilesdk/sdk/LocationRetriever;Landroid/location/Location;)Z
    .locals 1
    .param p0, "x0"    # Lcom/rsa/mobilesdk/sdk/LocationRetriever;
    .param p1, "x1"    # Landroid/location/Location;

    .prologue
    .line 20
    invoke-direct {p0, p1}, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->matchesTerminateConditions(Landroid/location/Location;)Z

    move-result v0

    return v0
.end method

.method static synthetic access$600(Lcom/rsa/mobilesdk/sdk/LocationRetriever;)V
    .locals 0
    .param p0, "x0"    # Lcom/rsa/mobilesdk/sdk/LocationRetriever;

    .prologue
    .line 20
    invoke-direct {p0}, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->cancelAllRequests()V

    return-void
.end method

.method static synthetic access$700(Lcom/rsa/mobilesdk/sdk/LocationRetriever;)V
    .locals 0
    .param p0, "x0"    # Lcom/rsa/mobilesdk/sdk/LocationRetriever;

    .prologue
    .line 20
    invoke-direct {p0}, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->stopTimeoutHandler()V

    return-void
.end method

.method static synthetic access$800(Lcom/rsa/mobilesdk/sdk/LocationRetriever;)V
    .locals 0
    .param p0, "x0"    # Lcom/rsa/mobilesdk/sdk/LocationRetriever;

    .prologue
    .line 20
    invoke-direct {p0}, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->startSilenceHandler()V

    return-void
.end method

.method static synthetic access$902(Lcom/rsa/mobilesdk/sdk/LocationRetriever;I)I
    .locals 0
    .param p0, "x0"    # Lcom/rsa/mobilesdk/sdk/LocationRetriever;
    .param p1, "x1"    # I

    .prologue
    .line 20
    iput p1, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mLocationDataStatus:I

    return p1
.end method

.method private cancelAllRequests()V
    .locals 2

    .prologue
    .line 259
    const-string v0, "LocationRetriever"

    const-string v1, "cancelAllRequests"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 260
    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mLocationManager:Landroid/location/LocationManager;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mLocationListener:Lcom/rsa/mobilesdk/sdk/LocationRetriever$LocationUpdateListener;

    if-eqz v0, :cond_0

    .line 261
    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mLocationManager:Landroid/location/LocationManager;

    iget-object v1, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mLocationListener:Lcom/rsa/mobilesdk/sdk/LocationRetriever$LocationUpdateListener;

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->removeUpdates(Landroid/location/LocationListener;)V

    .line 263
    :cond_0
    return-void
.end method

.method private getBetterLocation(Landroid/location/Location;Landroid/location/Location;)Landroid/location/Location;
    .locals 10
    .param p1, "loc1"    # Landroid/location/Location;
    .param p2, "loc2"    # Landroid/location/Location;

    .prologue
    .line 319
    invoke-direct {p0, p1}, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->isLocationOk(Landroid/location/Location;)Z

    move-result v4

    .line 320
    .local v4, "loc1Ok":Z
    invoke-direct {p0, p2}, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->isLocationOk(Landroid/location/Location;)Z

    move-result v5

    .line 321
    .local v5, "loc2Ok":Z
    if-nez v4, :cond_1

    if-nez v5, :cond_1

    .line 323
    const/4 p1, 0x0

    .line 360
    .end local p1    # "loc1":Landroid/location/Location;
    :cond_0
    :goto_0
    return-object p1

    .line 325
    .restart local p1    # "loc1":Landroid/location/Location;
    :cond_1
    if-eqz v4, :cond_4

    if-eqz v5, :cond_4

    .line 326
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 327
    .local v0, "currTime":J
    invoke-virtual {p1}, Landroid/location/Location;->getTime()J

    move-result-wide v8

    sub-long v2, v0, v8

    .line 328
    .local v2, "loc1Age":J
    invoke-virtual {p2}, Landroid/location/Location;->getTime()J

    move-result-wide v8

    sub-long v6, v0, v8

    .line 329
    .local v6, "loc2Age":J
    iget-wide v8, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mBestLocationAge_ms:J

    cmp-long v8, v2, v8

    if-gez v8, :cond_2

    iget-wide v8, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mBestLocationAge_ms:J

    cmp-long v8, v6, v8

    if-gez v8, :cond_2

    .line 333
    invoke-virtual {p1}, Landroid/location/Location;->getAccuracy()F

    move-result v8

    invoke-virtual {p2}, Landroid/location/Location;->getAccuracy()F

    move-result v9

    cmpg-float v8, v8, v9

    if-ltz v8, :cond_0

    move-object p1, p2

    .line 337
    goto :goto_0

    .line 341
    :cond_2
    iget-wide v8, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mBestLocationAge_ms:J

    cmp-long v8, v2, v8

    if-ltz v8, :cond_0

    .line 344
    iget-wide v8, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mBestLocationAge_ms:J

    cmp-long v8, v6, v8

    if-gez v8, :cond_3

    move-object p1, p2

    .line 345
    goto :goto_0

    .line 351
    :cond_3
    cmp-long v8, v2, v6

    if-ltz v8, :cond_0

    move-object p1, p2

    .line 354
    goto :goto_0

    .line 357
    .end local v0    # "currTime":J
    .end local v2    # "loc1Age":J
    .end local v6    # "loc2Age":J
    :cond_4
    if-nez v4, :cond_0

    move-object p1, p2

    .line 360
    goto :goto_0
.end method

.method private getUpdateListener()Lcom/rsa/mobilesdk/sdk/LocationRetriever$LocationUpdateListener;
    .locals 2

    .prologue
    .line 238
    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mLocationListener:Lcom/rsa/mobilesdk/sdk/LocationRetriever$LocationUpdateListener;

    if-nez v0, :cond_0

    .line 239
    new-instance v0, Lcom/rsa/mobilesdk/sdk/LocationRetriever$LocationUpdateListener;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/rsa/mobilesdk/sdk/LocationRetriever$LocationUpdateListener;-><init>(Lcom/rsa/mobilesdk/sdk/LocationRetriever;Lcom/rsa/mobilesdk/sdk/LocationRetriever$1;)V

    iput-object v0, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mLocationListener:Lcom/rsa/mobilesdk/sdk/LocationRetriever$LocationUpdateListener;

    .line 241
    :cond_0
    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mLocationListener:Lcom/rsa/mobilesdk/sdk/LocationRetriever$LocationUpdateListener;

    return-object v0
.end method

.method private handleSilenceExpired()V
    .locals 2

    .prologue
    .line 399
    const-string v0, "LocationRetriever"

    const-string v1, "handleSilenceExpired"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 400
    invoke-direct {p0}, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->stopTimeoutHandler()V

    .line 401
    invoke-direct {p0}, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->stopSilenceHandler()V

    .line 403
    const/4 v0, 0x0

    iput v0, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mLocationDataStatus:I

    .line 404
    invoke-direct {p0}, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->startLocationUpdate()V

    .line 405
    return-void
.end method

.method private handleTimeout()V
    .locals 2

    .prologue
    .line 383
    const-string v0, "LocationRetriever"

    const-string v1, "handleTimeout"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 384
    invoke-direct {p0}, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->stopTimeoutHandler()V

    .line 385
    invoke-direct {p0}, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->stopSilenceHandler()V

    .line 387
    const/4 v0, 0x3

    iput v0, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mLocationDataStatus:I

    .line 388
    invoke-direct {p0}, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->cancelAllRequests()V

    .line 389
    invoke-direct {p0}, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->putResult()V

    .line 390
    invoke-direct {p0}, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->startSilenceHandler()V

    .line 391
    return-void
.end method

.method private isLocationOk(Landroid/location/Location;)Z
    .locals 8
    .param p1, "location"    # Landroid/location/Location;

    .prologue
    const/4 v2, 0x0

    .line 305
    if-eqz p1, :cond_0

    .line 309
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {p1}, Landroid/location/Location;->getTime()J

    move-result-wide v6

    sub-long v0, v4, v6

    .line 310
    .local v0, "age":J
    iget-wide v4, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mMaxLocationAge_ms:J

    cmp-long v3, v0, v4

    if-gez v3, :cond_0

    const/4 v2, 0x1

    .line 312
    .end local v0    # "age":J
    :cond_0
    return v2
.end method

.method private matchesTerminateConditions(Landroid/location/Location;)Z
    .locals 8
    .param p1, "location"    # Landroid/location/Location;

    .prologue
    const/4 v4, 0x0

    .line 368
    if-eqz p1, :cond_0

    .line 369
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 370
    .local v0, "currTime":J
    invoke-virtual {p1}, Landroid/location/Location;->getTime()J

    move-result-wide v6

    sub-long v2, v0, v6

    .line 371
    .local v2, "locationAge":J
    iget-wide v6, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mBestLocationAge_ms:J

    cmp-long v5, v2, v6

    if-gez v5, :cond_0

    .line 372
    invoke-virtual {p1}, Landroid/location/Location;->getAccuracy()F

    move-result v5

    iget v6, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mMaxAccuracy:I

    int-to-float v6, v6

    cmpg-float v5, v5, v6

    if-gtz v5, :cond_0

    const/4 v4, 0x1

    .line 375
    .end local v0    # "currTime":J
    .end local v2    # "locationAge":J
    :cond_0
    return v4
.end method

.method private putResult()V
    .locals 3

    .prologue
    .line 248
    const-string v0, "LocationRetriever"

    const-string v1, "putResult"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 249
    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mLocationInfoBuffer:Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;

    iget-object v1, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mLastKnownLocation:Landroid/location/Location;

    iget v2, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mLocationDataStatus:I

    invoke-virtual {v0, v1, v2}, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;->set(Landroid/location/Location;I)V

    .line 250
    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mLocationDataListener:Lcom/rsa/mobilesdk/sdk/LocationRetriever$OnLocationDataChangedListener;

    if-eqz v0, :cond_0

    .line 251
    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mLocationDataListener:Lcom/rsa/mobilesdk/sdk/LocationRetriever$OnLocationDataChangedListener;

    invoke-interface {v0}, Lcom/rsa/mobilesdk/sdk/LocationRetriever$OnLocationDataChangedListener;->onLocationDataChanged()V

    .line 253
    :cond_0
    return-void
.end method

.method private declared-synchronized resolveLocation(Landroid/location/Location;)V
    .locals 1
    .param p1, "newLocation"    # Landroid/location/Location;

    .prologue
    .line 298
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mLastKnownLocation:Landroid/location/Location;

    invoke-direct {p0, v0, p1}, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->getBetterLocation(Landroid/location/Location;Landroid/location/Location;)Landroid/location/Location;

    move-result-object v0

    iput-object v0, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mLastKnownLocation:Landroid/location/Location;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 299
    monitor-exit p0

    return-void

    .line 298
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private startLocationUpdate()V
    .locals 10

    .prologue
    const-wide/16 v2, 0x7530

    const/high16 v4, 0x41200000    # 10.0f

    const/4 v9, 0x1

    .line 172
    const-string v0, "LocationRetriever"

    const-string v1, "startLocationUpdate"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 173
    const/4 v8, 0x0

    .line 177
    .local v8, "started":Z
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mNetworkDenied:Z

    iput-boolean v0, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mGPSDenied:Z

    .line 183
    :try_start_0
    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mLocationManager:Landroid/location/LocationManager;

    const-string v1, "gps"

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->getProvider(Ljava/lang/String;)Landroid/location/LocationProvider;

    move-result-object v0

    iput-object v0, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mGPSProvider:Landroid/location/LocationProvider;
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 188
    :goto_0
    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mGPSProvider:Landroid/location/LocationProvider;

    if-eqz v0, :cond_0

    .line 189
    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mLocationManager:Landroid/location/LocationManager;

    const-string v1, "gps"

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 190
    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mLocationManager:Landroid/location/LocationManager;

    const-string v1, "gps"

    invoke-direct {p0}, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->getUpdateListener()Lcom/rsa/mobilesdk/sdk/LocationRetriever$LocationUpdateListener;

    move-result-object v5

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v6

    invoke-virtual/range {v0 .. v6}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/location/LocationListener;Landroid/os/Looper;)V

    .line 195
    const/4 v8, 0x1

    .line 207
    :cond_0
    :goto_1
    :try_start_1
    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mLocationManager:Landroid/location/LocationManager;

    const-string v1, "network"

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->getProvider(Ljava/lang/String;)Landroid/location/LocationProvider;

    move-result-object v0

    iput-object v0, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mNetworkProvider:Landroid/location/LocationProvider;
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_1

    .line 212
    :goto_2
    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mNetworkProvider:Landroid/location/LocationProvider;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mLocationManager:Landroid/location/LocationManager;

    const-string v1, "network"

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 213
    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mLocationManager:Landroid/location/LocationManager;

    const-string v1, "network"

    invoke-direct {p0}, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->getUpdateListener()Lcom/rsa/mobilesdk/sdk/LocationRetriever$LocationUpdateListener;

    move-result-object v5

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v6

    invoke-virtual/range {v0 .. v6}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/location/LocationListener;Landroid/os/Looper;)V

    .line 218
    const/4 v8, 0x1

    .line 223
    :goto_3
    iget-boolean v0, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mGPSDenied:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mNetworkDenied:Z

    if-eqz v0, :cond_1

    .line 224
    iput v9, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mLocationDataStatus:I

    .line 229
    :cond_1
    if-eqz v8, :cond_2

    .line 230
    invoke-direct {p0}, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->startTimeoutHandler()V

    .line 232
    :cond_2
    return-void

    .line 184
    :catch_0
    move-exception v7

    .line 185
    .local v7, "e":Ljava/lang/SecurityException;
    iput-boolean v9, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mGPSDenied:Z

    goto :goto_0

    .line 199
    .end local v7    # "e":Ljava/lang/SecurityException;
    :cond_3
    iput-boolean v9, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mGPSDenied:Z

    goto :goto_1

    .line 208
    :catch_1
    move-exception v7

    .line 209
    .restart local v7    # "e":Ljava/lang/SecurityException;
    iput-boolean v9, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mNetworkDenied:Z

    goto :goto_2

    .line 220
    .end local v7    # "e":Ljava/lang/SecurityException;
    :cond_4
    iput-boolean v9, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mNetworkDenied:Z

    goto :goto_3
.end method

.method private startSilenceHandler()V
    .locals 4

    .prologue
    .line 429
    invoke-direct {p0}, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->stopSilenceHandler()V

    .line 431
    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mSilenceExpiredHandler:Landroid/os/Handler;

    const/16 v1, 0x4b1

    iget-wide v2, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mSilentPeriod_ms:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 433
    return-void
.end method

.method private startTimeoutHandler()V
    .locals 4

    .prologue
    .line 411
    invoke-direct {p0}, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->stopTimeoutHandler()V

    .line 412
    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mTimeoutHandler:Landroid/os/Handler;

    const/16 v1, 0x4b0

    iget-wide v2, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mMaxTimeout_ms:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 414
    return-void
.end method

.method private stopSilenceHandler()V
    .locals 2

    .prologue
    const/16 v1, 0x4b1

    .line 439
    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mSilenceExpiredHandler:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 440
    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mSilenceExpiredHandler:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 442
    :cond_0
    return-void
.end method

.method private stopTimeoutHandler()V
    .locals 2

    .prologue
    const/16 v1, 0x4b0

    .line 420
    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mTimeoutHandler:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 421
    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mTimeoutHandler:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 423
    :cond_0
    return-void
.end method


# virtual methods
.method queryLocation(Landroid/content/Context;JJJJILcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;Lcom/rsa/mobilesdk/sdk/LocationRetriever$OnLocationDataChangedListener;)V
    .locals 8
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "timeout_minutes"    # J
    .param p4, "silencePeriod_minutes"    # J
    .param p6, "bestLocationAgeMinutes"    # J
    .param p8, "maxLocationAgeDays"    # J
    .param p10, "maxAccuracy"    # I
    .param p11, "locationInfoBuffer"    # Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;
    .param p12, "l"    # Lcom/rsa/mobilesdk/sdk/LocationRetriever$OnLocationDataChangedListener;

    .prologue
    .line 95
    const-string v4, "LocationRetriever"

    const-string v5, "queryLocation"

    invoke-static {v4, v5}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 97
    if-nez p11, :cond_0

    .line 98
    const-string v4, "LocationRetriever"

    const-string v5, "mobile SDK: internal problem, queryLocation, null locationInfoBuffer"

    invoke-static {v4, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 166
    :goto_0
    return-void

    .line 102
    :cond_0
    const/4 v4, 0x0

    iput v4, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mLocationDataStatus:I

    .line 103
    const/4 v4, 0x0

    iput-boolean v4, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mGPSDenied:Z

    iput-boolean v4, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mNetworkDenied:Z

    .line 105
    iput-object p1, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mContext:Landroid/content/Context;

    .line 106
    move-object/from16 v0, p11

    iput-object v0, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mLocationInfoBuffer:Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;

    .line 107
    move-object/from16 v0, p12

    iput-object v0, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mLocationDataListener:Lcom/rsa/mobilesdk/sdk/LocationRetriever$OnLocationDataChangedListener;

    .line 109
    iget-object v4, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mContext:Landroid/content/Context;

    const-string v5, "location"

    invoke-virtual {v4, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/location/LocationManager;

    iput-object v4, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mLocationManager:Landroid/location/LocationManager;

    .line 114
    const-wide/16 v4, 0x3c

    mul-long/2addr v4, p2

    const-wide/16 v6, 0x3e8

    mul-long/2addr v4, v6

    iput-wide v4, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mMaxTimeout_ms:J

    .line 115
    const-wide/16 v4, 0x3c

    mul-long/2addr v4, p4

    const-wide/16 v6, 0x3e8

    mul-long/2addr v4, v6

    iput-wide v4, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mSilentPeriod_ms:J

    .line 116
    const-wide/16 v4, 0x3c

    mul-long/2addr v4, p6

    const-wide/16 v6, 0x3e8

    mul-long/2addr v4, v6

    iput-wide v4, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mBestLocationAge_ms:J

    .line 117
    const-wide/16 v4, 0x18

    mul-long v4, v4, p8

    const-wide/16 v6, 0xe10

    mul-long/2addr v4, v6

    const-wide/16 v6, 0x3e8

    mul-long/2addr v4, v6

    iput-wide v4, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mMaxLocationAge_ms:J

    .line 118
    move/from16 v0, p10

    iput v0, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mMaxAccuracy:I

    .line 124
    :try_start_0
    iget-object v4, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mLocationManager:Landroid/location/LocationManager;

    const-string v5, "gps"

    invoke-virtual {v4, v5}, Landroid/location/LocationManager;->getProvider(Ljava/lang/String;)Landroid/location/LocationProvider;

    move-result-object v4

    iput-object v4, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mGPSProvider:Landroid/location/LocationProvider;
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 130
    :goto_1
    iget-object v4, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mGPSProvider:Landroid/location/LocationProvider;

    if-eqz v4, :cond_4

    .line 131
    iget-object v4, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mLocationManager:Landroid/location/LocationManager;

    const-string v5, "gps"

    invoke-virtual {v4, v5}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 133
    const/4 v4, 0x1

    iput-boolean v4, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mGPSDenied:Z

    .line 136
    :cond_1
    :try_start_1
    iget-object v4, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mLocationManager:Landroid/location/LocationManager;

    const-string v5, "gps"

    invoke-virtual {v4, v5}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;

    move-result-object v3

    .line 137
    .local v3, "loc":Landroid/location/Location;
    invoke-direct {p0, v3}, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->resolveLocation(Landroid/location/Location;)V
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_1

    .line 151
    .end local v3    # "loc":Landroid/location/Location;
    :goto_2
    :try_start_2
    iget-object v4, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mLocationManager:Landroid/location/LocationManager;

    const-string v5, "network"

    invoke-virtual {v4, v5}, Landroid/location/LocationManager;->getProvider(Ljava/lang/String;)Landroid/location/LocationProvider;

    move-result-object v4

    iput-object v4, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mNetworkProvider:Landroid/location/LocationProvider;

    .line 152
    iget-object v4, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mLocationManager:Landroid/location/LocationManager;

    const-string v5, "network"

    invoke-virtual {v4, v5}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_2

    .line 153
    const/4 v4, 0x1

    iput-boolean v4, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mNetworkDenied:Z

    .line 155
    :cond_2
    iget-object v4, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mLocationManager:Landroid/location/LocationManager;

    const-string v5, "network"

    invoke-virtual {v4, v5}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;

    move-result-object v3

    .line 156
    .restart local v3    # "loc":Landroid/location/Location;
    invoke-direct {p0, v3}, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->resolveLocation(Landroid/location/Location;)V
    :try_end_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_2

    .line 161
    .end local v3    # "loc":Landroid/location/Location;
    :goto_3
    iget-boolean v4, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mGPSDenied:Z

    if-eqz v4, :cond_3

    iget-boolean v4, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mNetworkDenied:Z

    if-eqz v4, :cond_3

    .line 162
    const/4 v4, 0x1

    iput v4, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mLocationDataStatus:I

    .line 164
    :cond_3
    invoke-direct {p0}, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->putResult()V

    .line 165
    invoke-direct {p0}, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->startLocationUpdate()V

    goto/16 :goto_0

    .line 125
    :catch_0
    move-exception v2

    .line 127
    .local v2, "e":Ljava/lang/SecurityException;
    const/4 v4, 0x1

    iput-boolean v4, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mGPSDenied:Z

    goto :goto_1

    .line 138
    .end local v2    # "e":Ljava/lang/SecurityException;
    :catch_1
    move-exception v2

    .line 140
    .restart local v2    # "e":Ljava/lang/SecurityException;
    const/4 v4, 0x1

    iput-boolean v4, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mGPSDenied:Z

    goto :goto_2

    .line 144
    .end local v2    # "e":Ljava/lang/SecurityException;
    :cond_4
    const/4 v4, 0x4

    iput v4, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mLocationDataStatus:I

    goto :goto_2

    .line 157
    :catch_2
    move-exception v2

    .line 158
    .restart local v2    # "e":Ljava/lang/SecurityException;
    const/4 v4, 0x1

    iput-boolean v4, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mNetworkDenied:Z

    goto :goto_3
.end method

.method release()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 448
    invoke-direct {p0}, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->stopTimeoutHandler()V

    .line 449
    invoke-direct {p0}, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->stopSilenceHandler()V

    .line 450
    invoke-direct {p0}, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->cancelAllRequests()V

    .line 451
    iput-object v0, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mLocationManager:Landroid/location/LocationManager;

    .line 452
    iput-object v0, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mGPSProvider:Landroid/location/LocationProvider;

    .line 453
    iput-object v0, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mNetworkProvider:Landroid/location/LocationProvider;

    .line 454
    iput-object v0, p0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->mLocationListener:Lcom/rsa/mobilesdk/sdk/LocationRetriever$LocationUpdateListener;

    .line 455
    return-void
.end method
