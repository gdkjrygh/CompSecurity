.class public Lcom/worklight/androidgap/plugin/NetworkDetector;
.super Lorg/apache/cordova/api/Plugin;
.source "NetworkDetector.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0}, Lorg/apache/cordova/api/Plugin;-><init>()V

    return-void
.end method

.method private getLocalIpAddress()Ljava/lang/String;
    .locals 8

    .prologue
    .line 131
    const-string v6, ""

    .line 133
    .local v6, "ipAddress":Ljava/lang/String;
    :try_start_0
    invoke-static {}, Ljava/net/NetworkInterface;->getNetworkInterfaces()Ljava/util/Enumeration;

    move-result-object v0

    .local v0, "en":Ljava/util/Enumeration;, "Ljava/util/Enumeration<Ljava/net/NetworkInterface;>;"
    :cond_0
    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v7

    if-nez v7, :cond_1

    .line 149
    .end local v0    # "en":Ljava/util/Enumeration;, "Ljava/util/Enumeration<Ljava/net/NetworkInterface;>;"
    :goto_0
    return-object v6

    .line 134
    .restart local v0    # "en":Ljava/util/Enumeration;, "Ljava/util/Enumeration<Ljava/net/NetworkInterface;>;"
    :cond_1
    invoke-interface {v0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/net/NetworkInterface;

    .line 135
    .local v5, "intf":Ljava/net/NetworkInterface;
    invoke-virtual {v5}, Ljava/net/NetworkInterface;->getInetAddresses()Ljava/util/Enumeration;

    move-result-object v1

    .local v1, "enumIpAddr":Ljava/util/Enumeration;, "Ljava/util/Enumeration<Ljava/net/InetAddress;>;"
    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v7

    if-eqz v7, :cond_0

    .line 136
    invoke-interface {v1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/net/InetAddress;

    .line 137
    .local v4, "inetAddress":Ljava/net/InetAddress;
    invoke-virtual {v4}, Ljava/net/InetAddress;->isLoopbackAddress()Z

    move-result v7

    if-nez v7, :cond_2

    .line 138
    invoke-virtual {v4}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v6

    .line 139
    const-string v7, "%"

    invoke-virtual {v6, v7}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v3

    .line 140
    .local v3, "index":I
    const/4 v7, -0x1

    if-eq v3, v7, :cond_2

    .line 141
    const/4 v7, 0x0

    invoke-virtual {v6, v7, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;
    :try_end_0
    .catch Ljava/net/SocketException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v6

    goto :goto_1

    .line 146
    .end local v0    # "en":Ljava/util/Enumeration;, "Ljava/util/Enumeration<Ljava/net/NetworkInterface;>;"
    .end local v1    # "enumIpAddr":Ljava/util/Enumeration;, "Ljava/util/Enumeration<Ljava/net/InetAddress;>;"
    .end local v3    # "index":I
    .end local v4    # "inetAddress":Ljava/net/InetAddress;
    .end local v5    # "intf":Ljava/net/NetworkInterface;
    :catch_0
    move-exception v2

    .line 147
    .local v2, "ex":Ljava/net/SocketException;
    invoke-virtual {v2}, Ljava/net/SocketException;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/worklight/common/WLUtils;->error(Ljava/lang/String;)V

    goto :goto_0
.end method


# virtual methods
.method public execute(Ljava/lang/String;Lorg/json/JSONArray;Ljava/lang/String;)Lorg/apache/cordova/api/PluginResult;
    .locals 3
    .param p1, "action"    # Ljava/lang/String;
    .param p2, "args"    # Lorg/json/JSONArray;
    .param p3, "callbackId"    # Ljava/lang/String;

    .prologue
    .line 39
    const-string v2, "getNetworkInfo"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 40
    iget-object v2, p0, Lcom/worklight/androidgap/plugin/NetworkDetector;->ctx:Lorg/apache/cordova/api/LegacyContext;

    invoke-virtual {v2}, Lorg/apache/cordova/api/LegacyContext;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/worklight/androidgap/plugin/NetworkDetector;->getNetworkData(Landroid/content/Context;)Lorg/json/JSONObject;

    move-result-object v0

    .line 41
    .local v0, "networkInfo":Lorg/json/JSONObject;
    new-instance v1, Lorg/apache/cordova/api/PluginResult;

    sget-object v2, Lorg/apache/cordova/api/PluginResult$Status;->OK:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-direct {v1, v2, v0}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Lorg/json/JSONObject;)V

    .line 44
    .end local v0    # "networkInfo":Lorg/json/JSONObject;
    :goto_0
    return-object v1

    :cond_0
    new-instance v1, Lorg/apache/cordova/api/PluginResult;

    sget-object v2, Lorg/apache/cordova/api/PluginResult$Status;->INVALID_ACTION:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-direct {v1, v2}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;)V

    goto :goto_0
.end method

.method public getNetworkData(Landroid/content/Context;)Lorg/json/JSONObject;
    .locals 18
    .param p1, "ctx"    # Landroid/content/Context;

    .prologue
    .line 48
    new-instance v10, Lorg/json/JSONObject;

    invoke-direct {v10}, Lorg/json/JSONObject;-><init>()V

    .line 50
    .local v10, "response":Lorg/json/JSONObject;
    :try_start_0
    const-string v5, "false"

    .line 51
    .local v5, "isNetworkConnected":Ljava/lang/String;
    const-string v4, "false"

    .line 52
    .local v4, "isAirplaneMode":Ljava/lang/String;
    const-string v6, "false"

    .line 53
    .local v6, "isRoaming":Ljava/lang/String;
    const-string v7, ""

    .line 54
    .local v7, "networkConnectionTypeName":Ljava/lang/String;
    const-string v14, ""

    .line 55
    .local v14, "wifiName":Ljava/lang/String;
    const-string v11, ""

    .line 56
    .local v11, "telephonyNetworkType":Ljava/lang/String;
    const-string v1, ""

    .line 59
    .local v1, "carrierName":Ljava/lang/String;
    const-string v15, "connectivity"

    move-object/from16 v0, p1

    invoke-virtual {v0, v15}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/net/ConnectivityManager;

    .line 60
    .local v2, "cm":Landroid/net/ConnectivityManager;
    invoke-virtual {v2}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v9

    .line 62
    .local v9, "ni":Landroid/net/NetworkInfo;
    if-eqz v9, :cond_0

    .line 63
    invoke-virtual {v9}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v15

    invoke-static {v15}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/Boolean;->toString()Ljava/lang/String;

    move-result-object v5

    .line 64
    invoke-virtual {v9}, Landroid/net/NetworkInfo;->isRoaming()Z

    move-result v15

    invoke-static {v15}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/Boolean;->toString()Ljava/lang/String;

    move-result-object v6

    .line 65
    invoke-virtual {v9}, Landroid/net/NetworkInfo;->getTypeName()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v7

    .line 67
    :try_start_1
    const-string v15, "wifi"

    move-object/from16 v0, p1

    invoke-virtual {v0, v15}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Landroid/net/wifi/WifiManager;

    .line 68
    .local v13, "wifiManager":Landroid/net/wifi/WifiManager;
    invoke-virtual {v13}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;

    move-result-object v15

    invoke-virtual {v15}, Landroid/net/wifi/WifiInfo;->getSSID()Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v14

    .line 75
    .end local v13    # "wifiManager":Landroid/net/wifi/WifiManager;
    :cond_0
    :goto_0
    :try_start_2
    const-string v15, "phone"

    move-object/from16 v0, p1

    invoke-virtual {v0, v15}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroid/telephony/TelephonyManager;

    .line 76
    .local v12, "tm":Landroid/telephony/TelephonyManager;
    invoke-virtual {v12}, Landroid/telephony/TelephonyManager;->getNetworkType()I

    move-result v15

    packed-switch v15, :pswitch_data_0

    .line 100
    const-string v11, "UNDETECTABLE"

    .line 105
    :goto_1
    invoke-virtual {v12}, Landroid/telephony/TelephonyManager;->getNetworkOperator()Ljava/lang/String;

    move-result-object v15

    if-eqz v15, :cond_1

    invoke-virtual {v12}, Landroid/telephony/TelephonyManager;->getNetworkOperator()Ljava/lang/String;

    move-result-object v15

    const-string v16, ""

    invoke-virtual/range {v15 .. v16}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_2

    :cond_1
    const-string v8, ""

    .line 106
    .local v8, "networkOperator":Ljava/lang/String;
    :goto_2
    new-instance v15, Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Landroid/telephony/TelephonyManager;->getNetworkOperatorName()Ljava/lang/String;

    move-result-object v16

    invoke-static/range {v16 .. v16}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v16

    invoke-direct/range {v15 .. v16}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 109
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v15

    const-string v16, "airplane_mode_on"

    const/16 v17, 0x0

    invoke-static/range {v15 .. v17}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result v15

    if-eqz v15, :cond_3

    const/4 v15, 0x1

    :goto_3
    invoke-static {v15}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v4

    .line 112
    const-string v15, "isNetworkConnected"

    invoke-virtual {v10, v15, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 113
    const-string v15, "isAirplaneMode"

    invoke-virtual {v10, v15, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 114
    const-string v15, "isRoaming"

    invoke-virtual {v10, v15, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 115
    const-string v15, "networkConnectionType"

    invoke-virtual {v10, v15, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 116
    const-string v15, "wifiName"

    invoke-virtual {v10, v15, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 117
    const-string v15, "telephonyNetworkType"

    invoke-virtual {v10, v15, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 118
    const-string v15, "carrierName"

    invoke-virtual {v10, v15, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 119
    const-string v15, "ipAddress"

    invoke-direct/range {p0 .. p0}, Lcom/worklight/androidgap/plugin/NetworkDetector;->getLocalIpAddress()Ljava/lang/String;

    move-result-object v16

    move-object/from16 v0, v16

    invoke-virtual {v10, v15, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 123
    .end local v1    # "carrierName":Ljava/lang/String;
    .end local v2    # "cm":Landroid/net/ConnectivityManager;
    .end local v4    # "isAirplaneMode":Ljava/lang/String;
    .end local v5    # "isNetworkConnected":Ljava/lang/String;
    .end local v6    # "isRoaming":Ljava/lang/String;
    .end local v7    # "networkConnectionTypeName":Ljava/lang/String;
    .end local v8    # "networkOperator":Ljava/lang/String;
    .end local v9    # "ni":Landroid/net/NetworkInfo;
    .end local v11    # "telephonyNetworkType":Ljava/lang/String;
    .end local v12    # "tm":Landroid/telephony/TelephonyManager;
    .end local v14    # "wifiName":Ljava/lang/String;
    :goto_4
    return-object v10

    .line 69
    .restart local v1    # "carrierName":Ljava/lang/String;
    .restart local v2    # "cm":Landroid/net/ConnectivityManager;
    .restart local v4    # "isAirplaneMode":Ljava/lang/String;
    .restart local v5    # "isNetworkConnected":Ljava/lang/String;
    .restart local v6    # "isRoaming":Ljava/lang/String;
    .restart local v7    # "networkConnectionTypeName":Ljava/lang/String;
    .restart local v9    # "ni":Landroid/net/NetworkInfo;
    .restart local v11    # "telephonyNetworkType":Ljava/lang/String;
    .restart local v14    # "wifiName":Ljava/lang/String;
    :catch_0
    move-exception v3

    .line 70
    .local v3, "e":Ljava/lang/Exception;
    const-string v15, "Cannot retrive WIFI info, check application permission ACCESS_WIFI_STATE in AndroidManifest.xml."

    invoke-static {v15, v3}, Lcom/worklight/common/WLUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto/16 :goto_0

    .line 120
    .end local v1    # "carrierName":Ljava/lang/String;
    .end local v2    # "cm":Landroid/net/ConnectivityManager;
    .end local v3    # "e":Ljava/lang/Exception;
    .end local v4    # "isAirplaneMode":Ljava/lang/String;
    .end local v5    # "isNetworkConnected":Ljava/lang/String;
    .end local v6    # "isRoaming":Ljava/lang/String;
    .end local v7    # "networkConnectionTypeName":Ljava/lang/String;
    .end local v9    # "ni":Landroid/net/NetworkInfo;
    .end local v11    # "telephonyNetworkType":Ljava/lang/String;
    .end local v14    # "wifiName":Ljava/lang/String;
    :catch_1
    move-exception v3

    .line 121
    .restart local v3    # "e":Ljava/lang/Exception;
    const-string v15, "Cannot retrive network diagnostic data: "

    invoke-static {v15, v3}, Lcom/worklight/common/WLUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_4

    .line 78
    .end local v3    # "e":Ljava/lang/Exception;
    .restart local v1    # "carrierName":Ljava/lang/String;
    .restart local v2    # "cm":Landroid/net/ConnectivityManager;
    .restart local v4    # "isAirplaneMode":Ljava/lang/String;
    .restart local v5    # "isNetworkConnected":Ljava/lang/String;
    .restart local v6    # "isRoaming":Ljava/lang/String;
    .restart local v7    # "networkConnectionTypeName":Ljava/lang/String;
    .restart local v9    # "ni":Landroid/net/NetworkInfo;
    .restart local v11    # "telephonyNetworkType":Ljava/lang/String;
    .restart local v12    # "tm":Landroid/telephony/TelephonyManager;
    .restart local v14    # "wifiName":Ljava/lang/String;
    :pswitch_0
    :try_start_3
    const-string v11, "1xRTT"

    goto :goto_1

    .line 80
    :pswitch_1
    const-string v11, "CDMA"

    goto :goto_1

    .line 82
    :pswitch_2
    const-string v11, "EDGE"

    goto/16 :goto_1

    .line 84
    :pswitch_3
    const-string v11, "EVDO_0"

    goto/16 :goto_1

    .line 86
    :pswitch_4
    const-string v11, "EVDO_A"

    goto/16 :goto_1

    .line 88
    :pswitch_5
    const-string v11, "GPRS"

    goto/16 :goto_1

    .line 90
    :pswitch_6
    const-string v11, "UMTS"

    goto/16 :goto_1

    .line 92
    :pswitch_7
    const-string v11, ""

    goto/16 :goto_1

    .line 94
    :pswitch_8
    const-string v11, "HSDPA"

    goto/16 :goto_1

    .line 96
    :pswitch_9
    const-string v11, "HSPA"

    goto/16 :goto_1

    .line 98
    :pswitch_a
    const-string v11, "HSUPA"

    goto/16 :goto_1

    .line 105
    :cond_2
    new-instance v15, Ljava/lang/StringBuilder;

    const-string v16, "("

    invoke-direct/range {v15 .. v16}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12}, Landroid/telephony/TelephonyManager;->getNetworkOperator()Ljava/lang/String;

    move-result-object v16

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    const-string v16, ")"

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    move-result-object v8

    goto/16 :goto_2

    .line 109
    .restart local v8    # "networkOperator":Ljava/lang/String;
    :cond_3
    const/4 v15, 0x0

    goto/16 :goto_3

    .line 76
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_5
        :pswitch_2
        :pswitch_6
        :pswitch_1
        :pswitch_3
        :pswitch_4
        :pswitch_0
        :pswitch_8
        :pswitch_a
        :pswitch_9
    .end packed-switch
.end method
