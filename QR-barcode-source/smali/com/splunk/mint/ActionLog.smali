.class Lcom/splunk/mint/ActionLog;
.super Lcom/splunk/mint/BaseDTO;
.source "ActionLog.java"

# interfaces
.implements Lcom/splunk/mint/InterfaceDataType;


# instance fields
.field public eventLevel:Ljava/lang/Integer;

.field public eventName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/splunk/mint/EnumActionType;Ljava/lang/String;Ljava/lang/Integer;)V
    .locals 1
    .param p1, "type"    # Lcom/splunk/mint/EnumActionType;
    .param p2, "eventName"    # Ljava/lang/String;
    .param p3, "level"    # Ljava/lang/Integer;

    .prologue
    .line 16
    invoke-direct {p0, p1}, Lcom/splunk/mint/BaseDTO;-><init>(Lcom/splunk/mint/EnumActionType;)V

    .line 25
    const-string v0, ""

    iput-object v0, p0, Lcom/splunk/mint/ActionLog;->eventName:Ljava/lang/String;

    .line 26
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/splunk/mint/ActionLog;->eventLevel:Ljava/lang/Integer;

    .line 17
    iput-object p2, p0, Lcom/splunk/mint/ActionLog;->eventName:Ljava/lang/String;

    .line 18
    iput-object p3, p0, Lcom/splunk/mint/ActionLog;->eventLevel:Ljava/lang/Integer;

    .line 19
    return-void
.end method

.method public static final createLog(Ljava/lang/String;Lcom/splunk/mint/MintLogLevel;)Lcom/splunk/mint/ActionLog;
    .locals 3
    .param p0, "eventName"    # Ljava/lang/String;
    .param p1, "level"    # Lcom/splunk/mint/MintLogLevel;

    .prologue
    .line 22
    new-instance v0, Lcom/splunk/mint/ActionLog;

    sget-object v1, Lcom/splunk/mint/EnumActionType;->log:Lcom/splunk/mint/EnumActionType;

    invoke-static {p1}, Lcom/splunk/mint/Utils;->convertLoggingLevelToInt(Lcom/splunk/mint/MintLogLevel;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, p0, v2}, Lcom/splunk/mint/ActionLog;-><init>(Lcom/splunk/mint/EnumActionType;Ljava/lang/String;Ljava/lang/Integer;)V

    return-object v0
.end method

.method private getLevelSfromLevel(Ljava/lang/Integer;)Ljava/lang/String;
    .locals 2
    .param p1, "level"    # Ljava/lang/Integer;

    .prologue
    .line 41
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 42
    const-string v0, "D"

    .line 52
    :goto_0
    return-object v0

    .line 43
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x6

    if-ne v0, v1, :cond_1

    .line 44
    const-string v0, "E"

    goto :goto_0

    .line 45
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_2

    .line 46
    const-string v0, "I"

    goto :goto_0

    .line 47
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    .line 48
    const-string v0, "V"

    goto :goto_0

    .line 49
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_4

    .line 50
    const-string v0, "W"

    goto :goto_0

    .line 52
    :cond_4
    const-string v0, "I"

    goto :goto_0
.end method


# virtual methods
.method public save(Lcom/splunk/mint/DataSaver;)V
    .locals 2
    .param p1, "dataSaver"    # Lcom/splunk/mint/DataSaver;

    .prologue
    .line 62
    iget-object v0, p0, Lcom/splunk/mint/ActionLog;->eventLevel:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    .line 63
    iget-object v0, p0, Lcom/splunk/mint/ActionLog;->eventLevel:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    sget-object v1, Lcom/splunk/mint/Properties$RemoteSettingsProps;->logLevel:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-lt v0, v1, :cond_0

    .line 64
    invoke-virtual {p0}, Lcom/splunk/mint/ActionLog;->toJsonLine()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/splunk/mint/DataSaver;->save(Ljava/lang/String;)V

    .line 71
    :goto_0
    return-void

    .line 66
    :cond_0
    const-string v0, "Logs\'s level is lower than the minimum level from Remote Settings, log will not be saved"

    invoke-static {v0}, Lcom/splunk/mint/Logger;->logInfo(Ljava/lang/String;)V

    goto :goto_0

    .line 69
    :cond_1
    invoke-virtual {p0}, Lcom/splunk/mint/ActionLog;->toJsonLine()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/splunk/mint/DataSaver;->save(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public send(Landroid/content/Context;Lcom/splunk/mint/NetSender;Z)V
    .locals 1
    .param p1, "ctx"    # Landroid/content/Context;
    .param p2, "netSender"    # Lcom/splunk/mint/NetSender;
    .param p3, "saveOnFail"    # Z

    .prologue
    .line 57
    invoke-virtual {p0}, Lcom/splunk/mint/ActionLog;->toJsonLine()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0, p3}, Lcom/splunk/mint/NetSender;->send(Ljava/lang/String;Z)V

    .line 58
    return-void
.end method

.method public send(Lcom/splunk/mint/NetSender;Z)V
    .locals 1
    .param p1, "netSender"    # Lcom/splunk/mint/NetSender;
    .param p2, "saveOnFail"    # Z

    .prologue
    .line 75
    invoke-virtual {p0}, Lcom/splunk/mint/ActionLog;->toJsonLine()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Lcom/splunk/mint/NetSender;->send(Ljava/lang/String;Z)V

    .line 76
    return-void
.end method

.method public toJsonLine()Ljava/lang/String;
    .locals 4

    .prologue
    .line 30
    invoke-virtual {p0}, Lcom/splunk/mint/ActionLog;->getBasicDataFixtureJson()Lorg/json/JSONObject;

    move-result-object v1

    .line 32
    .local v1, "json":Lorg/json/JSONObject;
    :try_start_0
    const-string v2, "log_name"

    iget-object v3, p0, Lcom/splunk/mint/ActionLog;->eventName:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 33
    const-string v2, "level"

    iget-object v3, p0, Lcom/splunk/mint/ActionLog;->eventLevel:Ljava/lang/Integer;

    invoke-direct {p0, v3}, Lcom/splunk/mint/ActionLog;->getLevelSfromLevel(Ljava/lang/Integer;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/splunk/mint/ActionLog;->type:Lcom/splunk/mint/EnumActionType;

    invoke-static {v3}, Lcom/splunk/mint/Properties;->getSeparator(Lcom/splunk/mint/EnumActionType;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    return-object v2

    .line 34
    :catch_0
    move-exception v0

    .line 35
    .local v0, "e":Lorg/json/JSONException;
    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_0
.end method
