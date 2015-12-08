.class Lcom/splunk/mint/CrashInfo$2;
.super Ljava/lang/Object;
.source "CrashInfo.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/splunk/mint/CrashInfo;->saveCrashCounter()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/splunk/mint/CrashInfo;


# direct methods
.method constructor <init>(Lcom/splunk/mint/CrashInfo;)V
    .locals 0

    .prologue
    .line 75
    iput-object p1, p0, Lcom/splunk/mint/CrashInfo$2;->this$0:Lcom/splunk/mint/CrashInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    .prologue
    .line 80
    new-instance v6, Ljava/io/File;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v8, Lcom/splunk/mint/Properties;->FILES_PATH:Ljava/lang/String;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, "/"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, "crashCounter"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 81
    .local v6, "file":Ljava/io/File;
    if-eqz v6, :cond_0

    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v7

    if-nez v7, :cond_0

    .line 83
    :try_start_0
    invoke-virtual {v6}, Ljava/io/File;->createNewFile()Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 88
    :cond_0
    :goto_0
    const/4 v0, 0x0

    .line 89
    .local v0, "bin":Ljava/io/BufferedReader;
    const/4 v2, 0x0

    .line 92
    .local v2, "bos":Ljava/io/BufferedWriter;
    :try_start_1
    new-instance v1, Ljava/io/BufferedReader;

    new-instance v7, Ljava/io/FileReader;

    invoke-direct {v7, v6}, Ljava/io/FileReader;-><init>(Ljava/io/File;)V

    invoke-direct {v1, v7}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 93
    .end local v0    # "bin":Ljava/io/BufferedReader;
    .local v1, "bin":Ljava/io/BufferedReader;
    const/4 v7, 0x0

    :try_start_2
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_9
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-result-object v4

    .line 95
    .local v4, "crashCounter":Ljava/lang/Integer;
    :try_start_3
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_9
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    move-result-object v4

    .line 100
    :goto_1
    :try_start_4
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v7

    add-int/lit8 v7, v7, 0x1

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    .line 102
    new-instance v3, Ljava/io/BufferedWriter;

    new-instance v7, Ljava/io/FileWriter;

    invoke-direct {v7, v6}, Ljava/io/FileWriter;-><init>(Ljava/io/File;)V

    invoke-direct {v3, v7}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_9
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 103
    .end local v2    # "bos":Ljava/io/BufferedWriter;
    .local v3, "bos":Ljava/io/BufferedWriter;
    :try_start_5
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    .line 104
    invoke-virtual {v3}, Ljava/io/BufferedWriter;->newLine()V

    .line 105
    invoke-virtual {v3}, Ljava/io/BufferedWriter;->flush()V

    .line 106
    invoke-virtual {v3}, Ljava/io/BufferedWriter;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_a
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 112
    if-eqz v1, :cond_1

    .line 114
    :try_start_6
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2

    .line 120
    :cond_1
    :goto_2
    if-eqz v3, :cond_7

    .line 122
    :try_start_7
    invoke-virtual {v3}, Ljava/io/BufferedWriter;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_3

    move-object v2, v3

    .end local v3    # "bos":Ljava/io/BufferedWriter;
    .restart local v2    # "bos":Ljava/io/BufferedWriter;
    move-object v0, v1

    .line 129
    .end local v1    # "bin":Ljava/io/BufferedReader;
    .end local v4    # "crashCounter":Ljava/lang/Integer;
    .restart local v0    # "bin":Ljava/io/BufferedReader;
    :cond_2
    :goto_3
    return-void

    .line 84
    .end local v0    # "bin":Ljava/io/BufferedReader;
    .end local v2    # "bos":Ljava/io/BufferedWriter;
    :catch_0
    move-exception v5

    .line 85
    .local v5, "e":Ljava/io/IOException;
    invoke-virtual {v5}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0

    .line 96
    .end local v5    # "e":Ljava/io/IOException;
    .restart local v1    # "bin":Ljava/io/BufferedReader;
    .restart local v2    # "bos":Ljava/io/BufferedWriter;
    .restart local v4    # "crashCounter":Ljava/lang/Integer;
    :catch_1
    move-exception v5

    .line 97
    .local v5, "e":Ljava/lang/Exception;
    const/4 v7, 0x0

    :try_start_8
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_9
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    move-result-object v4

    goto :goto_1

    .line 115
    .end local v2    # "bos":Ljava/io/BufferedWriter;
    .end local v5    # "e":Ljava/lang/Exception;
    .restart local v3    # "bos":Ljava/io/BufferedWriter;
    :catch_2
    move-exception v5

    .line 116
    .local v5, "e":Ljava/io/IOException;
    invoke-virtual {v5}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_2

    .line 123
    .end local v5    # "e":Ljava/io/IOException;
    :catch_3
    move-exception v5

    .line 124
    .restart local v5    # "e":Ljava/io/IOException;
    invoke-virtual {v5}, Ljava/io/IOException;->printStackTrace()V

    move-object v2, v3

    .end local v3    # "bos":Ljava/io/BufferedWriter;
    .restart local v2    # "bos":Ljava/io/BufferedWriter;
    move-object v0, v1

    .line 125
    .end local v1    # "bin":Ljava/io/BufferedReader;
    .restart local v0    # "bin":Ljava/io/BufferedReader;
    goto :goto_3

    .line 107
    .end local v4    # "crashCounter":Ljava/lang/Integer;
    .end local v5    # "e":Ljava/io/IOException;
    :catch_4
    move-exception v5

    .line 108
    .restart local v5    # "e":Ljava/io/IOException;
    :goto_4
    :try_start_9
    const-string v7, "There was a problem saving the crash counter"

    invoke-static {v7}, Lcom/splunk/mint/Logger;->logWarning(Ljava/lang/String;)V

    .line 109
    sget-boolean v7, Lcom/splunk/mint/Mint;->DEBUG:Z

    if-eqz v7, :cond_3

    .line 110
    invoke-virtual {v5}, Ljava/io/IOException;->printStackTrace()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 112
    :cond_3
    if-eqz v0, :cond_4

    .line 114
    :try_start_a
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_6

    .line 120
    :cond_4
    :goto_5
    if-eqz v2, :cond_2

    .line 122
    :try_start_b
    invoke-virtual {v2}, Ljava/io/BufferedWriter;->close()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_5

    goto :goto_3

    .line 123
    :catch_5
    move-exception v5

    .line 124
    invoke-virtual {v5}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_3

    .line 115
    :catch_6
    move-exception v5

    .line 116
    invoke-virtual {v5}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_5

    .line 112
    .end local v5    # "e":Ljava/io/IOException;
    :catchall_0
    move-exception v7

    :goto_6
    if-eqz v0, :cond_5

    .line 114
    :try_start_c
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_7

    .line 120
    :cond_5
    :goto_7
    if-eqz v2, :cond_6

    .line 122
    :try_start_d
    invoke-virtual {v2}, Ljava/io/BufferedWriter;->close()V
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_8

    .line 125
    :cond_6
    :goto_8
    throw v7

    .line 115
    :catch_7
    move-exception v5

    .line 116
    .restart local v5    # "e":Ljava/io/IOException;
    invoke-virtual {v5}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_7

    .line 123
    .end local v5    # "e":Ljava/io/IOException;
    :catch_8
    move-exception v5

    .line 124
    .restart local v5    # "e":Ljava/io/IOException;
    invoke-virtual {v5}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_8

    .line 112
    .end local v0    # "bin":Ljava/io/BufferedReader;
    .end local v5    # "e":Ljava/io/IOException;
    .restart local v1    # "bin":Ljava/io/BufferedReader;
    :catchall_1
    move-exception v7

    move-object v0, v1

    .end local v1    # "bin":Ljava/io/BufferedReader;
    .restart local v0    # "bin":Ljava/io/BufferedReader;
    goto :goto_6

    .end local v0    # "bin":Ljava/io/BufferedReader;
    .end local v2    # "bos":Ljava/io/BufferedWriter;
    .restart local v1    # "bin":Ljava/io/BufferedReader;
    .restart local v3    # "bos":Ljava/io/BufferedWriter;
    .restart local v4    # "crashCounter":Ljava/lang/Integer;
    :catchall_2
    move-exception v7

    move-object v2, v3

    .end local v3    # "bos":Ljava/io/BufferedWriter;
    .restart local v2    # "bos":Ljava/io/BufferedWriter;
    move-object v0, v1

    .end local v1    # "bin":Ljava/io/BufferedReader;
    .restart local v0    # "bin":Ljava/io/BufferedReader;
    goto :goto_6

    .line 107
    .end local v0    # "bin":Ljava/io/BufferedReader;
    .end local v4    # "crashCounter":Ljava/lang/Integer;
    .restart local v1    # "bin":Ljava/io/BufferedReader;
    :catch_9
    move-exception v5

    move-object v0, v1

    .end local v1    # "bin":Ljava/io/BufferedReader;
    .restart local v0    # "bin":Ljava/io/BufferedReader;
    goto :goto_4

    .end local v0    # "bin":Ljava/io/BufferedReader;
    .end local v2    # "bos":Ljava/io/BufferedWriter;
    .restart local v1    # "bin":Ljava/io/BufferedReader;
    .restart local v3    # "bos":Ljava/io/BufferedWriter;
    .restart local v4    # "crashCounter":Ljava/lang/Integer;
    :catch_a
    move-exception v5

    move-object v2, v3

    .end local v3    # "bos":Ljava/io/BufferedWriter;
    .restart local v2    # "bos":Ljava/io/BufferedWriter;
    move-object v0, v1

    .end local v1    # "bin":Ljava/io/BufferedReader;
    .restart local v0    # "bin":Ljava/io/BufferedReader;
    goto :goto_4

    .end local v0    # "bin":Ljava/io/BufferedReader;
    .end local v2    # "bos":Ljava/io/BufferedWriter;
    .restart local v1    # "bin":Ljava/io/BufferedReader;
    .restart local v3    # "bos":Ljava/io/BufferedWriter;
    :cond_7
    move-object v2, v3

    .end local v3    # "bos":Ljava/io/BufferedWriter;
    .restart local v2    # "bos":Ljava/io/BufferedWriter;
    move-object v0, v1

    .end local v1    # "bin":Ljava/io/BufferedReader;
    .restart local v0    # "bin":Ljava/io/BufferedReader;
    goto :goto_3
.end method
