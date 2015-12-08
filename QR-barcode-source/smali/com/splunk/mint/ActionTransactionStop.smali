.class Lcom/splunk/mint/ActionTransactionStop;
.super Lcom/splunk/mint/ActionTransaction;
.source "ActionTransactionStop.java"

# interfaces
.implements Lcom/splunk/mint/InterfaceDataType;


# instance fields
.field protected duration:J

.field protected reason:Ljava/lang/String;

.field protected status:Lcom/splunk/mint/EnumTransactionStatus;


# direct methods
.method private constructor <init>(Ljava/lang/String;Lcom/splunk/mint/EnumTransactionStatus;Ljava/lang/String;)V
    .locals 6
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "status"    # Lcom/splunk/mint/EnumTransactionStatus;
    .param p3, "reason"    # Ljava/lang/String;

    .prologue
    .line 17
    sget-object v1, Lcom/splunk/mint/EnumActionType;->trstop:Lcom/splunk/mint/EnumActionType;

    invoke-direct {p0, p1, v1}, Lcom/splunk/mint/ActionTransaction;-><init>(Ljava/lang/String;Lcom/splunk/mint/EnumActionType;)V

    .line 58
    const-wide/16 v4, 0x0

    iput-wide v4, p0, Lcom/splunk/mint/ActionTransactionStop;->duration:J

    .line 59
    sget-object v1, Lcom/splunk/mint/EnumTransactionStatus;->FAIL:Lcom/splunk/mint/EnumTransactionStatus;

    iput-object v1, p0, Lcom/splunk/mint/ActionTransactionStop;->status:Lcom/splunk/mint/EnumTransactionStatus;

    .line 60
    const-string v1, ""

    iput-object v1, p0, Lcom/splunk/mint/ActionTransactionStop;->reason:Ljava/lang/String;

    .line 18
    iput-object p2, p0, Lcom/splunk/mint/ActionTransactionStop;->status:Lcom/splunk/mint/EnumTransactionStatus;

    .line 19
    iput-object p3, p0, Lcom/splunk/mint/ActionTransactionStop;->reason:Ljava/lang/String;

    .line 20
    if-eqz p3, :cond_0

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_1

    .line 21
    :cond_0
    const-string v1, "NA"

    iput-object v1, p0, Lcom/splunk/mint/ActionTransactionStop;->reason:Ljava/lang/String;

    .line 24
    :cond_1
    sget-object v1, Lcom/splunk/mint/Properties;->transactionsDatabase:Lcom/splunk/mint/TransactionsDatabase;

    invoke-virtual {v1, p1}, Lcom/splunk/mint/TransactionsDatabase;->getStartedTransactionContainer(Ljava/lang/String;)Lcom/splunk/mint/TransactionsDatabase$Container;

    move-result-object v0

    .line 25
    .local v0, "container":Lcom/splunk/mint/TransactionsDatabase$Container;
    if-eqz v0, :cond_2

    .line 26
    iget-object v1, v0, Lcom/splunk/mint/TransactionsDatabase$Container;->transid:Ljava/lang/String;

    iput-object v1, p0, Lcom/splunk/mint/ActionTransactionStop;->transaction_id:Ljava/lang/String;

    .line 28
    iget-object v1, v0, Lcom/splunk/mint/TransactionsDatabase$Container;->timestamp:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    .line 29
    .local v2, "timestampStart":J
    const-wide/16 v4, -0x1

    cmp-long v1, v2, v4

    if-eqz v1, :cond_2

    .line 30
    iget-object v1, p0, Lcom/splunk/mint/ActionTransactionStop;->timestampMilis:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    sub-long/2addr v4, v2

    iput-wide v4, p0, Lcom/splunk/mint/ActionTransactionStop;->duration:J

    .line 34
    .end local v2    # "timestampStart":J
    :cond_2
    sget-object v1, Lcom/splunk/mint/Properties;->transactionsDatabase:Lcom/splunk/mint/TransactionsDatabase;

    invoke-virtual {v1, p1}, Lcom/splunk/mint/TransactionsDatabase;->closeStartedTransaction(Ljava/lang/String;)Z

    .line 35
    return-void
.end method

.method protected static final createTransactionCancel(Ljava/lang/String;Ljava/lang/String;)Lcom/splunk/mint/ActionTransactionStop;
    .locals 2
    .param p0, "name"    # Ljava/lang/String;
    .param p1, "reason"    # Ljava/lang/String;

    .prologue
    .line 46
    new-instance v0, Lcom/splunk/mint/ActionTransactionStop;

    sget-object v1, Lcom/splunk/mint/EnumTransactionStatus;->CANCEL:Lcom/splunk/mint/EnumTransactionStatus;

    invoke-direct {v0, p0, v1, p1}, Lcom/splunk/mint/ActionTransactionStop;-><init>(Ljava/lang/String;Lcom/splunk/mint/EnumTransactionStatus;Ljava/lang/String;)V

    .line 48
    .local v0, "mTransactionStop":Lcom/splunk/mint/ActionTransactionStop;
    return-object v0
.end method

.method protected static final createTransactionFail(Ljava/lang/String;Ljava/lang/String;)Lcom/splunk/mint/ActionTransactionStop;
    .locals 2
    .param p0, "name"    # Ljava/lang/String;
    .param p1, "errorHash"    # Ljava/lang/String;

    .prologue
    .line 53
    new-instance v0, Lcom/splunk/mint/ActionTransactionStop;

    sget-object v1, Lcom/splunk/mint/EnumTransactionStatus;->FAIL:Lcom/splunk/mint/EnumTransactionStatus;

    invoke-direct {v0, p0, v1, p1}, Lcom/splunk/mint/ActionTransactionStop;-><init>(Ljava/lang/String;Lcom/splunk/mint/EnumTransactionStatus;Ljava/lang/String;)V

    .line 55
    .local v0, "mTransactionStop":Lcom/splunk/mint/ActionTransactionStop;
    return-object v0
.end method

.method protected static final createTransactionStop(Ljava/lang/String;)Lcom/splunk/mint/ActionTransactionStop;
    .locals 3
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 39
    new-instance v0, Lcom/splunk/mint/ActionTransactionStop;

    sget-object v1, Lcom/splunk/mint/EnumTransactionStatus;->SUCCESS:Lcom/splunk/mint/EnumTransactionStatus;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Lcom/splunk/mint/ActionTransactionStop;-><init>(Ljava/lang/String;Lcom/splunk/mint/EnumTransactionStatus;Ljava/lang/String;)V

    .line 41
    .local v0, "mTransactionStop":Lcom/splunk/mint/ActionTransactionStop;
    return-object v0
.end method


# virtual methods
.method public save(Lcom/splunk/mint/DataSaver;)V
    .locals 2
    .param p1, "dataSaver"    # Lcom/splunk/mint/DataSaver;

    .prologue
    .line 84
    new-instance v0, Lcom/splunk/mint/DataSaver;

    invoke-direct {v0}, Lcom/splunk/mint/DataSaver;-><init>()V

    invoke-virtual {p0}, Lcom/splunk/mint/ActionTransactionStop;->toJsonLine()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/splunk/mint/DataSaver;->save(Ljava/lang/String;)V

    .line 85
    return-void
.end method

.method public send(Landroid/content/Context;Lcom/splunk/mint/NetSender;Z)V
    .locals 1
    .param p1, "ctx"    # Landroid/content/Context;
    .param p2, "netSender"    # Lcom/splunk/mint/NetSender;
    .param p3, "saveOnFail"    # Z

    .prologue
    .line 89
    invoke-virtual {p0}, Lcom/splunk/mint/ActionTransactionStop;->toJsonLine()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0, p3}, Lcom/splunk/mint/NetSender;->send(Ljava/lang/String;Z)V

    .line 90
    return-void
.end method

.method public send(Lcom/splunk/mint/NetSender;Z)V
    .locals 1
    .param p1, "netSender"    # Lcom/splunk/mint/NetSender;
    .param p2, "saveOnFail"    # Z

    .prologue
    .line 79
    invoke-virtual {p0}, Lcom/splunk/mint/ActionTransactionStop;->toJsonLine()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Lcom/splunk/mint/NetSender;->send(Ljava/lang/String;Z)V

    .line 80
    return-void
.end method

.method public toJsonLine()Ljava/lang/String;
    .locals 6

    .prologue
    .line 64
    invoke-virtual {p0}, Lcom/splunk/mint/ActionTransactionStop;->getBasicDataFixtureJson()Lorg/json/JSONObject;

    move-result-object v1

    .line 66
    .local v1, "json":Lorg/json/JSONObject;
    :try_start_0
    const-string v2, "tr_name"

    iget-object v3, p0, Lcom/splunk/mint/ActionTransactionStop;->name:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 67
    const-string v2, "status"

    iget-object v3, p0, Lcom/splunk/mint/ActionTransactionStop;->status:Lcom/splunk/mint/EnumTransactionStatus;

    invoke-virtual {v3}, Lcom/splunk/mint/EnumTransactionStatus;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 68
    const-string v2, "reason"

    iget-object v3, p0, Lcom/splunk/mint/ActionTransactionStop;->reason:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 69
    const-string v2, "transaction_id"

    iget-object v3, p0, Lcom/splunk/mint/ActionTransactionStop;->transaction_id:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 70
    const-string v2, "tr_duration"

    iget-wide v4, p0, Lcom/splunk/mint/ActionTransactionStop;->duration:J

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 74
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lcom/splunk/mint/EnumActionType;->trstop:Lcom/splunk/mint/EnumActionType;

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
