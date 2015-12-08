.class Lorg/chromium/content/browser/LocationProviderFactory$LocationProviderImpl;
.super Ljava/lang/Object;
.source "LocationProviderFactory.java"

# interfaces
.implements Landroid/location/LocationListener;
.implements Lorg/chromium/content/browser/LocationProviderFactory$LocationProvider;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/chromium/content/browser/LocationProviderFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "LocationProviderImpl"
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z

.field private static final TAG:Ljava/lang/String; = "LocationProvider"


# instance fields
.field private mContext:Landroid/content/Context;

.field private mIsRunning:Z

.field private mLocationManager:Landroid/location/LocationManager;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 57
    const-class v0, Lorg/chromium/content/browser/LocationProviderFactory;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lorg/chromium/content/browser/LocationProviderFactory$LocationProviderImpl;->$assertionsDisabled:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    iput-object p1, p0, Lorg/chromium/content/browser/LocationProviderFactory$LocationProviderImpl;->mContext:Landroid/content/Context;

    .line 69
    return-void
.end method

.method static synthetic access$000(Lorg/chromium/content/browser/LocationProviderFactory$LocationProviderImpl;Landroid/location/Location;)V
    .locals 0
    .param p0, "x0"    # Lorg/chromium/content/browser/LocationProviderFactory$LocationProviderImpl;
    .param p1, "x1"    # Landroid/location/Location;

    .prologue
    .line 57
    invoke-direct {p0, p1}, Lorg/chromium/content/browser/LocationProviderFactory$LocationProviderImpl;->updateNewLocation(Landroid/location/Location;)V

    return-void
.end method

.method private ensureLocationManagerCreated()V
    .locals 2

    .prologue
    .line 130
    iget-object v0, p0, Lorg/chromium/content/browser/LocationProviderFactory$LocationProviderImpl;->mLocationManager:Landroid/location/LocationManager;

    if-eqz v0, :cond_1

    .line 136
    :cond_0
    :goto_0
    return-void

    .line 131
    :cond_1
    iget-object v0, p0, Lorg/chromium/content/browser/LocationProviderFactory$LocationProviderImpl;->mContext:Landroid/content/Context;

    const-string v1, "location"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/location/LocationManager;

    iput-object v0, p0, Lorg/chromium/content/browser/LocationProviderFactory$LocationProviderImpl;->mLocationManager:Landroid/location/LocationManager;

    .line 133
    iget-object v0, p0, Lorg/chromium/content/browser/LocationProviderFactory$LocationProviderImpl;->mLocationManager:Landroid/location/LocationManager;

    if-nez v0, :cond_0

    .line 134
    const-string v0, "LocationProvider"

    const-string v1, "Could not get location manager."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method private isOnlyPassiveLocationProviderEnabled()Z
    .locals 5

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x1

    .line 197
    iget-object v1, p0, Lorg/chromium/content/browser/LocationProviderFactory$LocationProviderImpl;->mLocationManager:Landroid/location/LocationManager;

    invoke-virtual {v1, v2}, Landroid/location/LocationManager;->getProviders(Z)Ljava/util/List;

    move-result-object v0

    .line 198
    .local v0, "providers":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-ne v1, v2, :cond_0

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v4, "passive"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move v1, v2

    :goto_0
    return v1

    :cond_0
    move v1, v3

    goto :goto_0
.end method

.method private registerForLocationUpdates(Z)V
    .locals 8
    .param p1, "isGpsEnabled"    # Z

    .prologue
    const/4 v2, 0x1

    .line 142
    invoke-direct {p0}, Lorg/chromium/content/browser/LocationProviderFactory$LocationProviderImpl;->ensureLocationManagerCreated()V

    .line 143
    invoke-direct {p0}, Lorg/chromium/content/browser/LocationProviderFactory$LocationProviderImpl;->usePassiveOneShotLocation()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 161
    :goto_0
    return-void

    .line 145
    :cond_0
    sget-boolean v1, Lorg/chromium/content/browser/LocationProviderFactory$LocationProviderImpl;->$assertionsDisabled:Z

    if-nez v1, :cond_1

    iget-boolean v1, p0, Lorg/chromium/content/browser/LocationProviderFactory$LocationProviderImpl;->mIsRunning:Z

    if-eqz v1, :cond_1

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    throw v1

    .line 146
    :cond_1
    iput-boolean v2, p0, Lorg/chromium/content/browser/LocationProviderFactory$LocationProviderImpl;->mIsRunning:Z

    .line 151
    :try_start_0
    new-instance v5, Landroid/location/Criteria;

    invoke-direct {v5}, Landroid/location/Criteria;-><init>()V

    .line 152
    .local v5, "criteria":Landroid/location/Criteria;
    if-eqz p1, :cond_2

    const/4 v1, 0x1

    invoke-virtual {v5, v1}, Landroid/location/Criteria;->setAccuracy(I)V

    .line 153
    :cond_2
    iget-object v1, p0, Lorg/chromium/content/browser/LocationProviderFactory$LocationProviderImpl;->mLocationManager:Landroid/location/LocationManager;

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    invoke-static {}, Lorg/chromium/base/ThreadUtils;->getUiThreadLooper()Landroid/os/Looper;

    move-result-object v7

    move-object v6, p0

    invoke-virtual/range {v1 .. v7}, Landroid/location/LocationManager;->requestLocationUpdates(JFLandroid/location/Criteria;Landroid/location/LocationListener;Landroid/os/Looper;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 155
    .end local v5    # "criteria":Landroid/location/Criteria;
    :catch_0
    move-exception v0

    .line 156
    .local v0, "e":Ljava/lang/SecurityException;
    const-string v1, "LocationProvider"

    const-string v2, "Caught security exception registering for location updates from system. This should only happen in DumpRenderTree."

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 158
    .end local v0    # "e":Ljava/lang/SecurityException;
    :catch_1
    move-exception v0

    .line 159
    .local v0, "e":Ljava/lang/IllegalArgumentException;
    const-string v1, "LocationProvider"

    const-string v2, "Caught IllegalArgumentException registering for location updates."

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method private unregisterFromLocationUpdates()V
    .locals 1

    .prologue
    .line 167
    iget-boolean v0, p0, Lorg/chromium/content/browser/LocationProviderFactory$LocationProviderImpl;->mIsRunning:Z

    if-eqz v0, :cond_0

    .line 168
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/chromium/content/browser/LocationProviderFactory$LocationProviderImpl;->mIsRunning:Z

    .line 169
    iget-object v0, p0, Lorg/chromium/content/browser/LocationProviderFactory$LocationProviderImpl;->mLocationManager:Landroid/location/LocationManager;

    invoke-virtual {v0, p0}, Landroid/location/LocationManager;->removeUpdates(Landroid/location/LocationListener;)V

    .line 171
    :cond_0
    return-void
.end method

.method private updateNewLocation(Landroid/location/Location;)V
    .locals 20
    .param p1, "location"    # Landroid/location/Location;

    .prologue
    .line 108
    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v2

    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v4

    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->getTime()J

    move-result-wide v6

    long-to-double v6, v6

    const-wide v8, 0x408f400000000000L    # 1000.0

    div-double/2addr v6, v8

    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->hasAltitude()Z

    move-result v8

    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->getAltitude()D

    move-result-wide v9

    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->hasAccuracy()Z

    move-result v11

    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->getAccuracy()F

    move-result v12

    float-to-double v12, v12

    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->hasBearing()Z

    move-result v14

    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->getBearing()F

    move-result v15

    float-to-double v15, v15

    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->hasSpeed()Z

    move-result v17

    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->getSpeed()F

    move-result v18

    move/from16 v0, v18

    float-to-double v0, v0

    move-wide/from16 v18, v0

    invoke-static/range {v2 .. v19}, Lorg/chromium/content/browser/LocationProviderAdapter;->newLocationAvailable(DDDZDZDZDZD)V

    .line 115
    return-void
.end method

.method private usePassiveOneShotLocation()Z
    .locals 3

    .prologue
    .line 174
    invoke-direct {p0}, Lorg/chromium/content/browser/LocationProviderFactory$LocationProviderImpl;->isOnlyPassiveLocationProviderEnabled()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    .line 189
    :goto_0
    return v1

    .line 179
    :cond_0
    iget-object v1, p0, Lorg/chromium/content/browser/LocationProviderFactory$LocationProviderImpl;->mLocationManager:Landroid/location/LocationManager;

    const-string v2, "passive"

    invoke-virtual {v1, v2}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;

    move-result-object v0

    .line 181
    .local v0, "location":Landroid/location/Location;
    if-eqz v0, :cond_1

    .line 182
    new-instance v1, Lorg/chromium/content/browser/LocationProviderFactory$LocationProviderImpl$1;

    invoke-direct {v1, p0, v0}, Lorg/chromium/content/browser/LocationProviderFactory$LocationProviderImpl$1;-><init>(Lorg/chromium/content/browser/LocationProviderFactory$LocationProviderImpl;Landroid/location/Location;)V

    invoke-static {v1}, Lorg/chromium/base/ThreadUtils;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 189
    :cond_1
    const/4 v1, 0x1

    goto :goto_0
.end method


# virtual methods
.method public isRunning()Z
    .locals 1

    .prologue
    .line 94
    iget-boolean v0, p0, Lorg/chromium/content/browser/LocationProviderFactory$LocationProviderImpl;->mIsRunning:Z

    return v0
.end method

.method public onLocationChanged(Landroid/location/Location;)V
    .locals 1
    .param p1, "location"    # Landroid/location/Location;

    .prologue
    .line 102
    iget-boolean v0, p0, Lorg/chromium/content/browser/LocationProviderFactory$LocationProviderImpl;->mIsRunning:Z

    if-eqz v0, :cond_0

    .line 103
    invoke-direct {p0, p1}, Lorg/chromium/content/browser/LocationProviderFactory$LocationProviderImpl;->updateNewLocation(Landroid/location/Location;)V

    .line 105
    :cond_0
    return-void
.end method

.method public onProviderDisabled(Ljava/lang/String;)V
    .locals 0
    .param p1, "provider"    # Ljava/lang/String;

    .prologue
    .line 127
    return-void
.end method

.method public onProviderEnabled(Ljava/lang/String;)V
    .locals 0
    .param p1, "provider"    # Ljava/lang/String;

    .prologue
    .line 123
    return-void
.end method

.method public onStatusChanged(Ljava/lang/String;ILandroid/os/Bundle;)V
    .locals 0
    .param p1, "provider"    # Ljava/lang/String;
    .param p2, "status"    # I
    .param p3, "extras"    # Landroid/os/Bundle;

    .prologue
    .line 119
    return-void
.end method

.method public start(Z)V
    .locals 0
    .param p1, "gpsEnabled"    # Z

    .prologue
    .line 77
    invoke-direct {p0}, Lorg/chromium/content/browser/LocationProviderFactory$LocationProviderImpl;->unregisterFromLocationUpdates()V

    .line 78
    invoke-direct {p0, p1}, Lorg/chromium/content/browser/LocationProviderFactory$LocationProviderImpl;->registerForLocationUpdates(Z)V

    .line 79
    return-void
.end method

.method public stop()V
    .locals 0

    .prologue
    .line 86
    invoke-direct {p0}, Lorg/chromium/content/browser/LocationProviderFactory$LocationProviderImpl;->unregisterFromLocationUpdates()V

    .line 87
    return-void
.end method
