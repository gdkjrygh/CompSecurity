.class public Lcom/splunk/mint/ActionNetwork;
.super Lcom/splunk/mint/BaseDTO;
.source "ActionNetwork.java"

# interfaces
.implements Lcom/splunk/mint/InterfaceDataType;


# instance fields
.field private exception:Ljava/lang/String;

.field private failed:Ljava/lang/Boolean;

.field private latency:Ljava/lang/Long;

.field private protocol:Ljava/lang/String;

.field private requestLength:Ljava/lang/Long;

.field private responseLength:Ljava/lang/Long;

.field private statusCode:Ljava/lang/Integer;

.field private url:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/splunk/mint/EnumActionType;Ljava/lang/String;)V
    .locals 4
    .param p1, "type"    # Lcom/splunk/mint/EnumActionType;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    .line 18
    invoke-direct {p0, p1}, Lcom/splunk/mint/BaseDTO;-><init>(Lcom/splunk/mint/EnumActionType;)V

    .line 51
    const-string v0, ""

    iput-object v0, p0, Lcom/splunk/mint/ActionNetwork;->url:Ljava/lang/String;

    .line 57
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/splunk/mint/ActionNetwork;->latency:Ljava/lang/Long;

    .line 58
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/splunk/mint/ActionNetwork;->statusCode:Ljava/lang/Integer;

    .line 59
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/splunk/mint/ActionNetwork;->responseLength:Ljava/lang/Long;

    .line 60
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/splunk/mint/ActionNetwork;->requestLength:Ljava/lang/Long;

    .line 61
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/splunk/mint/ActionNetwork;->failed:Ljava/lang/Boolean;

    .line 62
    iput-object v1, p0, Lcom/splunk/mint/ActionNetwork;->exception:Ljava/lang/String;

    .line 63
    iput-object v1, p0, Lcom/splunk/mint/ActionNetwork;->protocol:Ljava/lang/String;

    .line 19
    iput-object p2, p0, Lcom/splunk/mint/ActionNetwork;->url:Ljava/lang/String;

    .line 20
    return-void
.end method

.method public static final logNetwork(Ljava/lang/String;JJLjava/lang/String;Ljava/util/Map;Ljava/util/Map;IJJLjava/lang/String;)V
    .locals 7
    .param p0, "url"    # Ljava/lang/String;
    .param p1, "startT"    # J
    .param p3, "endT"    # J
    .param p5, "protocol"    # Ljava/lang/String;
    .param p8, "statusCode"    # I
    .param p9, "requestLength"    # J
    .param p11, "responseLength"    # J
    .param p13, "exception"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "JJ",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;>;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;>;IJJ",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 28
    .local p6, "reqHeaders":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;>;"
    .local p7, "respHeaders":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;>;"
    new-instance v2, Lcom/splunk/mint/ActionNetwork;

    sget-object v3, Lcom/splunk/mint/EnumActionType;->network:Lcom/splunk/mint/EnumActionType;

    invoke-direct {v2, v3, p0}, Lcom/splunk/mint/ActionNetwork;-><init>(Lcom/splunk/mint/EnumActionType;Ljava/lang/String;)V

    .line 31
    .local v2, "mActionNetwork":Lcom/splunk/mint/ActionNetwork;
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, Lcom/splunk/mint/ActionNetwork;->timestamp:Ljava/lang/String;

    .line 34
    sub-long v4, p3, p1

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    iput-object v3, v2, Lcom/splunk/mint/ActionNetwork;->latency:Ljava/lang/Long;

    .line 35
    invoke-static {p8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v2, Lcom/splunk/mint/ActionNetwork;->statusCode:Ljava/lang/Integer;

    .line 36
    invoke-static/range {p11 .. p12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    iput-object v3, v2, Lcom/splunk/mint/ActionNetwork;->responseLength:Ljava/lang/Long;

    .line 37
    invoke-static/range {p9 .. p10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    iput-object v3, v2, Lcom/splunk/mint/ActionNetwork;->requestLength:Ljava/lang/Long;

    .line 38
    iget-object v3, v2, Lcom/splunk/mint/ActionNetwork;->statusCode:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/16 v4, 0xc8

    if-lt v3, v4, :cond_0

    iget-object v3, v2, Lcom/splunk/mint/ActionNetwork;->statusCode:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/16 v4, 0x190

    if-ge v3, v4, :cond_0

    .line 39
    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    iput-object v3, v2, Lcom/splunk/mint/ActionNetwork;->failed:Ljava/lang/Boolean;

    .line 43
    :goto_0
    move-object/from16 v0, p13

    iput-object v0, v2, Lcom/splunk/mint/ActionNetwork;->exception:Ljava/lang/String;

    .line 46
    iput-object p5, v2, Lcom/splunk/mint/ActionNetwork;->protocol:Ljava/lang/String;

    .line 47
    new-instance v3, Lcom/splunk/mint/DataSaver;

    invoke-direct {v3}, Lcom/splunk/mint/DataSaver;-><init>()V

    invoke-virtual {v2, v3}, Lcom/splunk/mint/ActionNetwork;->save(Lcom/splunk/mint/DataSaver;)V

    .line 48
    return-void

    .line 41
    :cond_0
    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    iput-object v3, v2, Lcom/splunk/mint/ActionNetwork;->failed:Ljava/lang/Boolean;

    goto :goto_0
.end method


# virtual methods
.method public bridge synthetic getBasicDataFixtureJson()Lorg/json/JSONObject;
    .locals 1

    .prologue
    .line 15
    invoke-super {p0}, Lcom/splunk/mint/BaseDTO;->getBasicDataFixtureJson()Lorg/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public save(Lcom/splunk/mint/DataSaver;)V
    .locals 1
    .param p1, "dataSaver"    # Lcom/splunk/mint/DataSaver;

    .prologue
    .line 123
    invoke-virtual {p0}, Lcom/splunk/mint/ActionNetwork;->toJsonLine()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/splunk/mint/DataSaver;->save(Ljava/lang/String;)V

    .line 124
    return-void
.end method

.method public send(Landroid/content/Context;Lcom/splunk/mint/NetSender;Z)V
    .locals 1
    .param p1, "ctx"    # Landroid/content/Context;
    .param p2, "netSender"    # Lcom/splunk/mint/NetSender;
    .param p3, "saveOnFail"    # Z

    .prologue
    .line 118
    invoke-virtual {p0}, Lcom/splunk/mint/ActionNetwork;->toJsonLine()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0, p3}, Lcom/splunk/mint/NetSender;->send(Ljava/lang/String;Z)V

    .line 119
    return-void
.end method

.method public send(Lcom/splunk/mint/NetSender;Z)V
    .locals 1
    .param p1, "netSender"    # Lcom/splunk/mint/NetSender;
    .param p2, "saveOnFail"    # Z

    .prologue
    .line 128
    invoke-virtual {p0}, Lcom/splunk/mint/ActionNetwork;->toJsonLine()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Lcom/splunk/mint/NetSender;->send(Ljava/lang/String;Z)V

    .line 129
    return-void
.end method

.method public toJsonLine()Ljava/lang/String;
    .locals 4

    .prologue
    .line 67
    invoke-virtual {p0}, Lcom/splunk/mint/ActionNetwork;->getBasicDataFixtureJson()Lorg/json/JSONObject;

    move-result-object v1

    .line 70
    .local v1, "json":Lorg/json/JSONObject;
    :try_start_0
    const-string v2, "url"

    iget-object v3, p0, Lcom/splunk/mint/ActionNetwork;->url:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 72
    const-string v2, "latency"

    iget-object v3, p0, Lcom/splunk/mint/ActionNetwork;->latency:Ljava/lang/Long;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 73
    const-string v2, "statusCode"

    iget-object v3, p0, Lcom/splunk/mint/ActionNetwork;->statusCode:Ljava/lang/Integer;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 74
    const-string v2, "responseLength"

    iget-object v3, p0, Lcom/splunk/mint/ActionNetwork;->responseLength:Ljava/lang/Long;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 75
    const-string v2, "requestLength"

    iget-object v3, p0, Lcom/splunk/mint/ActionNetwork;->requestLength:Ljava/lang/Long;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 76
    const-string v2, "failed"

    iget-object v3, p0, Lcom/splunk/mint/ActionNetwork;->failed:Ljava/lang/Boolean;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 77
    const-string v2, "protocol"

    iget-object v3, p0, Lcom/splunk/mint/ActionNetwork;->protocol:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 78
    iget-object v2, p0, Lcom/splunk/mint/ActionNetwork;->exception:Ljava/lang/String;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/splunk/mint/ActionNetwork;->exception:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_0

    .line 79
    const-string v2, "exception"

    iget-object v3, p0, Lcom/splunk/mint/ActionNetwork;->exception:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 113
    :cond_0
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lcom/splunk/mint/EnumActionType;->network:Lcom/splunk/mint/EnumActionType;

    invoke-static {v3}, Lcom/splunk/mint/Properties;->getSeparator(Lcom/splunk/mint/EnumActionType;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    return-object v2

    .line 110
    :catch_0
    move-exception v0

    .line 111
    .local v0, "e":Lorg/json/JSONException;
    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_0
.end method
