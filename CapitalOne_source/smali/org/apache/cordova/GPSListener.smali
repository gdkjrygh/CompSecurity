.class public Lorg/apache/cordova/GPSListener;
.super Lorg/apache/cordova/CordovaLocationListener;
.source "GPSListener.java"


# direct methods
.method public constructor <init>(Landroid/location/LocationManager;Lorg/apache/cordova/GeoBroker;)V
    .locals 1
    .param p1, "locationManager"    # Landroid/location/LocationManager;
    .param p2, "m"    # Lorg/apache/cordova/GeoBroker;

    .prologue
    .line 30
    const-string v0, "[Cordova GPSListener]"

    invoke-direct {p0, p1, p2, v0}, Lorg/apache/cordova/CordovaLocationListener;-><init>(Landroid/location/LocationManager;Lorg/apache/cordova/GeoBroker;Ljava/lang/String;)V

    .line 31
    return-void
.end method


# virtual methods
.method protected start()V
    .locals 6

    .prologue
    .line 41
    iget-boolean v0, p0, Lorg/apache/cordova/GPSListener;->running:Z

    if-nez v0, :cond_0

    .line 42
    iget-object v0, p0, Lorg/apache/cordova/GPSListener;->locationManager:Landroid/location/LocationManager;

    const-string v1, "gps"

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->getProvider(Ljava/lang/String;)Landroid/location/LocationProvider;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 43
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/apache/cordova/GPSListener;->running:Z

    .line 44
    iget-object v0, p0, Lorg/apache/cordova/GPSListener;->locationManager:Landroid/location/LocationManager;

    const-string v1, "gps"

    const-wide/32 v2, 0xea60

    const/4 v4, 0x0

    move-object v5, p0

    invoke-virtual/range {v0 .. v5}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/location/LocationListener;)V

    .line 49
    :cond_0
    :goto_0
    return-void

    .line 46
    :cond_1
    sget v0, Lorg/apache/cordova/CordovaLocationListener;->POSITION_UNAVAILABLE:I

    const-string v1, "GPS provider is not available."

    invoke-virtual {p0, v0, v1}, Lorg/apache/cordova/GPSListener;->fail(ILjava/lang/String;)V

    goto :goto_0
.end method
