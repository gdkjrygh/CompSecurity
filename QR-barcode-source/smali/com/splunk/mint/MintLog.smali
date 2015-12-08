.class public Lcom/splunk/mint/MintLog;
.super Ljava/lang/Object;
.source "MintLog.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p0, "tag"    # Ljava/lang/String;
    .param p1, "msg"    # Ljava/lang/String;

    .prologue
    .line 24
    invoke-static {p0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/splunk/mint/MintLogLevel;->Debug:Lcom/splunk/mint/MintLogLevel;

    invoke-static {v0, v1}, Lcom/splunk/mint/ActionLog;->createLog(Ljava/lang/String;Lcom/splunk/mint/MintLogLevel;)Lcom/splunk/mint/ActionLog;

    move-result-object v0

    new-instance v1, Lcom/splunk/mint/DataSaver;

    invoke-direct {v1}, Lcom/splunk/mint/DataSaver;-><init>()V

    invoke-virtual {v0, v1}, Lcom/splunk/mint/ActionLog;->save(Lcom/splunk/mint/DataSaver;)V

    .line 26
    return-void
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p0, "tag"    # Ljava/lang/String;
    .param p1, "msg"    # Ljava/lang/String;

    .prologue
    .line 37
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 38
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/splunk/mint/MintLogLevel;->Error:Lcom/splunk/mint/MintLogLevel;

    invoke-static {v0, v1}, Lcom/splunk/mint/ActionLog;->createLog(Ljava/lang/String;Lcom/splunk/mint/MintLogLevel;)Lcom/splunk/mint/ActionLog;

    move-result-object v0

    new-instance v1, Lcom/splunk/mint/DataSaver;

    invoke-direct {v1}, Lcom/splunk/mint/DataSaver;-><init>()V

    invoke-virtual {v0, v1}, Lcom/splunk/mint/ActionLog;->save(Lcom/splunk/mint/DataSaver;)V

    .line 39
    return-void
.end method

.method public static i(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p0, "tag"    # Ljava/lang/String;
    .param p1, "msg"    # Ljava/lang/String;

    .prologue
    .line 50
    invoke-static {p0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 51
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/splunk/mint/MintLogLevel;->Info:Lcom/splunk/mint/MintLogLevel;

    invoke-static {v0, v1}, Lcom/splunk/mint/ActionLog;->createLog(Ljava/lang/String;Lcom/splunk/mint/MintLogLevel;)Lcom/splunk/mint/ActionLog;

    move-result-object v0

    new-instance v1, Lcom/splunk/mint/DataSaver;

    invoke-direct {v1}, Lcom/splunk/mint/DataSaver;-><init>()V

    invoke-virtual {v0, v1}, Lcom/splunk/mint/ActionLog;->save(Lcom/splunk/mint/DataSaver;)V

    .line 52
    return-void
.end method

.method public static v(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p0, "tag"    # Ljava/lang/String;
    .param p1, "msg"    # Ljava/lang/String;

    .prologue
    .line 63
    invoke-static {p0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 64
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/splunk/mint/MintLogLevel;->Verbose:Lcom/splunk/mint/MintLogLevel;

    invoke-static {v0, v1}, Lcom/splunk/mint/ActionLog;->createLog(Ljava/lang/String;Lcom/splunk/mint/MintLogLevel;)Lcom/splunk/mint/ActionLog;

    move-result-object v0

    new-instance v1, Lcom/splunk/mint/DataSaver;

    invoke-direct {v1}, Lcom/splunk/mint/DataSaver;-><init>()V

    invoke-virtual {v0, v1}, Lcom/splunk/mint/ActionLog;->save(Lcom/splunk/mint/DataSaver;)V

    .line 65
    return-void
.end method

.method public static w(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p0, "tag"    # Ljava/lang/String;
    .param p1, "msg"    # Ljava/lang/String;

    .prologue
    .line 76
    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 77
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/splunk/mint/MintLogLevel;->Warning:Lcom/splunk/mint/MintLogLevel;

    invoke-static {v0, v1}, Lcom/splunk/mint/ActionLog;->createLog(Ljava/lang/String;Lcom/splunk/mint/MintLogLevel;)Lcom/splunk/mint/ActionLog;

    move-result-object v0

    new-instance v1, Lcom/splunk/mint/DataSaver;

    invoke-direct {v1}, Lcom/splunk/mint/DataSaver;-><init>()V

    invoke-virtual {v0, v1}, Lcom/splunk/mint/ActionLog;->save(Lcom/splunk/mint/DataSaver;)V

    .line 78
    return-void
.end method
