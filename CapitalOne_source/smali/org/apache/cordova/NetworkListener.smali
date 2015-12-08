.class public Lorg/apache/cordova/NetworkListener;
.super Lorg/apache/cordova/CordovaLocationListener;
.source "NetworkListener.java"


# direct methods
.method public constructor <init>(Landroid/location/LocationManager;Lorg/apache/cordova/GeoBroker;)V
    .locals 1
    .param p1, "locationManager"    # Landroid/location/LocationManager;
    .param p2, "m"    # Lorg/apache/cordova/GeoBroker;

    .prologue
    .line 30
    const-string v0, "[Cordova NetworkListener]"

    invoke-direct {p0, p1, p2, v0}, Lorg/apache/cordova/CordovaLocationListener;-><init>(Landroid/location/LocationManager;Lorg/apache/cordova/GeoBroker;Ljava/lang/String;)V

    .line 31
    return-void
.end method
