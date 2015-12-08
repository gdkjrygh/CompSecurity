.class Lcom/splunk/mint/RemoteSettings;
.super Ljava/lang/Object;
.source "RemoteSettings.java"


# static fields
.field private static final DEVSETTINGS:Ljava/lang/String; = "devSettings"

.field private static final EVENTLEVEL:Ljava/lang/String; = "eventLevel"

.field private static final HASHCODE:Ljava/lang/String; = "hashCode"

.field private static final LOGLEVEL:Ljava/lang/String; = "logLevel"

.field private static final NETWORKMONITORING:Ljava/lang/String; = "netMonitoring"

.field private static final REMOTESETTINGS_API:Ljava/lang/String; = "1"

.field private static final REMOTESETTINGS_NAME:Ljava/lang/String; = "remSetVer"

.field private static final SESSIONTIME:Ljava/lang/String; = "sessionTime"

.field private static final SHARED_PREFERENSES_NAME:Ljava/lang/String; = "REMOTESETTINGSSETTINGS"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method protected static final convertJsonToRemoteSettings(Ljava/lang/String;)Lcom/splunk/mint/RemoteSettingsData;
    .locals 6
    .param p0, "jsonData"    # Ljava/lang/String;

    .prologue
    .line 24
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    const/4 v5, 0x1

    if-ge v4, v5, :cond_2

    .line 25
    :cond_0
    const/4 v2, 0x0

    .line 46
    :cond_1
    :goto_0
    return-object v2

    .line 27
    :cond_2
    new-instance v2, Lcom/splunk/mint/RemoteSettingsData;

    invoke-direct {v2}, Lcom/splunk/mint/RemoteSettingsData;-><init>()V

    .line 29
    .local v2, "rsd":Lcom/splunk/mint/RemoteSettingsData;
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 31
    .local v1, "rdjson":Lorg/json/JSONObject;
    const-string v4, "remSetVer1"

    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    .line 33
    .local v3, "settings":Lorg/json/JSONObject;
    if-eqz v3, :cond_1

    .line 34
    const-string v4, "logLevel"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iput-object v4, v2, Lcom/splunk/mint/RemoteSettingsData;->logLevel:Ljava/lang/Integer;

    .line 35
    const-string v4, "eventLevel"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iput-object v4, v2, Lcom/splunk/mint/RemoteSettingsData;->eventLevel:Ljava/lang/Integer;

    .line 36
    const-string v4, "netMonitoring"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    iput-object v4, v2, Lcom/splunk/mint/RemoteSettingsData;->netMonitoring:Ljava/lang/Boolean;

    .line 37
    const-string v4, "sessionTime"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iput-object v4, v2, Lcom/splunk/mint/RemoteSettingsData;->sessionTime:Ljava/lang/Integer;

    .line 38
    const-string v4, "devSettings"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v4

    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v2, Lcom/splunk/mint/RemoteSettingsData;->devSettings:Ljava/lang/String;

    .line 39
    const-string v4, "hash"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v2, Lcom/splunk/mint/RemoteSettingsData;->hashCode:Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 41
    .end local v1    # "rdjson":Lorg/json/JSONObject;
    .end local v3    # "settings":Lorg/json/JSONObject;
    :catch_0
    move-exception v0

    .line 42
    .local v0, "e":Lorg/json/JSONException;
    const-string v4, "Could not convert json to remote data"

    invoke-static {v4}, Lcom/splunk/mint/Logger;->logError(Ljava/lang/String;)V

    goto :goto_0
.end method

.method protected static final loadRemoteSettings(Landroid/content/Context;)Lcom/splunk/mint/RemoteSettingsData;
    .locals 4
    .param p0, "ctx"    # Landroid/content/Context;

    .prologue
    .line 100
    new-instance v1, Lcom/splunk/mint/RemoteSettingsData;

    invoke-direct {v1}, Lcom/splunk/mint/RemoteSettingsData;-><init>()V

    .line 101
    .local v1, "rsd":Lcom/splunk/mint/RemoteSettingsData;
    const-string v2, "REMOTESETTINGSSETTINGS"

    const/4 v3, 0x0

    invoke-virtual {p0, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 102
    .local v0, "preferences":Landroid/content/SharedPreferences;
    if-nez v0, :cond_0

    .line 103
    const/4 v1, 0x0

    .line 113
    .end local v1    # "rsd":Lcom/splunk/mint/RemoteSettingsData;
    :goto_0
    return-object v1

    .line 106
    .restart local v1    # "rsd":Lcom/splunk/mint/RemoteSettingsData;
    :cond_0
    const-string v2, "logLevel"

    sget-object v3, Lcom/splunk/mint/Properties$RemoteSettingsProps;->logLevel:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v1, Lcom/splunk/mint/RemoteSettingsData;->logLevel:Ljava/lang/Integer;

    .line 107
    const-string v2, "eventLevel"

    sget-object v3, Lcom/splunk/mint/Properties$RemoteSettingsProps;->eventLevel:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v1, Lcom/splunk/mint/RemoteSettingsData;->eventLevel:Ljava/lang/Integer;

    .line 108
    const-string v2, "netMonitoring"

    sget-object v3, Lcom/splunk/mint/Properties$RemoteSettingsProps;->netMonitoringEnabled:Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, v1, Lcom/splunk/mint/RemoteSettingsData;->netMonitoring:Ljava/lang/Boolean;

    .line 109
    const-string v2, "sessionTime"

    sget-object v3, Lcom/splunk/mint/Properties$RemoteSettingsProps;->sessionTime:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v1, Lcom/splunk/mint/RemoteSettingsData;->sessionTime:Ljava/lang/Integer;

    .line 110
    const-string v2, "devSettings"

    sget-object v3, Lcom/splunk/mint/Properties$RemoteSettingsProps;->devSettings:Lorg/json/JSONObject;

    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/splunk/mint/RemoteSettingsData;->devSettings:Ljava/lang/String;

    .line 111
    const-string v2, "hashCode"

    sget-object v3, Lcom/splunk/mint/Properties$RemoteSettingsProps;->hashCode:Ljava/lang/String;

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/splunk/mint/RemoteSettingsData;->hashCode:Ljava/lang/String;

    goto :goto_0
.end method

.method protected static final saveAndLoadRemoteSettings(Landroid/content/Context;Lcom/splunk/mint/RemoteSettingsData;)Z
    .locals 5
    .param p0, "ctx"    # Landroid/content/Context;
    .param p1, "rsd"    # Lcom/splunk/mint/RemoteSettingsData;

    .prologue
    const/4 v3, 0x0

    .line 51
    const-string v4, "REMOTESETTINGSSETTINGS"

    invoke-virtual {p0, v4, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v2

    .line 52
    .local v2, "preferences":Landroid/content/SharedPreferences;
    if-nez v2, :cond_1

    .line 96
    :cond_0
    :goto_0
    return v3

    .line 55
    :cond_1
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 56
    .local v1, "editor":Landroid/content/SharedPreferences$Editor;
    if-eqz v1, :cond_0

    .line 62
    iget-object v3, p1, Lcom/splunk/mint/RemoteSettingsData;->logLevel:Ljava/lang/Integer;

    if-eqz v3, :cond_2

    iget-object v3, p1, Lcom/splunk/mint/RemoteSettingsData;->logLevel:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-lez v3, :cond_2

    .line 63
    const-string v3, "logLevel"

    iget-object v4, p1, Lcom/splunk/mint/RemoteSettingsData;->logLevel:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-interface {v1, v3, v4}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 64
    iget-object v3, p1, Lcom/splunk/mint/RemoteSettingsData;->logLevel:Ljava/lang/Integer;

    sput-object v3, Lcom/splunk/mint/Properties$RemoteSettingsProps;->logLevel:Ljava/lang/Integer;

    .line 67
    :cond_2
    iget-object v3, p1, Lcom/splunk/mint/RemoteSettingsData;->eventLevel:Ljava/lang/Integer;

    if-eqz v3, :cond_3

    iget-object v3, p1, Lcom/splunk/mint/RemoteSettingsData;->eventLevel:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-lez v3, :cond_3

    .line 68
    const-string v3, "eventLevel"

    iget-object v4, p1, Lcom/splunk/mint/RemoteSettingsData;->eventLevel:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-interface {v1, v3, v4}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 69
    iget-object v3, p1, Lcom/splunk/mint/RemoteSettingsData;->eventLevel:Ljava/lang/Integer;

    sput-object v3, Lcom/splunk/mint/Properties$RemoteSettingsProps;->eventLevel:Ljava/lang/Integer;

    .line 72
    :cond_3
    iget-object v3, p1, Lcom/splunk/mint/RemoteSettingsData;->netMonitoring:Ljava/lang/Boolean;

    if-eqz v3, :cond_4

    .line 73
    const-string v3, "netMonitoring"

    iget-object v4, p1, Lcom/splunk/mint/RemoteSettingsData;->netMonitoring:Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    invoke-interface {v1, v3, v4}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 74
    iget-object v3, p1, Lcom/splunk/mint/RemoteSettingsData;->netMonitoring:Ljava/lang/Boolean;

    sput-object v3, Lcom/splunk/mint/Properties$RemoteSettingsProps;->netMonitoringEnabled:Ljava/lang/Boolean;

    .line 77
    :cond_4
    iget-object v3, p1, Lcom/splunk/mint/RemoteSettingsData;->sessionTime:Ljava/lang/Integer;

    if-eqz v3, :cond_5

    iget-object v3, p1, Lcom/splunk/mint/RemoteSettingsData;->sessionTime:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-lez v3, :cond_5

    .line 78
    const-string v3, "sessionTime"

    iget-object v4, p1, Lcom/splunk/mint/RemoteSettingsData;->sessionTime:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-interface {v1, v3, v4}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 79
    iget-object v3, p1, Lcom/splunk/mint/RemoteSettingsData;->sessionTime:Ljava/lang/Integer;

    sput-object v3, Lcom/splunk/mint/Properties$RemoteSettingsProps;->sessionTime:Ljava/lang/Integer;

    .line 82
    :cond_5
    iget-object v3, p1, Lcom/splunk/mint/RemoteSettingsData;->devSettings:Ljava/lang/String;

    if-eqz v3, :cond_6

    .line 83
    const-string v3, "devSettings"

    iget-object v4, p1, Lcom/splunk/mint/RemoteSettingsData;->devSettings:Ljava/lang/String;

    invoke-interface {v1, v3, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 85
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    iget-object v4, p1, Lcom/splunk/mint/RemoteSettingsData;->devSettings:Ljava/lang/String;

    invoke-direct {v3, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    sput-object v3, Lcom/splunk/mint/Properties$RemoteSettingsProps;->devSettings:Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 91
    :cond_6
    :goto_1
    iget-object v3, p1, Lcom/splunk/mint/RemoteSettingsData;->hashCode:Ljava/lang/String;

    if-eqz v3, :cond_7

    iget-object v3, p1, Lcom/splunk/mint/RemoteSettingsData;->hashCode:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v4, 0x1

    if-le v3, v4, :cond_7

    .line 92
    const-string v3, "hashCode"

    iget-object v4, p1, Lcom/splunk/mint/RemoteSettingsData;->hashCode:Ljava/lang/String;

    invoke-interface {v1, v3, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 93
    iget-object v3, p1, Lcom/splunk/mint/RemoteSettingsData;->hashCode:Ljava/lang/String;

    sput-object v3, Lcom/splunk/mint/Properties$RemoteSettingsProps;->hashCode:Ljava/lang/String;

    .line 96
    :cond_7
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v3

    goto/16 :goto_0

    .line 86
    :catch_0
    move-exception v0

    .line 87
    .local v0, "e":Lorg/json/JSONException;
    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_1
.end method
