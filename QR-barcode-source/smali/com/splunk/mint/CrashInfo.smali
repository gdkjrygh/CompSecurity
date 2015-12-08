.class Lcom/splunk/mint/CrashInfo;
.super Lcom/splunk/mint/BaseExecutor;
.source "CrashInfo.java"

# interfaces
.implements Lcom/splunk/mint/InterfaceExecutor;


# static fields
.field private static final crashCounterFile:Ljava/lang/String; = "crashCounter"

.field private static final lastCrashIDFile:Ljava/lang/String; = "lastCrashID"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Lcom/splunk/mint/BaseExecutor;-><init>()V

    return-void
.end method

.method protected static getCrashCounter()I
    .locals 8

    .prologue
    const/4 v5, 0x0

    .line 17
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 18
    .local v2, "crashCounter":Ljava/lang/Integer;
    new-instance v4, Ljava/io/File;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v7, Lcom/splunk/mint/Properties;->FILES_PATH:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "/"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "crashCounter"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v4, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 19
    .local v4, "file":Ljava/io/File;
    if-eqz v4, :cond_1

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v6

    if-nez v6, :cond_1

    .line 21
    :try_start_0
    invoke-virtual {v4}, Ljava/io/File;->createNewFile()Z

    .line 22
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v5

    .line 48
    :cond_0
    :goto_0
    return v5

    .line 23
    :catch_0
    move-exception v3

    .line 24
    .local v3, "e":Ljava/io/IOException;
    invoke-virtual {v3}, Ljava/io/IOException;->printStackTrace()V

    .line 27
    .end local v3    # "e":Ljava/io/IOException;
    :cond_1
    const/4 v0, 0x0

    .line 29
    .local v0, "bin":Ljava/io/BufferedReader;
    :try_start_1
    new-instance v1, Ljava/io/BufferedReader;

    new-instance v6, Ljava/io/FileReader;

    invoke-direct {v6, v4}, Ljava/io/FileReader;-><init>(Ljava/io/File;)V

    invoke-direct {v1, v6}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    .end local v0    # "bin":Ljava/io/BufferedReader;
    .local v1, "bin":Ljava/io/BufferedReader;
    :try_start_2
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-result-object v2

    .line 36
    :goto_1
    :try_start_3
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_6
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    move-result v5

    .line 43
    if-eqz v1, :cond_0

    .line 45
    :try_start_4
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_0

    .line 46
    :catch_1
    move-exception v3

    .line 47
    .restart local v3    # "e":Ljava/io/IOException;
    invoke-virtual {v3}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0

    .line 33
    .end local v3    # "e":Ljava/io/IOException;
    :catch_2
    move-exception v3

    .line 34
    .local v3, "e":Ljava/lang/Exception;
    const/4 v6, 0x0

    :try_start_5
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_6
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    move-result-object v2

    goto :goto_1

    .line 37
    .end local v1    # "bin":Ljava/io/BufferedReader;
    .end local v3    # "e":Ljava/lang/Exception;
    .restart local v0    # "bin":Ljava/io/BufferedReader;
    :catch_3
    move-exception v3

    .line 38
    .restart local v3    # "e":Ljava/lang/Exception;
    :goto_2
    :try_start_6
    const-string v6, "There was a problem getting the crash counter"

    invoke-static {v6}, Lcom/splunk/mint/Logger;->logWarning(Ljava/lang/String;)V

    .line 39
    sget-boolean v6, Lcom/splunk/mint/Mint;->DEBUG:Z

    if-eqz v6, :cond_2

    .line 40
    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 43
    :cond_2
    if-eqz v0, :cond_0

    .line 45
    :try_start_7
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_4

    goto :goto_0

    .line 46
    :catch_4
    move-exception v3

    .line 47
    .local v3, "e":Ljava/io/IOException;
    invoke-virtual {v3}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0

    .line 43
    .end local v3    # "e":Ljava/io/IOException;
    :catchall_0
    move-exception v5

    :goto_3
    if-eqz v0, :cond_3

    .line 45
    :try_start_8
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_5

    .line 48
    :cond_3
    :goto_4
    throw v5

    .line 46
    :catch_5
    move-exception v3

    .line 47
    .restart local v3    # "e":Ljava/io/IOException;
    invoke-virtual {v3}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_4

    .line 43
    .end local v0    # "bin":Ljava/io/BufferedReader;
    .end local v3    # "e":Ljava/io/IOException;
    .restart local v1    # "bin":Ljava/io/BufferedReader;
    :catchall_1
    move-exception v5

    move-object v0, v1

    .end local v1    # "bin":Ljava/io/BufferedReader;
    .restart local v0    # "bin":Ljava/io/BufferedReader;
    goto :goto_3

    .line 37
    .end local v0    # "bin":Ljava/io/BufferedReader;
    .restart local v1    # "bin":Ljava/io/BufferedReader;
    :catch_6
    move-exception v3

    move-object v0, v1

    .end local v1    # "bin":Ljava/io/BufferedReader;
    .restart local v0    # "bin":Ljava/io/BufferedReader;
    goto :goto_2
.end method

.method protected static getLastCrashID()Ljava/lang/String;
    .locals 8

    .prologue
    const/4 v5, 0x0

    .line 191
    const/4 v2, 0x0

    .line 192
    .local v2, "crashID":Ljava/lang/String;
    new-instance v4, Ljava/io/File;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v7, Lcom/splunk/mint/Properties;->FILES_PATH:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "/"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "lastCrashID"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v4, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 193
    .local v4, "file":Ljava/io/File;
    if-eqz v4, :cond_1

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v6

    if-nez v6, :cond_1

    .line 195
    :try_start_0
    invoke-virtual {v4}, Ljava/io/File;->createNewFile()Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v2, v5

    .line 224
    .end local v2    # "crashID":Ljava/lang/String;
    :cond_0
    :goto_0
    return-object v2

    .line 197
    .restart local v2    # "crashID":Ljava/lang/String;
    :catch_0
    move-exception v3

    .line 198
    .local v3, "e":Ljava/io/IOException;
    invoke-virtual {v3}, Ljava/io/IOException;->printStackTrace()V

    .line 201
    .end local v3    # "e":Ljava/io/IOException;
    :cond_1
    const/4 v0, 0x0

    .line 203
    .local v0, "bin":Ljava/io/BufferedReader;
    :try_start_1
    new-instance v1, Ljava/io/BufferedReader;

    new-instance v6, Ljava/io/FileReader;

    invoke-direct {v6, v4}, Ljava/io/FileReader;-><init>(Ljava/io/File;)V

    invoke-direct {v1, v6}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 206
    .end local v0    # "bin":Ljava/io/BufferedReader;
    .local v1, "bin":Ljava/io/BufferedReader;
    :try_start_2
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-result-object v2

    .line 219
    :goto_1
    if-eqz v1, :cond_0

    .line 221
    :try_start_3
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_0

    .line 222
    :catch_1
    move-exception v3

    .line 223
    .restart local v3    # "e":Ljava/io/IOException;
    invoke-virtual {v3}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0

    .line 207
    .end local v3    # "e":Ljava/io/IOException;
    :catch_2
    move-exception v3

    .line 209
    .local v3, "e":Ljava/lang/Exception;
    :try_start_4
    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_6
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 210
    const/4 v2, 0x0

    goto :goto_1

    .line 213
    .end local v1    # "bin":Ljava/io/BufferedReader;
    .end local v3    # "e":Ljava/lang/Exception;
    .restart local v0    # "bin":Ljava/io/BufferedReader;
    :catch_3
    move-exception v3

    .line 214
    .restart local v3    # "e":Ljava/lang/Exception;
    :goto_2
    :try_start_5
    const-string v6, "There was a problem getting the last crash id"

    invoke-static {v6}, Lcom/splunk/mint/Logger;->logWarning(Ljava/lang/String;)V

    .line 215
    sget-boolean v6, Lcom/splunk/mint/Mint;->DEBUG:Z

    if-eqz v6, :cond_2

    .line 216
    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 219
    :cond_2
    if-eqz v0, :cond_3

    .line 221
    :try_start_6
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_4

    .end local v3    # "e":Ljava/lang/Exception;
    :cond_3
    :goto_3
    move-object v2, v5

    .line 224
    goto :goto_0

    .line 222
    .restart local v3    # "e":Ljava/lang/Exception;
    :catch_4
    move-exception v3

    .line 223
    .local v3, "e":Ljava/io/IOException;
    invoke-virtual {v3}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_3

    .line 219
    .end local v3    # "e":Ljava/io/IOException;
    :catchall_0
    move-exception v5

    :goto_4
    if-eqz v0, :cond_4

    .line 221
    :try_start_7
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_5

    .line 224
    :cond_4
    :goto_5
    throw v5

    .line 222
    :catch_5
    move-exception v3

    .line 223
    .restart local v3    # "e":Ljava/io/IOException;
    invoke-virtual {v3}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_5

    .line 219
    .end local v0    # "bin":Ljava/io/BufferedReader;
    .end local v3    # "e":Ljava/io/IOException;
    .restart local v1    # "bin":Ljava/io/BufferedReader;
    :catchall_1
    move-exception v5

    move-object v0, v1

    .end local v1    # "bin":Ljava/io/BufferedReader;
    .restart local v0    # "bin":Ljava/io/BufferedReader;
    goto :goto_4

    .line 213
    .end local v0    # "bin":Ljava/io/BufferedReader;
    .restart local v1    # "bin":Ljava/io/BufferedReader;
    .local v3, "e":Ljava/lang/Exception;
    :catch_6
    move-exception v3

    move-object v0, v1

    .end local v1    # "bin":Ljava/io/BufferedReader;
    .restart local v0    # "bin":Ljava/io/BufferedReader;
    goto :goto_2
.end method


# virtual methods
.method protected clearCrashCounter()V
    .locals 4

    .prologue
    .line 56
    new-instance v2, Lcom/splunk/mint/LowPriorityThreadFactory;

    invoke-direct {v2}, Lcom/splunk/mint/LowPriorityThreadFactory;-><init>()V

    new-instance v3, Lcom/splunk/mint/CrashInfo$1;

    invoke-direct {v3, p0}, Lcom/splunk/mint/CrashInfo$1;-><init>(Lcom/splunk/mint/CrashInfo;)V

    invoke-virtual {v2, v3}, Lcom/splunk/mint/LowPriorityThreadFactory;->newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;

    move-result-object v1

    .line 68
    .local v1, "t":Ljava/lang/Thread;
    invoke-virtual {p0}, Lcom/splunk/mint/CrashInfo;->getExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    .line 69
    .local v0, "executor":Ljava/util/concurrent/ExecutorService;
    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    .line 70
    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 72
    :cond_0
    return-void
.end method

.method public getExecutor()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .prologue
    .line 232
    sget-object v0, Lcom/splunk/mint/CrashInfo;->executor:Ljava/util/concurrent/ExecutorService;

    if-nez v0, :cond_0

    .line 233
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/splunk/mint/CrashInfo;->executor:Ljava/util/concurrent/ExecutorService;

    .line 234
    :cond_0
    sget-object v0, Lcom/splunk/mint/CrashInfo;->executor:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method protected saveCrashCounter()V
    .locals 4

    .prologue
    .line 75
    new-instance v2, Lcom/splunk/mint/LowPriorityThreadFactory;

    invoke-direct {v2}, Lcom/splunk/mint/LowPriorityThreadFactory;-><init>()V

    new-instance v3, Lcom/splunk/mint/CrashInfo$2;

    invoke-direct {v3, p0}, Lcom/splunk/mint/CrashInfo$2;-><init>(Lcom/splunk/mint/CrashInfo;)V

    invoke-virtual {v2, v3}, Lcom/splunk/mint/LowPriorityThreadFactory;->newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;

    move-result-object v1

    .line 131
    .local v1, "t":Ljava/lang/Thread;
    invoke-virtual {p0}, Lcom/splunk/mint/CrashInfo;->getExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    .line 132
    .local v0, "executor":Ljava/util/concurrent/ExecutorService;
    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    .line 133
    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 135
    :cond_0
    return-void
.end method

.method protected saveLastCrashID(Ljava/lang/String;)V
    .locals 4
    .param p1, "lastID"    # Ljava/lang/String;

    .prologue
    .line 141
    if-eqz p1, :cond_0

    .line 142
    new-instance v2, Lcom/splunk/mint/LowPriorityThreadFactory;

    invoke-direct {v2}, Lcom/splunk/mint/LowPriorityThreadFactory;-><init>()V

    new-instance v3, Lcom/splunk/mint/CrashInfo$3;

    invoke-direct {v3, p0, p1}, Lcom/splunk/mint/CrashInfo$3;-><init>(Lcom/splunk/mint/CrashInfo;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lcom/splunk/mint/LowPriorityThreadFactory;->newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;

    move-result-object v1

    .line 182
    .local v1, "t":Ljava/lang/Thread;
    invoke-virtual {p0}, Lcom/splunk/mint/CrashInfo;->getExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    .line 183
    .local v0, "executor":Ljava/util/concurrent/ExecutorService;
    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    .line 184
    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 188
    .end local v0    # "executor":Ljava/util/concurrent/ExecutorService;
    .end local v1    # "t":Ljava/lang/Thread;
    :cond_0
    return-void
.end method
