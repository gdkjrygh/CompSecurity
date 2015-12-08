.class public Lcom/rsa/mobilesdk/sdk/DeviceInfo;
.super Ljava/lang/Object;
.source "DeviceInfo.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;,
        Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;
    }
.end annotation


# static fields
.field public static final LOCATION_STATUS_DENY:I = 0x1

.field public static final LOCATION_STATUS_NOT_AVAILABLE:I = 0x2

.field public static final LOCATION_STATUS_NOT_SUPPORTED:I = 0x4

.field public static final LOCATION_STATUS_SUCCESS:I = 0x0

.field public static final LOCATION_STATUS_TIMEOUT:I = 0x3


# instance fields
.field CellTowerId:Ljava/lang/String;

.field DeviceModel:Ljava/lang/String;

.field DeviceMultitaskingSupported:Z

.field DeviceName:Ljava/lang/String;

.field DeviceSystemName:Ljava/lang/String;

.field DeviceSystemVersion:Ljava/lang/String;

.field GeoLocation:Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;

.field HardwareID:Ljava/lang/String;

.field Language:Ljava/lang/String;

.field LocationAreaCode:Ljava/lang/String;

.field MCC:Ljava/lang/String;

.field MNC:Ljava/lang/String;

.field NumberOfAddressBookEntries:I

.field OS_ID:Ljava/lang/String;

.field PhoneNumber:Ljava/lang/String;

.field RSA_ApplicationKey:Ljava/lang/String;

.field SIM_ID:Ljava/lang/String;

.field ScreenSize:Ljava/lang/String;

.field Vendor_ClientID:Ljava/lang/String;

.field WiFiMACAddress:Ljava/lang/String;

.field private mConfiguration:I

.field wfNetworksData:Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;


# direct methods
.method public constructor <init>(I)V
    .locals 2
    .param p1, "configuration"    # I

    .prologue
    const/4 v1, 0x0

    .line 180
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    iput-object v1, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->HardwareID:Ljava/lang/String;

    .line 64
    iput-object v1, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->SIM_ID:Ljava/lang/String;

    .line 70
    iput-object v1, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->PhoneNumber:Ljava/lang/String;

    .line 75
    iput-object v1, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->GeoLocation:Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;

    .line 80
    iput-object v1, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->DeviceModel:Ljava/lang/String;

    .line 85
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->DeviceMultitaskingSupported:Z

    .line 90
    iput-object v1, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->DeviceName:Ljava/lang/String;

    .line 95
    iput-object v1, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->DeviceSystemName:Ljava/lang/String;

    .line 100
    iput-object v1, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->DeviceSystemVersion:Ljava/lang/String;

    .line 105
    iput-object v1, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->Language:Ljava/lang/String;

    .line 111
    iput-object v1, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->WiFiMACAddress:Ljava/lang/String;

    .line 117
    iput-object v1, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->wfNetworksData:Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;

    .line 124
    iput-object v1, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->CellTowerId:Ljava/lang/String;

    .line 129
    iput-object v1, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->LocationAreaCode:Ljava/lang/String;

    .line 134
    iput-object v1, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->ScreenSize:Ljava/lang/String;

    .line 140
    const/4 v0, -0x1

    iput v0, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->NumberOfAddressBookEntries:I

    .line 148
    iput-object v1, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->RSA_ApplicationKey:Ljava/lang/String;

    .line 154
    iput-object v1, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->Vendor_ClientID:Ljava/lang/String;

    .line 159
    iput-object v1, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->MCC:Ljava/lang/String;

    .line 164
    iput-object v1, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->MNC:Ljava/lang/String;

    .line 177
    iput-object v1, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->OS_ID:Ljava/lang/String;

    .line 181
    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    .line 182
    new-instance v0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;

    invoke-direct {v0, p0}, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;-><init>(Lcom/rsa/mobilesdk/sdk/DeviceInfo;)V

    iput-object v0, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->GeoLocation:Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;

    .line 183
    new-instance v0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;

    invoke-direct {v0, p0}, Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;-><init>(Lcom/rsa/mobilesdk/sdk/DeviceInfo;)V

    iput-object v0, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->wfNetworksData:Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;

    .line 185
    :cond_0
    iput p1, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->mConfiguration:I

    .line 186
    return-void
.end method


# virtual methods
.method public resetData()V
    .locals 1

    .prologue
    .line 189
    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->GeoLocation:Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;

    if-eqz v0, :cond_0

    .line 190
    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->GeoLocation:Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;

    invoke-virtual {v0}, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;->invalidate()V

    .line 192
    :cond_0
    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->wfNetworksData:Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;

    if-eqz v0, :cond_1

    .line 193
    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->wfNetworksData:Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;

    invoke-virtual {v0}, Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;->reset()V

    .line 195
    :cond_1
    return-void
.end method

.method public toJSONString(Z)Ljava/lang/String;
    .locals 14
    .param p1, "addTimestamp"    # Z

    .prologue
    .line 488
    :try_start_0
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 489
    .local v6, "root":Lorg/json/JSONObject;
    if-eqz p1, :cond_0

    .line 490
    const-string v11, "TIMESTAMP"

    new-instance v12, Ljava/util/Date;

    invoke-direct {v12}, Ljava/util/Date;-><init>()V

    invoke-virtual {v12}, Ljava/util/Date;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v6, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 492
    :cond_0
    iget-object v11, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->HardwareID:Ljava/lang/String;

    if-eqz v11, :cond_1

    .line 493
    const-string v11, "HardwareID"

    iget-object v12, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->HardwareID:Ljava/lang/String;

    invoke-virtual {v6, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 495
    :cond_1
    iget-object v11, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->SIM_ID:Ljava/lang/String;

    if-eqz v11, :cond_2

    .line 496
    const-string v11, "SIM_ID"

    iget-object v12, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->SIM_ID:Ljava/lang/String;

    invoke-virtual {v6, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 498
    :cond_2
    iget-object v11, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->PhoneNumber:Ljava/lang/String;

    if-eqz v11, :cond_3

    .line 499
    const-string v11, "PhoneNumber"

    iget-object v12, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->PhoneNumber:Ljava/lang/String;

    invoke-virtual {v6, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 503
    :cond_3
    iget-object v11, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->GeoLocation:Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;

    if-eqz v11, :cond_b

    .line 504
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 505
    .local v3, "geo":Lorg/json/JSONObject;
    iget-object v11, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->GeoLocation:Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;

    iget-boolean v11, v11, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;->LongitudeAvailable:Z

    if-eqz v11, :cond_4

    .line 506
    const-string v11, "Longitude"

    iget-object v12, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->GeoLocation:Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;

    iget-wide v12, v12, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;->Longitude:D

    invoke-static {v12, v13}, Lcom/rsa/mobilesdk/sdk/Utils;->getDoubleString(D)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v3, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 508
    :cond_4
    iget-object v11, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->GeoLocation:Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;

    iget-boolean v11, v11, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;->LatitudeAvailable:Z

    if-eqz v11, :cond_5

    .line 509
    const-string v11, "Latitude"

    iget-object v12, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->GeoLocation:Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;

    iget-wide v12, v12, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;->Latitude:D

    invoke-static {v12, v13}, Lcom/rsa/mobilesdk/sdk/Utils;->getDoubleString(D)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v3, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 511
    :cond_5
    iget-object v11, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->GeoLocation:Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;

    iget-boolean v11, v11, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;->HorizontalAccuracyAvailable:Z

    if-eqz v11, :cond_6

    .line 512
    iget-object v11, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->GeoLocation:Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;

    iget-wide v12, v11, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;->HorizontalAccuracy:D

    invoke-static {v12, v13}, Ljava/lang/Math;->round(D)J

    move-result-wide v12

    long-to-int v5, v12

    .line 513
    .local v5, "horzAccuracyInt":I
    const-string v11, "HorizontalAccuracy"

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, ""

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v3, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 515
    .end local v5    # "horzAccuracyInt":I
    :cond_6
    iget-object v11, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->GeoLocation:Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;

    iget-boolean v11, v11, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;->AltitudeAvailable:Z

    if-eqz v11, :cond_7

    .line 516
    iget-object v11, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->GeoLocation:Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;

    iget-wide v12, v11, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;->Altitude:D

    invoke-static {v12, v13}, Ljava/lang/Math;->round(D)J

    move-result-wide v12

    long-to-int v1, v12

    .line 517
    .local v1, "altitudeInt":I
    const-string v11, "Altitude"

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, ""

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v3, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 519
    .end local v1    # "altitudeInt":I
    :cond_7
    iget-object v11, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->GeoLocation:Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;

    iget-boolean v11, v11, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;->AltitudeAccuracyAvailable:Z

    if-eqz v11, :cond_8

    .line 520
    iget-object v11, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->GeoLocation:Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;

    iget-wide v12, v11, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;->AltitudeAccuracy:D

    invoke-static {v12, v13}, Ljava/lang/Math;->round(D)J

    move-result-wide v12

    long-to-int v0, v12

    .line 521
    .local v0, "altitudeAccInt":I
    const-string v11, "AltitudeAccuracy"

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, ""

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v3, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 524
    .end local v0    # "altitudeAccInt":I
    :cond_8
    iget-object v11, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->GeoLocation:Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;

    iget-wide v8, v11, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;->Timestamp:J

    .line 525
    .local v8, "ts":J
    const-string v11, "Timestamp"

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, ""

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v3, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 526
    iget-object v11, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->GeoLocation:Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;

    iget-boolean v11, v11, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;->HeadingAvailable:Z

    if-eqz v11, :cond_9

    .line 527
    const-string v11, "Heading"

    iget-object v12, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->GeoLocation:Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;

    iget-wide v12, v12, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;->Heading:D

    invoke-static {v12, v13}, Lcom/rsa/mobilesdk/sdk/Utils;->getDoubleString(D)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v3, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 529
    :cond_9
    iget-object v11, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->GeoLocation:Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;

    iget-boolean v11, v11, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;->SpeedAvailable:Z

    if-eqz v11, :cond_a

    .line 530
    iget-object v11, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->GeoLocation:Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;

    iget-wide v12, v11, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;->Speed:D

    invoke-static {v12, v13}, Ljava/lang/Math;->round(D)J

    move-result-wide v12

    long-to-int v7, v12

    .line 531
    .local v7, "speedInt":I
    const-string v11, "Speed"

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, ""

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v3, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 533
    .end local v7    # "speedInt":I
    :cond_a
    const-string v11, "Status"

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, ""

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    iget-object v13, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->GeoLocation:Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;

    iget v13, v13, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;->LocationDataStatus:I

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v3, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 534
    new-instance v4, Lorg/json/JSONArray;

    invoke-direct {v4}, Lorg/json/JSONArray;-><init>()V

    .line 535
    .local v4, "geoarr":Lorg/json/JSONArray;
    invoke-virtual {v4, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 536
    const-string v11, "GeoLocationInfo"

    invoke-virtual {v6, v11, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 539
    .end local v3    # "geo":Lorg/json/JSONObject;
    .end local v4    # "geoarr":Lorg/json/JSONArray;
    .end local v8    # "ts":J
    :cond_b
    iget-object v11, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->DeviceModel:Ljava/lang/String;

    if-eqz v11, :cond_c

    .line 540
    const-string v11, "DeviceModel"

    iget-object v12, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->DeviceModel:Ljava/lang/String;

    invoke-virtual {v6, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 542
    :cond_c
    iget v11, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->mConfiguration:I

    const/4 v12, 0x1

    if-eq v11, v12, :cond_d

    iget v11, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->mConfiguration:I

    const/4 v12, 0x2

    if-ne v11, v12, :cond_e

    .line 544
    :cond_d
    const-string v11, "MultitaskingSupported"

    iget-boolean v12, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->DeviceMultitaskingSupported:Z

    invoke-static {v12}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v6, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 546
    :cond_e
    iget-object v11, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->DeviceName:Ljava/lang/String;

    if-eqz v11, :cond_f

    .line 547
    const-string v11, "DeviceName"

    iget-object v12, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->DeviceName:Ljava/lang/String;

    invoke-virtual {v6, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 549
    :cond_f
    iget-object v11, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->DeviceSystemName:Ljava/lang/String;

    if-eqz v11, :cond_10

    .line 550
    const-string v11, "DeviceSystemName"

    iget-object v12, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->DeviceSystemName:Ljava/lang/String;

    invoke-virtual {v6, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 552
    :cond_10
    iget-object v11, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->DeviceSystemVersion:Ljava/lang/String;

    if-eqz v11, :cond_11

    .line 553
    const-string v11, "DeviceSystemVersion"

    iget-object v12, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->DeviceSystemVersion:Ljava/lang/String;

    invoke-virtual {v6, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 555
    :cond_11
    iget-object v11, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->Language:Ljava/lang/String;

    if-eqz v11, :cond_12

    .line 556
    const-string v11, "Languages"

    iget-object v12, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->Language:Ljava/lang/String;

    invoke-virtual {v6, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 558
    :cond_12
    iget-object v11, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->WiFiMACAddress:Ljava/lang/String;

    if-eqz v11, :cond_13

    .line 559
    const-string v11, "WiFiMacAddress"

    iget-object v12, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->WiFiMACAddress:Ljava/lang/String;

    invoke-virtual {v6, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 563
    :cond_13
    iget-object v11, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->wfNetworksData:Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;

    if-eqz v11, :cond_17

    .line 564
    new-instance v10, Lorg/json/JSONObject;

    invoke-direct {v10}, Lorg/json/JSONObject;-><init>()V

    .line 565
    .local v10, "wobj":Lorg/json/JSONObject;
    iget-object v11, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->wfNetworksData:Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;

    iget-object v11, v11, Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;->StationName:Ljava/lang/String;

    if-eqz v11, :cond_14

    .line 566
    const-string v11, "StationName"

    iget-object v12, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->wfNetworksData:Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;

    iget-object v12, v12, Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;->StationName:Ljava/lang/String;

    invoke-virtual {v10, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 568
    :cond_14
    iget-object v11, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->wfNetworksData:Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;

    iget-object v11, v11, Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;->BBSID:Ljava/lang/String;

    if-eqz v11, :cond_15

    .line 569
    const-string v11, "BBSID"

    iget-object v12, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->wfNetworksData:Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;

    iget-object v12, v12, Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;->BBSID:Ljava/lang/String;

    invoke-virtual {v10, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 571
    :cond_15
    const-string v11, "SignalStrength"

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, ""

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    iget-object v13, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->wfNetworksData:Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;

    iget v13, v13, Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;->SignalStrength:I

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v10, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 572
    const-string v11, "Channel"

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, ""

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    iget-object v13, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->wfNetworksData:Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;

    iget-object v13, v13, Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;->Channel:Ljava/lang/String;

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v10, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 573
    iget-object v11, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->wfNetworksData:Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;

    iget-object v11, v11, Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;->SSID:Ljava/lang/String;

    if-eqz v11, :cond_16

    .line 574
    const-string v11, "SSID"

    iget-object v12, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->wfNetworksData:Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;

    iget-object v12, v12, Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;->SSID:Ljava/lang/String;

    invoke-virtual {v10, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 576
    :cond_16
    invoke-virtual {v10}, Lorg/json/JSONObject;->length()I

    move-result v11

    if-lez v11, :cond_17

    .line 577
    const-string v11, "WiFiNetworksData"

    invoke-virtual {v6, v11, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 581
    .end local v10    # "wobj":Lorg/json/JSONObject;
    :cond_17
    iget-object v11, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->CellTowerId:Ljava/lang/String;

    if-eqz v11, :cond_18

    .line 582
    const-string v11, "CellTowerId"

    iget-object v12, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->CellTowerId:Ljava/lang/String;

    invoke-virtual {v6, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 584
    :cond_18
    iget-object v11, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->LocationAreaCode:Ljava/lang/String;

    if-eqz v11, :cond_19

    .line 585
    const-string v11, "LocationAreaCode"

    iget-object v12, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->LocationAreaCode:Ljava/lang/String;

    invoke-virtual {v6, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 587
    :cond_19
    iget-object v11, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->ScreenSize:Ljava/lang/String;

    if-eqz v11, :cond_1a

    .line 588
    const-string v11, "ScreenSize"

    iget-object v12, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->ScreenSize:Ljava/lang/String;

    invoke-virtual {v6, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 590
    :cond_1a
    iget v11, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->mConfiguration:I

    const/4 v12, 0x2

    if-ne v11, v12, :cond_1b

    .line 591
    const-string v11, "NumberOfAddressBookEntries"

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, ""

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    iget v13, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->NumberOfAddressBookEntries:I

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v6, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 593
    :cond_1b
    iget-object v11, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->RSA_ApplicationKey:Ljava/lang/String;

    if-eqz v11, :cond_1c

    .line 594
    const-string v11, "RSA_ApplicationKey"

    iget-object v12, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->RSA_ApplicationKey:Ljava/lang/String;

    invoke-virtual {v6, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 596
    :cond_1c
    iget-object v11, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->MCC:Ljava/lang/String;

    if-eqz v11, :cond_1d

    .line 597
    const-string v11, "MCC"

    iget-object v12, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->MCC:Ljava/lang/String;

    invoke-virtual {v6, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 599
    :cond_1d
    iget-object v11, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->MNC:Ljava/lang/String;

    if-eqz v11, :cond_1e

    .line 600
    const-string v11, "MNC"

    iget-object v12, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->MNC:Ljava/lang/String;

    invoke-virtual {v6, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 602
    :cond_1e
    iget-object v11, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->OS_ID:Ljava/lang/String;

    if-eqz v11, :cond_1f

    .line 603
    const-string v11, "OS_ID"

    iget-object v12, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->OS_ID:Ljava/lang/String;

    invoke-virtual {v6, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 605
    :cond_1f
    const-string v11, "SDK_VERSION"

    const-string v12, "1.00.00"

    invoke-virtual {v6, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 606
    const/4 v11, 0x0

    invoke-virtual {v6, v11}, Lorg/json/JSONObject;->toString(I)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v11

    .line 609
    .end local v6    # "root":Lorg/json/JSONObject;
    :goto_0
    return-object v11

    .line 607
    :catch_0
    move-exception v2

    .line 609
    .local v2, "e":Lorg/json/JSONException;
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "JSONStringFailure:"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v2}, Lorg/json/JSONException;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    goto :goto_0
.end method
