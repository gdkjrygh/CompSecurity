.class Lcom/splunk/mint/ActionTransactionStart;
.super Lcom/splunk/mint/ActionTransaction;
.source "ActionTransactionStart.java"

# interfaces
.implements Lcom/splunk/mint/InterfaceDataType;


# direct methods
.method private constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1, "name"    # Ljava/lang/String;

    .prologue
    .line 15
    sget-object v0, Lcom/splunk/mint/EnumActionType;->trstart:Lcom/splunk/mint/EnumActionType;

    invoke-direct {p0, p1, v0}, Lcom/splunk/mint/ActionTransaction;-><init>(Ljava/lang/String;Lcom/splunk/mint/EnumActionType;)V

    .line 16
    invoke-static {}, Lcom/splunk/mint/Utils;->getRandomSessionNumber()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/splunk/mint/ActionTransactionStart;->transaction_id:Ljava/lang/String;

    .line 17
    return-void
.end method

.method public static createTransactionStart(Ljava/lang/String;)Lcom/splunk/mint/ActionTransactionStart;
    .locals 2
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 20
    new-instance v0, Lcom/splunk/mint/ActionTransactionStart;

    invoke-direct {v0, p0}, Lcom/splunk/mint/ActionTransactionStart;-><init>(Ljava/lang/String;)V

    .line 21
    .local v0, "mTransactionStart":Lcom/splunk/mint/ActionTransactionStart;
    sget-object v1, Lcom/splunk/mint/Properties;->transactionsDatabase:Lcom/splunk/mint/TransactionsDatabase;

    invoke-virtual {v1, v0}, Lcom/splunk/mint/TransactionsDatabase;->addStartedTransaction(Lcom/splunk/mint/ActionTransactionStart;)Z

    .line 22
    return-object v0
.end method


# virtual methods
.method public save(Lcom/splunk/mint/DataSaver;)V
    .locals 2
    .param p1, "dataSaver"    # Lcom/splunk/mint/DataSaver;

    .prologue
    .line 44
    new-instance v0, Lcom/splunk/mint/DataSaver;

    invoke-direct {v0}, Lcom/splunk/mint/DataSaver;-><init>()V

    invoke-virtual {p0}, Lcom/splunk/mint/ActionTransactionStart;->toJsonLine()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/splunk/mint/DataSaver;->save(Ljava/lang/String;)V

    .line 45
    return-void
.end method

.method public send(Landroid/content/Context;Lcom/splunk/mint/NetSender;Z)V
    .locals 1
    .param p1, "ctx"    # Landroid/content/Context;
    .param p2, "netSender"    # Lcom/splunk/mint/NetSender;
    .param p3, "saveOnFail"    # Z

    .prologue
    .line 49
    invoke-virtual {p0}, Lcom/splunk/mint/ActionTransactionStart;->toJsonLine()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0, p3}, Lcom/splunk/mint/NetSender;->send(Ljava/lang/String;Z)V

    .line 50
    return-void
.end method

.method public send(Lcom/splunk/mint/NetSender;Z)V
    .locals 1
    .param p1, "netSender"    # Lcom/splunk/mint/NetSender;
    .param p2, "saveOnFail"    # Z

    .prologue
    .line 39
    invoke-virtual {p0}, Lcom/splunk/mint/ActionTransactionStart;->toJsonLine()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Lcom/splunk/mint/NetSender;->send(Ljava/lang/String;Z)V

    .line 40
    return-void
.end method

.method public toJsonLine()Ljava/lang/String;
    .locals 4

    .prologue
    .line 27
    invoke-virtual {p0}, Lcom/splunk/mint/ActionTransactionStart;->getBasicDataFixtureJson()Lorg/json/JSONObject;

    move-result-object v1

    .line 29
    .local v1, "json":Lorg/json/JSONObject;
    :try_start_0
    const-string v2, "tr_name"

    iget-object v3, p0, Lcom/splunk/mint/ActionTransactionStart;->name:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 30
    const-string v2, "transaction_id"

    iget-object v3, p0, Lcom/splunk/mint/ActionTransactionStart;->transaction_id:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lcom/splunk/mint/EnumActionType;->trstart:Lcom/splunk/mint/EnumActionType;

    invoke-static {v3}, Lcom/splunk/mint/Properties;->getSeparator(Lcom/splunk/mint/EnumActionType;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    return-object v2

    .line 31
    :catch_0
    move-exception v0

    .line 32
    .local v0, "e":Lorg/json/JSONException;
    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_0
.end method
