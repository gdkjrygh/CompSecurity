.class Lcom/splunk/mint/ActionEvent;
.super Lcom/splunk/mint/BaseDTO;
.source "ActionEvent.java"

# interfaces
.implements Lcom/splunk/mint/InterfaceDataType;


# static fields
.field private static savedSessionID:Ljava/lang/String;


# instance fields
.field protected duration:J

.field protected eventLevel:Ljava/lang/Integer;

.field protected eventName:Ljava/lang/String;

.field protected session_id:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 14
    const-string v0, ""

    sput-object v0, Lcom/splunk/mint/ActionEvent;->savedSessionID:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/splunk/mint/EnumActionType;Ljava/lang/String;Ljava/lang/Integer;)V
    .locals 2
    .param p1, "type"    # Lcom/splunk/mint/EnumActionType;
    .param p2, "eventName"    # Ljava/lang/String;
    .param p3, "level"    # Ljava/lang/Integer;

    .prologue
    .line 17
    invoke-direct {p0, p1}, Lcom/splunk/mint/BaseDTO;-><init>(Lcom/splunk/mint/EnumActionType;)V

    .line 50
    const-string v0, ""

    iput-object v0, p0, Lcom/splunk/mint/ActionEvent;->eventName:Ljava/lang/String;

    .line 51
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/splunk/mint/ActionEvent;->eventLevel:Ljava/lang/Integer;

    .line 52
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/splunk/mint/ActionEvent;->duration:J

    .line 53
    const-string v0, ""

    iput-object v0, p0, Lcom/splunk/mint/ActionEvent;->session_id:Ljava/lang/String;

    .line 18
    iput-object p2, p0, Lcom/splunk/mint/ActionEvent;->eventName:Ljava/lang/String;

    .line 19
    iput-object p3, p0, Lcom/splunk/mint/ActionEvent;->eventLevel:Ljava/lang/Integer;

    .line 20
    sget-object v0, Lcom/splunk/mint/EnumActionType;->ping:Lcom/splunk/mint/EnumActionType;

    if-ne p1, v0, :cond_1

    .line 21
    invoke-static {}, Lcom/splunk/mint/Utils;->getRandomSessionNumber()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/splunk/mint/ActionEvent;->session_id:Ljava/lang/String;

    .line 22
    iget-object v0, p0, Lcom/splunk/mint/ActionEvent;->session_id:Ljava/lang/String;

    sput-object v0, Lcom/splunk/mint/ActionEvent;->savedSessionID:Ljava/lang/String;

    .line 26
    :cond_0
    :goto_0
    return-void

    .line 23
    :cond_1
    sget-object v0, Lcom/splunk/mint/EnumActionType;->gnip:Lcom/splunk/mint/EnumActionType;

    if-ne p1, v0, :cond_0

    .line 24
    sget-object v0, Lcom/splunk/mint/ActionEvent;->savedSessionID:Ljava/lang/String;

    iput-object v0, p0, Lcom/splunk/mint/ActionEvent;->session_id:Ljava/lang/String;

    goto :goto_0
.end method

.method public static final createEvent(Ljava/lang/String;)Lcom/splunk/mint/ActionEvent;
    .locals 3
    .param p0, "eventName"    # Ljava/lang/String;

    .prologue
    .line 30
    new-instance v0, Lcom/splunk/mint/ActionEvent;

    sget-object v1, Lcom/splunk/mint/EnumActionType;->event:Lcom/splunk/mint/EnumActionType;

    sget-object v2, Lcom/splunk/mint/MintLogLevel;->Verbose:Lcom/splunk/mint/MintLogLevel;

    invoke-static {v2}, Lcom/splunk/mint/Utils;->convertLoggingLevelToInt(Lcom/splunk/mint/MintLogLevel;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, p0, v2}, Lcom/splunk/mint/ActionEvent;-><init>(Lcom/splunk/mint/EnumActionType;Ljava/lang/String;Ljava/lang/Integer;)V

    return-object v0
.end method

.method public static final createEvent(Ljava/lang/String;Lcom/splunk/mint/MintLogLevel;)Lcom/splunk/mint/ActionEvent;
    .locals 3
    .param p0, "eventName"    # Ljava/lang/String;
    .param p1, "level"    # Lcom/splunk/mint/MintLogLevel;

    .prologue
    .line 34
    new-instance v0, Lcom/splunk/mint/ActionEvent;

    sget-object v1, Lcom/splunk/mint/EnumActionType;->event:Lcom/splunk/mint/EnumActionType;

    invoke-static {p1}, Lcom/splunk/mint/Utils;->convertLoggingLevelToInt(Lcom/splunk/mint/MintLogLevel;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, p0, v2}, Lcom/splunk/mint/ActionEvent;-><init>(Lcom/splunk/mint/EnumActionType;Ljava/lang/String;Ljava/lang/Integer;)V

    return-object v0
.end method

.method public static final createGnip()Lcom/splunk/mint/ActionEvent;
    .locals 6

    .prologue
    const/4 v2, 0x0

    .line 45
    new-instance v0, Lcom/splunk/mint/ActionEvent;

    sget-object v1, Lcom/splunk/mint/EnumActionType;->gnip:Lcom/splunk/mint/EnumActionType;

    invoke-direct {v0, v1, v2, v2}, Lcom/splunk/mint/ActionEvent;-><init>(Lcom/splunk/mint/EnumActionType;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 46
    .local v0, "eventGnip":Lcom/splunk/mint/ActionEvent;
    iget-object v1, v0, Lcom/splunk/mint/ActionEvent;->timestampMilis:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    sget-wide v4, Lcom/splunk/mint/Properties;->lastPingTime:J

    sub-long/2addr v2, v4

    iput-wide v2, v0, Lcom/splunk/mint/ActionEvent;->duration:J

    .line 47
    return-object v0
.end method

.method public static final createPing()Lcom/splunk/mint/ActionEvent;
    .locals 4

    .prologue
    const/4 v2, 0x0

    .line 38
    new-instance v0, Lcom/splunk/mint/ActionEvent;

    sget-object v1, Lcom/splunk/mint/EnumActionType;->ping:Lcom/splunk/mint/EnumActionType;

    invoke-direct {v0, v1, v2, v2}, Lcom/splunk/mint/ActionEvent;-><init>(Lcom/splunk/mint/EnumActionType;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 40
    .local v0, "eventPing":Lcom/splunk/mint/ActionEvent;
    iget-object v1, v0, Lcom/splunk/mint/ActionEvent;->timestampMilis:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    sput-wide v2, Lcom/splunk/mint/Properties;->lastPingTime:J

    .line 41
    return-object v0
.end method


# virtual methods
.method public save(Lcom/splunk/mint/DataSaver;)V
    .locals 2
    .param p1, "dataSaver"    # Lcom/splunk/mint/DataSaver;

    .prologue
    .line 104
    iget-object v0, p0, Lcom/splunk/mint/ActionEvent;->eventLevel:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    .line 105
    iget-object v0, p0, Lcom/splunk/mint/ActionEvent;->eventLevel:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    sget-object v1, Lcom/splunk/mint/Properties$RemoteSettingsProps;->eventLevel:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-lt v0, v1, :cond_0

    .line 106
    invoke-virtual {p0}, Lcom/splunk/mint/ActionEvent;->toJsonLine()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/splunk/mint/DataSaver;->save(Ljava/lang/String;)V

    .line 113
    :goto_0
    return-void

    .line 108
    :cond_0
    const-string v0, "Event\'s level is lower than the minimum level from Remote Settings, event will not be saved"

    invoke-static {v0}, Lcom/splunk/mint/Logger;->logInfo(Ljava/lang/String;)V

    goto :goto_0

    .line 111
    :cond_1
    invoke-virtual {p0}, Lcom/splunk/mint/ActionEvent;->toJsonLine()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/splunk/mint/DataSaver;->save(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public send(Landroid/content/Context;Lcom/splunk/mint/NetSender;Z)V
    .locals 5
    .param p1, "ctx"    # Landroid/content/Context;
    .param p2, "netSender"    # Lcom/splunk/mint/NetSender;
    .param p3, "saveOnFail"    # Z

    .prologue
    .line 81
    iget-object v3, p0, Lcom/splunk/mint/ActionEvent;->type:Lcom/splunk/mint/EnumActionType;

    sget-object v4, Lcom/splunk/mint/EnumActionType;->ping:Lcom/splunk/mint/EnumActionType;

    invoke-virtual {v3, v4}, Lcom/splunk/mint/EnumActionType;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 82
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 83
    .local v2, "settingsUrl":Ljava/lang/StringBuilder;
    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static {v3, v4}, Lcom/splunk/mint/MintUrls;->getURL(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    const-string v3, "?hash="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    sget-object v3, Lcom/splunk/mint/Properties$RemoteSettingsProps;->hashCode:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/splunk/mint/ActionEvent;->toJsonLine()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p2, v3, v4, p3}, Lcom/splunk/mint/NetSender;->sendBlocking(Ljava/lang/String;Ljava/lang/String;Z)Lcom/splunk/mint/NetSenderResponse;

    move-result-object v0

    .line 91
    .local v0, "nsr":Lcom/splunk/mint/NetSenderResponse;
    invoke-virtual {v0}, Lcom/splunk/mint/NetSenderResponse;->getServerResponse()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/splunk/mint/RemoteSettings;->convertJsonToRemoteSettings(Ljava/lang/String;)Lcom/splunk/mint/RemoteSettingsData;

    move-result-object v1

    .line 93
    .local v1, "remoteData":Lcom/splunk/mint/RemoteSettingsData;
    if-eqz v1, :cond_0

    .line 95
    invoke-static {p1, v1}, Lcom/splunk/mint/RemoteSettings;->saveAndLoadRemoteSettings(Landroid/content/Context;Lcom/splunk/mint/RemoteSettingsData;)Z

    .line 100
    .end local v0    # "nsr":Lcom/splunk/mint/NetSenderResponse;
    .end local v1    # "remoteData":Lcom/splunk/mint/RemoteSettingsData;
    .end local v2    # "settingsUrl":Ljava/lang/StringBuilder;
    :cond_0
    :goto_0
    return-void

    .line 98
    :cond_1
    invoke-virtual {p0}, Lcom/splunk/mint/ActionEvent;->toJsonLine()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v3, p3}, Lcom/splunk/mint/NetSender;->send(Ljava/lang/String;Z)V

    goto :goto_0
.end method

.method public send(Lcom/splunk/mint/NetSender;Z)V
    .locals 1
    .param p1, "netSender"    # Lcom/splunk/mint/NetSender;
    .param p2, "saveOnFail"    # Z

    .prologue
    .line 118
    invoke-virtual {p0}, Lcom/splunk/mint/ActionEvent;->toJsonLine()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Lcom/splunk/mint/NetSender;->send(Ljava/lang/String;Z)V

    .line 119
    return-void
.end method

.method public toJsonLine()Ljava/lang/String;
    .locals 6

    .prologue
    .line 57
    invoke-virtual {p0}, Lcom/splunk/mint/ActionEvent;->getBasicDataFixtureJson()Lorg/json/JSONObject;

    move-result-object v1

    .line 59
    .local v1, "json":Lorg/json/JSONObject;
    :try_start_0
    iget-wide v2, p0, Lcom/splunk/mint/ActionEvent;->duration:J

    const-wide/16 v4, -0x1

    cmp-long v2, v2, v4

    if-eqz v2, :cond_0

    .line 60
    const-string v2, "ses_duration"

    iget-wide v4, p0, Lcom/splunk/mint/ActionEvent;->duration:J

    invoke-virtual {v1, v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 62
    :cond_0
    iget-object v2, p0, Lcom/splunk/mint/ActionEvent;->eventName:Ljava/lang/String;

    if-eqz v2, :cond_1

    .line 63
    const-string v2, "event_name"

    iget-object v3, p0, Lcom/splunk/mint/ActionEvent;->eventName:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 65
    :cond_1
    iget-object v2, p0, Lcom/splunk/mint/ActionEvent;->eventLevel:Ljava/lang/Integer;

    if-eqz v2, :cond_2

    .line 66
    const-string v2, "level"

    iget-object v3, p0, Lcom/splunk/mint/ActionEvent;->eventLevel:Ljava/lang/Integer;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 68
    :cond_2
    iget-object v2, p0, Lcom/splunk/mint/ActionEvent;->type:Lcom/splunk/mint/EnumActionType;

    sget-object v3, Lcom/splunk/mint/EnumActionType;->event:Lcom/splunk/mint/EnumActionType;

    if-eq v2, v3, :cond_3

    .line 69
    const-string v2, "session_id"

    iget-object v3, p0, Lcom/splunk/mint/ActionEvent;->session_id:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 74
    :cond_3
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/splunk/mint/ActionEvent;->type:Lcom/splunk/mint/EnumActionType;

    invoke-static {v3}, Lcom/splunk/mint/Properties;->getSeparator(Lcom/splunk/mint/EnumActionType;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    return-object v2

    .line 71
    :catch_0
    move-exception v0

    .line 72
    .local v0, "e":Lorg/json/JSONException;
    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_0
.end method
