.class public Lorg/chromium/base/SysUtils;
.super Ljava/lang/Object;
.source "SysUtils.java"


# static fields
.field static final synthetic $assertionsDisabled:Z

.field private static final ANDROID_LOW_MEMORY_ANDROID_SDK_THRESHOLD:I = 0x12

.field private static final ANDROID_LOW_MEMORY_DEVICE_THRESHOLD_MB:J = 0x200L

.field private static final TAG:Ljava/lang/String; = "SysUtils"

.field private static sLowEndDevice:Ljava/lang/Boolean;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 19
    const-class v0, Lorg/chromium/base/SysUtils;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lorg/chromium/base/SysUtils;->$assertionsDisabled:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static amountOfPhysicalMemoryKB()I
    .locals 11

    .prologue
    .line 51
    const-string v8, "^MemTotal:\\s+([0-9]+) kB$"

    invoke-static {v8}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v5

    .line 53
    .local v5, "pattern":Ljava/util/regex/Pattern;
    invoke-static {}, Landroid/os/StrictMode;->allowThreadDiskReads()Landroid/os/StrictMode$ThreadPolicy;

    move-result-object v4

    .line 55
    .local v4, "oldPolicy":Landroid/os/StrictMode$ThreadPolicy;
    :try_start_0
    new-instance v1, Ljava/io/FileReader;

    const-string v8, "/proc/meminfo"

    invoke-direct {v1, v8}, Ljava/io/FileReader;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 57
    .local v1, "fileReader":Ljava/io/FileReader;
    :try_start_1
    new-instance v6, Ljava/io/BufferedReader;

    invoke-direct {v6, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 61
    .local v6, "reader":Ljava/io/BufferedReader;
    :cond_0
    :try_start_2
    invoke-virtual {v6}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v2

    .line 62
    .local v2, "line":Ljava/lang/String;
    if-nez v2, :cond_1

    .line 63
    const-string v8, "SysUtils"

    const-string v9, "/proc/meminfo lacks a MemTotal entry?"

    invoke-static {v8, v9}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 80
    :goto_0
    :try_start_3
    invoke-virtual {v6}, Ljava/io/BufferedReader;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 83
    :try_start_4
    invoke-virtual {v1}, Ljava/io/FileReader;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 88
    invoke-static {v4}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 91
    .end local v1    # "fileReader":Ljava/io/FileReader;
    .end local v2    # "line":Ljava/lang/String;
    .end local v6    # "reader":Ljava/io/BufferedReader;
    :goto_1
    const/4 v7, 0x0

    :goto_2
    return v7

    .line 66
    .restart local v1    # "fileReader":Ljava/io/FileReader;
    .restart local v2    # "line":Ljava/lang/String;
    .restart local v6    # "reader":Ljava/io/BufferedReader;
    :cond_1
    :try_start_5
    invoke-virtual {v5, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v3

    .line 67
    .local v3, "m":Ljava/util/regex/Matcher;
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->find()Z

    move-result v8

    if-eqz v8, :cond_0

    .line 69
    const/4 v8, 0x1

    invoke-virtual {v3, v8}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    .line 71
    .local v7, "totalMemoryKB":I
    const/16 v8, 0x400

    if-gt v7, v8, :cond_2

    .line 72
    const-string v8, "SysUtils"

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Invalid /proc/meminfo total size in kB: "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    const/4 v10, 0x1

    invoke-virtual {v3, v10}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_0

    .line 80
    .end local v2    # "line":Ljava/lang/String;
    .end local v3    # "m":Ljava/util/regex/Matcher;
    .end local v7    # "totalMemoryKB":I
    :catchall_0
    move-exception v8

    :try_start_6
    invoke-virtual {v6}, Ljava/io/BufferedReader;->close()V

    throw v8
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 83
    .end local v6    # "reader":Ljava/io/BufferedReader;
    :catchall_1
    move-exception v8

    :try_start_7
    invoke-virtual {v1}, Ljava/io/FileReader;->close()V

    throw v8
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 85
    .end local v1    # "fileReader":Ljava/io/FileReader;
    :catch_0
    move-exception v0

    .line 86
    .local v0, "e":Ljava/lang/Exception;
    :try_start_8
    const-string v8, "SysUtils"

    const-string v9, "Cannot get total physical size from /proc/meminfo"

    invoke-static {v8, v9, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 88
    invoke-static {v4}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    goto :goto_1

    .line 80
    .end local v0    # "e":Ljava/lang/Exception;
    .restart local v1    # "fileReader":Ljava/io/FileReader;
    .restart local v2    # "line":Ljava/lang/String;
    .restart local v3    # "m":Ljava/util/regex/Matcher;
    .restart local v6    # "reader":Ljava/io/BufferedReader;
    .restart local v7    # "totalMemoryKB":I
    :cond_2
    :try_start_9
    invoke-virtual {v6}, Ljava/io/BufferedReader;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 83
    :try_start_a
    invoke-virtual {v1}, Ljava/io/FileReader;->close()V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_0
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 88
    invoke-static {v4}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    goto :goto_2

    .end local v1    # "fileReader":Ljava/io/FileReader;
    .end local v2    # "line":Ljava/lang/String;
    .end local v3    # "m":Ljava/util/regex/Matcher;
    .end local v6    # "reader":Ljava/io/BufferedReader;
    .end local v7    # "totalMemoryKB":I
    :catchall_2
    move-exception v8

    invoke-static {v4}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    throw v8
.end method

.method private static detectLowEndDevice()Z
    .locals 8

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 106
    sget-boolean v4, Lorg/chromium/base/SysUtils;->$assertionsDisabled:Z

    if-nez v4, :cond_0

    invoke-static {}, Lorg/chromium/base/CommandLine;->isInitialized()Z

    move-result v4

    if-nez v4, :cond_0

    new-instance v2, Ljava/lang/AssertionError;

    invoke-direct {v2}, Ljava/lang/AssertionError;-><init>()V

    throw v2

    .line 107
    :cond_0
    invoke-static {}, Lorg/chromium/base/CommandLine;->getInstance()Lorg/chromium/base/CommandLine;

    move-result-object v4

    const-string v5, "low-end-device-mode"

    invoke-virtual {v4, v5}, Lorg/chromium/base/CommandLine;->hasSwitch(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 108
    invoke-static {}, Lorg/chromium/base/CommandLine;->getInstance()Lorg/chromium/base/CommandLine;

    move-result-object v4

    const-string v5, "low-end-device-mode"

    invoke-virtual {v4, v5}, Lorg/chromium/base/CommandLine;->getSwitchValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    .line 110
    .local v0, "mode":I
    if-ne v0, v2, :cond_2

    .line 119
    :cond_1
    :goto_0
    return v2

    .line 111
    :cond_2
    if-nez v0, :cond_3

    move v2, v3

    goto :goto_0

    .line 114
    :cond_3
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x12

    if-gt v4, v5, :cond_4

    move v2, v3

    .line 115
    goto :goto_0

    .line 118
    :cond_4
    invoke-static {}, Lorg/chromium/base/SysUtils;->amountOfPhysicalMemoryKB()I

    move-result v1

    .line 119
    .local v1, "ramSizeKB":I
    if-lez v1, :cond_5

    div-int/lit16 v4, v1, 0x400

    int-to-long v4, v4

    const-wide/16 v6, 0x200

    cmp-long v4, v4, v6

    if-ltz v4, :cond_1

    :cond_5
    move v2, v3

    goto :goto_0
.end method

.method public static isLowEndDevice()Z
    .locals 1
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 99
    sget-object v0, Lorg/chromium/base/SysUtils;->sLowEndDevice:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    .line 100
    invoke-static {}, Lorg/chromium/base/SysUtils;->detectLowEndDevice()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    sput-object v0, Lorg/chromium/base/SysUtils;->sLowEndDevice:Ljava/lang/Boolean;

    .line 102
    :cond_0
    sget-object v0, Lorg/chromium/base/SysUtils;->sLowEndDevice:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method
