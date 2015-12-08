.class Lcom/splunk/mint/ActionError;
.super Lcom/splunk/mint/BaseDTO;
.source "ActionError.java"

# interfaces
.implements Lcom/splunk/mint/InterfaceDataType;


# instance fields
.field private breadcrumbs:Lorg/json/JSONArray;

.field private errorHash:Ljava/lang/String;

.field private gpsStatus:Lcom/splunk/mint/EnumStateStatus;

.field private handled:Ljava/lang/Boolean;

.field private klass:Ljava/lang/String;

.field private memAppAvailable:Ljava/lang/String;

.field private memAppMax:Ljava/lang/String;

.field private memAppTotal:Ljava/lang/String;

.field private memSysAvailable:Ljava/lang/String;

.field private memSysLow:Ljava/lang/String;

.field private memSysThreshold:Ljava/lang/String;

.field private message:Ljava/lang/String;

.field private msFromStart:Ljava/lang/String;

.field private stacktrace:Ljava/lang/String;

.field private where:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/splunk/mint/EnumActionType;Ljava/lang/String;Lcom/splunk/mint/EnumExceptionType;Lcom/splunk/mint/ExtraData;)V
    .locals 8
    .param p1, "dataType"    # Lcom/splunk/mint/EnumActionType;
    .param p2, "stacktrace"    # Ljava/lang/String;
    .param p3, "exceptionType"    # Lcom/splunk/mint/EnumExceptionType;
    .param p4, "customData"    # Lcom/splunk/mint/ExtraData;

    .prologue
    const-wide/high16 v6, 0x4130000000000000L    # 1048576.0

    .line 46
    invoke-direct {p0, p1}, Lcom/splunk/mint/BaseDTO;-><init>(Lcom/splunk/mint/EnumActionType;)V

    .line 48
    iput-object p2, p0, Lcom/splunk/mint/ActionError;->stacktrace:Ljava/lang/String;

    .line 49
    sget-object v3, Lcom/splunk/mint/EnumExceptionType;->HANDLED:Lcom/splunk/mint/EnumExceptionType;

    if-ne p3, v3, :cond_2

    .line 50
    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    iput-object v3, p0, Lcom/splunk/mint/ActionError;->handled:Ljava/lang/Boolean;

    .line 55
    :goto_0
    sget-object v3, Lcom/splunk/mint/Properties;->APP_PACKAGE:Ljava/lang/String;

    invoke-static {v3, p2}, Lcom/splunk/mint/StacktraceHash;->manipulateStacktrace(Ljava/lang/String;Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object v2

    .line 56
    .local v2, "stackHashMap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    const-string v3, "klass"

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    iput-object v3, p0, Lcom/splunk/mint/ActionError;->klass:Ljava/lang/String;

    .line 57
    const-string v3, "message"

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    iput-object v3, p0, Lcom/splunk/mint/ActionError;->message:Ljava/lang/String;

    .line 58
    const-string v3, "errorHash"

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    iput-object v3, p0, Lcom/splunk/mint/ActionError;->errorHash:Ljava/lang/String;

    .line 59
    const-string v3, "where"

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    iput-object v3, p0, Lcom/splunk/mint/ActionError;->where:Ljava/lang/String;

    .line 61
    if-eqz p4, :cond_1

    .line 62
    iget-object v3, p0, Lcom/splunk/mint/ActionError;->extraData:Lcom/splunk/mint/ExtraData;

    if-nez v3, :cond_0

    .line 63
    new-instance v3, Lcom/splunk/mint/ExtraData;

    invoke-direct {v3}, Lcom/splunk/mint/ExtraData;-><init>()V

    iput-object v3, p0, Lcom/splunk/mint/ActionError;->extraData:Lcom/splunk/mint/ExtraData;

    .line 65
    :cond_0
    iget-object v3, p0, Lcom/splunk/mint/ActionError;->extraData:Lcom/splunk/mint/ExtraData;

    invoke-virtual {v3, p4}, Lcom/splunk/mint/ExtraData;->addExtraData(Lcom/splunk/mint/ExtraData;)Z

    .line 68
    :cond_1
    sget-object v3, Lcom/splunk/mint/Properties;->IS_GPS_ON:Lcom/splunk/mint/EnumStateStatus;

    iput-object v3, p0, Lcom/splunk/mint/ActionError;->gpsStatus:Lcom/splunk/mint/EnumStateStatus;

    .line 69
    invoke-static {}, Lcom/splunk/mint/Utils;->getMilisFromStart()Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/splunk/mint/ActionError;->msFromStart:Ljava/lang/String;

    .line 70
    new-instance v0, Landroid/app/ActivityManager$MemoryInfo;

    invoke-direct {v0}, Landroid/app/ActivityManager$MemoryInfo;-><init>()V

    .line 71
    .local v0, "memoryInfo":Landroid/app/ActivityManager$MemoryInfo;
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v1

    .line 72
    .local v1, "rt":Ljava/lang/Runtime;
    iget-boolean v3, v0, Landroid/app/ActivityManager$MemoryInfo;->lowMemory:Z

    invoke-static {v3}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/splunk/mint/ActionError;->memSysLow:Ljava/lang/String;

    .line 73
    iget-wide v4, v0, Landroid/app/ActivityManager$MemoryInfo;->availMem:J

    long-to-double v4, v4

    div-double/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/splunk/mint/ActionError;->memSysAvailable:Ljava/lang/String;

    .line 74
    iget-wide v4, v0, Landroid/app/ActivityManager$MemoryInfo;->threshold:J

    long-to-double v4, v4

    div-double/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/splunk/mint/ActionError;->memSysThreshold:Ljava/lang/String;

    .line 75
    invoke-virtual {v1}, Ljava/lang/Runtime;->maxMemory()J

    move-result-wide v4

    long-to-double v4, v4

    div-double/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/splunk/mint/ActionError;->memAppMax:Ljava/lang/String;

    .line 76
    invoke-virtual {v1}, Ljava/lang/Runtime;->freeMemory()J

    move-result-wide v4

    long-to-double v4, v4

    div-double/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/splunk/mint/ActionError;->memAppAvailable:Ljava/lang/String;

    .line 77
    invoke-virtual {v1}, Ljava/lang/Runtime;->totalMemory()J

    move-result-wide v4

    long-to-double v4, v4

    div-double/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/splunk/mint/ActionError;->memAppTotal:Ljava/lang/String;

    .line 78
    sget-object v3, Lcom/splunk/mint/Properties;->breadcrumbs:Lcom/splunk/mint/BreadcrumbsLimited;

    invoke-virtual {v3}, Lcom/splunk/mint/BreadcrumbsLimited;->getList()Lorg/json/JSONArray;

    move-result-object v3

    iput-object v3, p0, Lcom/splunk/mint/ActionError;->breadcrumbs:Lorg/json/JSONArray;

    .line 81
    return-void

    .line 52
    .end local v0    # "memoryInfo":Landroid/app/ActivityManager$MemoryInfo;
    .end local v1    # "rt":Ljava/lang/Runtime;
    .end local v2    # "stackHashMap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    :cond_2
    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    iput-object v3, p0, Lcom/splunk/mint/ActionError;->handled:Ljava/lang/Boolean;

    goto/16 :goto_0
.end method


# virtual methods
.method protected final getErrorHash()Ljava/lang/String;
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Lcom/splunk/mint/ActionError;->errorHash:Ljava/lang/String;

    return-object v0
.end method

.method public save(Lcom/splunk/mint/DataSaver;)V
    .locals 2
    .param p1, "dataSaver"    # Lcom/splunk/mint/DataSaver;

    .prologue
    .line 135
    new-instance v0, Lcom/splunk/mint/DataSaver;

    invoke-direct {v0}, Lcom/splunk/mint/DataSaver;-><init>()V

    invoke-virtual {p0}, Lcom/splunk/mint/ActionError;->toJsonLine()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/splunk/mint/DataSaver;->save(Ljava/lang/String;)V

    .line 136
    return-void
.end method

.method public send(Landroid/content/Context;Lcom/splunk/mint/NetSender;Z)V
    .locals 1
    .param p1, "ctx"    # Landroid/content/Context;
    .param p2, "netSender"    # Lcom/splunk/mint/NetSender;
    .param p3, "saveOnFail"    # Z

    .prologue
    .line 140
    invoke-virtual {p0}, Lcom/splunk/mint/ActionError;->toJsonLine()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0, p3}, Lcom/splunk/mint/NetSender;->send(Ljava/lang/String;Z)V

    .line 141
    return-void
.end method

.method public send(Lcom/splunk/mint/NetSender;Z)V
    .locals 1
    .param p1, "netSender"    # Lcom/splunk/mint/NetSender;
    .param p2, "saveOnFail"    # Z

    .prologue
    .line 130
    invoke-virtual {p0}, Lcom/splunk/mint/ActionError;->toJsonLine()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Lcom/splunk/mint/NetSender;->send(Ljava/lang/String;Z)V

    .line 131
    return-void
.end method

.method public toJsonLine()Ljava/lang/String;
    .locals 5

    .prologue
    .line 89
    invoke-virtual {p0}, Lcom/splunk/mint/ActionError;->getBasicDataFixtureJson()Lorg/json/JSONObject;

    move-result-object v1

    .line 92
    .local v1, "json":Lorg/json/JSONObject;
    :try_start_0
    const-string v3, "stacktrace"

    iget-object v4, p0, Lcom/splunk/mint/ActionError;->stacktrace:Ljava/lang/String;

    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 93
    const-string v3, "handled"

    iget-object v4, p0, Lcom/splunk/mint/ActionError;->handled:Ljava/lang/Boolean;

    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 94
    const-string v3, "klass"

    iget-object v4, p0, Lcom/splunk/mint/ActionError;->klass:Ljava/lang/String;

    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 95
    const-string v3, "message"

    iget-object v4, p0, Lcom/splunk/mint/ActionError;->message:Ljava/lang/String;

    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 96
    const-string v3, "errorHash"

    iget-object v4, p0, Lcom/splunk/mint/ActionError;->errorHash:Ljava/lang/String;

    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 97
    const-string v3, "where"

    iget-object v4, p0, Lcom/splunk/mint/ActionError;->where:Ljava/lang/String;

    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 98
    const-string v3, "rooted"

    iget-object v4, p0, Lcom/splunk/mint/ActionError;->rooted:Ljava/lang/Boolean;

    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 100
    const-string v3, "gpsStatus"

    iget-object v4, p0, Lcom/splunk/mint/ActionError;->gpsStatus:Lcom/splunk/mint/EnumStateStatus;

    invoke-virtual {v4}, Lcom/splunk/mint/EnumStateStatus;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 101
    const-string v3, "msFromStart"

    iget-object v4, p0, Lcom/splunk/mint/ActionError;->msFromStart:Ljava/lang/String;

    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 102
    iget-object v3, p0, Lcom/splunk/mint/ActionError;->breadcrumbs:Lorg/json/JSONArray;

    if-eqz v3, :cond_0

    iget-object v3, p0, Lcom/splunk/mint/ActionError;->breadcrumbs:Lorg/json/JSONArray;

    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-lez v3, :cond_0

    .line 103
    const-string v3, "breadcrumbs"

    iget-object v4, p0, Lcom/splunk/mint/ActionError;->breadcrumbs:Lorg/json/JSONArray;

    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 108
    :cond_0
    const-string v3, "memSysLow"

    iget-object v4, p0, Lcom/splunk/mint/ActionError;->memSysLow:Ljava/lang/String;

    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 109
    const-string v3, "memSysAvailable"

    iget-object v4, p0, Lcom/splunk/mint/ActionError;->memSysAvailable:Ljava/lang/String;

    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 110
    const-string v3, "memSysThreshold"

    iget-object v4, p0, Lcom/splunk/mint/ActionError;->memSysThreshold:Ljava/lang/String;

    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 111
    const-string v3, "memAppMax"

    iget-object v4, p0, Lcom/splunk/mint/ActionError;->memAppMax:Ljava/lang/String;

    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 112
    const-string v3, "memAppAvailable"

    iget-object v4, p0, Lcom/splunk/mint/ActionError;->memAppAvailable:Ljava/lang/String;

    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 113
    const-string v3, "memAppTotal"

    iget-object v4, p0, Lcom/splunk/mint/ActionError;->memAppTotal:Ljava/lang/String;

    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 116
    sget-boolean v3, Lcom/splunk/mint/Properties;->SEND_LOG:Z

    if-eqz v3, :cond_1

    iget-object v3, p0, Lcom/splunk/mint/ActionError;->handled:Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-nez v3, :cond_1

    .line 117
    invoke-static {}, Lcom/splunk/mint/Utils;->readLogs()Ljava/lang/String;

    move-result-object v2

    .line 118
    .local v2, "logcat":Ljava/lang/String;
    const-string v3, "log"

    invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 125
    .end local v2    # "logcat":Ljava/lang/String;
    :cond_1
    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    sget-object v4, Lcom/splunk/mint/EnumActionType;->error:Lcom/splunk/mint/EnumActionType;

    invoke-static {v4}, Lcom/splunk/mint/Properties;->getSeparator(Lcom/splunk/mint/EnumActionType;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    return-object v3

    .line 121
    :catch_0
    move-exception v0

    .line 122
    .local v0, "e":Lorg/json/JSONException;
    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_0
.end method
