.class Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesMemory;
.super Ljava/lang/Object;
.source "DeviceCapabilitiesMemory.java"


# static fields
.field private static final MEM_INFO_FILE:Ljava/lang/String; = "/proc/meminfo"

.field private static final TAG:Ljava/lang/String; = "DeviceCapabilitiesMemory"


# instance fields
.field private mAvailableCapacity:J

.field private mCapacity:J

.field private mContext:Landroid/content/Context;

.field private mDeviceCapabilities:Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;


# direct methods
.method public constructor <init>(Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;Landroid/content/Context;)V
    .locals 2
    .param p1, "instance"    # Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;
    .param p2, "context"    # Landroid/content/Context;

    .prologue
    const-wide/16 v0, 0x0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-wide v0, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesMemory;->mAvailableCapacity:J

    .line 27
    iput-wide v0, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesMemory;->mCapacity:J

    .line 31
    iput-object p1, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesMemory;->mDeviceCapabilities:Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;

    .line 32
    iput-object p2, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesMemory;->mContext:Landroid/content/Context;

    .line 33
    return-void
.end method

.method private getTotalMemFromFile()J
    .locals 12

    .prologue
    .line 63
    const-wide/16 v2, 0x0

    .line 64
    .local v2, "capacity":J
    const/4 v4, 0x0

    .line 67
    .local v4, "file":Ljava/io/RandomAccessFile;
    :try_start_0
    new-instance v5, Ljava/io/RandomAccessFile;

    const-string v8, "/proc/meminfo"

    const-string v9, "r"

    invoke-direct {v5, v8, v9}, Ljava/io/RandomAccessFile;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    .end local v4    # "file":Ljava/io/RandomAccessFile;
    .local v5, "file":Ljava/io/RandomAccessFile;
    :try_start_1
    invoke-virtual {v5}, Ljava/io/RandomAccessFile;->readLine()Ljava/lang/String;

    move-result-object v6

    .line 70
    .local v6, "line":Ljava/lang/String;
    const-string v8, ":"

    invoke-virtual {v6, v8}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 71
    .local v0, "arrs":[Ljava/lang/String;
    const/4 v8, 0x0

    aget-object v8, v0, v8

    const-string v9, "MemTotal"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_5
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result v8

    if-nez v8, :cond_1

    .line 72
    const-wide/16 v8, 0x0

    .line 81
    if-eqz v5, :cond_0

    .line 82
    :try_start_2
    invoke-virtual {v5}, Ljava/io/RandomAccessFile;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :cond_0
    :goto_0
    move-object v4, v5

    .line 89
    .end local v0    # "arrs":[Ljava/lang/String;
    .end local v5    # "file":Ljava/io/RandomAccessFile;
    .end local v6    # "line":Ljava/lang/String;
    .restart local v4    # "file":Ljava/io/RandomAccessFile;
    :goto_1
    return-wide v8

    .line 84
    .end local v4    # "file":Ljava/io/RandomAccessFile;
    .restart local v0    # "arrs":[Ljava/lang/String;
    .restart local v5    # "file":Ljava/io/RandomAccessFile;
    .restart local v6    # "line":Ljava/lang/String;
    :catch_0
    move-exception v1

    .line 85
    .local v1, "e":Ljava/io/IOException;
    const-string v10, "DeviceCapabilitiesMemory"

    invoke-virtual {v1}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 74
    .end local v1    # "e":Ljava/io/IOException;
    :cond_1
    const/4 v8, 0x1

    :try_start_3
    aget-object v8, v0, v8

    invoke-virtual {v8}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v8

    const-string v9, "\\s+"

    invoke-virtual {v8, v9}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v7

    .line 75
    .local v7, "values":[Ljava/lang/String;
    const/4 v8, 0x0

    aget-object v8, v7, v8

    invoke-static {v8}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_5
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    move-result-wide v8

    const-wide/16 v10, 0x400

    mul-long v2, v8, v10

    .line 81
    if-eqz v5, :cond_2

    .line 82
    :try_start_4
    invoke-virtual {v5}, Ljava/io/RandomAccessFile;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    :cond_2
    move-object v4, v5

    .end local v0    # "arrs":[Ljava/lang/String;
    .end local v5    # "file":Ljava/io/RandomAccessFile;
    .end local v6    # "line":Ljava/lang/String;
    .end local v7    # "values":[Ljava/lang/String;
    .restart local v4    # "file":Ljava/io/RandomAccessFile;
    :cond_3
    :goto_2
    move-wide v8, v2

    .line 89
    goto :goto_1

    .line 84
    .end local v4    # "file":Ljava/io/RandomAccessFile;
    .restart local v0    # "arrs":[Ljava/lang/String;
    .restart local v5    # "file":Ljava/io/RandomAccessFile;
    .restart local v6    # "line":Ljava/lang/String;
    .restart local v7    # "values":[Ljava/lang/String;
    :catch_1
    move-exception v1

    .line 85
    .restart local v1    # "e":Ljava/io/IOException;
    const-string v8, "DeviceCapabilitiesMemory"

    invoke-virtual {v1}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    move-object v4, v5

    .line 87
    .end local v5    # "file":Ljava/io/RandomAccessFile;
    .restart local v4    # "file":Ljava/io/RandomAccessFile;
    goto :goto_2

    .line 76
    .end local v0    # "arrs":[Ljava/lang/String;
    .end local v1    # "e":Ljava/io/IOException;
    .end local v6    # "line":Ljava/lang/String;
    .end local v7    # "values":[Ljava/lang/String;
    :catch_2
    move-exception v1

    .line 77
    .restart local v1    # "e":Ljava/io/IOException;
    :goto_3
    const-wide/16 v2, 0x0

    .line 78
    :try_start_5
    const-string v8, "DeviceCapabilitiesMemory"

    invoke-virtual {v1}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 81
    if-eqz v4, :cond_3

    .line 82
    :try_start_6
    invoke-virtual {v4}, Ljava/io/RandomAccessFile;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3

    goto :goto_2

    .line 84
    :catch_3
    move-exception v1

    .line 85
    const-string v8, "DeviceCapabilitiesMemory"

    invoke-virtual {v1}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    .line 80
    .end local v1    # "e":Ljava/io/IOException;
    :catchall_0
    move-exception v8

    .line 81
    :goto_4
    if-eqz v4, :cond_4

    .line 82
    :try_start_7
    invoke-virtual {v4}, Ljava/io/RandomAccessFile;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_4

    .line 86
    :cond_4
    :goto_5
    throw v8

    .line 84
    :catch_4
    move-exception v1

    .line 85
    .restart local v1    # "e":Ljava/io/IOException;
    const-string v9, "DeviceCapabilitiesMemory"

    invoke-virtual {v1}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_5

    .line 80
    .end local v1    # "e":Ljava/io/IOException;
    .end local v4    # "file":Ljava/io/RandomAccessFile;
    .restart local v5    # "file":Ljava/io/RandomAccessFile;
    :catchall_1
    move-exception v8

    move-object v4, v5

    .end local v5    # "file":Ljava/io/RandomAccessFile;
    .restart local v4    # "file":Ljava/io/RandomAccessFile;
    goto :goto_4

    .line 76
    .end local v4    # "file":Ljava/io/RandomAccessFile;
    .restart local v5    # "file":Ljava/io/RandomAccessFile;
    :catch_5
    move-exception v1

    move-object v4, v5

    .end local v5    # "file":Ljava/io/RandomAccessFile;
    .restart local v4    # "file":Ljava/io/RandomAccessFile;
    goto :goto_3
.end method

.method private readMemoryInfo()V
    .locals 4

    .prologue
    .line 50
    new-instance v1, Landroid/app/ActivityManager$MemoryInfo;

    invoke-direct {v1}, Landroid/app/ActivityManager$MemoryInfo;-><init>()V

    .line 51
    .local v1, "mem_info":Landroid/app/ActivityManager$MemoryInfo;
    iget-object v2, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesMemory;->mContext:Landroid/content/Context;

    const-string v3, "activity"

    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    .line 52
    .local v0, "activityManager":Landroid/app/ActivityManager;
    invoke-virtual {v0, v1}, Landroid/app/ActivityManager;->getMemoryInfo(Landroid/app/ActivityManager$MemoryInfo;)V

    .line 54
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x10

    if-lt v2, v3, :cond_0

    .line 55
    iget-wide v2, v1, Landroid/app/ActivityManager$MemoryInfo;->totalMem:J

    iput-wide v2, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesMemory;->mCapacity:J

    .line 59
    :goto_0
    iget-wide v2, v1, Landroid/app/ActivityManager$MemoryInfo;->availMem:J

    iput-wide v2, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesMemory;->mAvailableCapacity:J

    .line 60
    return-void

    .line 57
    :cond_0
    invoke-direct {p0}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesMemory;->getTotalMemFromFile()J

    move-result-wide v2

    iput-wide v2, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesMemory;->mCapacity:J

    goto :goto_0
.end method


# virtual methods
.method public getInfo()Lorg/json/JSONObject;
    .locals 6

    .prologue
    .line 36
    invoke-direct {p0}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesMemory;->readMemoryInfo()V

    .line 38
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 40
    .local v1, "out":Lorg/json/JSONObject;
    :try_start_0
    const-string v2, "capacity"

    iget-wide v4, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesMemory;->mCapacity:J

    invoke-virtual {v1, v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 41
    const-string v2, "availCapacity"

    iget-wide v4, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesMemory;->mAvailableCapacity:J

    invoke-virtual {v1, v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    .end local v1    # "out":Lorg/json/JSONObject;
    :goto_0
    return-object v1

    .line 42
    .restart local v1    # "out":Lorg/json/JSONObject;
    :catch_0
    move-exception v0

    .line 43
    .local v0, "e":Lorg/json/JSONException;
    iget-object v2, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesMemory;->mDeviceCapabilities:Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;

    invoke-virtual {v0}, Lorg/json/JSONException;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;->setErrorMessage(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    goto :goto_0
.end method
