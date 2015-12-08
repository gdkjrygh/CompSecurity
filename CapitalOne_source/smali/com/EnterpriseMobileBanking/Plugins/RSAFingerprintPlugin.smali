.class public Lcom/EnterpriseMobileBanking/Plugins/RSAFingerprintPlugin;
.super Lorg/apache/cordova/api/Plugin;
.source "RSAFingerprintPlugin.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "RSAFingerprintPlugin"

.field private static final rsaSDKConfig:Ljava/util/Properties;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 32
    new-instance v0, Ljava/util/Properties;

    invoke-direct {v0}, Ljava/util/Properties;-><init>()V

    sput-object v0, Lcom/EnterpriseMobileBanking/Plugins/RSAFingerprintPlugin;->rsaSDKConfig:Ljava/util/Properties;

    .line 35
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/RSAFingerprintPlugin;->rsaSDKConfig:Ljava/util/Properties;

    const-string v1, "Configuration-key"

    const-string v2, "1"

    invoke-virtual {v0, v1, v2}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 36
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/RSAFingerprintPlugin;->rsaSDKConfig:Ljava/util/Properties;

    const-string v1, "Add-timestamp-key"

    const-string v2, "1"

    invoke-virtual {v0, v1, v2}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 37
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Lorg/apache/cordova/api/Plugin;-><init>()V

    return-void
.end method

.method private getDeviceInformation()Ljava/lang/String;
    .locals 12

    .prologue
    .line 183
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 185
    .local v4, "myObj":Lorg/json/JSONObject;
    :try_start_0
    iget-object v9, p0, Lcom/EnterpriseMobileBanking/Plugins/RSAFingerprintPlugin;->cordova:Lorg/apache/cordova/api/CordovaInterface;

    invoke-interface {v9}, Lorg/apache/cordova/api/CordovaInterface;->getContext()Landroid/content/Context;

    move-result-object v9

    const-string v10, "phone"

    invoke-virtual {v9, v10}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/telephony/TelephonyManager;

    .line 186
    .local v6, "teleMgr":Landroid/telephony/TelephonyManager;
    iget-object v9, p0, Lcom/EnterpriseMobileBanking/Plugins/RSAFingerprintPlugin;->cordova:Lorg/apache/cordova/api/CordovaInterface;

    invoke-interface {v9}, Lorg/apache/cordova/api/CordovaInterface;->getContext()Landroid/content/Context;

    move-result-object v9

    const-string v10, "wifi"

    invoke-virtual {v9, v10}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/net/wifi/WifiManager;

    .line 187
    .local v7, "wifiMgr":Landroid/net/wifi/WifiManager;
    iget-object v9, p0, Lcom/EnterpriseMobileBanking/Plugins/RSAFingerprintPlugin;->cordova:Lorg/apache/cordova/api/CordovaInterface;

    invoke-interface {v9}, Lorg/apache/cordova/api/CordovaInterface;->getContext()Landroid/content/Context;

    move-result-object v9

    const-string v10, "window"

    invoke-virtual {v9, v10}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/view/WindowManager;

    .line 188
    .local v8, "windMgr":Landroid/view/WindowManager;
    invoke-interface {v8}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v2

    .line 189
    .local v2, "display":Landroid/view/Display;
    new-instance v5, Ljava/text/SimpleDateFormat;

    const-string v9, "EEE MMM dd HH:mm:ss zzz yyyy"

    invoke-direct {v5, v9}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 190
    .local v5, "sdf":Ljava/text/SimpleDateFormat;
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    .line 191
    .local v0, "blueAdap":Landroid/bluetooth/BluetoothAdapter;
    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->getName()Ljava/lang/String;

    move-result-object v1

    .line 192
    .local v1, "deviceName":Ljava/lang/String;
    const-string v9, "RSAFingerprintPlugin"

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "BluetoothAdapter deviceName = "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    const-string v9, "RSAFingerprintPlugin"

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "android.os.Build.DEVICE = "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    sget-object v11, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 195
    const-string v9, "DeviceSystemVersion"

    sget v10, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {v10}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v4, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 196
    const-string v9, "SDK_VERSION"

    const-string v10, "1.00.00"

    invoke-virtual {v4, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 197
    const-string v9, "DeviceName"

    if-nez v1, :cond_0

    sget-object v1, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .end local v1    # "deviceName":Ljava/lang/String;
    :cond_0
    invoke-virtual {v4, v9, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 198
    const-string v10, "WiFiMacAddress"

    invoke-virtual {v7}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;

    move-result-object v9

    if-nez v9, :cond_1

    const-string v9, ""

    :goto_0
    invoke-virtual {v4, v10, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 199
    const-string v9, "PhoneNumber"

    invoke-virtual {v6}, Landroid/telephony/TelephonyManager;->getLine1Number()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v4, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 200
    const-string v9, "OS_ID"

    iget-object v10, p0, Lcom/EnterpriseMobileBanking/Plugins/RSAFingerprintPlugin;->cordova:Lorg/apache/cordova/api/CordovaInterface;

    invoke-interface {v10}, Lorg/apache/cordova/api/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v10

    invoke-virtual {v10}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v10

    const-string v11, "android_id"

    invoke-static {v10, v11}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v4, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 201
    const-string v9, "MultitaskingSupported"

    const-string v10, "true"

    invoke-virtual {v4, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 202
    const-string v9, "Languages"

    iget-object v10, p0, Lcom/EnterpriseMobileBanking/Plugins/RSAFingerprintPlugin;->cordova:Lorg/apache/cordova/api/CordovaInterface;

    invoke-interface {v10}, Lorg/apache/cordova/api/CordovaInterface;->getContext()Landroid/content/Context;

    move-result-object v10

    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    invoke-virtual {v10}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v10

    iget-object v10, v10, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v10}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v4, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 203
    const-string v9, "DeviceModel"

    sget-object v10, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v4, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 204
    const-string v9, "DeviceSystemName"

    const-string v10, "Android"

    invoke-virtual {v4, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 205
    const-string v9, "ScreenSize"

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, ""

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v2}, Landroid/view/Display;->getWidth()I

    move-result v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, "x"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v2}, Landroid/view/Display;->getHeight()I

    move-result v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v4, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 206
    const-string v9, "SIM_ID"

    invoke-virtual {v6}, Landroid/telephony/TelephonyManager;->getSubscriberId()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v4, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 207
    const-string v9, "TIMESTAMP"

    new-instance v10, Ljava/util/Date;

    invoke-direct {v10}, Ljava/util/Date;-><init>()V

    invoke-virtual {v5, v10}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v4, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 208
    const-string v9, "HardwareID"

    invoke-virtual {v6}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v4, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 209
    const-string v9, "OperatorName"

    invoke-virtual {v6}, Landroid/telephony/TelephonyManager;->getNetworkOperatorName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v4, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 210
    const-string v9, "OperatorCode"

    invoke-virtual {v6}, Landroid/telephony/TelephonyManager;->getNetworkOperator()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v4, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 211
    const-string v9, "OperatorISO"

    invoke-virtual {v6}, Landroid/telephony/TelephonyManager;->getNetworkCountryIso()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v4, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 212
    const-string v9, "SimCountryCode"

    invoke-virtual {v6}, Landroid/telephony/TelephonyManager;->getSimCountryIso()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v4, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 213
    const-string v9, "SimOperator"

    invoke-virtual {v6}, Landroid/telephony/TelephonyManager;->getSimOperatorName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v4, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 214
    const-string v9, "SimSerialNum"

    invoke-virtual {v6}, Landroid/telephony/TelephonyManager;->getSimSerialNumber()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v4, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 215
    const-string v9, "SubscriberId"

    invoke-virtual {v6}, Landroid/telephony/TelephonyManager;->getSubscriberId()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v4, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 217
    const-string v9, "RSAFingerprintPlugin"

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "My Result:  "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    const/4 v11, 0x0

    invoke-virtual {v4, v11}, Lorg/json/JSONObject;->toString(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 223
    .end local v0    # "blueAdap":Landroid/bluetooth/BluetoothAdapter;
    .end local v2    # "display":Landroid/view/Display;
    .end local v5    # "sdf":Ljava/text/SimpleDateFormat;
    .end local v6    # "teleMgr":Landroid/telephony/TelephonyManager;
    .end local v7    # "wifiMgr":Landroid/net/wifi/WifiManager;
    .end local v8    # "windMgr":Landroid/view/WindowManager;
    :goto_1
    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v9

    return-object v9

    .line 198
    .restart local v0    # "blueAdap":Landroid/bluetooth/BluetoothAdapter;
    .restart local v2    # "display":Landroid/view/Display;
    .restart local v5    # "sdf":Ljava/text/SimpleDateFormat;
    .restart local v6    # "teleMgr":Landroid/telephony/TelephonyManager;
    .restart local v7    # "wifiMgr":Landroid/net/wifi/WifiManager;
    .restart local v8    # "windMgr":Landroid/view/WindowManager;
    :cond_1
    :try_start_1
    invoke-virtual {v7}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;

    move-result-object v9

    invoke-virtual {v9}, Landroid/net/wifi/WifiInfo;->getMacAddress()Ljava/lang/String;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v9

    goto/16 :goto_0

    .line 219
    .end local v0    # "blueAdap":Landroid/bluetooth/BluetoothAdapter;
    .end local v2    # "display":Landroid/view/Display;
    .end local v5    # "sdf":Ljava/text/SimpleDateFormat;
    .end local v6    # "teleMgr":Landroid/telephony/TelephonyManager;
    .end local v7    # "wifiMgr":Landroid/net/wifi/WifiManager;
    .end local v8    # "windMgr":Landroid/view/WindowManager;
    :catch_0
    move-exception v3

    .line 220
    .local v3, "e":Lorg/json/JSONException;
    const-string v9, "RSAFingerprintPlugin"

    const-string v10, "A JSONException occurred while building the device information mappings."

    invoke-static {v9, v10}, Lcom/EnterpriseMobileBanking/Utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1
.end method

.method private testDeviceInfoAgainstRSA(Ljava/lang/String;Ljava/lang/String;)V
    .locals 7
    .param p1, "myResult"    # Ljava/lang/String;
    .param p2, "rsaResult"    # Ljava/lang/String;

    .prologue
    .line 239
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 240
    .local v3, "myObj":Lorg/json/JSONObject;
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 243
    .local v1, "deviceObj":Lorg/json/JSONObject;
    invoke-virtual {v3}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v2

    .line 244
    .local v2, "it":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/lang/String;>;"
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 246
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 247
    .local v0, "currKey":Ljava/lang/String;
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 249
    const-string v4, "RSAFingerprintPlugin"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Non-matching key-value pair for myObj vs deviceObj for key "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, ":  "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, " vs "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/EnterpriseMobileBanking/Utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 253
    .end local v0    # "currKey":Ljava/lang/String;
    .end local v1    # "deviceObj":Lorg/json/JSONObject;
    .end local v2    # "it":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/lang/String;>;"
    .end local v3    # "myObj":Lorg/json/JSONObject;
    :catch_0
    move-exception v4

    .line 256
    :cond_1
    return-void
.end method


# virtual methods
.method public execute(Ljava/lang/String;Lorg/json/JSONArray;Ljava/lang/String;)Lorg/apache/cordova/api/PluginResult;
    .locals 20
    .param p1, "action"    # Ljava/lang/String;
    .param p2, "args"    # Lorg/json/JSONArray;
    .param p3, "callbackId"    # Ljava/lang/String;

    .prologue
    .line 41
    const-string v17, "RSAFingerprintPlugin"

    const-string v18, "execute"

    invoke-static/range {v17 .. v18}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/EnterpriseMobileBanking/Plugins/RSAFingerprintPlugin;->cordova:Lorg/apache/cordova/api/CordovaInterface;

    move-object/from16 v17, v0

    invoke-interface/range {v17 .. v17}, Lorg/apache/cordova/api/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v17

    invoke-static/range {v17 .. v17}, Lcom/rsa/mobilesdk/sdk/MobileAPI;->getInstance(Landroid/app/Activity;)Lcom/rsa/mobilesdk/sdk/MobileAPI;

    move-result-object v6

    .line 57
    .local v6, "mobileAPI":Lcom/rsa/mobilesdk/sdk/MobileAPI;
    :try_start_0
    sget-object v17, Lcom/EnterpriseMobileBanking/Plugins/RSAFingerprintPlugin;->rsaSDKConfig:Ljava/util/Properties;

    move-object/from16 v0, v17

    invoke-virtual {v6, v0}, Lcom/rsa/mobilesdk/sdk/MobileAPI;->initSDK(Ljava/util/Properties;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 113
    :cond_0
    :goto_0
    invoke-virtual {v6}, Lcom/rsa/mobilesdk/sdk/MobileAPI;->collectInfo()Ljava/lang/String;

    move-result-object v11

    .line 114
    .local v11, "rsaResult":Ljava/lang/String;
    const-string v17, "RSAFingerprintPlugin"

    new-instance v18, Ljava/lang/StringBuilder;

    invoke-direct/range {v18 .. v18}, Ljava/lang/StringBuilder;-><init>()V

    const-string v19, "Collected result: "

    invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    move-object/from16 v0, v18

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    invoke-static/range {v17 .. v18}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    invoke-virtual {v6}, Lcom/rsa/mobilesdk/sdk/MobileAPI;->destroy()V

    .line 122
    const-string v17, "extras"

    move-object/from16 v0, p1

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_3

    .line 124
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/EnterpriseMobileBanking/Plugins/RSAFingerprintPlugin;->cordova:Lorg/apache/cordova/api/CordovaInterface;

    move-object/from16 v17, v0

    invoke-interface/range {v17 .. v17}, Lorg/apache/cordova/api/CordovaInterface;->getContext()Landroid/content/Context;

    move-result-object v17

    const-string v18, "phone"

    invoke-virtual/range {v17 .. v18}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Landroid/telephony/TelephonyManager;

    .line 125
    .local v16, "telephonyManager":Landroid/telephony/TelephonyManager;
    invoke-virtual/range {v16 .. v16}, Landroid/telephony/TelephonyManager;->getNetworkOperatorName()Ljava/lang/String;

    move-result-object v9

    .line 126
    .local v9, "operatorname":Ljava/lang/String;
    invoke-virtual/range {v16 .. v16}, Landroid/telephony/TelephonyManager;->getNetworkOperator()Ljava/lang/String;

    move-result-object v7

    .line 127
    .local v7, "operatorcode":Ljava/lang/String;
    invoke-virtual/range {v16 .. v16}, Landroid/telephony/TelephonyManager;->getNetworkCountryIso()Ljava/lang/String;

    move-result-object v8

    .line 128
    .local v8, "operatoriso":Ljava/lang/String;
    invoke-virtual/range {v16 .. v16}, Landroid/telephony/TelephonyManager;->getSimCountryIso()Ljava/lang/String;

    move-result-object v12

    .line 129
    .local v12, "simcountrycode":Ljava/lang/String;
    invoke-virtual/range {v16 .. v16}, Landroid/telephony/TelephonyManager;->getSimOperatorName()Ljava/lang/String;

    move-result-object v13

    .line 130
    .local v13, "simoperator":Ljava/lang/String;
    invoke-virtual/range {v16 .. v16}, Landroid/telephony/TelephonyManager;->getSimSerialNumber()Ljava/lang/String;

    move-result-object v14

    .line 131
    .local v14, "simserialno":Ljava/lang/String;
    invoke-virtual/range {v16 .. v16}, Landroid/telephony/TelephonyManager;->getSubscriberId()Ljava/lang/String;

    move-result-object v15

    .line 133
    .local v15, "subscriberid":Ljava/lang/String;
    :try_start_1
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v11}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 134
    .local v2, "deviceObj":Lorg/json/JSONObject;
    const-string v17, "OperatorName"

    move-object/from16 v0, v17

    invoke-virtual {v2, v0, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 135
    const-string v17, "OperatorCode"

    move-object/from16 v0, v17

    invoke-virtual {v2, v0, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 136
    const-string v17, "OperatorISO"

    move-object/from16 v0, v17

    invoke-virtual {v2, v0, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 137
    const-string v17, "SimCountryCode"

    move-object/from16 v0, v17

    invoke-virtual {v2, v0, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 138
    const-string v17, "SimOperator"

    move-object/from16 v0, v17

    invoke-virtual {v2, v0, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 139
    if-eqz v14, :cond_1

    .line 140
    const-string v17, "SimSerialNum"

    move-object/from16 v0, v17

    invoke-virtual {v2, v0, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 142
    :cond_1
    if-eqz v15, :cond_2

    .line 143
    const-string v17, "SubscriberId"

    move-object/from16 v0, v17

    invoke-virtual {v2, v0, v15}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 145
    :cond_2
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v11

    .line 151
    .end local v2    # "deviceObj":Lorg/json/JSONObject;
    .end local v7    # "operatorcode":Ljava/lang/String;
    .end local v8    # "operatoriso":Ljava/lang/String;
    .end local v9    # "operatorname":Ljava/lang/String;
    .end local v12    # "simcountrycode":Ljava/lang/String;
    .end local v13    # "simoperator":Ljava/lang/String;
    .end local v14    # "simserialno":Ljava/lang/String;
    .end local v15    # "subscriberid":Ljava/lang/String;
    .end local v16    # "telephonyManager":Landroid/telephony/TelephonyManager;
    :cond_3
    :goto_1
    new-instance v17, Lorg/apache/cordova/api/PluginResult;

    sget-object v18, Lorg/apache/cordova/api/PluginResult$Status;->OK:Lorg/apache/cordova/api/PluginResult$Status;

    move-object/from16 v0, v17

    move-object/from16 v1, v18

    invoke-direct {v0, v1, v11}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Ljava/lang/String;)V

    return-object v17

    .line 59
    .end local v11    # "rsaResult":Ljava/lang/String;
    :catch_0
    move-exception v10

    .line 61
    .local v10, "re":Ljava/lang/RuntimeException;
    new-instance v4, Ljava/io/StringWriter;

    invoke-direct {v4}, Ljava/io/StringWriter;-><init>()V

    .line 62
    .local v4, "errors":Ljava/io/StringWriter;
    new-instance v17, Ljava/io/PrintWriter;

    move-object/from16 v0, v17

    invoke-direct {v0, v4}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    move-object/from16 v0, v17

    invoke-virtual {v10, v0}, Ljava/lang/RuntimeException;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 63
    const-string v17, "RSAFingerprintPlugin"

    const-string v18, "RuntimeException thrown from com.rsa.mobilesdk.sdk.MobileAPI method initSDK(java.util.Properties)."

    invoke-static/range {v17 .. v18}, Lcom/EnterpriseMobileBanking/Utils/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    const-string v17, "RSAFingerprintPlugin"

    invoke-virtual {v4}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object v18

    invoke-static/range {v17 .. v18}, Lcom/EnterpriseMobileBanking/Utils/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    invoke-virtual {v10}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v17

    const-string v18, "Looper.prepare()"

    invoke-virtual/range {v17 .. v18}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v17

    if-eqz v17, :cond_5

    .line 79
    invoke-virtual {v6}, Lcom/rsa/mobilesdk/sdk/MobileAPI;->destroy()V

    .line 82
    const/4 v5, 0x0

    .line 83
    .local v5, "loopermanual":Z
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v17

    if-nez v17, :cond_4

    .line 85
    const-string v17, "RSAFingerprintPlugin"

    const-string v18, "Looper is null.  Preparing."

    invoke-static/range {v17 .. v18}, Lcom/EnterpriseMobileBanking/Utils/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    invoke-static {}, Landroid/os/Looper;->prepare()V

    .line 87
    const/4 v5, 0x1

    .line 88
    const-string v17, "RSAFingerprintPlugin"

    const-string v18, "Looper prepared"

    invoke-static/range {v17 .. v18}, Lcom/EnterpriseMobileBanking/Utils/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    :cond_4
    sget-object v17, Lcom/EnterpriseMobileBanking/Plugins/RSAFingerprintPlugin;->rsaSDKConfig:Ljava/util/Properties;

    move-object/from16 v0, v17

    invoke-virtual {v6, v0}, Lcom/rsa/mobilesdk/sdk/MobileAPI;->initSDK(Ljava/util/Properties;)V

    .line 91
    if-eqz v5, :cond_0

    .line 93
    const-string v17, "RSAFingerprintPlugin"

    const-string v18, "initSDK called successfully.  Looper quitting."

    invoke-static/range {v17 .. v18}, Lcom/EnterpriseMobileBanking/Utils/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Landroid/os/Looper;->quit()V

    .line 95
    const-string v17, "RSAFingerprintPlugin"

    const-string v18, "Looper quit."

    invoke-static/range {v17 .. v18}, Lcom/EnterpriseMobileBanking/Utils/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 102
    .end local v5    # "loopermanual":Z
    :cond_5
    invoke-virtual {v6}, Lcom/rsa/mobilesdk/sdk/MobileAPI;->destroy()V

    .line 103
    throw v10

    .line 146
    .end local v4    # "errors":Ljava/io/StringWriter;
    .end local v10    # "re":Ljava/lang/RuntimeException;
    .restart local v7    # "operatorcode":Ljava/lang/String;
    .restart local v8    # "operatoriso":Ljava/lang/String;
    .restart local v9    # "operatorname":Ljava/lang/String;
    .restart local v11    # "rsaResult":Ljava/lang/String;
    .restart local v12    # "simcountrycode":Ljava/lang/String;
    .restart local v13    # "simoperator":Ljava/lang/String;
    .restart local v14    # "simserialno":Ljava/lang/String;
    .restart local v15    # "subscriberid":Ljava/lang/String;
    .restart local v16    # "telephonyManager":Landroid/telephony/TelephonyManager;
    :catch_1
    move-exception v3

    .line 147
    .local v3, "e":Ljava/lang/Exception;
    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_1
.end method
