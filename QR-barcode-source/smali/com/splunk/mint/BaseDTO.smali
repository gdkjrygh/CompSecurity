.class abstract Lcom/splunk/mint/BaseDTO;
.super Ljava/lang/Object;
.source "BaseDTO.java"


# instance fields
.field protected apiKey:Ljava/lang/String;

.field protected appVersionCode:Ljava/lang/String;

.field protected appVersionName:Ljava/lang/String;

.field protected carrier:Ljava/lang/String;

.field protected connection:Ljava/lang/String;

.field protected device:Ljava/lang/String;

.field protected extraData:Lcom/splunk/mint/ExtraData;

.field protected locale:Ljava/lang/String;

.field protected osVersion:Ljava/lang/String;

.field protected packageName:Ljava/lang/String;

.field protected platform:Ljava/lang/String;

.field protected remoteIP:Ljava/lang/String;

.field protected rooted:Ljava/lang/Boolean;

.field protected sdkVersion:Ljava/lang/String;

.field protected state:Ljava/lang/String;

.field protected timestamp:Ljava/lang/String;

.field protected timestampMilis:Ljava/lang/Long;

.field protected type:Lcom/splunk/mint/EnumActionType;

.field protected userIdentifier:Ljava/lang/String;

.field protected uuid:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/splunk/mint/EnumActionType;)V
    .locals 3
    .param p1, "dataType"    # Lcom/splunk/mint/EnumActionType;

    .prologue
    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    invoke-static {}, Lcom/splunk/mint/Utils;->getTime()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/splunk/mint/BaseDTO;->timestamp:Ljava/lang/String;

    .line 42
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/splunk/mint/BaseDTO;->timestampMilis:Ljava/lang/Long;

    .line 43
    const-string v0, "4.0"

    iput-object v0, p0, Lcom/splunk/mint/BaseDTO;->sdkVersion:Ljava/lang/String;

    .line 44
    const-string v0, "Android"

    iput-object v0, p0, Lcom/splunk/mint/BaseDTO;->platform:Ljava/lang/String;

    .line 45
    iput-object p1, p0, Lcom/splunk/mint/BaseDTO;->type:Lcom/splunk/mint/EnumActionType;

    .line 46
    sget-object v0, Lcom/splunk/mint/Properties;->API_KEY:Ljava/lang/String;

    iput-object v0, p0, Lcom/splunk/mint/BaseDTO;->apiKey:Ljava/lang/String;

    .line 47
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v0, Lcom/splunk/mint/Properties;->PHONE_BRAND:Ljava/lang/String;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/splunk/mint/Properties;->PHONE_BRAND:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/splunk/mint/Properties;->PHONE_MODEL:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/splunk/mint/BaseDTO;->device:Ljava/lang/String;

    .line 48
    sget-object v0, Lcom/splunk/mint/Properties;->OS_VERSION:Ljava/lang/String;

    iput-object v0, p0, Lcom/splunk/mint/BaseDTO;->osVersion:Ljava/lang/String;

    .line 49
    sget-object v0, Lcom/splunk/mint/Properties;->APP_VERSIONCODE:Ljava/lang/String;

    iput-object v0, p0, Lcom/splunk/mint/BaseDTO;->appVersionCode:Ljava/lang/String;

    .line 50
    sget-object v0, Lcom/splunk/mint/Properties;->APP_VERSIONNAME:Ljava/lang/String;

    iput-object v0, p0, Lcom/splunk/mint/BaseDTO;->appVersionName:Ljava/lang/String;

    .line 51
    sget-object v0, Lcom/splunk/mint/Properties;->APP_PACKAGE:Ljava/lang/String;

    iput-object v0, p0, Lcom/splunk/mint/BaseDTO;->packageName:Ljava/lang/String;

    .line 52
    sget-object v0, Lcom/splunk/mint/Properties;->LOCALE:Ljava/lang/String;

    iput-object v0, p0, Lcom/splunk/mint/BaseDTO;->locale:Ljava/lang/String;

    .line 53
    sget-boolean v0, Lcom/splunk/mint/Properties;->HAS_ROOT:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/splunk/mint/BaseDTO;->rooted:Ljava/lang/Boolean;

    .line 54
    sget-object v0, Lcom/splunk/mint/Properties;->UID:Ljava/lang/String;

    iput-object v0, p0, Lcom/splunk/mint/BaseDTO;->uuid:Ljava/lang/String;

    .line 55
    sget-object v0, Lcom/splunk/mint/Properties;->userIdentifier:Ljava/lang/String;

    iput-object v0, p0, Lcom/splunk/mint/BaseDTO;->userIdentifier:Ljava/lang/String;

    .line 56
    sget-object v0, Lcom/splunk/mint/Properties;->CARRIER:Ljava/lang/String;

    iput-object v0, p0, Lcom/splunk/mint/BaseDTO;->carrier:Ljava/lang/String;

    .line 57
    const-string v0, "{%#@@#%}"

    iput-object v0, p0, Lcom/splunk/mint/BaseDTO;->remoteIP:Ljava/lang/String;

    .line 58
    sget-object v0, Lcom/splunk/mint/Properties;->CONNECTION:Ljava/lang/String;

    iput-object v0, p0, Lcom/splunk/mint/BaseDTO;->connection:Ljava/lang/String;

    .line 59
    sget-object v0, Lcom/splunk/mint/Properties;->STATE:Ljava/lang/String;

    iput-object v0, p0, Lcom/splunk/mint/BaseDTO;->state:Ljava/lang/String;

    .line 60
    sget-object v0, Lcom/splunk/mint/Properties;->extraData:Lcom/splunk/mint/ExtraData;

    iput-object v0, p0, Lcom/splunk/mint/BaseDTO;->extraData:Lcom/splunk/mint/ExtraData;

    .line 61
    return-void

    .line 47
    :cond_0
    const-string v0, ""

    goto :goto_0
.end method


# virtual methods
.method public getBasicDataFixtureJson()Lorg/json/JSONObject;
    .locals 7

    .prologue
    .line 64
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 69
    .local v4, "json":Lorg/json/JSONObject;
    :try_start_0
    const-string v5, "sdkVersion"

    iget-object v6, p0, Lcom/splunk/mint/BaseDTO;->sdkVersion:Ljava/lang/String;

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 70
    const-string v5, "apiKey"

    iget-object v6, p0, Lcom/splunk/mint/BaseDTO;->apiKey:Ljava/lang/String;

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 71
    const-string v5, "platform"

    iget-object v6, p0, Lcom/splunk/mint/BaseDTO;->platform:Ljava/lang/String;

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 72
    const-string v5, "device"

    iget-object v6, p0, Lcom/splunk/mint/BaseDTO;->device:Ljava/lang/String;

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 73
    const-string v5, "osVersion"

    iget-object v6, p0, Lcom/splunk/mint/BaseDTO;->osVersion:Ljava/lang/String;

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 74
    const-string v5, "locale"

    iget-object v6, p0, Lcom/splunk/mint/BaseDTO;->locale:Ljava/lang/String;

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 75
    const-string v5, "uuid"

    iget-object v6, p0, Lcom/splunk/mint/BaseDTO;->uuid:Ljava/lang/String;

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 76
    const-string v5, "userIdentifier"

    iget-object v6, p0, Lcom/splunk/mint/BaseDTO;->userIdentifier:Ljava/lang/String;

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 77
    const-string v5, "carrier"

    iget-object v6, p0, Lcom/splunk/mint/BaseDTO;->carrier:Ljava/lang/String;

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 78
    const-string v5, "remoteIP"

    iget-object v6, p0, Lcom/splunk/mint/BaseDTO;->remoteIP:Ljava/lang/String;

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 79
    const-string v5, "appVersionCode"

    iget-object v6, p0, Lcom/splunk/mint/BaseDTO;->appVersionCode:Ljava/lang/String;

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 80
    const-string v5, "appVersionName"

    iget-object v6, p0, Lcom/splunk/mint/BaseDTO;->appVersionName:Ljava/lang/String;

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 81
    const-string v5, "packageName"

    iget-object v6, p0, Lcom/splunk/mint/BaseDTO;->packageName:Ljava/lang/String;

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 82
    const-string v5, "connection"

    iget-object v6, p0, Lcom/splunk/mint/BaseDTO;->connection:Ljava/lang/String;

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 83
    const-string v5, "state"

    iget-object v6, p0, Lcom/splunk/mint/BaseDTO;->state:Ljava/lang/String;

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 85
    iget-object v5, p0, Lcom/splunk/mint/BaseDTO;->type:Lcom/splunk/mint/EnumActionType;

    sget-object v6, Lcom/splunk/mint/EnumActionType;->ping:Lcom/splunk/mint/EnumActionType;

    if-ne v5, v6, :cond_1

    .line 105
    :cond_0
    :goto_0
    return-object v4

    .line 87
    :cond_1
    iget-object v5, p0, Lcom/splunk/mint/BaseDTO;->type:Lcom/splunk/mint/EnumActionType;

    sget-object v6, Lcom/splunk/mint/EnumActionType;->gnip:Lcom/splunk/mint/EnumActionType;

    if-eq v5, v6, :cond_0

    .line 89
    iget-object v5, p0, Lcom/splunk/mint/BaseDTO;->extraData:Lcom/splunk/mint/ExtraData;

    if-eqz v5, :cond_0

    iget-object v5, p0, Lcom/splunk/mint/BaseDTO;->extraData:Lcom/splunk/mint/ExtraData;

    invoke-virtual {v5}, Lcom/splunk/mint/ExtraData;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_0

    .line 90
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 91
    .local v2, "extraDataJson":Lorg/json/JSONObject;
    iget-object v5, p0, Lcom/splunk/mint/BaseDTO;->extraData:Lcom/splunk/mint/ExtraData;

    invoke-virtual {v5}, Lcom/splunk/mint/ExtraData;->entrySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .local v3, "i$":Ljava/util/Iterator;
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 92
    .local v1, "extra":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_2

    .line 93
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    const-string v6, "null"

    invoke-virtual {v2, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 102
    .end local v1    # "extra":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
    .end local v2    # "extraDataJson":Lorg/json/JSONObject;
    .end local v3    # "i$":Ljava/util/Iterator;
    :catch_0
    move-exception v0

    .line 103
    .local v0, "e":Lorg/json/JSONException;
    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_0

    .line 95
    .end local v0    # "e":Lorg/json/JSONException;
    .restart local v1    # "extra":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
    .restart local v2    # "extraDataJson":Lorg/json/JSONObject;
    .restart local v3    # "i$":Ljava/util/Iterator;
    :cond_2
    :try_start_1
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v2, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_1

    .line 99
    .end local v1    # "extra":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
    :cond_3
    const-string v5, "extraData"

    invoke-virtual {v4, v5, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0
.end method
