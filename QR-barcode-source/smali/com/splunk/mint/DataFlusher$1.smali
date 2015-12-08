.class Lcom/splunk/mint/DataFlusher$1;
.super Ljava/lang/Object;
.source "DataFlusher.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/splunk/mint/DataFlusher;->send()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/splunk/mint/DataFlusher;


# direct methods
.method constructor <init>(Lcom/splunk/mint/DataFlusher;)V
    .locals 0

    .prologue
    .line 14
    iput-object p1, p0, Lcom/splunk/mint/DataFlusher$1;->this$0:Lcom/splunk/mint/DataFlusher;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    .prologue
    const/4 v8, 0x0

    const/4 v7, 0x0

    .line 19
    new-instance v1, Ljava/io/File;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v6, Lcom/splunk/mint/Properties;->FILES_PATH:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "/Mint.json"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v1, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 20
    .local v1, "file":Ljava/io/File;
    new-instance v3, Lcom/splunk/mint/NetSenderResponse;

    invoke-static {}, Lcom/splunk/mint/MintUrls;->getURL()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v5, v8}, Lcom/splunk/mint/NetSenderResponse;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .local v3, "nsr":Lcom/splunk/mint/NetSenderResponse;
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v5

    if-nez v5, :cond_1

    .line 22
    new-instance v5, Ljava/lang/Exception;

    const-string v6, "There is no data to be sent. This is not an error."

    invoke-direct {v5, v6}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v5}, Lcom/splunk/mint/NetSenderResponse;->setException(Ljava/lang/Exception;)V

    .line 23
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v3, v5}, Lcom/splunk/mint/NetSenderResponse;->setSentSuccessfully(Ljava/lang/Boolean;)V

    .line 59
    :cond_0
    :goto_0
    return-void

    .line 26
    :cond_1
    const/4 v2, 0x0

    .line 28
    .local v2, "jsonData":Ljava/lang/String;
    :try_start_0
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/splunk/mint/Utils;->readFile(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 39
    :cond_2
    :goto_1
    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    if-nez v5, :cond_4

    .line 41
    :cond_3
    sget-object v5, Lcom/splunk/mint/Mint;->mintCallback:Lcom/splunk/mint/MintCallback;

    if-eqz v5, :cond_0

    .line 42
    sget-object v5, Lcom/splunk/mint/Mint;->mintCallback:Lcom/splunk/mint/MintCallback;

    invoke-interface {v5, v3}, Lcom/splunk/mint/MintCallback;->netSenderResponse(Lcom/splunk/mint/NetSenderResponse;)V

    goto :goto_0

    .line 29
    :catch_0
    move-exception v0

    .line 30
    .local v0, "e":Ljava/lang/Exception;
    invoke-virtual {v3, v0}, Lcom/splunk/mint/NetSenderResponse;->setException(Ljava/lang/Exception;)V

    .line 31
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v3, v5}, Lcom/splunk/mint/NetSenderResponse;->setSentSuccessfully(Ljava/lang/Boolean;)V

    .line 32
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 34
    sget-object v5, Lcom/splunk/mint/Mint;->mintCallback:Lcom/splunk/mint/MintCallback;

    if-eqz v5, :cond_2

    .line 35
    sget-object v5, Lcom/splunk/mint/Mint;->mintCallback:Lcom/splunk/mint/MintCallback;

    invoke-interface {v5, v3}, Lcom/splunk/mint/MintCallback;->netSenderResponse(Lcom/splunk/mint/NetSenderResponse;)V

    goto :goto_1

    .line 48
    .end local v0    # "e":Ljava/lang/Exception;
    :cond_4
    new-instance v5, Lcom/splunk/mint/NetSender;

    invoke-direct {v5}, Lcom/splunk/mint/NetSender;-><init>()V

    invoke-virtual {v5, v8, v2, v7}, Lcom/splunk/mint/NetSender;->sendBlocking(Ljava/lang/String;Ljava/lang/String;Z)Lcom/splunk/mint/NetSenderResponse;

    move-result-object v4

    .line 49
    .local v4, "sendResult":Lcom/splunk/mint/NetSenderResponse;
    invoke-virtual {v4}, Lcom/splunk/mint/NetSenderResponse;->getSentSuccessfully()Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_0

    .line 51
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    goto :goto_0
.end method
