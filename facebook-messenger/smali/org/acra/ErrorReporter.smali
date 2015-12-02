.class public Lorg/acra/ErrorReporter;
.super Ljava/lang/Object;
.source "ErrorReporter.java"

# interfaces
.implements Ljava/lang/Thread$UncaughtExceptionHandler;


# static fields
.field public static final ACRA_DIRNAME:Ljava/lang/String; = "acra-reports"

.field public static final DEFAULT_MAX_REPORT_SIZE:J = 0xc800L

.field public static final MAX_REPORT_AGE:J = 0x5265c00L

.field private static final MAX_SEND_REPORTS:I = 0x5

.field public static final REPORTFILE_EXTENSION:Ljava/lang/String; = ".stacktrace"

.field private static TRACE_COUNT_LIMIT:I

.field private static mInstanceSingleton:Lorg/acra/ErrorReporter;

.field private static mInternalException:Ljava/lang/String;


# instance fields
.field private final activityLogger:Lorg/acra/util/SimpleTraceLogger;

.field private forceDump:Z

.field private mAppVersionCode:Ljava/lang/String;

.field private mAppVersionName:Ljava/lang/String;

.field private mContext:Landroid/content/Context;

.field private mCrashProperties:Lorg/acra/CrashReportData;

.field mCustomParameters:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private mDfltExceptionHandler:Ljava/lang/Thread$UncaughtExceptionHandler;

.field private mInitialConfiguration:Ljava/lang/String;

.field private mMaxReportSize:J

.field private mReportSenders:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lorg/acra/sender/ReportSender;",
            ">;"
        }
    .end annotation
.end field

.field private processNameByAms:Ljava/lang/String;

.field private processNameByAmsReady:Z

.field private sendInMemoryReport:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 86
    const-string v0, "ACRA_INTERNAL=java.lang.Exception: An exception occurred while trying to collect data about an ACRA internal error\n\tat org.acra.ErrorReporter.handleException(ErrorReporter.java:810)\n\tat org.acra.ErrorReporter.handleException(ErrorReporter.java:866)\n\tat org.acra.ErrorReporter.uncaughtException(ErrorReporter.java:666)\n\tat java.lang.ThreadGroup.uncaughtException(ThreadGroup.java:693)\n\tat java.lang.ThreadGroup.uncaughtException(ThreadGroup.java:690)\n"

    sput-object v0, Lorg/acra/ErrorReporter;->mInternalException:Ljava/lang/String;

    .line 185
    const/4 v0, 0x5

    sput v0, Lorg/acra/ErrorReporter;->TRACE_COUNT_LIMIT:I

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 84
    const-wide/32 v0, 0xc800

    iput-wide v0, p0, Lorg/acra/ErrorReporter;->mMaxReportSize:J

    .line 96
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/acra/ErrorReporter;->mReportSenders:Ljava/util/ArrayList;

    .line 166
    new-instance v0, Lorg/acra/CrashReportData;

    invoke-direct {v0}, Lorg/acra/CrashReportData;-><init>()V

    iput-object v0, p0, Lorg/acra/ErrorReporter;->mCrashProperties:Lorg/acra/CrashReportData;

    .line 170
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lorg/acra/ErrorReporter;->mCustomParameters:Ljava/util/Map;

    .line 186
    new-instance v0, Lorg/acra/util/SimpleTraceLogger;

    sget v1, Lorg/acra/ErrorReporter;->TRACE_COUNT_LIMIT:I

    invoke-direct {v0, v1}, Lorg/acra/util/SimpleTraceLogger;-><init>(I)V

    iput-object v0, p0, Lorg/acra/ErrorReporter;->activityLogger:Lorg/acra/util/SimpleTraceLogger;

    .line 195
    iput-boolean v2, p0, Lorg/acra/ErrorReporter;->sendInMemoryReport:Z

    .line 200
    iput-boolean v2, p0, Lorg/acra/ErrorReporter;->forceDump:Z

    return-void
.end method

.method static synthetic access$000(Lorg/acra/ErrorReporter;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lorg/acra/ErrorReporter;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method private deleteFile(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 1075
    invoke-static {p1, p2}, Lorg/acra/ErrorReporter;->fileForName(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    move-result v0

    .line 1076
    if-nez v0, :cond_0

    .line 1077
    sget-object v0, Lorg/acra/ACRA;->LOG_TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Could not delete error report : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 1079
    :cond_0
    return-void
.end method

.method private static fileForName(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
    .locals 2

    .prologue
    .line 1070
    const-string v0, "acra-reports"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object v0

    .line 1071
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v1
.end method

.method private gatherCrashData(Ljava/lang/String;Ljava/io/Writer;)V
    .locals 1

    .prologue
    .line 746
    sget-object v0, Lorg/acra/ReportField;->STACK_TRACE:Lorg/acra/ReportField;

    invoke-direct {p0, v0, p1, p2}, Lorg/acra/ErrorReporter;->put(Lorg/acra/ReportField;Ljava/lang/String;Ljava/io/Writer;)V

    .line 748
    iget-object v0, p0, Lorg/acra/ErrorReporter;->mContext:Landroid/content/Context;

    invoke-direct {p0, v0, p2}, Lorg/acra/ErrorReporter;->retrieveCrashData(Landroid/content/Context;Ljava/io/Writer;)V

    .line 749
    return-void
.end method

.method private genCrashReportFileName()Ljava/lang/String;
    .locals 4

    .prologue
    .line 923
    sget-object v0, Lorg/acra/ACRA;->LOG_TAG:Ljava/lang/String;

    const-string v1, "Generating crash report file."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 924
    new-instance v0, Landroid/text/format/Time;

    invoke-direct {v0}, Landroid/text/format/Time;-><init>()V

    .line 925
    invoke-virtual {v0}, Landroid/text/format/Time;->setToNow()V

    .line 926
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/text/format/Time;->toMillis(Z)J

    move-result-wide v0

    .line 927
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v0, p0, Lorg/acra/ErrorReporter;->mAppVersionCode:Ljava/lang/String;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lorg/acra/ErrorReporter;->mAppVersionCode:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".stacktrace"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, ""

    goto :goto_0
.end method

.method private static getAvailableInternalMemorySize()J
    .locals 4

    .prologue
    .line 444
    :try_start_0
    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    move-result-object v0

    .line 445
    new-instance v1, Landroid/os/StatFs;

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 446
    invoke-virtual {v1}, Landroid/os/StatFs;->getBlockSize()I

    move-result v0

    int-to-long v2, v0

    .line 447
    invoke-virtual {v1}, Landroid/os/StatFs;->getAvailableBlocks()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    int-to-long v0, v0

    .line 448
    mul-long/2addr v0, v2

    .line 450
    :goto_0
    return-wide v0

    .line 449
    :catch_0
    move-exception v0

    .line 450
    const-wide/16 v0, -0x1

    goto :goto_0
.end method

.method public static getInstance()Lorg/acra/ErrorReporter;
    .locals 1

    .prologue
    .line 403
    sget-object v0, Lorg/acra/ErrorReporter;->mInstanceSingleton:Lorg/acra/ErrorReporter;

    if-nez v0, :cond_0

    .line 404
    new-instance v0, Lorg/acra/ErrorReporter;

    invoke-direct {v0}, Lorg/acra/ErrorReporter;-><init>()V

    sput-object v0, Lorg/acra/ErrorReporter;->mInstanceSingleton:Lorg/acra/ErrorReporter;

    .line 406
    :cond_0
    sget-object v0, Lorg/acra/ErrorReporter;->mInstanceSingleton:Lorg/acra/ErrorReporter;

    return-object v0
.end method

.method private getJailStatus()Ljava/lang/String;
    .locals 6

    .prologue
    .line 353
    sget-object v0, Landroid/os/Build;->TAGS:Ljava/lang/String;

    .line 354
    if-eqz v0, :cond_0

    const-string v1, "test-keys"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 355
    const-string v0, "yes"

    .line 387
    :goto_0
    return-object v0

    .line 360
    :cond_0
    :try_start_0
    new-instance v0, Ljava/io/File;

    const-string v1, "/system/app/Superuser.apk"

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 361
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 362
    const-string v0, "yes"
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 364
    :catch_0
    move-exception v0

    .line 365
    sget-object v1, Lorg/acra/ACRA;->LOG_TAG:Ljava/lang/String;

    const-string v2, "Failed to find Superuser.pak"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 369
    :cond_1
    invoke-static {}, Ljava/lang/System;->getenv()Ljava/util/Map;

    move-result-object v0

    .line 370
    if-eqz v0, :cond_3

    .line 371
    const-string v1, "PATH"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 372
    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 374
    array-length v3, v2

    const/4 v0, 0x0

    move v1, v0

    :goto_1
    if-ge v1, v3, :cond_3

    aget-object v0, v2, v1

    .line 375
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, "/"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, "su"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 377
    :try_start_1
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 378
    if-eqz v4, :cond_2

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 379
    const-string v0, "yes"
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 381
    :catch_1
    move-exception v0

    .line 382
    sget-object v4, Lorg/acra/ACRA;->LOG_TAG:Ljava/lang/String;

    const-string v5, "Failed to find su binary in the PATH"

    invoke-static {v4, v5, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 374
    :cond_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 387
    :cond_3
    const-string v0, "no"

    goto :goto_0
.end method

.method private getProcessName()Ljava/lang/String;
    .locals 6

    .prologue
    .line 317
    invoke-direct {p0}, Lorg/acra/ErrorReporter;->getProcessNameFromAmsOrNull()Ljava/lang/String;

    move-result-object v3

    .line 318
    if-nez v3, :cond_3

    .line 319
    const/4 v1, 0x0

    .line 321
    :try_start_0
    new-instance v0, Ljava/io/FileReader;

    const-string v2, "/proc/self/cmdline"

    invoke-direct {v0, v2}, Ljava/io/FileReader;-><init>(Ljava/lang/String;)V

    .line 322
    new-instance v2, Ljava/io/BufferedReader;

    const/16 v4, 0x80

    invoke-direct {v2, v0, v4}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 323
    :try_start_1
    invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2

    move-result-object v0

    .line 324
    if-eqz v0, :cond_0

    .line 325
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3

    move-result-object v0

    .line 331
    :cond_0
    :goto_0
    if-eqz v2, :cond_1

    .line 333
    :try_start_3
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    .line 340
    :cond_1
    :goto_1
    if-nez v0, :cond_2

    .line 341
    const-string v0, ""

    .line 343
    :cond_2
    return-object v0

    .line 327
    :catch_0
    move-exception v0

    move-object v2, v3

    .line 328
    :goto_2
    sget-object v3, Lorg/acra/ACRA;->LOG_TAG:Ljava/lang/String;

    const-string v4, "Failed to get process name."

    invoke-static {v3, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    move-object v0, v2

    move-object v2, v1

    goto :goto_0

    .line 334
    :catch_1
    move-exception v1

    .line 335
    sget-object v2, Lorg/acra/ACRA;->LOG_TAG:Ljava/lang/String;

    const-string v3, "Failed to close file."

    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1

    .line 327
    :catch_2
    move-exception v0

    move-object v1, v2

    move-object v2, v3

    goto :goto_2

    :catch_3
    move-exception v1

    move-object v5, v1

    move-object v1, v2

    move-object v2, v0

    move-object v0, v5

    goto :goto_2

    :cond_3
    move-object v0, v3

    goto :goto_1
.end method

.method private getProcessNameFromAms()Ljava/lang/String;
    .locals 1

    .prologue
    .line 304
    invoke-direct {p0}, Lorg/acra/ErrorReporter;->getProcessNameFromAmsOrNull()Ljava/lang/String;

    move-result-object v0

    .line 305
    if-nez v0, :cond_0

    .line 306
    const-string v0, "n/a"

    .line 308
    :cond_0
    return-object v0
.end method

.method private getProcessNameFromAmsOrNull()Ljava/lang/String;
    .locals 4

    .prologue
    .line 276
    iget-boolean v0, p0, Lorg/acra/ErrorReporter;->processNameByAmsReady:Z

    if-eqz v0, :cond_0

    .line 277
    iget-object v0, p0, Lorg/acra/ErrorReporter;->processNameByAms:Ljava/lang/String;

    .line 291
    :goto_0
    return-object v0

    .line 280
    :cond_0
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v1

    .line 281
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/acra/ErrorReporter;->processNameByAms:Ljava/lang/String;

    .line 282
    iget-object v0, p0, Lorg/acra/ErrorReporter;->mContext:Landroid/content/Context;

    const-string v2, "activity"

    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    .line 283
    invoke-virtual {v0}, Landroid/app/ActivityManager;->getRunningAppProcesses()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 284
    iget v3, v0, Landroid/app/ActivityManager$RunningAppProcessInfo;->pid:I

    if-ne v3, v1, :cond_1

    .line 285
    iget-object v0, v0, Landroid/app/ActivityManager$RunningAppProcessInfo;->processName:Ljava/lang/String;

    iput-object v0, p0, Lorg/acra/ErrorReporter;->processNameByAms:Ljava/lang/String;

    .line 290
    :cond_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/acra/ErrorReporter;->processNameByAmsReady:Z

    .line 291
    iget-object v0, p0, Lorg/acra/ErrorReporter;->processNameByAms:Ljava/lang/String;

    goto :goto_0
.end method

.method private getProcessUptime()J
    .locals 2

    .prologue
    .line 394
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    move-result-wide v0

    return-wide v0
.end method

.method private static getTotalInternalMemorySize()J
    .locals 4

    .prologue
    .line 462
    :try_start_0
    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    move-result-object v0

    .line 463
    new-instance v1, Landroid/os/StatFs;

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 464
    invoke-virtual {v1}, Landroid/os/StatFs;->getBlockSize()I

    move-result v0

    int-to-long v2, v0

    .line 465
    invoke-virtual {v1}, Landroid/os/StatFs;->getBlockCount()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    int-to-long v0, v0

    .line 466
    mul-long/2addr v0, v2

    .line 468
    :goto_0
    return-wide v0

    .line 467
    :catch_0
    move-exception v0

    .line 468
    const-wide/16 v0, -0x1

    goto :goto_0
.end method

.method private loadCrashReport(Landroid/content/Context;Ljava/lang/String;)Lorg/acra/CrashReportData;
    .locals 7

    .prologue
    const/4 v0, 0x0

    .line 1035
    new-instance v1, Lorg/acra/CrashReportData;

    invoke-direct {v1}, Lorg/acra/CrashReportData;-><init>()V

    .line 1036
    invoke-static {p1, p2}, Lorg/acra/ErrorReporter;->fileForName(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    .line 1037
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {v2}, Ljava/io/File;->lastModified()J

    move-result-wide v5

    sub-long/2addr v3, v5

    const-wide/32 v5, 0x5265c00

    cmp-long v3, v3, v5

    if-lez v3, :cond_0

    .line 1038
    sget-object v1, Lorg/acra/ACRA;->LOG_TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "crash report "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " was too old; deleted"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 1039
    invoke-direct {p0, p1, p2}, Lorg/acra/ErrorReporter;->deleteFile(Landroid/content/Context;Ljava/lang/String;)V

    .line 1065
    :goto_0
    return-object v0

    .line 1042
    :cond_0
    invoke-virtual {v2}, Ljava/io/File;->length()J

    move-result-wide v3

    iget-wide v5, p0, Lorg/acra/ErrorReporter;->mMaxReportSize:J

    cmp-long v3, v3, v5

    if-lez v3, :cond_1

    .line 1043
    sget-object v1, Lorg/acra/ACRA;->LOG_TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, ""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v2}, Ljava/io/File;->length()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "-byte crash report "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " exceeded max size of "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v3, p0, Lorg/acra/ErrorReporter;->mMaxReportSize:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " bytes; deleted"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 1045
    invoke-direct {p0, p1, p2}, Lorg/acra/ErrorReporter;->deleteFile(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 1049
    :cond_1
    new-instance v3, Ljava/io/FileInputStream;

    invoke-direct {v3, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 1050
    const/4 v2, 0x0

    .line 1053
    :try_start_0
    invoke-virtual {v1, v3}, Lorg/acra/CrashReportData;->load(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1062
    invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V

    :goto_1
    move-object v0, v1

    .line 1065
    goto :goto_0

    .line 1054
    :catch_0
    move-exception v0

    .line 1055
    :try_start_1
    sget-object v4, Lorg/acra/ACRA;->LOG_TAG:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Could not load crash report:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, " "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1056
    invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V

    .line 1057
    const/4 v2, 0x1

    .line 1058
    invoke-virtual {p1, p2}, Landroid/content/Context;->deleteFile(Ljava/lang/String;)Z

    .line 1059
    sget-object v0, Lorg/acra/ACRA;->LOG_TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Crash report:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " deleted"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 1061
    :catchall_0
    move-exception v0

    move v1, v2

    if-nez v1, :cond_2

    .line 1062
    invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V

    :cond_2
    throw v0
.end method

.method private put(Lorg/acra/ReportField;Ljava/lang/String;Ljava/io/Writer;)V
    .locals 2

    .prologue
    .line 765
    :try_start_0
    iget-object v0, p0, Lorg/acra/ErrorReporter;->mCrashProperties:Lorg/acra/CrashReportData;

    iget-boolean v1, p0, Lorg/acra/ErrorReporter;->sendInMemoryReport:Z

    if-eqz v1, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-virtual {v0, p1, p2, p3}, Lorg/acra/CrashReportData;->put(Lorg/acra/ReportField;Ljava/lang/String;Ljava/io/Writer;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 770
    :goto_0
    return-void

    .line 766
    :catch_0
    move-exception v0

    .line 768
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/acra/ErrorReporter;->sendInMemoryReport:Z

    goto :goto_0
.end method

.method private resetProcessNameByAmsCache()V
    .locals 1

    .prologue
    .line 295
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/acra/ErrorReporter;->processNameByAms:Ljava/lang/String;

    .line 296
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/acra/ErrorReporter;->processNameByAmsReady:Z

    .line 297
    return-void
.end method

.method private retrieveCrashData(Landroid/content/Context;Ljava/io/Writer;)V
    .locals 5

    .prologue
    .line 481
    sget-object v0, Lorg/acra/ACRA;->DEFAULT_REPORT_FIELDS:[Lorg/acra/ReportField;

    .line 482
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 485
    sget-object v0, Lorg/acra/ReportField;->REPORT_ID:Lorg/acra/ReportField;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 486
    sget-object v0, Lorg/acra/ReportField;->REPORT_ID:Lorg/acra/ReportField;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0, v2, p2}, Lorg/acra/ErrorReporter;->put(Lorg/acra/ReportField;Ljava/lang/String;Ljava/io/Writer;)V

    .line 490
    :cond_0
    sget-object v0, Lorg/acra/ReportField;->APP_VERSION_CODE:Lorg/acra/ReportField;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 491
    sget-object v0, Lorg/acra/ReportField;->APP_VERSION_CODE:Lorg/acra/ReportField;

    iget-object v2, p0, Lorg/acra/ErrorReporter;->mAppVersionCode:Ljava/lang/String;

    invoke-direct {p0, v0, v2, p2}, Lorg/acra/ErrorReporter;->put(Lorg/acra/ReportField;Ljava/lang/String;Ljava/io/Writer;)V

    .line 493
    :cond_1
    sget-object v0, Lorg/acra/ReportField;->APP_VERSION_NAME:Lorg/acra/ReportField;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 494
    sget-object v0, Lorg/acra/ReportField;->APP_VERSION_NAME:Lorg/acra/ReportField;

    iget-object v2, p0, Lorg/acra/ErrorReporter;->mAppVersionName:Ljava/lang/String;

    invoke-direct {p0, v0, v2, p2}, Lorg/acra/ErrorReporter;->put(Lorg/acra/ReportField;Ljava/lang/String;Ljava/io/Writer;)V

    .line 498
    :cond_2
    sget-object v0, Lorg/acra/ReportField;->PACKAGE_NAME:Lorg/acra/ReportField;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 499
    sget-object v0, Lorg/acra/ReportField;->PACKAGE_NAME:Lorg/acra/ReportField;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0, v2, p2}, Lorg/acra/ErrorReporter;->put(Lorg/acra/ReportField;Ljava/lang/String;Ljava/io/Writer;)V

    .line 503
    :cond_3
    sget-object v0, Lorg/acra/ReportField;->PROCESS_NAME:Lorg/acra/ReportField;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 504
    sget-object v0, Lorg/acra/ReportField;->PROCESS_NAME:Lorg/acra/ReportField;

    invoke-direct {p0}, Lorg/acra/ErrorReporter;->getProcessName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0, v2, p2}, Lorg/acra/ErrorReporter;->put(Lorg/acra/ReportField;Ljava/lang/String;Ljava/io/Writer;)V

    .line 508
    :cond_4
    sget-object v0, Lorg/acra/ReportField;->PROCESS_UPTIME:Lorg/acra/ReportField;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 509
    sget-object v0, Lorg/acra/ReportField;->PROCESS_UPTIME:Lorg/acra/ReportField;

    invoke-direct {p0}, Lorg/acra/ErrorReporter;->getProcessUptime()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0, v2, p2}, Lorg/acra/ErrorReporter;->put(Lorg/acra/ReportField;Ljava/lang/String;Ljava/io/Writer;)V

    .line 513
    :cond_5
    sget-object v0, Lorg/acra/ReportField;->BUILD:Lorg/acra/ReportField;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 514
    sget-object v0, Lorg/acra/ReportField;->BUILD:Lorg/acra/ReportField;

    const-class v2, Landroid/os/Build;

    invoke-static {v2}, Lorg/acra/ReflectionCollector;->collectConstants(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0, v2, p2}, Lorg/acra/ErrorReporter;->put(Lorg/acra/ReportField;Ljava/lang/String;Ljava/io/Writer;)V

    .line 518
    :cond_6
    sget-object v0, Lorg/acra/ReportField;->PHONE_MODEL:Lorg/acra/ReportField;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 519
    sget-object v0, Lorg/acra/ReportField;->PHONE_MODEL:Lorg/acra/ReportField;

    sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-direct {p0, v0, v2, p2}, Lorg/acra/ErrorReporter;->put(Lorg/acra/ReportField;Ljava/lang/String;Ljava/io/Writer;)V

    .line 522
    :cond_7
    sget-object v0, Lorg/acra/ReportField;->ANDROID_VERSION:Lorg/acra/ReportField;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 523
    sget-object v0, Lorg/acra/ReportField;->ANDROID_VERSION:Lorg/acra/ReportField;

    sget-object v2, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-direct {p0, v0, v2, p2}, Lorg/acra/ErrorReporter;->put(Lorg/acra/ReportField;Ljava/lang/String;Ljava/io/Writer;)V

    .line 527
    :cond_8
    sget-object v0, Lorg/acra/ReportField;->BRAND:Lorg/acra/ReportField;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 528
    sget-object v0, Lorg/acra/ReportField;->BRAND:Lorg/acra/ReportField;

    sget-object v2, Landroid/os/Build;->BRAND:Ljava/lang/String;

    invoke-direct {p0, v0, v2, p2}, Lorg/acra/ErrorReporter;->put(Lorg/acra/ReportField;Ljava/lang/String;Ljava/io/Writer;)V

    .line 530
    :cond_9
    sget-object v0, Lorg/acra/ReportField;->PRODUCT:Lorg/acra/ReportField;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 531
    sget-object v0, Lorg/acra/ReportField;->PRODUCT:Lorg/acra/ReportField;

    sget-object v2, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    invoke-direct {p0, v0, v2, p2}, Lorg/acra/ErrorReporter;->put(Lorg/acra/ReportField;Ljava/lang/String;Ljava/io/Writer;)V

    .line 535
    :cond_a
    sget-object v0, Lorg/acra/ReportField;->JAIL_BROKEN:Lorg/acra/ReportField;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 536
    sget-object v0, Lorg/acra/ReportField;->JAIL_BROKEN:Lorg/acra/ReportField;

    invoke-direct {p0}, Lorg/acra/ErrorReporter;->getJailStatus()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0, v2, p2}, Lorg/acra/ErrorReporter;->put(Lorg/acra/ReportField;Ljava/lang/String;Ljava/io/Writer;)V

    .line 540
    :cond_b
    sget-object v0, Lorg/acra/ReportField;->CUSTOM_DATA:Lorg/acra/ReportField;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 541
    sget-object v0, Lorg/acra/ReportField;->CUSTOM_DATA:Lorg/acra/ReportField;

    invoke-virtual {p0}, Lorg/acra/ErrorReporter;->createCustomInfoString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0, v2, p2}, Lorg/acra/ErrorReporter;->put(Lorg/acra/ReportField;Ljava/lang/String;Ljava/io/Writer;)V

    .line 545
    :cond_c
    sget-object v0, Lorg/acra/ReportField;->INSTALLATION_ID:Lorg/acra/ReportField;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 546
    sget-object v0, Lorg/acra/ReportField;->INSTALLATION_ID:Lorg/acra/ReportField;

    iget-object v2, p0, Lorg/acra/ErrorReporter;->mContext:Landroid/content/Context;

    invoke-static {v2}, Lorg/acra/util/Installation;->id(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0, v2, p2}, Lorg/acra/ErrorReporter;->put(Lorg/acra/ReportField;Ljava/lang/String;Ljava/io/Writer;)V

    .line 550
    :cond_d
    sget-object v0, Lorg/acra/ReportField;->INITIAL_CONFIGURATION:Lorg/acra/ReportField;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 551
    sget-object v0, Lorg/acra/ReportField;->INITIAL_CONFIGURATION:Lorg/acra/ReportField;

    iget-object v2, p0, Lorg/acra/ErrorReporter;->mInitialConfiguration:Ljava/lang/String;

    invoke-direct {p0, v0, v2, p2}, Lorg/acra/ErrorReporter;->put(Lorg/acra/ReportField;Ljava/lang/String;Ljava/io/Writer;)V

    .line 553
    :cond_e
    sget-object v0, Lorg/acra/ReportField;->CRASH_CONFIGURATION:Lorg/acra/ReportField;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 554
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    .line 555
    sget-object v2, Lorg/acra/ReportField;->CRASH_CONFIGURATION:Lorg/acra/ReportField;

    invoke-static {v0}, Lorg/acra/ConfigurationInspector;->toString(Landroid/content/res/Configuration;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v2, v0, p2}, Lorg/acra/ErrorReporter;->put(Lorg/acra/ReportField;Ljava/lang/String;Ljava/io/Writer;)V

    .line 559
    :cond_f
    sget-object v0, Lorg/acra/ReportField;->TOTAL_MEM_SIZE:Lorg/acra/ReportField;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 560
    sget-object v0, Lorg/acra/ReportField;->TOTAL_MEM_SIZE:Lorg/acra/ReportField;

    invoke-static {}, Lorg/acra/ErrorReporter;->getTotalInternalMemorySize()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0, v2, p2}, Lorg/acra/ErrorReporter;->put(Lorg/acra/ReportField;Ljava/lang/String;Ljava/io/Writer;)V

    .line 562
    :cond_10
    sget-object v0, Lorg/acra/ReportField;->AVAILABLE_MEM_SIZE:Lorg/acra/ReportField;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 563
    sget-object v0, Lorg/acra/ReportField;->AVAILABLE_MEM_SIZE:Lorg/acra/ReportField;

    invoke-static {}, Lorg/acra/ErrorReporter;->getAvailableInternalMemorySize()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0, v2, p2}, Lorg/acra/ErrorReporter;->put(Lorg/acra/ReportField;Ljava/lang/String;Ljava/io/Writer;)V

    .line 567
    :cond_11
    sget-object v0, Lorg/acra/ReportField;->DUMPSYS_MEMINFO:Lorg/acra/ReportField;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 568
    sget-object v0, Lorg/acra/ReportField;->DUMPSYS_MEMINFO:Lorg/acra/ReportField;

    invoke-static {p1}, Lorg/acra/DumpSysCollector;->collectMemInfo(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0, v2, p2}, Lorg/acra/ErrorReporter;->put(Lorg/acra/ReportField;Ljava/lang/String;Ljava/io/Writer;)V

    .line 572
    :cond_12
    sget-object v0, Lorg/acra/ReportField;->FILE_PATH:Lorg/acra/ReportField;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_13

    .line 573
    sget-object v0, Lorg/acra/ReportField;->FILE_PATH:Lorg/acra/ReportField;

    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0, v2, p2}, Lorg/acra/ErrorReporter;->put(Lorg/acra/ReportField;Ljava/lang/String;Ljava/io/Writer;)V

    .line 577
    :cond_13
    sget-object v0, Lorg/acra/ReportField;->USER_CRASH_DATE:Lorg/acra/ReportField;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_14

    .line 578
    new-instance v0, Landroid/text/format/Time;

    invoke-direct {v0}, Landroid/text/format/Time;-><init>()V

    .line 579
    invoke-virtual {v0}, Landroid/text/format/Time;->setToNow()V

    .line 580
    sget-object v2, Lorg/acra/ReportField;->USER_CRASH_DATE:Lorg/acra/ReportField;

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Landroid/text/format/Time;->format3339(Z)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v2, v0, p2}, Lorg/acra/ErrorReporter;->put(Lorg/acra/ReportField;Ljava/lang/String;Ljava/io/Writer;)V

    .line 584
    :cond_14
    sget-object v0, Lorg/acra/ReportField;->DEVICE_FEATURES:Lorg/acra/ReportField;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_15

    .line 585
    sget-object v0, Lorg/acra/ReportField;->DEVICE_FEATURES:Lorg/acra/ReportField;

    invoke-static {p1}, Lorg/acra/DeviceFeaturesCollector;->getFeatures(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0, v2, p2}, Lorg/acra/ErrorReporter;->put(Lorg/acra/ReportField;Ljava/lang/String;Ljava/io/Writer;)V

    .line 589
    :cond_15
    sget-object v0, Lorg/acra/ReportField;->ENVIRONMENT:Lorg/acra/ReportField;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_16

    .line 590
    sget-object v0, Lorg/acra/ReportField;->ENVIRONMENT:Lorg/acra/ReportField;

    const-class v2, Landroid/os/Environment;

    invoke-static {v2}, Lorg/acra/ReflectionCollector;->collectStaticGettersResults(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0, v2, p2}, Lorg/acra/ErrorReporter;->put(Lorg/acra/ReportField;Ljava/lang/String;Ljava/io/Writer;)V

    .line 595
    :cond_16
    sget-object v0, Lorg/acra/ReportField;->ACTIVITY_LOG:Lorg/acra/ReportField;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_17

    .line 596
    sget-object v0, Lorg/acra/ReportField;->ACTIVITY_LOG:Lorg/acra/ReportField;

    iget-object v2, p0, Lorg/acra/ErrorReporter;->activityLogger:Lorg/acra/util/SimpleTraceLogger;

    invoke-virtual {v2}, Lorg/acra/util/SimpleTraceLogger;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0, v2, p2}, Lorg/acra/ErrorReporter;->put(Lorg/acra/ReportField;Ljava/lang/String;Ljava/io/Writer;)V

    .line 600
    :cond_17
    sget-object v0, Lorg/acra/ReportField;->DISPLAY:Lorg/acra/ReportField;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_18

    .line 601
    const-string v0, "window"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    .line 603
    sget-object v2, Lorg/acra/ReportField;->DISPLAY:Lorg/acra/ReportField;

    invoke-static {v0}, Lorg/acra/ErrorReporter;->toString(Landroid/view/Display;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v2, v0, p2}, Lorg/acra/ErrorReporter;->put(Lorg/acra/ReportField;Ljava/lang/String;Ljava/io/Writer;)V

    .line 607
    :cond_18
    sget-object v0, Lorg/acra/ReportField;->SETTINGS_SYSTEM:Lorg/acra/ReportField;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_19

    .line 608
    sget-object v0, Lorg/acra/ReportField;->SETTINGS_SYSTEM:Lorg/acra/ReportField;

    iget-object v2, p0, Lorg/acra/ErrorReporter;->mContext:Landroid/content/Context;

    invoke-static {v2}, Lorg/acra/SettingsCollector;->collectSystemSettings(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0, v2, p2}, Lorg/acra/ErrorReporter;->put(Lorg/acra/ReportField;Ljava/lang/String;Ljava/io/Writer;)V

    .line 612
    :cond_19
    sget-object v0, Lorg/acra/ReportField;->SETTINGS_SECURE:Lorg/acra/ReportField;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1a

    .line 613
    sget-object v0, Lorg/acra/ReportField;->SETTINGS_SECURE:Lorg/acra/ReportField;

    iget-object v2, p0, Lorg/acra/ErrorReporter;->mContext:Landroid/content/Context;

    invoke-static {v2}, Lorg/acra/SettingsCollector;->collectSecureSettings(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0, v2, p2}, Lorg/acra/ErrorReporter;->put(Lorg/acra/ReportField;Ljava/lang/String;Ljava/io/Writer;)V

    .line 617
    :cond_1a
    sget-object v0, Lorg/acra/ReportField;->PROCESS_NAME_BY_AMS:Lorg/acra/ReportField;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1b

    .line 618
    sget-object v0, Lorg/acra/ReportField;->PROCESS_NAME_BY_AMS:Lorg/acra/ReportField;

    invoke-direct {p0}, Lorg/acra/ErrorReporter;->getProcessNameFromAms()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0, v2, p2}, Lorg/acra/ErrorReporter;->put(Lorg/acra/ReportField;Ljava/lang/String;Ljava/io/Writer;)V

    .line 620
    :cond_1b
    invoke-direct {p0}, Lorg/acra/ErrorReporter;->resetProcessNameByAmsCache()V

    .line 622
    new-instance v0, Lorg/acra/util/PackageManagerWrapper;

    invoke-direct {v0, p1}, Lorg/acra/util/PackageManagerWrapper;-><init>(Landroid/content/Context;)V

    .line 625
    if-eqz v0, :cond_20

    .line 626
    iget-boolean v2, p0, Lorg/acra/ErrorReporter;->forceDump:Z

    if-eqz v2, :cond_21

    const-string v2, "android.permission.READ_LOGS"

    invoke-virtual {v0, v2}, Lorg/acra/util/PackageManagerWrapper;->hasPermission(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_21

    .line 627
    sget-object v2, Lorg/acra/ACRA;->LOG_TAG:Ljava/lang/String;

    const-string v3, "READ_LOGS granted! ACRA can include LogCat and DropBox data."

    invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 628
    sget-object v2, Lorg/acra/ReportField;->LOGCAT:Lorg/acra/ReportField;

    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1c

    .line 629
    sget-object v2, Lorg/acra/ReportField;->LOGCAT:Lorg/acra/ReportField;

    const/4 v3, 0x0

    invoke-static {v3}, Lorg/acra/LogCatCollector;->collectLogCat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v2, v3, p2}, Lorg/acra/ErrorReporter;->put(Lorg/acra/ReportField;Ljava/lang/String;Ljava/io/Writer;)V

    .line 631
    :cond_1c
    sget-object v2, Lorg/acra/ReportField;->EVENTSLOG:Lorg/acra/ReportField;

    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1d

    .line 632
    sget-object v2, Lorg/acra/ReportField;->EVENTSLOG:Lorg/acra/ReportField;

    const-string v3, "events"

    invoke-static {v3}, Lorg/acra/LogCatCollector;->collectLogCat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v2, v3, p2}, Lorg/acra/ErrorReporter;->put(Lorg/acra/ReportField;Ljava/lang/String;Ljava/io/Writer;)V

    .line 634
    :cond_1d
    sget-object v2, Lorg/acra/ReportField;->RADIOLOG:Lorg/acra/ReportField;

    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1e

    .line 635
    sget-object v2, Lorg/acra/ReportField;->RADIOLOG:Lorg/acra/ReportField;

    const-string v3, "radio"

    invoke-static {v3}, Lorg/acra/LogCatCollector;->collectLogCat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v2, v3, p2}, Lorg/acra/ErrorReporter;->put(Lorg/acra/ReportField;Ljava/lang/String;Ljava/io/Writer;)V

    .line 637
    :cond_1e
    sget-object v2, Lorg/acra/ReportField;->DROPBOX:Lorg/acra/ReportField;

    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1f

    .line 638
    sget-object v2, Lorg/acra/ReportField;->DROPBOX:Lorg/acra/ReportField;

    iget-object v3, p0, Lorg/acra/ErrorReporter;->mContext:Landroid/content/Context;

    invoke-static {}, Lorg/acra/ACRA;->getConfig()Lorg/acra/reporter/ReportsCrashes;

    move-result-object v4

    invoke-interface {v4}, Lorg/acra/reporter/ReportsCrashes;->additionalDropBoxTags()[Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lorg/acra/DropBoxCollector;->read(Landroid/content/Context;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v2, v3, p2}, Lorg/acra/ErrorReporter;->put(Lorg/acra/ReportField;Ljava/lang/String;Ljava/io/Writer;)V

    .line 646
    :cond_1f
    :goto_0
    sget-object v2, Lorg/acra/ReportField;->DEVICE_ID:Lorg/acra/ReportField;

    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_20

    const-string v1, "android.permission.READ_PHONE_STATE"

    invoke-virtual {v0, v1}, Lorg/acra/util/PackageManagerWrapper;->hasPermission(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_20

    .line 648
    const-string v0, "phone"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/TelephonyManager;

    .line 649
    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;

    move-result-object v0

    .line 650
    if-eqz v0, :cond_20

    .line 651
    sget-object v1, Lorg/acra/ReportField;->DEVICE_ID:Lorg/acra/ReportField;

    invoke-direct {p0, v1, v0, p2}, Lorg/acra/ErrorReporter;->put(Lorg/acra/ReportField;Ljava/lang/String;Ljava/io/Writer;)V

    .line 655
    :cond_20
    return-void

    .line 642
    :cond_21
    sget-object v2, Lorg/acra/ACRA;->LOG_TAG:Ljava/lang/String;

    const-string v3, "READ_LOGS not allowed. ACRA will not include LogCat and DropBox data."

    invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method private sendCrashReport(Lorg/acra/CrashReportData;)V
    .locals 6

    .prologue
    .line 904
    const/4 v0, 0x0

    .line 905
    iget-object v1, p0, Lorg/acra/ErrorReporter;->mReportSenders:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v1, v0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/acra/sender/ReportSender;

    .line 907
    :try_start_0
    invoke-interface {v0, p1}, Lorg/acra/sender/ReportSender;->send(Lorg/acra/CrashReportData;)V
    :try_end_0
    .catch Lorg/acra/sender/ReportSenderException; {:try_start_0 .. :try_end_0} :catch_0

    .line 910
    const/4 v0, 0x1

    :goto_1
    move v1, v0

    .line 918
    goto :goto_0

    .line 911
    :catch_0
    move-exception v3

    .line 912
    if-nez v1, :cond_0

    .line 913
    throw v3

    .line 915
    :cond_0
    sget-object v3, Lorg/acra/ACRA;->LOG_TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "ReportSender of class "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, " failed but other senders completed their task. ACRA will not send this report again."

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    move v0, v1

    goto :goto_1

    .line 920
    :cond_1
    return-void
.end method

.method private throwableToString(Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 724
    if-nez p1, :cond_0

    .line 725
    new-instance p1, Ljava/lang/Exception;

    const-string v0, "Report requested by developer"

    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 728
    :cond_0
    new-instance v1, Ljava/io/StringWriter;

    invoke-direct {v1}, Ljava/io/StringWriter;-><init>()V

    .line 729
    new-instance v2, Ljava/io/PrintWriter;

    invoke-direct {v2, v1}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 730
    invoke-virtual {p1, v2}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 733
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    .line 734
    :goto_0
    if-eqz v0, :cond_1

    .line 735
    invoke-virtual {v0, v2}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 736
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    goto :goto_0

    .line 738
    :cond_1
    invoke-virtual {v2}, Ljava/io/PrintWriter;->close()V

    .line 740
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static toString(Landroid/view/Display;)Ljava/lang/String;
    .locals 5

    .prologue
    const/16 v4, 0xa

    .line 666
    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    .line 667
    invoke-virtual {p0, v0}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 668
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 669
    const-string v2, "width="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Landroid/view/Display;->getWidth()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "height="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Landroid/view/Display;->getHeight()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "pixelFormat="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Landroid/view/Display;->getPixelFormat()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "refreshRate="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Landroid/view/Display;->getRefreshRate()F

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "fps"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "metrics.density=x"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, v0, Landroid/util/DisplayMetrics;->density:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "metrics.scaledDensity=x"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, v0, Landroid/util/DisplayMetrics;->scaledDensity:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "metrics.widthPixels="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "metrics.heightPixels="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "metrics.xdpi="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, v0, Landroid/util/DisplayMetrics;->xdpi:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "metrics.ydpi="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v0, v0, Landroid/util/DisplayMetrics;->ydpi:F

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 677
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public addReportSender(Lorg/acra/sender/ReportSender;)V
    .locals 1

    .prologue
    .line 1103
    iget-object v0, p0, Lorg/acra/ErrorReporter;->mReportSenders:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1104
    return-void
.end method

.method declared-synchronized checkAndSendReports(Landroid/content/Context;)V
    .locals 8

    .prologue
    const/4 v0, 0x0

    .line 969
    monitor-enter p0

    :try_start_0
    sget-object v1, Lorg/acra/ACRA;->LOG_TAG:Ljava/lang/String;

    const-string v2, "#checkAndSendReports - start"

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 970
    invoke-virtual {p0}, Lorg/acra/ErrorReporter;->getCrashReportFilesList()[Ljava/lang/String;

    move-result-object v2

    .line 971
    invoke-static {v2}, Ljava/util/Arrays;->sort([Ljava/lang/Object;)V

    .line 975
    array-length v3, v2

    move v1, v0

    :goto_0
    if-ge v0, v3, :cond_0

    aget-object v4, v2, v0

    .line 976
    const/4 v5, 0x5

    if-lt v1, v5, :cond_1

    .line 1003
    :cond_0
    :goto_1
    sget-object v0, Lorg/acra/ACRA;->LOG_TAG:Ljava/lang/String;

    const-string v1, "#checkAndSendReports - finish"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1004
    monitor-exit p0

    return-void

    .line 980
    :cond_1
    :try_start_1
    sget-object v5, Lorg/acra/ACRA;->LOG_TAG:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Sending file "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 982
    :try_start_2
    invoke-direct {p0, p1, v4}, Lorg/acra/ErrorReporter;->loadCrashReport(Landroid/content/Context;Ljava/lang/String;)Lorg/acra/CrashReportData;

    move-result-object v5

    .line 983
    if-eqz v5, :cond_2

    .line 984
    sget-object v6, Lorg/acra/ReportField;->ACRA_REPORT_FILENAME:Lorg/acra/ReportField;

    invoke-virtual {v5, v6, v4}, Lorg/acra/CrashReportData;->put(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;

    .line 986
    invoke-direct {p0, v5}, Lorg/acra/ErrorReporter;->sendCrashReport(Lorg/acra/CrashReportData;)V

    .line 987
    invoke-direct {p0, p1, v4}, Lorg/acra/ErrorReporter;->deleteFile(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Lorg/acra/sender/ReportSenderException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1001
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 975
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 989
    :catch_0
    move-exception v0

    .line 990
    :try_start_3
    sget-object v1, Lorg/acra/ACRA;->LOG_TAG:Ljava/lang/String;

    const-string v2, "Failed to send crash reports"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 991
    invoke-direct {p0, p1, v4}, Lorg/acra/ErrorReporter;->deleteFile(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1

    .line 969
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 993
    :catch_1
    move-exception v0

    .line 994
    :try_start_4
    sget-object v1, Lorg/acra/ACRA;->LOG_TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to load crash report for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 995
    invoke-direct {p0, p1, v4}, Lorg/acra/ErrorReporter;->deleteFile(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_1

    .line 997
    :catch_2
    move-exception v0

    .line 998
    sget-object v1, Lorg/acra/ACRA;->LOG_TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to send crash report for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_1
.end method

.method public checkReportsOnApplicationStart()Lorg/acra/ErrorReporter$ReportsSenderWorker;
    .locals 2

    .prologue
    .line 1085
    invoke-virtual {p0}, Lorg/acra/ErrorReporter;->getCrashReportFilesList()[Ljava/lang/String;

    move-result-object v0

    .line 1086
    if-eqz v0, :cond_0

    array-length v0, v0

    if-lez v0, :cond_0

    .line 1087
    sget-object v0, Lorg/acra/ACRA;->LOG_TAG:Ljava/lang/String;

    const-string v1, "About to start ReportSenderWorker from #checkReportOnApplicationStart"

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1088
    new-instance v0, Lorg/acra/ErrorReporter$ReportsSenderWorker;

    invoke-direct {v0, p0}, Lorg/acra/ErrorReporter$ReportsSenderWorker;-><init>(Lorg/acra/ErrorReporter;)V

    .line 1089
    invoke-virtual {v0}, Lorg/acra/ErrorReporter$ReportsSenderWorker;->start()V

    .line 1092
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public createCustomInfoString()Ljava/lang/String;
    .locals 5

    .prologue
    .line 261
    const-string v0, ""

    .line 262
    iget-object v1, p0, Lorg/acra/ErrorReporter;->mCustomParameters:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move-object v2, v0

    .line 263
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 264
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 265
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 266
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 267
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object v2, v0

    .line 268
    goto :goto_0

    .line 269
    :cond_0
    return-object v2
.end method

.method getCrashReportFilesList()[Ljava/lang/String;
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 938
    iget-object v0, p0, Lorg/acra/ErrorReporter;->mContext:Landroid/content/Context;

    if-nez v0, :cond_1

    .line 939
    sget-object v0, Lorg/acra/ACRA;->LOG_TAG:Ljava/lang/String;

    const-string v1, "Trying to get ACRA reports but ACRA is not initialized."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 940
    new-array v0, v4, [Ljava/lang/String;

    .line 958
    :cond_0
    :goto_0
    return-object v0

    .line 943
    :cond_1
    iget-object v0, p0, Lorg/acra/ErrorReporter;->mContext:Landroid/content/Context;

    const-string v1, "acra-reports"

    invoke-virtual {v0, v1, v4}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object v0

    .line 944
    if-eqz v0, :cond_2

    .line 945
    sget-object v1, Lorg/acra/ACRA;->LOG_TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Looking for error files in "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 948
    new-instance v1, Lorg/acra/ErrorReporter$1;

    invoke-direct {v1, p0}, Lorg/acra/ErrorReporter$1;-><init>(Lorg/acra/ErrorReporter;)V

    .line 953
    invoke-virtual {v0, v1}, Ljava/io/File;->list(Ljava/io/FilenameFilter;)[Ljava/lang/String;

    move-result-object v0

    .line 954
    if-nez v0, :cond_0

    new-array v0, v4, [Ljava/lang/String;

    goto :goto_0

    .line 956
    :cond_2
    sget-object v0, Lorg/acra/ACRA;->LOG_TAG:Ljava/lang/String;

    const-string v1, "Application files directory does not exist! The application may not be installed correctly. Please try reinstalling."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 958
    new-array v0, v4, [Ljava/lang/String;

    goto :goto_0
.end method

.method public getCustomData(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 252
    iget-object v0, p0, Lorg/acra/ErrorReporter;->mCustomParameters:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public handleException(Ljava/lang/String;)Lorg/acra/ErrorReporter$ReportsSenderWorker;
    .locals 1

    .prologue
    .line 890
    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lorg/acra/ErrorReporter;->handleException(Ljava/lang/String;Z)Lorg/acra/ErrorReporter$ReportsSenderWorker;

    move-result-object v0

    return-object v0
.end method

.method handleException(Ljava/lang/String;Z)Lorg/acra/ErrorReporter$ReportsSenderWorker;
    .locals 7

    .prologue
    const/4 v0, 0x0

    .line 812
    invoke-direct {p0}, Lorg/acra/ErrorReporter;->genCrashReportFileName()Ljava/lang/String;

    move-result-object v5

    .line 817
    :try_start_0
    new-instance v2, Ljava/io/FileOutputStream;

    iget-object v1, p0, Lorg/acra/ErrorReporter;->mContext:Landroid/content/Context;

    invoke-static {v1, v5}, Lorg/acra/ErrorReporter;->fileForName(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 818
    :try_start_1
    invoke-static {v2}, Lorg/acra/CrashReportData;->getWriter(Ljava/io/OutputStream;)Ljava/io/Writer;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_6

    move-result-object v1

    move-object v3, v1

    move-object v4, v2

    .line 826
    :goto_0
    :try_start_2
    sget-object v1, Lorg/acra/ReportField;->ACRA_REPORT_FILENAME:Lorg/acra/ReportField;

    invoke-direct {p0, v1, v5, v3}, Lorg/acra/ErrorReporter;->put(Lorg/acra/ReportField;Ljava/lang/String;Ljava/io/Writer;)V

    .line 827
    invoke-direct {p0, p1, v3}, Lorg/acra/ErrorReporter;->gatherCrashData(Ljava/lang/String;Ljava/io/Writer;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 854
    :try_start_3
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 861
    :goto_1
    if-eqz p2, :cond_0

    .line 864
    new-instance v0, Lorg/acra/ErrorReporter$ReportsSenderWorker;

    iget-boolean v1, p0, Lorg/acra/ErrorReporter;->sendInMemoryReport:Z

    invoke-direct {v0, p0, v1}, Lorg/acra/ErrorReporter$ReportsSenderWorker;-><init>(Lorg/acra/ErrorReporter;Z)V

    .line 865
    sget-object v1, Lorg/acra/ACRA;->LOG_TAG:Ljava/lang/String;

    const-string v2, "About to start ReportSenderWorker from #handleException"

    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 866
    invoke-virtual {v0}, Lorg/acra/ErrorReporter$ReportsSenderWorker;->start()V

    .line 878
    :goto_2
    return-object v0

    .line 819
    :catch_0
    move-exception v1

    move-object v2, v0

    .line 820
    :goto_3
    sget-object v3, Lorg/acra/ACRA;->LOG_TAG:Ljava/lang/String;

    const-string v4, "An error occurred while creating the report file ..."

    invoke-static {v3, v4, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 822
    const/4 v1, 0x1

    iput-boolean v1, p0, Lorg/acra/ErrorReporter;->sendInMemoryReport:Z

    move-object v3, v0

    move-object v4, v2

    goto :goto_0

    .line 855
    :catch_1
    move-exception v1

    .line 856
    sget-object v2, Lorg/acra/ACRA;->LOG_TAG:Ljava/lang/String;

    const-string v3, "An error occurred while deleting closing the report file ..."

    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1

    .line 828
    :catch_2
    move-exception v1

    .line 835
    :try_start_4
    sget-object v2, Lorg/acra/ACRA;->LOG_TAG:Ljava/lang/String;

    const-string v5, "An error occurred while gathering crash data ..."

    invoke-static {v2, v5, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 836
    new-instance v2, Ljava/io/StringWriter;

    invoke-direct {v2}, Ljava/io/StringWriter;-><init>()V

    .line 837
    new-instance v5, Ljava/io/PrintWriter;

    invoke-direct {v5, v2}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 840
    invoke-virtual {v1, v5}, Ljava/lang/Exception;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 841
    sget-object v2, Lorg/acra/ReportField;->ACRA_INTERNAL:Lorg/acra/ReportField;

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {p0, v2, v5, v3}, Lorg/acra/ErrorReporter;->put(Lorg/acra/ReportField;Ljava/lang/String;Ljava/io/Writer;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 850
    :try_start_5
    sget-object v2, Lorg/acra/ACRA;->LOG_TAG:Ljava/lang/String;

    const-string v3, "An error occurred while gathering crash data ..."

    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 854
    :goto_4
    :try_start_6
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3

    goto :goto_1

    .line 855
    :catch_3
    move-exception v1

    .line 856
    sget-object v2, Lorg/acra/ACRA;->LOG_TAG:Ljava/lang/String;

    const-string v3, "An error occurred while deleting closing the report file ..."

    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1

    .line 842
    :catch_4
    move-exception v2

    .line 847
    :try_start_7
    sget-object v5, Lorg/acra/ACRA;->LOG_TAG:Ljava/lang/String;

    const-string v6, "An error occurred while gathering internal crash data ..."

    invoke-static {v5, v6, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 848
    sget-object v2, Lorg/acra/ReportField;->ACRA_INTERNAL:Lorg/acra/ReportField;

    sget-object v5, Lorg/acra/ErrorReporter;->mInternalException:Ljava/lang/String;

    invoke-direct {p0, v2, v5, v3}, Lorg/acra/ErrorReporter;->put(Lorg/acra/ReportField;Ljava/lang/String;Ljava/io/Writer;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 850
    :try_start_8
    sget-object v2, Lorg/acra/ACRA;->LOG_TAG:Ljava/lang/String;

    const-string v3, "An error occurred while gathering crash data ..."

    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    goto :goto_4

    .line 853
    :catchall_0
    move-exception v0

    .line 854
    :try_start_9
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_5

    .line 858
    :goto_5
    throw v0

    .line 850
    :catchall_1
    move-exception v0

    :try_start_a
    sget-object v2, Lorg/acra/ACRA;->LOG_TAG:Ljava/lang/String;

    const-string v3, "An error occurred while gathering crash data ..."

    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 855
    :catch_5
    move-exception v1

    .line 856
    sget-object v2, Lorg/acra/ACRA;->LOG_TAG:Ljava/lang/String;

    const-string v3, "An error occurred while deleting closing the report file ..."

    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_5

    .line 875
    :cond_0
    sget-object v1, Lorg/acra/ACRA;->LOG_TAG:Ljava/lang/String;

    const-string v2, "ACRA caught an OutOfMemoryError. Report upload deferred until next ACRA launch."

    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    .line 819
    :catch_6
    move-exception v1

    goto :goto_3
.end method

.method public handleException(Ljava/lang/Throwable;)Lorg/acra/ErrorReporter$ReportsSenderWorker;
    .locals 2

    .prologue
    .line 793
    instance-of v0, p1, Ljava/lang/OutOfMemoryError;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 794
    :goto_0
    invoke-direct {p0, p1}, Lorg/acra/ErrorReporter;->throwableToString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    .line 795
    invoke-virtual {p0, v1, v0}, Lorg/acra/ErrorReporter;->handleException(Ljava/lang/String;Z)Lorg/acra/ErrorReporter$ReportsSenderWorker;

    move-result-object v0

    return-object v0

    .line 793
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public init(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 420
    iget-object v0, p0, Lorg/acra/ErrorReporter;->mDfltExceptionHandler:Ljava/lang/Thread$UncaughtExceptionHandler;

    if-nez v0, :cond_0

    .line 421
    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v0

    iput-object v0, p0, Lorg/acra/ErrorReporter;->mDfltExceptionHandler:Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 423
    invoke-static {p0}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    .line 424
    iput-object p1, p0, Lorg/acra/ErrorReporter;->mContext:Landroid/content/Context;

    .line 426
    iget-object v0, p0, Lorg/acra/ErrorReporter;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    invoke-static {v0}, Lorg/acra/ConfigurationInspector;->toString(Landroid/content/res/Configuration;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/acra/ErrorReporter;->mInitialConfiguration:Ljava/lang/String;

    .line 427
    new-instance v0, Lorg/acra/util/PackageManagerWrapper;

    invoke-direct {v0, p1}, Lorg/acra/util/PackageManagerWrapper;-><init>(Landroid/content/Context;)V

    .line 428
    invoke-virtual {v0}, Lorg/acra/util/PackageManagerWrapper;->getPackageInfo()Landroid/content/pm/PackageInfo;

    move-result-object v0

    .line 429
    if-eqz v0, :cond_0

    .line 430
    iget v1, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lorg/acra/ErrorReporter;->mAppVersionCode:Ljava/lang/String;

    .line 431
    iget-object v1, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    if-eqz v1, :cond_1

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    :goto_0
    iput-object v0, p0, Lorg/acra/ErrorReporter;->mAppVersionName:Ljava/lang/String;

    .line 434
    :cond_0
    return-void

    .line 431
    :cond_1
    const-string v0, "not set"

    goto :goto_0
.end method

.method public putCustomData(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 222
    if-eqz p2, :cond_0

    .line 223
    iget-object v0, p0, Lorg/acra/ErrorReporter;->mCustomParameters:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 225
    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0, p1}, Lorg/acra/ErrorReporter;->removeCustomData(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public registerActivity(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 1150
    if-eqz p1, :cond_0

    .line 1151
    iget-object v0, p0, Lorg/acra/ErrorReporter;->activityLogger:Lorg/acra/util/SimpleTraceLogger;

    invoke-virtual {v0, p1}, Lorg/acra/util/SimpleTraceLogger;->append(Ljava/lang/String;)V

    .line 1153
    :cond_0
    return-void
.end method

.method public removeAllReportSenders()V
    .locals 1

    .prologue
    .line 1111
    iget-object v0, p0, Lorg/acra/ErrorReporter;->mReportSenders:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1112
    return-void
.end method

.method public removeCustomData(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 239
    iget-object v0, p0, Lorg/acra/ErrorReporter;->mCustomParameters:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method declared-synchronized sendInMemoryReport(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 1013
    monitor-enter p0

    :try_start_0
    sget-object v0, Lorg/acra/ACRA;->LOG_TAG:Ljava/lang/String;

    const-string v1, "Sending in-memory report"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1015
    :try_start_1
    iget-object v0, p0, Lorg/acra/ErrorReporter;->mCrashProperties:Lorg/acra/CrashReportData;

    invoke-direct {p0, v0}, Lorg/acra/ErrorReporter;->sendCrashReport(Lorg/acra/CrashReportData;)V

    .line 1022
    iget-object v0, p0, Lorg/acra/ErrorReporter;->mCrashProperties:Lorg/acra/CrashReportData;

    sget-object v1, Lorg/acra/ReportField;->ACRA_REPORT_FILENAME:Lorg/acra/ReportField;

    invoke-virtual {v0, v1}, Lorg/acra/CrashReportData;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1023
    if-eqz v0, :cond_0

    .line 1024
    invoke-static {p1, v0}, Lorg/acra/ErrorReporter;->fileForName(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    .line 1025
    if-eqz v0, :cond_0

    .line 1026
    invoke-virtual {v0}, Ljava/io/File;->delete()Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1032
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    .line 1029
    :catch_0
    move-exception v0

    .line 1030
    :try_start_2
    sget-object v1, Lorg/acra/ACRA;->LOG_TAG:Ljava/lang/String;

    const-string v2, "Failed to send in-memory crash report: "

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 1013
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public setAppStartDate(Landroid/text/format/Time;)V
    .locals 3

    .prologue
    .line 1140
    iget-object v0, p0, Lorg/acra/ErrorReporter;->mCrashProperties:Lorg/acra/CrashReportData;

    sget-object v1, Lorg/acra/ReportField;->USER_APP_START_DATE:Lorg/acra/ReportField;

    const/4 v2, 0x0

    invoke-virtual {p1, v2}, Landroid/text/format/Time;->format3339(Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/acra/CrashReportData;->put(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1141
    return-void
.end method

.method public setMaxReportSize(J)V
    .locals 0

    .prologue
    .line 1120
    iput-wide p1, p0, Lorg/acra/ErrorReporter;->mMaxReportSize:J

    .line 1121
    return-void
.end method

.method public setReportSender(Lorg/acra/sender/ReportSender;)V
    .locals 0

    .prologue
    .line 1129
    invoke-virtual {p0}, Lorg/acra/ErrorReporter;->removeAllReportSenders()V

    .line 1130
    invoke-virtual {p0, p1}, Lorg/acra/ErrorReporter;->addReportSender(Lorg/acra/sender/ReportSender;)V

    .line 1131
    return-void
.end method

.method public uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 4

    .prologue
    .line 686
    sget-object v0, Lorg/acra/ACRA;->LOG_TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ACRA caught a "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " exception for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lorg/acra/ErrorReporter;->mContext:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ". Building report."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 691
    instance-of v0, p2, Ljava/lang/SecurityException;

    if-eqz v0, :cond_0

    .line 692
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/acra/ErrorReporter;->forceDump:Z

    .line 696
    :cond_0
    iget-object v0, p0, Lorg/acra/ErrorReporter;->mCrashProperties:Lorg/acra/CrashReportData;

    sget-object v1, Lorg/acra/ReportField;->IS_SILENT:Lorg/acra/ReportField;

    invoke-virtual {v0, v1}, Lorg/acra/CrashReportData;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 699
    invoke-virtual {p0, p2}, Lorg/acra/ErrorReporter;->handleException(Ljava/lang/Throwable;)Lorg/acra/ErrorReporter$ReportsSenderWorker;

    move-result-object v0

    .line 701
    if-eqz v0, :cond_1

    .line 702
    :goto_0
    invoke-virtual {v0}, Lorg/acra/ErrorReporter$ReportsSenderWorker;->isAlive()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 706
    const-wide/16 v1, 0x64

    :try_start_0
    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 707
    :catch_0
    move-exception v1

    .line 708
    sget-object v2, Lorg/acra/ACRA;->LOG_TAG:Ljava/lang/String;

    const-string v3, "Error : "

    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    .line 713
    :cond_1
    iget-object v0, p0, Lorg/acra/ErrorReporter;->mDfltExceptionHandler:Ljava/lang/Thread$UncaughtExceptionHandler;

    if-eqz v0, :cond_2

    .line 714
    iget-object v0, p0, Lorg/acra/ErrorReporter;->mDfltExceptionHandler:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-interface {v0, p1, p2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 716
    :cond_2
    return-void
.end method

.method public writeReportToStream(Ljava/lang/Throwable;Ljava/io/OutputStream;)V
    .locals 4

    .prologue
    .line 777
    :try_start_0
    invoke-static {p2}, Lorg/acra/CrashReportData;->getWriter(Ljava/io/OutputStream;)Ljava/io/Writer;

    move-result-object v0

    .line 778
    invoke-direct {p0, p1}, Lorg/acra/ErrorReporter;->throwableToString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    .line 779
    invoke-direct {p0, v1, v0}, Lorg/acra/ErrorReporter;->gatherCrashData(Ljava/lang/String;Ljava/io/Writer;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 783
    :goto_0
    return-void

    .line 780
    :catch_0
    move-exception v0

    .line 781
    const-string v1, "ACRA"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Crash in writeReportToStream:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method
