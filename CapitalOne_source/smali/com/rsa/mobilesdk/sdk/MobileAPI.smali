.class public Lcom/rsa/mobilesdk/sdk/MobileAPI;
.super Ljava/lang/Object;
.source "MobileAPI.java"


# static fields
.field public static final ADD_TIMESTAMP_KEY:Ljava/lang/String; = "Add-timestamp-key"

.field public static final BEST_LOCATION_AGE_MINUTES_DEFAULT_VALUE:I = 0x3

.field public static final BEST_LOCATION_AGE_MINUTES_KEY:Ljava/lang/String; = "Best-location-age-key"

.field public static final CELL_TOWER_ID:I = 0xd

.field public static final COLLECT_ALL_DEVICE_DATA_AND_LOCATION:I = 0x2

.field public static final COLLECT_BASIC_DEVICE_DATA_ONLY:I = 0x0

.field public static final COLLECT_DEVICE_DATA_ONLY:I = 0x1

.field public static final CONFIGURATION_DEFAULT_VALUE:I = 0x0

.field public static final CONFIGURATION_KEY:Ljava/lang/String; = "Configuration-key"

.field public static final DEVICE_MODEL:I = 0x5

.field public static final DEVICE_MULTITASKING_SUPPORTED:I = 0x6

.field public static final DEVICE_NAME:I = 0x7

.field public static final DEVICE_SYSTEM_NAME:I = 0x8

.field public static final DEVICE_SYSTEM_VERSION:I = 0x9

.field public static final HARDWARE_ID:I = 0x1

.field public static final LANGUAGE:I = 0xa

.field public static final LOCATION_AREA_CODE:I = 0xe

.field public static final MAX_ACCURACY_DEFAULT_VALUE:I = 0x64

.field public static final MAX_ACCURACY_KEY:Ljava/lang/String; = "Max-accuracy-key"

.field private static final MAX_API_ID:I = 0x14

.field public static final MAX_LOCATION_AGE_DAYS_DEFAULT_VALUE:I = 0x2

.field public static final MAX_LOCATION_AGE_DAYS_KEY:Ljava/lang/String; = "Max-location-age-key"

.field public static final MCC:I = 0x12

.field public static final MNC:I = 0x13

.field public static final NOT_IMPLEMENTED:I = 0x2

.field public static final NUMBER_OF_BOOK_ENTRIES:I = 0x10

.field public static final OS_ID:I = 0x14

.field public static final PERMISSION_DENIED:I = 0x1

.field public static final PHONE_NUMBER:I = 0x3

.field public static final QUERY_GEO_LOCATION_DATA:I = 0x4

.field private static final RESULT_NO_PERMISSIONS:Ljava/lang/String; = "-1"

.field private static final RESULT_NO_PERMISSIONS_INT:I = -0x1

.field public static final RSA_APPLICATION_KEY:I = 0x11

.field public static final SCREEN_SIZE:I = 0xf

.field public static final SDK_VERSION:I = 0x0

.field public static final SILENT_PERIOD_DEFAULT_VALUE:I = 0x3

.field public static final SILENT_PERIOD_MINUTES_KEY:Ljava/lang/String; = "Silent-period-key"

.field public static final SIM_ID:I = 0x2

.field public static final SUCCESS:I = 0x0

.field private static final TAG:Ljava/lang/String; = "MobileAPI"

.field public static final TIMEOUT_DEFAULT_VALUE:I = 0x2

.field public static final TIMEOUT_MINUTES_KEY:Ljava/lang/String; = "Timeout-key"

.field public static final UNKNOWN_ERROR:I = -0x1

.field public static final WI_FI_MAC_ADDRESS:I = 0xb

.field public static final WI_FI_NETWORKS_DATA:I = 0xc

.field private static sInstance:Lcom/rsa/mobilesdk/sdk/MobileAPI;


# instance fields
.field private mAPI_state:[I

.field private mAddTimestamp:Z

.field private mConfiguration:I

.field private final mContext:Landroid/content/Context;

.field private mDeviceInfo:Lcom/rsa/mobilesdk/sdk/DeviceInfo;

.field private mLocationBestAgeMinutes:I

.field private mLocationMaxAccuracy:I

.field private mLocationMaxAgeDays:I

.field private mLocationRetriever:Lcom/rsa/mobilesdk/sdk/LocationRetriever;

.field private mLocationSilentPeriod:I

.field private mLocationTimeout:I

.field private mScreenHeight:I

.field private mScreenWidth:I

.field private final mTelephonyManager:Landroid/telephony/TelephonyManager;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 377
    const/4 v0, 0x0

    sput-object v0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->sInstance:Lcom/rsa/mobilesdk/sdk/MobileAPI;

    return-void
.end method

.method private constructor <init>(Landroid/app/Activity;)V
    .locals 3
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 451
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 389
    iput-object v1, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mDeviceInfo:Lcom/rsa/mobilesdk/sdk/DeviceInfo;

    .line 393
    iput-object v1, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mLocationRetriever:Lcom/rsa/mobilesdk/sdk/LocationRetriever;

    .line 397
    iput v2, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mConfiguration:I

    .line 401
    const/16 v1, 0x15

    new-array v1, v1, [I

    iput-object v1, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mAPI_state:[I

    .line 405
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mAddTimestamp:Z

    .line 452
    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iput-object v1, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mContext:Landroid/content/Context;

    .line 458
    invoke-virtual {p1}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v1

    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    .line 459
    .local v0, "disp":Landroid/view/Display;
    if-eqz v0, :cond_0

    .line 460
    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v1

    iput v1, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mScreenWidth:I

    .line 461
    invoke-virtual {v0}, Landroid/view/Display;->getHeight()I

    move-result v1

    iput v1, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mScreenHeight:I

    .line 467
    :goto_0
    iget-object v1, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mContext:Landroid/content/Context;

    const-string v2, "phone"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/telephony/TelephonyManager;

    iput-object v1, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mTelephonyManager:Landroid/telephony/TelephonyManager;

    .line 469
    return-void

    .line 463
    :cond_0
    iput v2, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mScreenWidth:I

    .line 464
    iput v2, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mScreenHeight:I

    goto :goto_0
.end method

.method static synthetic access$000(Lcom/rsa/mobilesdk/sdk/MobileAPI;)[I
    .locals 1
    .param p0, "x0"    # Lcom/rsa/mobilesdk/sdk/MobileAPI;

    .prologue
    .line 31
    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mAPI_state:[I

    return-object v0
.end method

.method static synthetic access$100(Lcom/rsa/mobilesdk/sdk/MobileAPI;)Lcom/rsa/mobilesdk/sdk/DeviceInfo;
    .locals 1
    .param p0, "x0"    # Lcom/rsa/mobilesdk/sdk/MobileAPI;

    .prologue
    .line 31
    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mDeviceInfo:Lcom/rsa/mobilesdk/sdk/DeviceInfo;

    return-object v0
.end method

.method private collectBasicDeviceData()V
    .locals 2

    .prologue
    .line 574
    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mDeviceInfo:Lcom/rsa/mobilesdk/sdk/DeviceInfo;

    invoke-virtual {p0}, Lcom/rsa/mobilesdk/sdk/MobileAPI;->getDeviceId()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->HardwareID:Ljava/lang/String;

    .line 575
    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mDeviceInfo:Lcom/rsa/mobilesdk/sdk/DeviceInfo;

    invoke-virtual {p0}, Lcom/rsa/mobilesdk/sdk/MobileAPI;->getSubscriberId()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->SIM_ID:Ljava/lang/String;

    .line 576
    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mDeviceInfo:Lcom/rsa/mobilesdk/sdk/DeviceInfo;

    invoke-virtual {p0}, Lcom/rsa/mobilesdk/sdk/MobileAPI;->getPhoneNumber()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->PhoneNumber:Ljava/lang/String;

    .line 577
    return-void
.end method

.method private collectDeviceData()V
    .locals 2

    .prologue
    .line 619
    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mDeviceInfo:Lcom/rsa/mobilesdk/sdk/DeviceInfo;

    invoke-virtual {p0}, Lcom/rsa/mobilesdk/sdk/MobileAPI;->getDeviceModel()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->DeviceModel:Ljava/lang/String;

    .line 620
    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mDeviceInfo:Lcom/rsa/mobilesdk/sdk/DeviceInfo;

    invoke-virtual {p0}, Lcom/rsa/mobilesdk/sdk/MobileAPI;->isMultitaskingSupported()Z

    move-result v1

    iput-boolean v1, v0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->DeviceMultitaskingSupported:Z

    .line 621
    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mDeviceInfo:Lcom/rsa/mobilesdk/sdk/DeviceInfo;

    invoke-virtual {p0}, Lcom/rsa/mobilesdk/sdk/MobileAPI;->getDeviceName()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->DeviceName:Ljava/lang/String;

    .line 622
    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mDeviceInfo:Lcom/rsa/mobilesdk/sdk/DeviceInfo;

    invoke-virtual {p0}, Lcom/rsa/mobilesdk/sdk/MobileAPI;->getDeviceSystemName()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->DeviceSystemName:Ljava/lang/String;

    .line 623
    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mDeviceInfo:Lcom/rsa/mobilesdk/sdk/DeviceInfo;

    invoke-virtual {p0}, Lcom/rsa/mobilesdk/sdk/MobileAPI;->getDeviceSystemVersion()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->DeviceSystemVersion:Ljava/lang/String;

    .line 624
    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mDeviceInfo:Lcom/rsa/mobilesdk/sdk/DeviceInfo;

    invoke-virtual {p0}, Lcom/rsa/mobilesdk/sdk/MobileAPI;->getScreenSize()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->ScreenSize:Ljava/lang/String;

    .line 625
    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mDeviceInfo:Lcom/rsa/mobilesdk/sdk/DeviceInfo;

    invoke-virtual {p0}, Lcom/rsa/mobilesdk/sdk/MobileAPI;->getLanguage()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->Language:Ljava/lang/String;

    .line 626
    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mDeviceInfo:Lcom/rsa/mobilesdk/sdk/DeviceInfo;

    invoke-virtual {p0}, Lcom/rsa/mobilesdk/sdk/MobileAPI;->getWiFiMacAddress()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->WiFiMACAddress:Ljava/lang/String;

    .line 627
    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mDeviceInfo:Lcom/rsa/mobilesdk/sdk/DeviceInfo;

    invoke-virtual {p0}, Lcom/rsa/mobilesdk/sdk/MobileAPI;->getOsId()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->OS_ID:Ljava/lang/String;

    .line 629
    return-void
.end method

.method private collectDeviceLocationAndNetworkData(Ljava/util/Properties;)V
    .locals 13
    .param p1, "params"    # Ljava/util/Properties;

    .prologue
    .line 587
    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mLocationRetriever:Lcom/rsa/mobilesdk/sdk/LocationRetriever;

    if-nez v0, :cond_0

    .line 588
    new-instance v0, Lcom/rsa/mobilesdk/sdk/LocationRetriever;

    invoke-direct {v0}, Lcom/rsa/mobilesdk/sdk/LocationRetriever;-><init>()V

    iput-object v0, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mLocationRetriever:Lcom/rsa/mobilesdk/sdk/LocationRetriever;

    .line 591
    :cond_0
    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mLocationRetriever:Lcom/rsa/mobilesdk/sdk/LocationRetriever;

    iget-object v1, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mContext:Landroid/content/Context;

    iget v2, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mLocationTimeout:I

    int-to-long v2, v2

    iget v4, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mLocationSilentPeriod:I

    int-to-long v4, v4

    iget v6, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mLocationBestAgeMinutes:I

    int-to-long v6, v6

    iget v8, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mLocationMaxAgeDays:I

    int-to-long v8, v8

    iget v10, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mLocationMaxAccuracy:I

    iget-object v11, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mDeviceInfo:Lcom/rsa/mobilesdk/sdk/DeviceInfo;

    iget-object v11, v11, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->GeoLocation:Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;

    new-instance v12, Lcom/rsa/mobilesdk/sdk/MobileAPI$1;

    invoke-direct {v12, p0}, Lcom/rsa/mobilesdk/sdk/MobileAPI$1;-><init>(Lcom/rsa/mobilesdk/sdk/MobileAPI;)V

    invoke-virtual/range {v0 .. v12}, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->queryLocation(Landroid/content/Context;JJJJILcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;Lcom/rsa/mobilesdk/sdk/LocationRetriever$OnLocationDataChangedListener;)V

    .line 605
    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mDeviceInfo:Lcom/rsa/mobilesdk/sdk/DeviceInfo;

    iget-object v0, v0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->wfNetworksData:Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;

    invoke-virtual {p0, v0}, Lcom/rsa/mobilesdk/sdk/MobileAPI;->getWiFiNetworksData(Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;)Ljava/lang/String;

    .line 606
    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mDeviceInfo:Lcom/rsa/mobilesdk/sdk/DeviceInfo;

    invoke-virtual {p0}, Lcom/rsa/mobilesdk/sdk/MobileAPI;->getRsaApplicationKey()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->RSA_ApplicationKey:Ljava/lang/String;

    .line 607
    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mDeviceInfo:Lcom/rsa/mobilesdk/sdk/DeviceInfo;

    invoke-virtual {p0}, Lcom/rsa/mobilesdk/sdk/MobileAPI;->getMCC()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->MCC:Ljava/lang/String;

    .line 608
    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mDeviceInfo:Lcom/rsa/mobilesdk/sdk/DeviceInfo;

    invoke-virtual {p0}, Lcom/rsa/mobilesdk/sdk/MobileAPI;->getMNC()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->MNC:Ljava/lang/String;

    .line 609
    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mDeviceInfo:Lcom/rsa/mobilesdk/sdk/DeviceInfo;

    invoke-virtual {p0}, Lcom/rsa/mobilesdk/sdk/MobileAPI;->getCellTowerId()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->CellTowerId:Ljava/lang/String;

    .line 610
    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mDeviceInfo:Lcom/rsa/mobilesdk/sdk/DeviceInfo;

    invoke-virtual {p0}, Lcom/rsa/mobilesdk/sdk/MobileAPI;->getLocationAreaCode()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->LocationAreaCode:Ljava/lang/String;

    .line 611
    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mDeviceInfo:Lcom/rsa/mobilesdk/sdk/DeviceInfo;

    invoke-virtual {p0}, Lcom/rsa/mobilesdk/sdk/MobileAPI;->getNumberOfBookEntries()I

    move-result v1

    iput v1, v0, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->NumberOfAddressBookEntries:I

    .line 612
    return-void
.end method

.method private destroySDK()V
    .locals 1

    .prologue
    .line 1157
    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mDeviceInfo:Lcom/rsa/mobilesdk/sdk/DeviceInfo;

    if-eqz v0, :cond_0

    .line 1158
    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mDeviceInfo:Lcom/rsa/mobilesdk/sdk/DeviceInfo;

    invoke-virtual {v0}, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->resetData()V

    .line 1159
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mDeviceInfo:Lcom/rsa/mobilesdk/sdk/DeviceInfo;

    .line 1161
    :cond_0
    return-void
.end method

.method public static declared-synchronized getInstance(Landroid/app/Activity;)Lcom/rsa/mobilesdk/sdk/MobileAPI;
    .locals 2
    .param p0, "activity"    # Landroid/app/Activity;

    .prologue
    .line 440
    const-class v1, Lcom/rsa/mobilesdk/sdk/MobileAPI;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->sInstance:Lcom/rsa/mobilesdk/sdk/MobileAPI;

    if-nez v0, :cond_0

    .line 441
    new-instance v0, Lcom/rsa/mobilesdk/sdk/MobileAPI;

    invoke-direct {v0, p0}, Lcom/rsa/mobilesdk/sdk/MobileAPI;-><init>(Landroid/app/Activity;)V

    sput-object v0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->sInstance:Lcom/rsa/mobilesdk/sdk/MobileAPI;

    .line 443
    :cond_0
    sget-object v0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->sInstance:Lcom/rsa/mobilesdk/sdk/MobileAPI;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 440
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method private initAndValidateProperties(Ljava/util/Properties;)V
    .locals 6
    .param p1, "properties"    # Ljava/util/Properties;

    .prologue
    const/4 v5, 0x4

    const/4 v1, 0x0

    const/4 v4, 0x3

    const/4 v3, 0x1

    const/4 v2, 0x2

    .line 526
    const-string v0, "Configuration-key"

    invoke-static {p1, v0, v1}, Lcom/rsa/mobilesdk/sdk/Utils;->getIntProperty(Ljava/util/Properties;Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mConfiguration:I

    .line 527
    iget v0, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mConfiguration:I

    if-ltz v0, :cond_0

    iget v0, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mConfiguration:I

    if-le v0, v2, :cond_1

    .line 529
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "invalid configuration key: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mConfiguration:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 531
    :cond_1
    const-string v0, "Add-timestamp-key"

    invoke-static {p1, v0, v1}, Lcom/rsa/mobilesdk/sdk/Utils;->getBooleanProperty(Ljava/util/Properties;Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mAddTimestamp:Z

    .line 533
    iget v0, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mConfiguration:I

    if-ne v0, v2, :cond_b

    .line 535
    const-string v0, "Timeout-key"

    invoke-static {p1, v0, v2}, Lcom/rsa/mobilesdk/sdk/Utils;->getIntProperty(Ljava/util/Properties;Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mLocationTimeout:I

    .line 537
    iget v0, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mLocationTimeout:I

    if-lt v0, v3, :cond_2

    iget v0, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mLocationTimeout:I

    if-le v0, v5, :cond_3

    .line 538
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "invalid TIMEOUT_MINUTES_KEY: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mLocationTimeout:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 541
    :cond_3
    const-string v0, "Silent-period-key"

    invoke-static {p1, v0, v4}, Lcom/rsa/mobilesdk/sdk/Utils;->getIntProperty(Ljava/util/Properties;Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mLocationSilentPeriod:I

    .line 543
    iget v0, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mLocationSilentPeriod:I

    if-lt v0, v3, :cond_4

    iget v0, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mLocationSilentPeriod:I

    const/16 v1, 0x3c

    if-le v0, v1, :cond_5

    .line 544
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "invalid SILENT_PERIOD_MINUTES_KEY: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mLocationSilentPeriod:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 547
    :cond_5
    const-string v0, "Best-location-age-key"

    invoke-static {p1, v0, v4}, Lcom/rsa/mobilesdk/sdk/Utils;->getIntProperty(Ljava/util/Properties;Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mLocationBestAgeMinutes:I

    .line 550
    iget v0, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mLocationBestAgeMinutes:I

    if-lt v0, v2, :cond_6

    iget v0, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mLocationBestAgeMinutes:I

    if-le v0, v5, :cond_7

    .line 551
    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "invalid BEST_LOCATION_AGE_MINUTES_KEY: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mLocationBestAgeMinutes:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 554
    :cond_7
    const-string v0, "Max-location-age-key"

    invoke-static {p1, v0, v2}, Lcom/rsa/mobilesdk/sdk/Utils;->getIntProperty(Ljava/util/Properties;Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mLocationMaxAgeDays:I

    .line 556
    iget v0, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mLocationMaxAgeDays:I

    if-lt v0, v3, :cond_8

    iget v0, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mLocationMaxAgeDays:I

    if-le v0, v4, :cond_9

    .line 557
    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "invalid MAX_LOCATION_AGE_DAYS_KEY: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mLocationMaxAgeDays:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 560
    :cond_9
    const-string v0, "Max-accuracy-key"

    const/16 v1, 0x64

    invoke-static {p1, v0, v1}, Lcom/rsa/mobilesdk/sdk/Utils;->getIntProperty(Ljava/util/Properties;Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mLocationMaxAccuracy:I

    .line 562
    iget v0, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mLocationMaxAccuracy:I

    const/16 v1, 0x32

    if-lt v0, v1, :cond_a

    iget v0, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mLocationMaxAccuracy:I

    const/16 v1, 0xc8

    if-le v0, v1, :cond_b

    .line 563
    :cond_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "invalid MAX_ACCURACY_KEY: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mLocationMaxAccuracy:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 567
    :cond_b
    return-void
.end method

.method private stopLocations()V
    .locals 1

    .prologue
    .line 1165
    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mLocationRetriever:Lcom/rsa/mobilesdk/sdk/LocationRetriever;

    if-eqz v0, :cond_0

    .line 1166
    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mLocationRetriever:Lcom/rsa/mobilesdk/sdk/LocationRetriever;

    invoke-virtual {v0}, Lcom/rsa/mobilesdk/sdk/LocationRetriever;->release()V

    .line 1167
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mLocationRetriever:Lcom/rsa/mobilesdk/sdk/LocationRetriever;

    .line 1169
    :cond_0
    return-void
.end method


# virtual methods
.method public declared-synchronized collectInfo()Ljava/lang/String;
    .locals 3

    .prologue
    .line 1135
    monitor-enter p0

    :try_start_0
    iget-object v1, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mDeviceInfo:Lcom/rsa/mobilesdk/sdk/DeviceInfo;

    if-nez v1, :cond_0

    .line 1136
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Mobile SDK was not initialized"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1135
    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1

    .line 1138
    :cond_0
    :try_start_1
    iget-object v1, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mDeviceInfo:Lcom/rsa/mobilesdk/sdk/DeviceInfo;

    iget-boolean v2, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mAddTimestamp:Z

    invoke-virtual {v1, v2}, Lcom/rsa/mobilesdk/sdk/DeviceInfo;->toJSONString(Z)Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    .line 1139
    .local v0, "jstr":Ljava/lang/String;
    monitor-exit p0

    return-object v0
.end method

.method public declared-synchronized destroy()V
    .locals 1

    .prologue
    .line 1151
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/rsa/mobilesdk/sdk/MobileAPI;->destroySDK()V

    .line 1152
    invoke-direct {p0}, Lcom/rsa/mobilesdk/sdk/MobileAPI;->stopLocations()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1153
    monitor-exit p0

    return-void

    .line 1151
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method getCellTowerId()Ljava/lang/String;
    .locals 7

    .prologue
    const/16 v6, 0xd

    .line 951
    iget-object v3, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mAPI_state:[I

    const/4 v4, -0x1

    aput v4, v3, v6

    .line 953
    :try_start_0
    iget-object v3, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mTelephonyManager:Landroid/telephony/TelephonyManager;

    invoke-virtual {v3}, Landroid/telephony/TelephonyManager;->getCellLocation()Landroid/telephony/CellLocation;

    move-result-object v0

    .line 954
    .local v0, "cl":Landroid/telephony/CellLocation;
    const/4 v2, 0x0

    .line 955
    .local v2, "result":Ljava/lang/String;
    instance-of v3, v0, Landroid/telephony/gsm/GsmCellLocation;

    if-eqz v3, :cond_1

    .line 956
    check-cast v0, Landroid/telephony/gsm/GsmCellLocation;

    .end local v0    # "cl":Landroid/telephony/CellLocation;
    invoke-virtual {v0}, Landroid/telephony/gsm/GsmCellLocation;->getCid()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    .line 961
    :cond_0
    :goto_0
    iget-object v3, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mAPI_state:[I

    const/16 v4, 0xd

    const/4 v5, 0x0

    aput v5, v3, v4

    .line 966
    .end local v2    # "result":Ljava/lang/String;
    :goto_1
    return-object v2

    .line 957
    .restart local v0    # "cl":Landroid/telephony/CellLocation;
    .restart local v2    # "result":Ljava/lang/String;
    :cond_1
    instance-of v3, v0, Landroid/telephony/cdma/CdmaCellLocation;

    if-eqz v3, :cond_0

    .line 958
    check-cast v0, Landroid/telephony/cdma/CdmaCellLocation;

    .end local v0    # "cl":Landroid/telephony/CellLocation;
    invoke-virtual {v0}, Landroid/telephony/cdma/CdmaCellLocation;->getBaseStationId()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    goto :goto_0

    .line 963
    .end local v2    # "result":Ljava/lang/String;
    :catch_0
    move-exception v1

    .line 964
    .local v1, "e":Ljava/lang/SecurityException;
    iget-object v3, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mAPI_state:[I

    const/4 v4, 0x1

    aput v4, v3, v6

    .line 965
    const-string v3, "MobileAPI"

    invoke-virtual {v1}, Ljava/lang/SecurityException;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 966
    const-string v2, "-1"

    goto :goto_1
.end method

.method getDeviceId()Ljava/lang/String;
    .locals 6

    .prologue
    const/4 v5, 0x1

    .line 640
    iget-object v2, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mAPI_state:[I

    const/4 v3, -0x1

    aput v3, v2, v5

    .line 642
    :try_start_0
    iget-object v2, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mTelephonyManager:Landroid/telephony/TelephonyManager;

    invoke-virtual {v2}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;

    move-result-object v1

    .line 643
    .local v1, "result":Ljava/lang/String;
    iget-object v2, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mAPI_state:[I

    const/4 v3, 0x1

    const/4 v4, 0x0

    aput v4, v2, v3
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 649
    .end local v1    # "result":Ljava/lang/String;
    :goto_0
    return-object v1

    .line 646
    :catch_0
    move-exception v0

    .line 647
    .local v0, "e":Ljava/lang/SecurityException;
    iget-object v2, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mAPI_state:[I

    aput v5, v2, v5

    .line 648
    const-string v2, "MobileAPI"

    invoke-virtual {v0}, Ljava/lang/SecurityException;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 649
    const-string v1, "-1"

    goto :goto_0
.end method

.method getDeviceModel()Ljava/lang/String;
    .locals 3

    .prologue
    .line 839
    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mAPI_state:[I

    const/4 v1, 0x5

    const/4 v2, 0x0

    aput v2, v0, v1

    .line 840
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    return-object v0
.end method

.method getDeviceName()Ljava/lang/String;
    .locals 6

    .prologue
    .line 862
    iget-object v3, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mAPI_state:[I

    const/4 v4, 0x7

    const/4 v5, 0x0

    aput v5, v3, v4

    .line 866
    :try_start_0
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    .line 867
    .local v0, "adapter":Landroid/bluetooth/BluetoothAdapter;
    if-eqz v0, :cond_0

    .line 868
    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->getName()Ljava/lang/String;

    move-result-object v1

    .line 869
    .local v1, "name":Ljava/lang/String;
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v3

    if-nez v3, :cond_0

    .line 880
    .end local v0    # "adapter":Landroid/bluetooth/BluetoothAdapter;
    .end local v1    # "name":Ljava/lang/String;
    :goto_0
    return-object v1

    .line 873
    :catch_0
    move-exception v3

    .line 876
    :cond_0
    sget-object v2, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 877
    .local v2, "result":Ljava/lang/String;
    invoke-virtual {p0}, Lcom/rsa/mobilesdk/sdk/MobileAPI;->getDeviceModel()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    move-object v1, v2

    .line 878
    goto :goto_0

    .line 880
    :cond_1
    const/4 v1, 0x0

    goto :goto_0
.end method

.method getDeviceSystemName()Ljava/lang/String;
    .locals 3

    .prologue
    .line 890
    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mAPI_state:[I

    const/16 v1, 0x8

    const/4 v2, 0x0

    aput v2, v0, v1

    .line 891
    const-string v0, "Android"

    return-object v0
.end method

.method getDeviceSystemVersion()Ljava/lang/String;
    .locals 3

    .prologue
    .line 901
    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mAPI_state:[I

    const/16 v1, 0x9

    const/4 v2, 0x0

    aput v2, v0, v1

    .line 902
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method getError(I)I
    .locals 1
    .param p1, "api_id"    # I

    .prologue
    .line 1074
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mAPI_state:[I

    array-length v0, v0

    if-ge p1, v0, :cond_0

    .line 1075
    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mAPI_state:[I

    aget v0, v0, p1

    .line 1077
    :goto_0
    return v0

    :cond_0
    const/4 v0, -0x1

    goto :goto_0
.end method

.method getLanguage()Ljava/lang/String;
    .locals 6

    .prologue
    const/16 v5, 0xa

    .line 722
    iget-object v2, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mAPI_state:[I

    const/4 v3, -0x1

    aput v3, v2, v5

    .line 724
    :try_start_0
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    .line 729
    .local v1, "language":Ljava/lang/String;
    const-string v2, "iw"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 730
    const-string v1, "he"

    .line 737
    :cond_0
    :goto_0
    iget-object v2, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mAPI_state:[I

    const/16 v3, 0xa

    const/4 v4, 0x0

    aput v4, v2, v3

    .line 743
    .end local v1    # "language":Ljava/lang/String;
    :goto_1
    return-object v1

    .line 731
    .restart local v1    # "language":Ljava/lang/String;
    :cond_1
    const-string v2, "in"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 732
    const-string v1, "id"

    goto :goto_0

    .line 733
    :cond_2
    const-string v2, "ji"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 734
    const-string v1, "yi"
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 740
    .end local v1    # "language":Ljava/lang/String;
    :catch_0
    move-exception v0

    .line 741
    .local v0, "e":Ljava/lang/SecurityException;
    iget-object v2, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mAPI_state:[I

    const/4 v3, 0x1

    aput v3, v2, v5

    .line 742
    const-string v2, "MobileAPI"

    invoke-virtual {v0}, Ljava/lang/SecurityException;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 743
    const-string v1, "-1"

    goto :goto_1
.end method

.method getLocationAreaCode()Ljava/lang/String;
    .locals 6

    .prologue
    const/16 v5, 0xe

    .line 981
    iget-object v2, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mAPI_state:[I

    const/4 v3, -0x1

    aput v3, v2, v5

    .line 983
    :try_start_0
    iget-object v2, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mTelephonyManager:Landroid/telephony/TelephonyManager;

    invoke-virtual {v2}, Landroid/telephony/TelephonyManager;->getCellLocation()Landroid/telephony/CellLocation;

    move-result-object v0

    .line 984
    .local v0, "cl":Landroid/telephony/CellLocation;
    instance-of v2, v0, Landroid/telephony/gsm/GsmCellLocation;

    if-eqz v2, :cond_0

    .line 985
    iget-object v2, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mAPI_state:[I

    const/16 v3, 0xe

    const/4 v4, 0x0

    aput v4, v2, v3

    .line 986
    check-cast v0, Landroid/telephony/gsm/GsmCellLocation;

    .end local v0    # "cl":Landroid/telephony/CellLocation;
    invoke-virtual {v0}, Landroid/telephony/gsm/GsmCellLocation;->getLac()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 993
    :goto_0
    return-object v2

    .line 988
    :catch_0
    move-exception v1

    .line 989
    .local v1, "e":Ljava/lang/SecurityException;
    iget-object v2, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mAPI_state:[I

    const/4 v3, 0x1

    aput v3, v2, v5

    .line 990
    const-string v2, "MobileAPI"

    invoke-virtual {v1}, Ljava/lang/SecurityException;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 991
    const-string v2, "-1"

    goto :goto_0

    .line 993
    .end local v1    # "e":Ljava/lang/SecurityException;
    .restart local v0    # "cl":Landroid/telephony/CellLocation;
    :cond_0
    const/4 v2, 0x0

    goto :goto_0
.end method

.method getMCC()Ljava/lang/String;
    .locals 8

    .prologue
    const/4 v7, 0x3

    const/16 v6, 0x12

    .line 782
    iget-object v3, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mAPI_state:[I

    const/4 v4, -0x1

    aput v4, v3, v6

    .line 784
    :try_start_0
    iget-object v3, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mTelephonyManager:Landroid/telephony/TelephonyManager;

    invoke-virtual {v3}, Landroid/telephony/TelephonyManager;->getNetworkOperator()Ljava/lang/String;

    move-result-object v2

    .line 785
    .local v2, "networkOperator":Ljava/lang/String;
    iget-object v3, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mAPI_state:[I

    const/16 v4, 0x12

    const/4 v5, 0x0

    aput v5, v3, v4

    .line 786
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-lt v3, v7, :cond_0

    .line 787
    const/4 v3, 0x0

    const/4 v4, 0x3

    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    .line 798
    .end local v2    # "networkOperator":Ljava/lang/String;
    :goto_0
    return-object v3

    .line 789
    .restart local v2    # "networkOperator":Ljava/lang/String;
    :cond_0
    iget-object v3, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mContext:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v3

    iget v1, v3, Landroid/content/res/Configuration;->mcc:I

    .line 790
    .local v1, "mcc":I
    if-nez v1, :cond_1

    .line 791
    const/4 v3, 0x0

    goto :goto_0

    .line 793
    :cond_1
    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v3

    goto :goto_0

    .line 795
    .end local v1    # "mcc":I
    .end local v2    # "networkOperator":Ljava/lang/String;
    :catch_0
    move-exception v0

    .line 796
    .local v0, "e":Ljava/lang/SecurityException;
    iget-object v3, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mAPI_state:[I

    const/4 v4, 0x1

    aput v4, v3, v6

    .line 797
    const-string v3, "MobileAPI"

    invoke-virtual {v0}, Ljava/lang/SecurityException;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 798
    const-string v3, "-1"

    goto :goto_0
.end method

.method getMNC()Ljava/lang/String;
    .locals 8

    .prologue
    const/4 v7, 0x3

    const/16 v6, 0x13

    .line 812
    iget-object v3, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mAPI_state:[I

    const/4 v4, -0x1

    aput v4, v3, v6

    .line 814
    :try_start_0
    iget-object v3, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mTelephonyManager:Landroid/telephony/TelephonyManager;

    invoke-virtual {v3}, Landroid/telephony/TelephonyManager;->getNetworkOperator()Ljava/lang/String;

    move-result-object v2

    .line 815
    .local v2, "networkOperator":Ljava/lang/String;
    iget-object v3, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mAPI_state:[I

    const/16 v4, 0x13

    const/4 v5, 0x0

    aput v5, v3, v4

    .line 816
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-lt v3, v7, :cond_0

    .line 817
    const/4 v3, 0x3

    invoke-virtual {v2, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    .line 828
    .end local v2    # "networkOperator":Ljava/lang/String;
    :goto_0
    return-object v3

    .line 819
    .restart local v2    # "networkOperator":Ljava/lang/String;
    :cond_0
    iget-object v3, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mContext:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v3

    iget v1, v3, Landroid/content/res/Configuration;->mnc:I

    .line 820
    .local v1, "mnc":I
    if-nez v1, :cond_1

    .line 821
    const/4 v3, 0x0

    goto :goto_0

    .line 823
    :cond_1
    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v3

    goto :goto_0

    .line 825
    .end local v1    # "mnc":I
    .end local v2    # "networkOperator":Ljava/lang/String;
    :catch_0
    move-exception v0

    .line 826
    .local v0, "e":Ljava/lang/SecurityException;
    iget-object v3, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mAPI_state:[I

    const/4 v4, 0x1

    aput v4, v3, v6

    .line 827
    const-string v3, "MobileAPI"

    invoke-virtual {v0}, Ljava/lang/SecurityException;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 828
    const-string v3, "-1"

    goto :goto_0
.end method

.method getNumberOfBookEntries()I
    .locals 11

    .prologue
    const/4 v9, -0x1

    const/16 v10, 0x10

    .line 1007
    iget-object v1, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mAPI_state:[I

    aput v9, v1, v10

    .line 1008
    const/4 v8, -0x1

    .line 1010
    .local v8, "res":I
    :try_start_0
    iget-object v1, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    .line 1011
    .local v0, "cr":Landroid/content/ContentResolver;
    sget-object v1, Landroid/provider/ContactsContract$Contacts;->CONTENT_URI:Landroid/net/Uri;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 1012
    .local v6, "cur":Landroid/database/Cursor;
    invoke-interface {v6}, Landroid/database/Cursor;->getCount()I

    move-result v8

    .line 1013
    iget-object v1, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mAPI_state:[I

    const/16 v2, 0x10

    const/4 v3, 0x0

    aput v3, v1, v2
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    move v1, v8

    .line 1019
    .end local v0    # "cr":Landroid/content/ContentResolver;
    .end local v6    # "cur":Landroid/database/Cursor;
    :goto_0
    return v1

    .line 1014
    :catch_0
    move-exception v7

    .line 1015
    .local v7, "e":Ljava/lang/SecurityException;
    iget-object v1, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mAPI_state:[I

    const/4 v2, 0x1

    aput v2, v1, v10

    .line 1016
    const-string v1, "MobileAPI"

    invoke-virtual {v7}, Ljava/lang/SecurityException;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    move v1, v9

    .line 1017
    goto :goto_0
.end method

.method getOsId()Ljava/lang/String;
    .locals 4

    .prologue
    .line 1060
    iget-object v1, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mAPI_state:[I

    const/16 v2, 0x14

    const/4 v3, 0x0

    aput v3, v1, v2

    .line 1061
    iget-object v1, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    const-string v2, "android_id"

    invoke-static {v1, v2}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1063
    .local v0, "id":Ljava/lang/String;
    return-object v0
.end method

.method getPhoneNumber()Ljava/lang/String;
    .locals 6

    .prologue
    const/4 v5, 0x3

    .line 684
    iget-object v2, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mAPI_state:[I

    const/4 v3, -0x1

    aput v3, v2, v5

    .line 686
    :try_start_0
    iget-object v2, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mTelephonyManager:Landroid/telephony/TelephonyManager;

    invoke-virtual {v2}, Landroid/telephony/TelephonyManager;->getLine1Number()Ljava/lang/String;

    move-result-object v1

    .line 687
    .local v1, "result":Ljava/lang/String;
    iget-object v2, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mAPI_state:[I

    const/4 v3, 0x3

    const/4 v4, 0x0

    aput v4, v2, v3
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 693
    .end local v1    # "result":Ljava/lang/String;
    :goto_0
    return-object v1

    .line 690
    :catch_0
    move-exception v0

    .line 691
    .local v0, "e":Ljava/lang/SecurityException;
    iget-object v2, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mAPI_state:[I

    const/4 v3, 0x1

    aput v3, v2, v5

    .line 692
    const-string v2, "MobileAPI"

    invoke-virtual {v0}, Ljava/lang/SecurityException;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 693
    const-string v1, "-1"

    goto :goto_0
.end method

.method getRsaApplicationKey()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1049
    const/4 v0, 0x0

    return-object v0
.end method

.method getScreenSize()Ljava/lang/String;
    .locals 3

    .prologue
    .line 707
    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mAPI_state:[I

    const/16 v1, 0xf

    const/4 v2, 0x0

    aput v2, v0, v1

    .line 708
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mScreenWidth:I

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mScreenHeight:I

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method getSubscriberId()Ljava/lang/String;
    .locals 6

    .prologue
    const/4 v5, 0x2

    .line 662
    iget-object v2, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mAPI_state:[I

    const/4 v3, -0x1

    aput v3, v2, v5

    .line 664
    :try_start_0
    iget-object v2, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mTelephonyManager:Landroid/telephony/TelephonyManager;

    invoke-virtual {v2}, Landroid/telephony/TelephonyManager;->getSubscriberId()Ljava/lang/String;

    move-result-object v1

    .line 665
    .local v1, "result":Ljava/lang/String;
    iget-object v2, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mAPI_state:[I

    const/4 v3, 0x2

    const/4 v4, 0x0

    aput v4, v2, v3
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 671
    .end local v1    # "result":Ljava/lang/String;
    :goto_0
    return-object v1

    .line 668
    :catch_0
    move-exception v0

    .line 669
    .local v0, "e":Ljava/lang/SecurityException;
    iget-object v2, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mAPI_state:[I

    const/4 v3, 0x1

    aput v3, v2, v5

    .line 670
    const-string v2, "MobileAPI"

    invoke-virtual {v0}, Ljava/lang/SecurityException;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 671
    const-string v1, "-1"

    goto :goto_0
.end method

.method getWiFiMacAddress()Ljava/lang/String;
    .locals 8

    .prologue
    const/16 v7, 0xb

    .line 756
    iget-object v4, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mAPI_state:[I

    const/4 v5, -0x1

    aput v5, v4, v7

    .line 758
    :try_start_0
    iget-object v4, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mContext:Landroid/content/Context;

    const-string v5, "wifi"

    invoke-virtual {v4, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/net/wifi/WifiManager;

    .line 760
    .local v3, "wifiMan":Landroid/net/wifi/WifiManager;
    invoke-virtual {v3}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;

    move-result-object v2

    .line 761
    .local v2, "wifiInf":Landroid/net/wifi/WifiInfo;
    invoke-virtual {v2}, Landroid/net/wifi/WifiInfo;->getMacAddress()Ljava/lang/String;

    move-result-object v1

    .line 762
    .local v1, "macAddr":Ljava/lang/String;
    iget-object v4, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mAPI_state:[I

    const/16 v5, 0xb

    const/4 v6, 0x0

    aput v6, v4, v5
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 768
    .end local v1    # "macAddr":Ljava/lang/String;
    .end local v2    # "wifiInf":Landroid/net/wifi/WifiInfo;
    .end local v3    # "wifiMan":Landroid/net/wifi/WifiManager;
    :goto_0
    return-object v1

    .line 765
    :catch_0
    move-exception v0

    .line 766
    .local v0, "e":Ljava/lang/SecurityException;
    iget-object v4, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mAPI_state:[I

    const/4 v5, 0x1

    aput v5, v4, v7

    .line 767
    const-string v4, "MobileAPI"

    invoke-virtual {v0}, Ljava/lang/SecurityException;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 768
    const-string v1, "-1"

    goto :goto_0
.end method

.method getWiFiNetworksData(Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;)Ljava/lang/String;
    .locals 7
    .param p1, "buffer"    # Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;

    .prologue
    const/16 v6, 0xc

    .line 919
    iget-object v3, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mAPI_state:[I

    const/4 v4, -0x1

    aput v4, v3, v6

    .line 921
    :try_start_0
    iget-object v3, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mContext:Landroid/content/Context;

    const-string v4, "wifi"

    invoke-virtual {v3, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/net/wifi/WifiManager;

    .line 923
    .local v2, "wifiMan":Landroid/net/wifi/WifiManager;
    invoke-virtual {v2}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;

    move-result-object v1

    .line 924
    .local v1, "info":Landroid/net/wifi/WifiInfo;
    invoke-virtual {p1, v1}, Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;->set(Landroid/net/wifi/WifiInfo;)V

    .line 925
    iget-object v3, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mAPI_state:[I

    const/16 v4, 0xc

    const/4 v5, 0x0

    aput v5, v3, v4

    .line 926
    invoke-virtual {p1}, Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v3

    .line 932
    .end local v1    # "info":Landroid/net/wifi/WifiInfo;
    .end local v2    # "wifiMan":Landroid/net/wifi/WifiManager;
    :goto_0
    return-object v3

    .line 928
    :catch_0
    move-exception v0

    .line 929
    .local v0, "e":Ljava/lang/SecurityException;
    iget-object v3, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mAPI_state:[I

    const/4 v4, 0x1

    aput v4, v3, v6

    .line 930
    invoke-virtual {p1}, Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;->setNoPermission()V

    .line 931
    const-string v3, "MobileAPI"

    invoke-virtual {v0}, Ljava/lang/SecurityException;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 932
    const/4 v3, 0x0

    goto :goto_0
.end method

.method public declared-synchronized initSDK(Ljava/util/Properties;)V
    .locals 3
    .param p1, "properties"    # Ljava/util/Properties;

    .prologue
    .line 490
    monitor-enter p0

    :try_start_0
    iget-object v1, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mDeviceInfo:Lcom/rsa/mobilesdk/sdk/DeviceInfo;

    if-eqz v1, :cond_0

    .line 491
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "SDK already initialized"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 490
    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1

    .line 494
    :cond_0
    :try_start_1
    invoke-direct {p0, p1}, Lcom/rsa/mobilesdk/sdk/MobileAPI;->initAndValidateProperties(Ljava/util/Properties;)V

    .line 496
    new-instance v1, Lcom/rsa/mobilesdk/sdk/DeviceInfo;

    iget v2, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mConfiguration:I

    invoke-direct {v1, v2}, Lcom/rsa/mobilesdk/sdk/DeviceInfo;-><init>(I)V

    iput-object v1, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mDeviceInfo:Lcom/rsa/mobilesdk/sdk/DeviceInfo;

    .line 497
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    iget-object v1, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mAPI_state:[I

    array-length v1, v1

    if-ge v0, v1, :cond_1

    .line 498
    iget-object v1, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mAPI_state:[I

    const/4 v2, 0x2

    aput v2, v1, v0

    .line 497
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 501
    :cond_1
    iget v1, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mConfiguration:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    packed-switch v1, :pswitch_data_0

    .line 515
    :goto_1
    monitor-exit p0

    return-void

    .line 503
    :pswitch_0
    :try_start_2
    invoke-direct {p0}, Lcom/rsa/mobilesdk/sdk/MobileAPI;->collectBasicDeviceData()V

    goto :goto_1

    .line 506
    :pswitch_1
    invoke-direct {p0}, Lcom/rsa/mobilesdk/sdk/MobileAPI;->collectBasicDeviceData()V

    .line 507
    invoke-direct {p0}, Lcom/rsa/mobilesdk/sdk/MobileAPI;->collectDeviceData()V

    goto :goto_1

    .line 510
    :pswitch_2
    invoke-direct {p0}, Lcom/rsa/mobilesdk/sdk/MobileAPI;->collectBasicDeviceData()V

    .line 511
    invoke-direct {p0}, Lcom/rsa/mobilesdk/sdk/MobileAPI;->collectDeviceData()V

    .line 512
    invoke-direct {p0, p1}, Lcom/rsa/mobilesdk/sdk/MobileAPI;->collectDeviceLocationAndNetworkData(Ljava/util/Properties;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    .line 501
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method isMultitaskingSupported()Z
    .locals 3

    .prologue
    .line 850
    iget-object v0, p0, Lcom/rsa/mobilesdk/sdk/MobileAPI;->mAPI_state:[I

    const/4 v1, 0x6

    const/4 v2, 0x0

    aput v2, v0, v1

    .line 851
    const/4 v0, 0x1

    return v0
.end method
