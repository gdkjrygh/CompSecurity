.class Lcom/splunk/mint/DataSaver$1;
.super Ljava/lang/Object;
.source "DataSaver.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/splunk/mint/DataSaver;->save(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/splunk/mint/DataSaver;

.field final synthetic val$jsonData:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/splunk/mint/DataSaver;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 19
    iput-object p1, p0, Lcom/splunk/mint/DataSaver$1;->this$0:Lcom/splunk/mint/DataSaver;

    iput-object p2, p0, Lcom/splunk/mint/DataSaver$1;->val$jsonData:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .prologue
    const/4 v7, 0x1

    .line 24
    new-instance v4, Ljava/io/File;

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

    invoke-direct {v4, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 26
    .local v4, "file":Ljava/io/File;
    new-instance v2, Lcom/splunk/mint/DataSaverResponse;

    iget-object v5, p0, Lcom/splunk/mint/DataSaver$1;->val$jsonData:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v2, v5, v6}, Lcom/splunk/mint/DataSaverResponse;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .local v2, "dsr":Lcom/splunk/mint/DataSaverResponse;
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v5

    if-nez v5, :cond_0

    .line 30
    :try_start_0
    invoke-virtual {v4}, Ljava/io/File;->createNewFile()Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    :cond_0
    :goto_0
    const/4 v0, 0x0

    .line 39
    .local v0, "bWritter":Ljava/io/BufferedWriter;
    :try_start_1
    new-instance v1, Ljava/io/BufferedWriter;

    new-instance v5, Ljava/io/FileWriter;

    const/4 v6, 0x1

    invoke-direct {v5, v4, v6}, Ljava/io/FileWriter;-><init>(Ljava/io/File;Z)V

    invoke-direct {v1, v5}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    .end local v0    # "bWritter":Ljava/io/BufferedWriter;
    .local v1, "bWritter":Ljava/io/BufferedWriter;
    :try_start_2
    iget-object v5, p0, Lcom/splunk/mint/DataSaver$1;->val$jsonData:Ljava/lang/String;

    invoke-virtual {v1, v5}, Ljava/io/BufferedWriter;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    .line 42
    invoke-virtual {v1}, Ljava/io/BufferedWriter;->flush()V

    .line 43
    invoke-virtual {v1}, Ljava/io/BufferedWriter;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_5
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 56
    if-eqz v1, :cond_1

    .line 58
    :try_start_3
    invoke-virtual {v1}, Ljava/io/BufferedWriter;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    .line 64
    :cond_1
    :goto_1
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/splunk/mint/DataSaverResponse;->setSavedSuccessfully(Ljava/lang/Boolean;)V

    .line 65
    sget-object v5, Lcom/splunk/mint/Mint;->mintCallback:Lcom/splunk/mint/MintCallback;

    if-eqz v5, :cond_7

    .line 66
    sget-object v5, Lcom/splunk/mint/Mint;->mintCallback:Lcom/splunk/mint/MintCallback;

    invoke-interface {v5, v2}, Lcom/splunk/mint/MintCallback;->dataSaverResponse(Lcom/splunk/mint/DataSaverResponse;)V

    move-object v0, v1

    .line 71
    .end local v1    # "bWritter":Ljava/io/BufferedWriter;
    .restart local v0    # "bWritter":Ljava/io/BufferedWriter;
    :cond_2
    :goto_2
    return-void

    .line 31
    .end local v0    # "bWritter":Ljava/io/BufferedWriter;
    :catch_0
    move-exception v3

    .line 32
    .local v3, "e":Ljava/io/IOException;
    invoke-virtual {v3}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0

    .line 59
    .end local v3    # "e":Ljava/io/IOException;
    .restart local v1    # "bWritter":Ljava/io/BufferedWriter;
    :catch_1
    move-exception v3

    .line 60
    .restart local v3    # "e":Ljava/io/IOException;
    invoke-virtual {v3}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_1

    .line 44
    .end local v1    # "bWritter":Ljava/io/BufferedWriter;
    .end local v3    # "e":Ljava/io/IOException;
    .restart local v0    # "bWritter":Ljava/io/BufferedWriter;
    :catch_2
    move-exception v3

    .line 45
    .restart local v3    # "e":Ljava/io/IOException;
    :goto_3
    :try_start_4
    invoke-virtual {v3}, Ljava/io/IOException;->printStackTrace()V

    .line 46
    invoke-virtual {v2, v3}, Lcom/splunk/mint/DataSaverResponse;->setException(Ljava/lang/Exception;)V

    .line 47
    const/4 v5, 0x0

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/splunk/mint/DataSaverResponse;->setSavedSuccessfully(Ljava/lang/Boolean;)V

    .line 48
    sget-object v5, Lcom/splunk/mint/Mint;->mintCallback:Lcom/splunk/mint/MintCallback;

    if-eqz v5, :cond_3

    .line 49
    sget-object v5, Lcom/splunk/mint/Mint;->mintCallback:Lcom/splunk/mint/MintCallback;

    invoke-interface {v5, v2}, Lcom/splunk/mint/MintCallback;->dataSaverResponse(Lcom/splunk/mint/DataSaverResponse;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 56
    :cond_3
    if-eqz v0, :cond_4

    .line 58
    :try_start_5
    invoke-virtual {v0}, Ljava/io/BufferedWriter;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    .line 64
    :cond_4
    :goto_4
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/splunk/mint/DataSaverResponse;->setSavedSuccessfully(Ljava/lang/Boolean;)V

    .line 65
    sget-object v5, Lcom/splunk/mint/Mint;->mintCallback:Lcom/splunk/mint/MintCallback;

    if-eqz v5, :cond_2

    .line 66
    sget-object v5, Lcom/splunk/mint/Mint;->mintCallback:Lcom/splunk/mint/MintCallback;

    invoke-interface {v5, v2}, Lcom/splunk/mint/MintCallback;->dataSaverResponse(Lcom/splunk/mint/DataSaverResponse;)V

    goto :goto_2

    .line 59
    :catch_3
    move-exception v3

    .line 60
    invoke-virtual {v3}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_4

    .line 56
    .end local v3    # "e":Ljava/io/IOException;
    :catchall_0
    move-exception v5

    :goto_5
    if-eqz v0, :cond_5

    .line 58
    :try_start_6
    invoke-virtual {v0}, Ljava/io/BufferedWriter;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_4

    .line 64
    :cond_5
    :goto_6
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-virtual {v2, v6}, Lcom/splunk/mint/DataSaverResponse;->setSavedSuccessfully(Ljava/lang/Boolean;)V

    .line 65
    sget-object v6, Lcom/splunk/mint/Mint;->mintCallback:Lcom/splunk/mint/MintCallback;

    if-eqz v6, :cond_6

    .line 66
    sget-object v6, Lcom/splunk/mint/Mint;->mintCallback:Lcom/splunk/mint/MintCallback;

    invoke-interface {v6, v2}, Lcom/splunk/mint/MintCallback;->dataSaverResponse(Lcom/splunk/mint/DataSaverResponse;)V

    :cond_6
    throw v5

    .line 59
    :catch_4
    move-exception v3

    .line 60
    .restart local v3    # "e":Ljava/io/IOException;
    invoke-virtual {v3}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_6

    .line 56
    .end local v0    # "bWritter":Ljava/io/BufferedWriter;
    .end local v3    # "e":Ljava/io/IOException;
    .restart local v1    # "bWritter":Ljava/io/BufferedWriter;
    :catchall_1
    move-exception v5

    move-object v0, v1

    .end local v1    # "bWritter":Ljava/io/BufferedWriter;
    .restart local v0    # "bWritter":Ljava/io/BufferedWriter;
    goto :goto_5

    .line 44
    .end local v0    # "bWritter":Ljava/io/BufferedWriter;
    .restart local v1    # "bWritter":Ljava/io/BufferedWriter;
    :catch_5
    move-exception v3

    move-object v0, v1

    .end local v1    # "bWritter":Ljava/io/BufferedWriter;
    .restart local v0    # "bWritter":Ljava/io/BufferedWriter;
    goto :goto_3

    .end local v0    # "bWritter":Ljava/io/BufferedWriter;
    .restart local v1    # "bWritter":Ljava/io/BufferedWriter;
    :cond_7
    move-object v0, v1

    .end local v1    # "bWritter":Ljava/io/BufferedWriter;
    .restart local v0    # "bWritter":Ljava/io/BufferedWriter;
    goto :goto_2
.end method
