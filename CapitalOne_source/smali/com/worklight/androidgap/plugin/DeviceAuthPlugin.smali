.class public Lcom/worklight/androidgap/plugin/DeviceAuthPlugin;
.super Lorg/apache/cordova/api/Plugin;
.source "DeviceAuthPlugin.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;
    }
.end annotation


# static fields
.field private static synthetic $SWITCH_TABLE$com$worklight$androidgap$plugin$DeviceAuthPlugin$Command:[I = null

.field private static final RESULT_ERROR:Ljava/lang/String; = "result:error"


# instance fields
.field private logCat:Ljava/lang/String;


# direct methods
.method static synthetic $SWITCH_TABLE$com$worklight$androidgap$plugin$DeviceAuthPlugin$Command()[I
    .locals 3

    .prologue
    .line 27
    sget-object v0, Lcom/worklight/androidgap/plugin/DeviceAuthPlugin;->$SWITCH_TABLE$com$worklight$androidgap$plugin$DeviceAuthPlugin$Command:[I

    if-eqz v0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {}, Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;->values()[Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_0
    sget-object v1, Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;->createCSR:Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;

    invoke-virtual {v1}, Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_4

    :goto_1
    :try_start_1
    sget-object v1, Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;->createDeviceAuthHeader:Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;

    invoke-virtual {v1}, Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_3

    :goto_2
    :try_start_2
    sget-object v1, Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;->init:Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;

    invoke-virtual {v1}, Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :goto_3
    :try_start_3
    sget-object v1, Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;->isCertificateExists:Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;

    invoke-virtual {v1}, Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_1

    :goto_4
    :try_start_4
    sget-object v1, Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;->noValue:Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;

    invoke-virtual {v1}, Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;->ordinal()I

    move-result v1

    const/4 v2, 0x5

    aput v2, v0, v1
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_0

    :goto_5
    sput-object v0, Lcom/worklight/androidgap/plugin/DeviceAuthPlugin;->$SWITCH_TABLE$com$worklight$androidgap$plugin$DeviceAuthPlugin$Command:[I

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_5

    :catch_1
    move-exception v1

    goto :goto_4

    :catch_2
    move-exception v1

    goto :goto_3

    :catch_3
    move-exception v1

    goto :goto_2

    :catch_4
    move-exception v1

    goto :goto_1
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 27
    invoke-direct {p0}, Lorg/apache/cordova/api/Plugin;-><init>()V

    .line 44
    const-string v0, ""

    iput-object v0, p0, Lcom/worklight/androidgap/plugin/DeviceAuthPlugin;->logCat:Ljava/lang/String;

    .line 27
    return-void
.end method

.method private createCSR(Lorg/json/JSONArray;)Lorg/apache/cordova/api/PluginResult;
    .locals 6
    .param p1, "args"    # Lorg/json/JSONArray;

    .prologue
    .line 98
    const/4 v4, 0x0

    :try_start_0
    invoke-virtual {p1, v4}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 99
    .local v0, "csrData":Ljava/lang/String;
    const/4 v4, 0x1

    invoke-virtual {p1, v4}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 100
    .local v2, "provisioningEntity":Ljava/lang/String;
    const/4 v4, 0x2

    invoke-virtual {p1, v4}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 103
    .local v3, "realm":Ljava/lang/String;
    invoke-static {}, Lcom/worklight/common/security/WLDeviceAuthManager;->getInstance()Lcom/worklight/common/security/WLDeviceAuthManager;

    move-result-object v4

    invoke-virtual {v4, v0, v2, v3}, Lcom/worklight/common/security/WLDeviceAuthManager;->createCSR(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 104
    new-instance v4, Lorg/apache/cordova/api/PluginResult;

    sget-object v5, Lorg/apache/cordova/api/PluginResult$Status;->OK:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-direct {v4, v5}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 107
    .end local v0    # "csrData":Ljava/lang/String;
    .end local v2    # "provisioningEntity":Ljava/lang/String;
    .end local v3    # "realm":Ljava/lang/String;
    :goto_0
    return-object v4

    .line 105
    :catch_0
    move-exception v1

    .line 106
    .local v1, "e":Lorg/json/JSONException;
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Error occurred while trying to create CSR "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v1}, Lcom/worklight/common/WLUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 107
    new-instance v4, Lorg/apache/cordova/api/PluginResult;

    sget-object v5, Lorg/apache/cordova/api/PluginResult$Status;->ERROR:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-direct {v4, v5}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;)V

    goto :goto_0
.end method

.method private createDeviceAuthHeader(Lorg/json/JSONArray;)Ljava/lang/String;
    .locals 8
    .param p1, "args"    # Lorg/json/JSONArray;

    .prologue
    .line 121
    const/4 v6, 0x0

    :try_start_0
    invoke-virtual {p1, v6}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 122
    .local v2, "payLoadJson":Ljava/lang/String;
    const/4 v6, 0x1

    invoke-virtual {p1, v6}, Lorg/json/JSONArray;->getBoolean(I)Z

    move-result v1

    .line 123
    .local v1, "isProvisioningEnabled":Z
    const/4 v6, 0x2

    invoke-virtual {p1, v6}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 124
    .local v4, "provisioningEntity":Ljava/lang/String;
    invoke-static {}, Lcom/worklight/common/security/WLDeviceAuthManager;->getInstance()Lcom/worklight/common/security/WLDeviceAuthManager;

    move-result-object v6

    invoke-static {}, Lcom/worklight/androidgap/WLDroidGap;->getWLConfig()Lcom/worklight/common/WLConfig;

    move-result-object v7

    invoke-virtual {v6, v7, v2}, Lcom/worklight/common/security/WLDeviceAuthManager;->addDeviceIdAndAppId(Lcom/worklight/common/WLConfig;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 125
    .local v3, "payloadWithDeviceAndApp":Ljava/lang/String;
    invoke-static {}, Lcom/worklight/common/security/WLDeviceAuthManager;->getInstance()Lcom/worklight/common/security/WLDeviceAuthManager;

    move-result-object v6

    invoke-virtual {v6, v3, v4, v1}, Lcom/worklight/common/security/WLDeviceAuthManager;->createDeviceAuthHeader(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v5

    .line 130
    .end local v1    # "isProvisioningEnabled":Z
    .end local v2    # "payLoadJson":Ljava/lang/String;
    .end local v3    # "payloadWithDeviceAndApp":Ljava/lang/String;
    .end local v4    # "provisioningEntity":Ljava/lang/String;
    :goto_0
    return-object v5

    .line 126
    :catch_0
    move-exception v0

    .line 127
    .local v0, "e":Ljava/lang/Exception;
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Error occurred while trying to create JWS header "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v0}, Lcom/worklight/common/WLUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 128
    const-string v5, "result:error"

    goto :goto_0
.end method

.method private init(Lorg/json/JSONArray;)Lorg/apache/cordova/api/PluginResult;
    .locals 3
    .param p1, "args"    # Lorg/json/JSONArray;

    .prologue
    .line 86
    invoke-static {}, Lcom/worklight/common/security/WLDeviceAuthManager;->getInstance()Lcom/worklight/common/security/WLDeviceAuthManager;

    move-result-object v1

    iget-object v0, p0, Lcom/worklight/androidgap/plugin/DeviceAuthPlugin;->cordova:Lorg/apache/cordova/api/CordovaInterface;

    check-cast v0, Landroid/app/Activity;

    iget-object v2, p0, Lcom/worklight/androidgap/plugin/DeviceAuthPlugin;->webView:Lorg/apache/cordova/CordovaWebView;

    invoke-virtual {v1, v0, v2}, Lcom/worklight/common/security/WLDeviceAuthManager;->init(Landroid/app/Activity;Landroid/webkit/WebView;)V

    .line 87
    new-instance v0, Lorg/apache/cordova/api/PluginResult;

    sget-object v1, Lorg/apache/cordova/api/PluginResult$Status;->OK:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-direct {v0, v1}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;)V

    return-object v0
.end method

.method private isIfCertificateExists(Lorg/json/JSONArray;)Ljava/lang/String;
    .locals 6
    .param p1, "args"    # Lorg/json/JSONArray;

    .prologue
    .line 141
    const/4 v4, 0x0

    :try_start_0
    invoke-virtual {p1, v4}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 142
    .local v2, "provisioningEntity":Ljava/lang/String;
    invoke-static {}, Lcom/worklight/common/security/WLDeviceAuthManager;->getInstance()Lcom/worklight/common/security/WLDeviceAuthManager;

    move-result-object v4

    invoke-virtual {v4, v2}, Lcom/worklight/common/security/WLDeviceAuthManager;->isCertificateExists(Ljava/lang/String;)Z

    move-result v0

    .line 143
    .local v0, "certificateExists":Z
    invoke-static {v0}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v3

    .line 148
    .end local v0    # "certificateExists":Z
    .end local v2    # "provisioningEntity":Ljava/lang/String;
    :goto_0
    return-object v3

    .line 144
    :catch_0
    move-exception v1

    .line 145
    .local v1, "e":Ljava/lang/Exception;
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Error occurred while trying to check device authentication "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v1}, Lcom/worklight/common/WLUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 146
    const-string v3, "result:error"

    goto :goto_0
.end method


# virtual methods
.method public debug(Ljava/lang/String;)V
    .locals 1
    .param p1, "msg"    # Ljava/lang/String;

    .prologue
    .line 47
    iget-object v0, p0, Lcom/worklight/androidgap/plugin/DeviceAuthPlugin;->logCat:Ljava/lang/String;

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 48
    return-void
.end method

.method public error(Ljava/lang/String;)V
    .locals 1
    .param p1, "msg"    # Ljava/lang/String;

    .prologue
    .line 51
    iget-object v0, p0, Lcom/worklight/androidgap/plugin/DeviceAuthPlugin;->logCat:Ljava/lang/String;

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 52
    return-void
.end method

.method public execute(Ljava/lang/String;Lorg/json/JSONArray;Ljava/lang/String;)Lorg/apache/cordova/api/PluginResult;
    .locals 3
    .param p1, "action"    # Ljava/lang/String;
    .param p2, "args"    # Lorg/json/JSONArray;
    .param p3, "callbackId"    # Ljava/lang/String;

    .prologue
    .line 56
    const-string v0, ""

    .line 57
    .local v0, "result":Ljava/lang/String;
    invoke-static {}, Lcom/worklight/androidgap/plugin/DeviceAuthPlugin;->$SWITCH_TABLE$com$worklight$androidgap$plugin$DeviceAuthPlugin$Command()[I

    move-result-object v1

    invoke-static {p1}, Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;->fromString(Ljava/lang/String;)Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;

    move-result-object v2

    invoke-virtual {v2}, Lcom/worklight/androidgap/plugin/DeviceAuthPlugin$Command;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    .line 71
    :goto_0
    const-string v1, "result:error"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 72
    new-instance v1, Lorg/apache/cordova/api/PluginResult;

    sget-object v2, Lorg/apache/cordova/api/PluginResult$Status;->ERROR:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-direct {v1, v2}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;)V

    .line 75
    :goto_1
    return-object v1

    .line 60
    :pswitch_0
    invoke-direct {p0, p2}, Lcom/worklight/androidgap/plugin/DeviceAuthPlugin;->isIfCertificateExists(Lorg/json/JSONArray;)Ljava/lang/String;

    move-result-object v0

    .line 61
    goto :goto_0

    .line 63
    :pswitch_1
    invoke-direct {p0, p2}, Lcom/worklight/androidgap/plugin/DeviceAuthPlugin;->createDeviceAuthHeader(Lorg/json/JSONArray;)Ljava/lang/String;

    move-result-object v0

    .line 64
    goto :goto_0

    .line 66
    :pswitch_2
    invoke-direct {p0, p2}, Lcom/worklight/androidgap/plugin/DeviceAuthPlugin;->createCSR(Lorg/json/JSONArray;)Lorg/apache/cordova/api/PluginResult;

    move-result-object v1

    goto :goto_1

    .line 68
    :pswitch_3
    invoke-direct {p0, p2}, Lcom/worklight/androidgap/plugin/DeviceAuthPlugin;->init(Lorg/json/JSONArray;)Lorg/apache/cordova/api/PluginResult;

    move-result-object v1

    goto :goto_1

    .line 75
    :cond_0
    new-instance v1, Lorg/apache/cordova/api/PluginResult;

    sget-object v2, Lorg/apache/cordova/api/PluginResult$Status;->OK:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-direct {v1, v2, v0}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Ljava/lang/String;)V

    goto :goto_1

    .line 57
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public isSynch(Ljava/lang/String;)Z
    .locals 1
    .param p1, "arg0"    # Ljava/lang/String;

    .prologue
    .line 153
    const/4 v0, 0x1

    return v0
.end method
