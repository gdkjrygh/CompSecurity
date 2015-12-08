.class Lcom/splunk/mint/CrashInfo$3;
.super Ljava/lang/Object;
.source "CrashInfo.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/splunk/mint/CrashInfo;->saveLastCrashID(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/splunk/mint/CrashInfo;

.field final synthetic val$lastID:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/splunk/mint/CrashInfo;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 142
    iput-object p1, p0, Lcom/splunk/mint/CrashInfo$3;->this$0:Lcom/splunk/mint/CrashInfo;

    iput-object p2, p0, Lcom/splunk/mint/CrashInfo$3;->val$lastID:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .prologue
    .line 147
    new-instance v3, Ljava/io/File;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v5, Lcom/splunk/mint/Properties;->FILES_PATH:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "/"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "lastCrashID"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 148
    .local v3, "file":Ljava/io/File;
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v4

    if-nez v4, :cond_0

    .line 150
    :try_start_0
    invoke-virtual {v3}, Ljava/io/File;->createNewFile()Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 156
    :cond_0
    :goto_0
    const/4 v0, 0x0

    .line 160
    .local v0, "bos":Ljava/io/BufferedWriter;
    :try_start_1
    new-instance v1, Ljava/io/BufferedWriter;

    new-instance v4, Ljava/io/FileWriter;

    invoke-direct {v4, v3}, Ljava/io/FileWriter;-><init>(Ljava/io/File;)V

    invoke-direct {v1, v4}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 161
    .end local v0    # "bos":Ljava/io/BufferedWriter;
    .local v1, "bos":Ljava/io/BufferedWriter;
    :try_start_2
    iget-object v4, p0, Lcom/splunk/mint/CrashInfo$3;->val$lastID:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    .line 162
    invoke-virtual {v1}, Ljava/io/BufferedWriter;->newLine()V

    .line 163
    invoke-virtual {v1}, Ljava/io/BufferedWriter;->flush()V

    .line 164
    invoke-virtual {v1}, Ljava/io/BufferedWriter;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_5
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 171
    if-eqz v1, :cond_4

    .line 173
    :try_start_3
    invoke-virtual {v1}, Ljava/io/BufferedWriter;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    move-object v0, v1

    .line 180
    .end local v1    # "bos":Ljava/io/BufferedWriter;
    .restart local v0    # "bos":Ljava/io/BufferedWriter;
    :cond_1
    :goto_1
    return-void

    .line 151
    .end local v0    # "bos":Ljava/io/BufferedWriter;
    :catch_0
    move-exception v2

    .line 152
    .local v2, "e":Ljava/io/IOException;
    invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0

    .line 174
    .end local v2    # "e":Ljava/io/IOException;
    .restart local v1    # "bos":Ljava/io/BufferedWriter;
    :catch_1
    move-exception v2

    .line 175
    .restart local v2    # "e":Ljava/io/IOException;
    invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V

    move-object v0, v1

    .line 176
    .end local v1    # "bos":Ljava/io/BufferedWriter;
    .restart local v0    # "bos":Ljava/io/BufferedWriter;
    goto :goto_1

    .line 165
    .end local v2    # "e":Ljava/io/IOException;
    :catch_2
    move-exception v2

    .line 166
    .restart local v2    # "e":Ljava/io/IOException;
    :goto_2
    :try_start_4
    const-string v4, "There was a problem saving the last crash id"

    invoke-static {v4}, Lcom/splunk/mint/Logger;->logWarning(Ljava/lang/String;)V

    .line 167
    sget-boolean v4, Lcom/splunk/mint/Mint;->DEBUG:Z

    if-eqz v4, :cond_2

    .line 168
    invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 171
    :cond_2
    if-eqz v0, :cond_1

    .line 173
    :try_start_5
    invoke-virtual {v0}, Ljava/io/BufferedWriter;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    goto :goto_1

    .line 174
    :catch_3
    move-exception v2

    .line 175
    invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_1

    .line 171
    .end local v2    # "e":Ljava/io/IOException;
    :catchall_0
    move-exception v4

    :goto_3
    if-eqz v0, :cond_3

    .line 173
    :try_start_6
    invoke-virtual {v0}, Ljava/io/BufferedWriter;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_4

    .line 176
    :cond_3
    :goto_4
    throw v4

    .line 174
    :catch_4
    move-exception v2

    .line 175
    .restart local v2    # "e":Ljava/io/IOException;
    invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_4

    .line 171
    .end local v0    # "bos":Ljava/io/BufferedWriter;
    .end local v2    # "e":Ljava/io/IOException;
    .restart local v1    # "bos":Ljava/io/BufferedWriter;
    :catchall_1
    move-exception v4

    move-object v0, v1

    .end local v1    # "bos":Ljava/io/BufferedWriter;
    .restart local v0    # "bos":Ljava/io/BufferedWriter;
    goto :goto_3

    .line 165
    .end local v0    # "bos":Ljava/io/BufferedWriter;
    .restart local v1    # "bos":Ljava/io/BufferedWriter;
    :catch_5
    move-exception v2

    move-object v0, v1

    .end local v1    # "bos":Ljava/io/BufferedWriter;
    .restart local v0    # "bos":Ljava/io/BufferedWriter;
    goto :goto_2

    .end local v0    # "bos":Ljava/io/BufferedWriter;
    .restart local v1    # "bos":Ljava/io/BufferedWriter;
    :cond_4
    move-object v0, v1

    .end local v1    # "bos":Ljava/io/BufferedWriter;
    .restart local v0    # "bos":Ljava/io/BufferedWriter;
    goto :goto_1
.end method
