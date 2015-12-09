.class public Lorg/apache/cordova/DirectoryManager;
.super Ljava/lang/Object;
.source "DirectoryManager.java"


# static fields
.field private static final LOG_TAG:Ljava/lang/String; = "DirectoryManager"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static constructFilePaths(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
    .locals 3
    .param p0, "file1"    # Ljava/lang/String;
    .param p1, "file2"    # Ljava/lang/String;

    .prologue
    .line 126
    invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 127
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 132
    .local v0, "newPath":Ljava/io/File;
    :goto_0
    return-object v0

    .line 130
    .end local v0    # "newPath":Ljava/io/File;
    :cond_0
    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .restart local v0    # "newPath":Ljava/io/File;
    goto :goto_0
.end method

.method private static freeSpaceCalculation(Ljava/lang/String;)J
    .locals 10
    .param p0, "path"    # Ljava/lang/String;

    .prologue
    .line 90
    new-instance v4, Landroid/os/StatFs;

    invoke-direct {v4, p0}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 91
    .local v4, "stat":Landroid/os/StatFs;
    invoke-virtual {v4}, Landroid/os/StatFs;->getBlockSize()I

    move-result v5

    int-to-long v2, v5

    .line 92
    .local v2, "blockSize":J
    invoke-virtual {v4}, Landroid/os/StatFs;->getAvailableBlocks()I

    move-result v5

    int-to-long v0, v5

    .line 93
    .local v0, "availableBlocks":J
    mul-long v6, v0, v2

    const-wide/16 v8, 0x400

    div-long/2addr v6, v8

    return-wide v6
.end method

.method protected static getFreeDiskSpace(Z)J
    .locals 6
    .param p0, "checkInternal"    # Z

    .prologue
    .line 65
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v2

    .line 66
    .local v2, "status":Ljava/lang/String;
    const-wide/16 v0, 0x0

    .line 69
    .local v0, "freeSpace":J
    const-string v3, "mounted"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 70
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v3}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lorg/apache/cordova/DirectoryManager;->freeSpaceCalculation(Ljava/lang/String;)J

    move-result-wide v0

    :goto_0
    move-wide v4, v0

    .line 80
    :goto_1
    return-wide v4

    .line 72
    :cond_0
    if-eqz p0, :cond_1

    .line 73
    const-string v3, "/"

    invoke-static {v3}, Lorg/apache/cordova/DirectoryManager;->freeSpaceCalculation(Ljava/lang/String;)J

    move-result-wide v0

    goto :goto_0

    .line 77
    :cond_1
    const-wide/16 v4, -0x1

    goto :goto_1
.end method

.method protected static getTempDirectoryPath(Landroid/content/Context;)Ljava/lang/String;
    .locals 3
    .param p0, "ctx"    # Landroid/content/Context;

    .prologue
    .line 142
    const/4 v0, 0x0

    .line 145
    .local v0, "cache":Ljava/io/File;
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v1

    const-string v2, "mounted"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 146
    new-instance v0, Ljava/io/File;

    .end local v0    # "cache":Ljava/io/File;
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/Android/data/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/cache/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 155
    .restart local v0    # "cache":Ljava/io/File;
    :goto_0
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_0

    .line 156
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 159
    :cond_0
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    return-object v1

    .line 151
    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v0

    goto :goto_0
.end method

.method protected static testFileExists(Ljava/lang/String;)Z
    .locals 4
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 47
    invoke-static {}, Lorg/apache/cordova/DirectoryManager;->testSaveLocationExists()Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v3, ""

    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 48
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    .line 49
    .local v1, "path":Ljava/io/File;
    invoke-virtual {v1}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, p0}, Lorg/apache/cordova/DirectoryManager;->constructFilePaths(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    .line 50
    .local v0, "newPath":Ljava/io/File;
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    .line 56
    .end local v0    # "newPath":Ljava/io/File;
    .end local v1    # "path":Ljava/io/File;
    .local v2, "status":Z
    :goto_0
    return v2

    .line 54
    .end local v2    # "status":Z
    :cond_0
    const/4 v2, 0x0

    .restart local v2    # "status":Z
    goto :goto_0
.end method

.method protected static testSaveLocationExists()Z
    .locals 3

    .prologue
    .line 102
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v0

    .line 106
    .local v0, "sDCardStatus":Ljava/lang/String;
    const-string v2, "mounted"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 107
    const/4 v1, 0x1

    .line 114
    .local v1, "status":Z
    :goto_0
    return v1

    .line 112
    .end local v1    # "status":Z
    :cond_0
    const/4 v1, 0x0

    .restart local v1    # "status":Z
    goto :goto_0
.end method
