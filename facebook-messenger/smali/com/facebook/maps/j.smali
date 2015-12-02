.class public Lcom/facebook/maps/j;
.super Ljava/lang/Object;
.source "Locations.java"


# static fields
.field private static a:D


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 11
    const-wide v0, 0x412e848000000000L    # 1000000.0

    sput-wide v0, Lcom/facebook/maps/j;->a:D

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(DD)Landroid/location/Location;
    .locals 2

    .prologue
    .line 14
    new-instance v0, Landroid/location/Location;

    const-string v1, ""

    invoke-direct {v0, v1}, Landroid/location/Location;-><init>(Ljava/lang/String;)V

    .line 15
    invoke-virtual {v0, p0, p1}, Landroid/location/Location;->setLatitude(D)V

    .line 16
    invoke-virtual {v0, p2, p3}, Landroid/location/Location;->setLongitude(D)V

    .line 17
    return-object v0
.end method

.method public static a(Lcom/google/android/maps/GeoPoint;)Landroid/location/Location;
    .locals 6

    .prologue
    .line 21
    invoke-virtual {p0}, Lcom/google/android/maps/GeoPoint;->getLatitudeE6()I

    move-result v0

    int-to-double v0, v0

    sget-wide v2, Lcom/facebook/maps/j;->a:D

    div-double/2addr v0, v2

    invoke-virtual {p0}, Lcom/google/android/maps/GeoPoint;->getLongitudeE6()I

    move-result v2

    int-to-double v2, v2

    sget-wide v4, Lcom/facebook/maps/j;->a:D

    div-double/2addr v2, v4

    invoke-static {v0, v1, v2, v3}, Lcom/facebook/maps/j;->a(DD)Landroid/location/Location;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/location/Location;)Lcom/google/android/maps/GeoPoint;
    .locals 6

    .prologue
    .line 25
    new-instance v0, Lcom/google/android/maps/GeoPoint;

    invoke-virtual {p0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    sget-wide v3, Lcom/facebook/maps/j;->a:D

    mul-double/2addr v1, v3

    double-to-int v1, v1

    invoke-virtual {p0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v2

    sget-wide v4, Lcom/facebook/maps/j;->a:D

    mul-double/2addr v2, v4

    double-to-int v2, v2

    invoke-direct {v0, v1, v2}, Lcom/google/android/maps/GeoPoint;-><init>(II)V

    return-object v0
.end method
