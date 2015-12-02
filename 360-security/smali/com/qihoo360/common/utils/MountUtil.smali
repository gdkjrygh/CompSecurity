.class public Lcom/qihoo360/common/utils/MountUtil;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo360/common/utils/MountUtil$MountInfo;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getMountPoint(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 93
    const/4 v0, 0x0

    const/16 v1, 0x2f

    const/4 v2, 0x1

    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->indexOf(II)I

    move-result v1

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static queryMountInfo(Ljava/lang/String;)Lcom/qihoo360/common/utils/MountUtil$MountInfo;
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 45
    .line 53
    :try_start_0
    new-instance v0, Ljava/io/FileReader;

    const-string/jumbo v2, "/proc/mounts"

    invoke-direct {v0, v2}, Ljava/io/FileReader;-><init>(Ljava/lang/String;)V

    .line 54
    new-instance v2, Ljava/io/BufferedReader;

    invoke-direct {v2, v0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    :cond_0
    :try_start_1
    invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_6
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-object v0

    if-nez v0, :cond_1

    .line 80
    :try_start_2
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_5

    :goto_0
    move-object v0, v1

    .line 85
    :goto_1
    return-object v0

    .line 57
    :cond_1
    :try_start_3
    invoke-virtual {v0, p0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 61
    const-string/jumbo v3, "[ \t]+"

    invoke-virtual {v0, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    .line 62
    if-eqz v3, :cond_2

    array-length v0, v3

    const/4 v4, 0x4

    if-le v0, v4, :cond_2

    .line 63
    new-instance v0, Lcom/qihoo360/common/utils/MountUtil$MountInfo;

    invoke-direct {v0}, Lcom/qihoo360/common/utils/MountUtil$MountInfo;-><init>()V

    .line 64
    const/4 v4, 0x0

    aget-object v4, v3, v4

    iput-object v4, v0, Lcom/qihoo360/common/utils/MountUtil$MountInfo;->dev:Ljava/lang/String;

    .line 65
    const/4 v4, 0x1

    aget-object v4, v3, v4

    iput-object v4, v0, Lcom/qihoo360/common/utils/MountUtil$MountInfo;->mountPoint:Ljava/lang/String;

    .line 66
    const/4 v4, 0x2

    aget-object v4, v3, v4

    iput-object v4, v0, Lcom/qihoo360/common/utils/MountUtil$MountInfo;->fstype:Ljava/lang/String;

    .line 67
    const/4 v4, 0x3

    aget-object v3, v3, v4

    iput-object v3, v0, Lcom/qihoo360/common/utils/MountUtil$MountInfo;->flags:Ljava/lang/String;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_6
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 80
    :try_start_4
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_1

    .line 81
    :catch_0
    move-exception v1

    goto :goto_1

    .line 80
    :cond_2
    :try_start_5
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    :goto_2
    move-object v0, v1

    .line 70
    goto :goto_1

    .line 74
    :catch_1
    move-exception v0

    move-object v0, v1

    .line 80
    :goto_3
    :try_start_6
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    goto :goto_0

    .line 81
    :catch_2
    move-exception v0

    goto :goto_0

    .line 78
    :catchall_0
    move-exception v0

    move-object v2, v1

    .line 80
    :goto_4
    :try_start_7
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_4

    .line 83
    :goto_5
    throw v0

    .line 81
    :catch_3
    move-exception v0

    goto :goto_2

    :catch_4
    move-exception v1

    goto :goto_5

    :catch_5
    move-exception v0

    goto :goto_0

    .line 78
    :catchall_1
    move-exception v0

    goto :goto_4

    .line 74
    :catch_6
    move-exception v0

    move-object v0, v2

    goto :goto_3
.end method
