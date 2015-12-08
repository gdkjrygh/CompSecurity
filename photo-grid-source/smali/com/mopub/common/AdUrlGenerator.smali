.class public abstract Lcom/mopub/common/AdUrlGenerator;
.super Lcom/mopub/common/BaseUrlGenerator;
.source "SourceFile"


# instance fields
.field protected a:Landroid/content/Context;

.field protected b:Ljava/lang/String;

.field protected c:Ljava/lang/String;

.field protected d:Landroid/location/Location;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 109
    invoke-direct {p0}, Lcom/mopub/common/BaseUrlGenerator;-><init>()V

    .line 110
    iput-object p1, p0, Lcom/mopub/common/AdUrlGenerator;->a:Landroid/content/Context;

    .line 111
    return-void
.end method

.method private static e(Ljava/lang/String;)I
    .locals 2

    .prologue
    .line 251
    const/4 v0, 0x3

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    return v0
.end method


# virtual methods
.method protected final a()V
    .locals 2

    .prologue
    .line 177
    const-string v0, "mr"

    const-string v1, "0"

    invoke-virtual {p0, v0, v1}, Lcom/mopub/common/AdUrlGenerator;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 179
    return-void
.end method

.method protected final a(Lcom/mopub/common/ClientMetadata;)V
    .locals 9

    .prologue
    const/4 v8, 0x0

    .line 210
    iget-object v0, p0, Lcom/mopub/common/AdUrlGenerator;->b:Ljava/lang/String;

    .line 1129
    const-string v1, "id"

    invoke-virtual {p0, v1, v0}, Lcom/mopub/common/AdUrlGenerator;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 212
    invoke-virtual {p1}, Lcom/mopub/common/ClientMetadata;->getSdkVersion()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/mopub/common/AdUrlGenerator;->a(Ljava/lang/String;)V

    .line 213
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    invoke-virtual {p1}, Lcom/mopub/common/ClientMetadata;->getDeviceManufacturer()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v8

    const/4 v1, 0x1

    invoke-virtual {p1}, Lcom/mopub/common/ClientMetadata;->getDeviceModel()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    invoke-virtual {p1}, Lcom/mopub/common/ClientMetadata;->getDeviceProduct()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-virtual {p0, v0}, Lcom/mopub/common/AdUrlGenerator;->a([Ljava/lang/String;)V

    .line 216
    invoke-virtual {p1}, Lcom/mopub/common/ClientMetadata;->getAppPackageName()Ljava/lang/String;

    move-result-object v0

    .line 1204
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 1205
    const-string v1, "bundle"

    invoke-virtual {p0, v1, v0}, Lcom/mopub/common/AdUrlGenerator;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 218
    :cond_0
    iget-object v0, p0, Lcom/mopub/common/AdUrlGenerator;->c:Ljava/lang/String;

    .line 2137
    const-string v1, "q"

    invoke-virtual {p0, v1, v0}, Lcom/mopub/common/AdUrlGenerator;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 220
    iget-object v0, p0, Lcom/mopub/common/AdUrlGenerator;->d:Landroid/location/Location;

    .line 2142
    iget-object v1, p0, Lcom/mopub/common/AdUrlGenerator;->a:Landroid/content/Context;

    invoke-static {}, Lcom/mopub/common/MoPub;->getLocationPrecision()I

    move-result v2

    invoke-static {}, Lcom/mopub/common/MoPub;->getLocationAwareness()Lcom/mopub/common/MoPub$LocationAwareness;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lcom/mopub/common/LocationService;->getLastKnownLocation(Landroid/content/Context;ILcom/mopub/common/MoPub$LocationAwareness;)Landroid/location/Location;

    move-result-object v1

    .line 2146
    if-eqz v1, :cond_2

    if-eqz v0, :cond_1

    invoke-virtual {v1}, Landroid/location/Location;->getTime()J

    move-result-wide v2

    invoke-virtual {v0}, Landroid/location/Location;->getTime()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-ltz v2, :cond_2

    :cond_1
    move-object v0, v1

    .line 2151
    :cond_2
    if-eqz v0, :cond_3

    .line 2152
    const-string v2, "ll"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ","

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v2, v3}, Lcom/mopub/common/AdUrlGenerator;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2153
    const-string v2, "lla"

    invoke-virtual {v0}, Landroid/location/Location;->getAccuracy()F

    move-result v3

    float-to-int v3, v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v2, v3}, Lcom/mopub/common/AdUrlGenerator;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2154
    const-string v2, "llf"

    .line 2255
    invoke-static {v0}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;)V

    .line 2256
    invoke-virtual {v0}, Landroid/location/Location;->getTime()J

    move-result-wide v4

    .line 2257
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 2258
    sub-long v4, v6, v4

    long-to-int v3, v4

    .line 2154
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v2, v3}, Lcom/mopub/common/AdUrlGenerator;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2157
    if-ne v0, v1, :cond_3

    .line 2158
    const-string v0, "llsdk"

    const-string v1, "1"

    invoke-virtual {p0, v0, v1}, Lcom/mopub/common/AdUrlGenerator;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 222
    :cond_3
    invoke-static {}, Lcom/mopub/common/util/DateAndTime;->getTimeZoneOffsetString()Ljava/lang/String;

    move-result-object v0

    .line 3164
    const-string v1, "z"

    invoke-virtual {p0, v1, v0}, Lcom/mopub/common/AdUrlGenerator;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 224
    invoke-virtual {p1}, Lcom/mopub/common/ClientMetadata;->getOrientationString()Ljava/lang/String;

    move-result-object v0

    .line 3168
    const-string v1, "o"

    invoke-virtual {p0, v1, v0}, Lcom/mopub/common/AdUrlGenerator;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 225
    invoke-virtual {p1}, Lcom/mopub/common/ClientMetadata;->getDeviceDimensions()Landroid/graphics/Point;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/mopub/common/AdUrlGenerator;->a(Landroid/graphics/Point;)V

    .line 226
    invoke-virtual {p1}, Lcom/mopub/common/ClientMetadata;->getDensity()F

    move-result v0

    .line 3172
    const-string v1, "sc_a"

    invoke-static {v0}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Lcom/mopub/common/AdUrlGenerator;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 228
    invoke-virtual {p1}, Lcom/mopub/common/ClientMetadata;->getNetworkOperatorForUrl()Ljava/lang/String;

    move-result-object v1

    .line 3182
    if-nez v1, :cond_4

    const-string v0, ""

    .line 3183
    :goto_0
    const-string v2, "mcc"

    invoke-virtual {p0, v2, v0}, Lcom/mopub/common/AdUrlGenerator;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 3187
    if-nez v1, :cond_5

    const-string v0, ""

    .line 3188
    :goto_1
    const-string v1, "mnc"

    invoke-virtual {p0, v1, v0}, Lcom/mopub/common/AdUrlGenerator;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 232
    invoke-virtual {p1}, Lcom/mopub/common/ClientMetadata;->getIsoCountryCode()Ljava/lang/String;

    move-result-object v0

    .line 3192
    const-string v1, "iso"

    invoke-virtual {p0, v1, v0}, Lcom/mopub/common/AdUrlGenerator;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 233
    invoke-virtual {p1}, Lcom/mopub/common/ClientMetadata;->getNetworkOperatorName()Ljava/lang/String;

    move-result-object v0

    .line 3196
    const-string v1, "cn"

    invoke-virtual {p0, v1, v0}, Lcom/mopub/common/AdUrlGenerator;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 235
    invoke-virtual {p1}, Lcom/mopub/common/ClientMetadata;->getActiveNetworkType()Lcom/mopub/common/ClientMetadata$MoPubNetworkType;

    move-result-object v0

    .line 3200
    const-string v1, "ct"

    .line 3247
    invoke-virtual {v0}, Lcom/mopub/common/ClientMetadata$MoPubNetworkType;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Lcom/mopub/common/AdUrlGenerator;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 237
    invoke-virtual {p1}, Lcom/mopub/common/ClientMetadata;->getAppVersion()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/mopub/common/AdUrlGenerator;->c(Ljava/lang/String;)V

    .line 240
    invoke-virtual {p1}, Lcom/mopub/common/ClientMetadata;->getDeviceId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/mopub/common/AdUrlGenerator;->d(Ljava/lang/String;)V

    .line 241
    invoke-virtual {p1}, Lcom/mopub/common/ClientMetadata;->isDoNotTrackSet()Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/mopub/common/AdUrlGenerator;->b(Z)V

    .line 244
    return-void

    .line 3182
    :cond_4
    invoke-static {v1}, Lcom/mopub/common/AdUrlGenerator;->e(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v8, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 3187
    :cond_5
    invoke-static {v1}, Lcom/mopub/common/AdUrlGenerator;->e(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_1
.end method

.method protected a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 133
    const-string v0, "nv"

    invoke-virtual {p0, v0, p1}, Lcom/mopub/common/AdUrlGenerator;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    return-void
.end method

.method public withAdUnitId(Ljava/lang/String;)Lcom/mopub/common/AdUrlGenerator;
    .locals 0

    .prologue
    .line 114
    iput-object p1, p0, Lcom/mopub/common/AdUrlGenerator;->b:Ljava/lang/String;

    .line 115
    return-object p0
.end method

.method public withFacebookSupported(Z)Lcom/mopub/common/AdUrlGenerator;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 266
    return-object p0
.end method

.method public withKeywords(Ljava/lang/String;)Lcom/mopub/common/AdUrlGenerator;
    .locals 0

    .prologue
    .line 119
    iput-object p1, p0, Lcom/mopub/common/AdUrlGenerator;->c:Ljava/lang/String;

    .line 120
    return-object p0
.end method

.method public withLocation(Landroid/location/Location;)Lcom/mopub/common/AdUrlGenerator;
    .locals 0

    .prologue
    .line 124
    iput-object p1, p0, Lcom/mopub/common/AdUrlGenerator;->d:Landroid/location/Location;

    .line 125
    return-object p0
.end method
