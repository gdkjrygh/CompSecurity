.class abstract Lcom/splunk/mint/ActionTransaction;
.super Lcom/splunk/mint/BaseDTO;
.source "ActionTransaction.java"

# interfaces
.implements Lcom/splunk/mint/InterfaceDataType;


# instance fields
.field protected name:Ljava/lang/String;

.field protected transaction_id:Ljava/lang/String;


# direct methods
.method protected constructor <init>(Ljava/lang/String;Lcom/splunk/mint/EnumActionType;)V
    .locals 1
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "transactionType"    # Lcom/splunk/mint/EnumActionType;

    .prologue
    .line 12
    invoke-direct {p0, p2}, Lcom/splunk/mint/BaseDTO;-><init>(Lcom/splunk/mint/EnumActionType;)V

    .line 16
    const-string v0, ""

    iput-object v0, p0, Lcom/splunk/mint/ActionTransaction;->name:Ljava/lang/String;

    .line 18
    const-string v0, ""

    iput-object v0, p0, Lcom/splunk/mint/ActionTransaction;->transaction_id:Ljava/lang/String;

    .line 13
    iput-object p1, p0, Lcom/splunk/mint/ActionTransaction;->name:Ljava/lang/String;

    .line 14
    return-void
.end method


# virtual methods
.method public save(Lcom/splunk/mint/DataSaver;)V
    .locals 2
    .param p1, "dataSaver"    # Lcom/splunk/mint/DataSaver;

    .prologue
    .line 32
    new-instance v0, Lcom/splunk/mint/DataSaver;

    invoke-direct {v0}, Lcom/splunk/mint/DataSaver;-><init>()V

    invoke-virtual {p0}, Lcom/splunk/mint/ActionTransaction;->toJsonLine()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/splunk/mint/DataSaver;->save(Ljava/lang/String;)V

    .line 33
    return-void
.end method

.method public send(Landroid/content/Context;Lcom/splunk/mint/NetSender;Z)V
    .locals 1
    .param p1, "ctx"    # Landroid/content/Context;
    .param p2, "netSender"    # Lcom/splunk/mint/NetSender;
    .param p3, "saveOnFail"    # Z

    .prologue
    .line 37
    invoke-virtual {p0}, Lcom/splunk/mint/ActionTransaction;->toJsonLine()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0, p3}, Lcom/splunk/mint/NetSender;->send(Ljava/lang/String;Z)V

    .line 38
    return-void
.end method

.method public send(Lcom/splunk/mint/NetSender;Z)V
    .locals 1
    .param p1, "netSender"    # Lcom/splunk/mint/NetSender;
    .param p2, "saveOnFail"    # Z

    .prologue
    .line 27
    invoke-virtual {p0}, Lcom/splunk/mint/ActionTransaction;->toJsonLine()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Lcom/splunk/mint/NetSender;->send(Ljava/lang/String;Z)V

    .line 28
    return-void
.end method

.method public toJsonLine()Ljava/lang/String;
    .locals 2

    .prologue
    .line 22
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/splunk/mint/EnumActionType;->trstart:Lcom/splunk/mint/EnumActionType;

    invoke-static {v1}, Lcom/splunk/mint/Properties;->getSeparator(Lcom/splunk/mint/EnumActionType;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
