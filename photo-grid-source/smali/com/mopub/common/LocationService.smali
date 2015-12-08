.class public Lcom/mopub/common/LocationService;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    return-void
.end method

.method public static getLastKnownLocation(Landroid/content/Context;ILcom/mopub/common/MoPub$LocationAwareness;)Landroid/location/Location;
    .locals 7

    .prologue
    const/4 v6, 0x5

    const/4 v2, 0x0

    .line 58
    sget-object v0, Lcom/mopub/common/MoPub$LocationAwareness;->DISABLED:Lcom/mopub/common/MoPub$LocationAwareness;

    if-ne p2, v0, :cond_1

    .line 114
    :cond_0
    :goto_0
    return-object v2

    .line 62
    :cond_1
    const-string v0, "location"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/location/LocationManager;

    .line 65
    :try_start_0
    const-string v1, "gps"

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_2

    move-result-object v1

    .line 76
    :goto_1
    :try_start_1
    const-string v3, "network"

    invoke-virtual {v0, v3}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_5

    move-result-object v0

    .line 85
    :goto_2
    if-nez v1, :cond_2

    if-eqz v0, :cond_0

    .line 87
    :cond_2
    if-eqz v1, :cond_6

    if-eqz v0, :cond_6

    .line 88
    invoke-virtual {v1}, Landroid/location/Location;->getTime()J

    move-result-wide v2

    invoke-virtual {v0}, Landroid/location/Location;->getTime()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-lez v2, :cond_5

    .line 100
    :cond_3
    :goto_3
    sget-object v0, Lcom/mopub/common/MoPub$LocationAwareness;->TRUNCATED:Lcom/mopub/common/MoPub$LocationAwareness;

    if-ne p2, v0, :cond_4

    .line 101
    invoke-virtual {v1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v2

    .line 102
    invoke-static {v2, v3}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0, p1, v6}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->doubleValue()D

    move-result-wide v2

    .line 105
    invoke-virtual {v1, v2, v3}, Landroid/location/Location;->setLatitude(D)V

    .line 107
    invoke-virtual {v1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v2

    .line 108
    invoke-static {v2, v3}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0, p1, v6}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->doubleValue()D

    move-result-wide v2

    .line 111
    invoke-virtual {v1, v2, v3}, Landroid/location/Location;->setLongitude(D)V

    :cond_4
    move-object v2, v1

    .line 114
    goto :goto_0

    .line 67
    :catch_0
    move-exception v1

    const-string v1, "Failed to retrieve GPS location: access appears to be disabled."

    invoke-static {v1}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    move-object v1, v2

    .line 72
    goto :goto_1

    .line 69
    :catch_1
    move-exception v1

    const-string v1, "Failed to retrieve GPS location: device has no GPS provider."

    invoke-static {v1}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    move-object v1, v2

    .line 72
    goto :goto_1

    .line 71
    :catch_2
    move-exception v1

    const-string v1, "Failed to retrieve GPS location: device has no GPS provider."

    invoke-static {v1}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    move-object v1, v2

    goto :goto_1

    .line 78
    :catch_3
    move-exception v0

    const-string v0, "Failed to retrieve network location: access appears to be disabled."

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    move-object v0, v2

    .line 83
    goto :goto_2

    .line 80
    :catch_4
    move-exception v0

    const-string v0, "Failed to retrieve network location: device has no network provider."

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    move-object v0, v2

    .line 83
    goto :goto_2

    .line 82
    :catch_5
    move-exception v0

    const-string v0, "Failed to retrieve GPS location: device has no network provider."

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    move-object v0, v2

    goto :goto_2

    :cond_5
    move-object v1, v0

    .line 91
    goto :goto_3

    .line 93
    :cond_6
    if-nez v1, :cond_3

    move-object v1, v0

    .line 96
    goto :goto_3
.end method
