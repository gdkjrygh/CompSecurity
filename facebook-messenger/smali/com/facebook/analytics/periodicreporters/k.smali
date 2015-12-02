.class public Lcom/facebook/analytics/periodicreporters/k;
.super Ljava/lang/Object;
.source "DeviceStatusPeriodicReporter.java"

# interfaces
.implements Lcom/facebook/analytics/periodicreporters/l;


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private static final b:Lcom/facebook/prefs/shared/ae;


# instance fields
.field private final c:Landroid/content/Context;

.field private final d:Lcom/facebook/base/a/d;

.field private final e:Lcom/facebook/prefs/shared/d;

.field private final f:Landroid/telephony/TelephonyManager;

.field private final g:Lcom/facebook/common/hardware/k;

.field private final h:Lcom/facebook/e/c;

.field private final i:Lcom/facebook/analytics/ak;

.field private final j:Lcom/facebook/common/hardware/a;

.field private final k:Landroid/content/pm/PackageManager;

.field private final l:Lcom/facebook/common/e/h;

.field private final m:Lcom/facebook/analytics/i/a;

.field private n:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 52
    const-class v0, Lcom/facebook/analytics/periodicreporters/k;

    sput-object v0, Lcom/facebook/analytics/periodicreporters/k;->a:Ljava/lang/Class;

    .line 56
    const-string v0, "fbandroid_optional_analytics"

    invoke-static {v0}, Lcom/facebook/f/n;->a(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v0

    sput-object v0, Lcom/facebook/analytics/periodicreporters/k;->b:Lcom/facebook/prefs/shared/ae;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/base/a/d;Lcom/facebook/prefs/shared/d;Landroid/telephony/TelephonyManager;Landroid/content/pm/PackageManager;Lcom/facebook/common/hardware/k;Lcom/facebook/e/c;Lcom/facebook/common/hardware/a;Lcom/facebook/analytics/ak;Lcom/facebook/common/e/h;Lcom/facebook/analytics/i/a;)V
    .locals 2

    .prologue
    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/facebook/analytics/periodicreporters/k;->n:J

    .line 85
    iput-object p1, p0, Lcom/facebook/analytics/periodicreporters/k;->c:Landroid/content/Context;

    .line 86
    iput-object p2, p0, Lcom/facebook/analytics/periodicreporters/k;->d:Lcom/facebook/base/a/d;

    .line 87
    iput-object p3, p0, Lcom/facebook/analytics/periodicreporters/k;->e:Lcom/facebook/prefs/shared/d;

    .line 88
    iput-object p10, p0, Lcom/facebook/analytics/periodicreporters/k;->l:Lcom/facebook/common/e/h;

    .line 89
    iput-object p4, p0, Lcom/facebook/analytics/periodicreporters/k;->f:Landroid/telephony/TelephonyManager;

    .line 90
    iput-object p6, p0, Lcom/facebook/analytics/periodicreporters/k;->g:Lcom/facebook/common/hardware/k;

    .line 91
    iput-object p7, p0, Lcom/facebook/analytics/periodicreporters/k;->h:Lcom/facebook/e/c;

    .line 92
    iput-object p9, p0, Lcom/facebook/analytics/periodicreporters/k;->i:Lcom/facebook/analytics/ak;

    .line 93
    iput-object p8, p0, Lcom/facebook/analytics/periodicreporters/k;->j:Lcom/facebook/common/hardware/a;

    .line 94
    iput-object p5, p0, Lcom/facebook/analytics/periodicreporters/k;->k:Landroid/content/pm/PackageManager;

    .line 95
    iput-object p11, p0, Lcom/facebook/analytics/periodicreporters/k;->m:Lcom/facebook/analytics/i/a;

    .line 96
    return-void
.end method

.method private a()J
    .locals 4

    .prologue
    .line 116
    iget-object v0, p0, Lcom/facebook/analytics/periodicreporters/k;->e:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/prefs/shared/aj;->l:Lcom/facebook/prefs/shared/ae;

    const-wide/32 v2, 0x1d4c0

    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;J)J

    move-result-wide v0

    return-wide v0
.end method

.method private a(Lcom/facebook/analytics/cb;)V
    .locals 9

    .prologue
    const-wide/32 v7, 0x100000

    .line 214
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    .line 219
    invoke-virtual {v0}, Ljava/lang/Runtime;->maxMemory()J

    move-result-wide v1

    .line 220
    invoke-virtual {v0}, Ljava/lang/Runtime;->totalMemory()J

    move-result-wide v3

    invoke-virtual {v0}, Ljava/lang/Runtime;->freeMemory()J

    move-result-wide v5

    sub-long/2addr v3, v5

    .line 221
    sub-long v3, v1, v3

    .line 223
    const-string v5, "free_mem"

    div-long/2addr v3, v7

    invoke-virtual {p1, v5, v3, v4}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;J)Lcom/facebook/analytics/cb;

    .line 224
    const-string v3, "total_mem"

    div-long/2addr v1, v7

    invoke-virtual {p1, v3, v1, v2}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;J)Lcom/facebook/analytics/cb;

    .line 225
    const-string v1, "core_count"

    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v0

    invoke-virtual {p1, v1, v0}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    .line 226
    return-void
.end method

.method private a(Lcom/fasterxml/jackson/databind/node/ObjectNode;Ljava/lang/Class;Ljava/lang/Object;I)V
    .locals 17

    .prologue
    .line 317
    :try_start_0
    const-string v1, "com.android.internal.os.PowerProfile"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    .line 318
    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Class;

    const/4 v3, 0x0

    const-class v4, Landroid/content/Context;

    aput-object v4, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/facebook/analytics/periodicreporters/k;->c:Landroid/content/Context;

    aput-object v5, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 320
    const-string v3, "getNumSpeedSteps"

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Class;

    invoke-virtual {v1, v3, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 322
    new-instance v5, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v1, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v5, v1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 323
    const-string v1, "com.android.internal.os.BatteryStatsImpl$Uid$Proc"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    .line 324
    const-string v1, "getProcessStats"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Class;

    move-object/from16 v0, p2

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    move-object/from16 v0, p3

    invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    .line 326
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 328
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    .line 329
    const-wide/16 v9, 0xa

    const-string v2, "getUserTime"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Class;

    const/4 v11, 0x0

    sget-object v12, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v12, v3, v11

    invoke-virtual {v6, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v11, 0x0

    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    aput-object v12, v3, v11

    invoke-virtual {v2, v8, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    mul-long/2addr v9, v2

    .line 331
    const-wide/16 v11, 0xa

    const-string v2, "getSystemTime"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Class;

    const/4 v13, 0x0

    sget-object v14, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v14, v3, v13

    invoke-virtual {v6, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v13, 0x0

    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    aput-object v14, v3, v13

    invoke-virtual {v2, v8, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    mul-long/2addr v11, v2

    .line 333
    const-wide/16 v13, 0xa

    const-string v2, "getForegroundTime"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Class;

    const/4 v15, 0x0

    sget-object v16, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v16, v3, v15

    invoke-virtual {v6, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v15, 0x0

    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v16

    aput-object v16, v3, v15

    invoke-virtual {v2, v8, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    mul-long/2addr v2, v13

    .line 335
    new-instance v13, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v14, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v13, v14}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 336
    const-string v14, "user_time_ms"

    invoke-virtual {v13, v14, v9, v10}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;J)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 337
    const-string v9, "system_time_ms"

    invoke-virtual {v13, v9, v11, v12}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;J)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 338
    const-string v9, "foreground_time_ms"

    invoke-virtual {v13, v9, v2, v3}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;J)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 341
    new-instance v9, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v2, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v9, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 342
    const/4 v2, 0x0

    move v3, v2

    :goto_1
    if-ge v3, v4, :cond_0

    .line 343
    const-string v2, "getTimeAtCpuSpeedStep"

    const/4 v10, 0x2

    new-array v10, v10, [Ljava/lang/Class;

    const/4 v11, 0x0

    sget-object v12, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v12, v10, v11

    const/4 v11, 0x1

    sget-object v12, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v12, v10, v11

    invoke-virtual {v6, v2, v10}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    const/4 v10, 0x2

    new-array v10, v10, [Ljava/lang/Object;

    const/4 v11, 0x0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    aput-object v12, v10, v11

    const/4 v11, 0x1

    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    aput-object v12, v10, v11

    invoke-virtual {v2, v8, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    .line 346
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v12, ""

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v9, v2, v10, v11}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;J)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 342
    add-int/lit8 v2, v3, 0x1

    move v3, v2

    goto :goto_1

    .line 348
    :cond_0
    const-string v2, "relative_time_at_speeds"

    invoke-virtual {v13, v2, v9}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/JsonNode;

    .line 350
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v5, v1, v13}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/JsonNode;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    .line 353
    :catch_0
    move-exception v1

    .line 354
    const-string v2, "Failed to extract process stats"

    move-object/from16 v0, p0

    invoke-direct {v0, v1, v2}, Lcom/facebook/analytics/periodicreporters/k;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 356
    :goto_2
    return-void

    .line 352
    :cond_1
    :try_start_1
    const-string v1, "proc_cpu"

    move-object/from16 v0, p1

    invoke-virtual {v0, v1, v5}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/JsonNode;
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2
.end method

.method private a(Lcom/fasterxml/jackson/databind/node/ObjectNode;Ljava/lang/Class;Ljava/lang/Object;IJ)V
    .locals 10

    .prologue
    .line 365
    :try_start_0
    const-string v0, "com.android.internal.os.BatteryStatsImpl$Uid$Wakelock"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    .line 366
    const-string v0, "com.android.internal.os.BatteryStatsImpl$Timer"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    .line 367
    const-string v0, "getWakelockStats"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Class;

    invoke-virtual {p2, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, p3, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    .line 368
    const-wide/16 v1, 0x0

    .line 369
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 370
    const-string v6, "getWakeTime"

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Class;

    const/4 v8, 0x0

    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v9, v7, v8

    invoke-virtual {v3, v6, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    aput-object v9, v7, v8

    invoke-virtual {v6, v0, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 374
    if-eqz v0, :cond_1

    .line 375
    const-string v6, "getTotalTimeLocked"

    const/4 v7, 0x2

    new-array v7, v7, [Ljava/lang/Class;

    const/4 v8, 0x0

    sget-object v9, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    aput-object v9, v7, v8

    const/4 v8, 0x1

    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v9, v7, v8

    invoke-virtual {v4, v6, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    const/4 v7, 0x2

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v8, 0x0

    invoke-static/range {p5 .. p6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    aput-object v9, v7, v8

    const/4 v8, 0x1

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    aput-object v9, v7, v8

    invoke-virtual {v6, v0, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    add-long v0, v1, v6

    :goto_1
    move-wide v1, v0

    .line 379
    goto :goto_0

    .line 380
    :cond_0
    const-wide/16 v3, 0x3e8

    div-long v0, v1, v3

    .line 381
    const-string v2, "wake_lock_time_ms"

    invoke-virtual {p1, v2, v0, v1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;J)Lcom/fasterxml/jackson/databind/node/ObjectNode;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 385
    :goto_2
    return-void

    .line 382
    :catch_0
    move-exception v0

    .line 383
    const-string v1, "Failed to extract wakelock stats"

    invoke-direct {p0, v0, v1}, Lcom/facebook/analytics/periodicreporters/k;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    goto :goto_2

    :cond_1
    move-wide v0, v1

    goto :goto_1
.end method

.method private a(Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 5

    .prologue
    .line 305
    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 306
    new-instance v1, Ljava/io/PrintWriter;

    invoke-direct {v1, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    invoke-virtual {p1, v1}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 307
    sget-object v1, Lcom/facebook/analytics/periodicreporters/k;->a:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    .line 308
    iget-object v1, p0, Lcom/facebook/analytics/periodicreporters/k;->l:Lcom/facebook/common/e/h;

    const-string v2, "BatteryLogger"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ": "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 309
    return-void
.end method

.method private b(Lcom/facebook/analytics/cb;)V
    .locals 14

    .prologue
    const-wide/16 v12, 0x3e8

    const/4 v4, 0x0

    const/4 v3, 0x0

    .line 229
    new-instance v1, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v0, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v1, v0}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 231
    :try_start_0
    const-string v0, "com.android.internal.app.IBatteryStats"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    .line 232
    const-string v0, "com.android.internal.app.IBatteryStats$Stub"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    .line 233
    const-string v0, "android.os.ServiceManager"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 234
    const-string v2, "com.android.internal.os.BatteryStatsImpl"

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    .line 235
    const-string v2, "com.android.internal.os.BatteryStatsImpl$Uid"

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    .line 239
    const-string v8, "getService"

    const/4 v9, 0x1

    new-array v9, v9, [Ljava/lang/Class;

    const/4 v10, 0x0

    const-class v11, Ljava/lang/String;

    aput-object v11, v9, v10

    invoke-virtual {v0, v8, v9}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v8, 0x0

    const/4 v9, 0x1

    new-array v9, v9, [Ljava/lang/Object;

    const/4 v10, 0x0

    const-string v11, "batteryinfo"

    aput-object v11, v9, v10

    invoke-virtual {v0, v8, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/IBinder;

    .line 242
    const-string v8, "asInterface"

    const/4 v9, 0x1

    new-array v9, v9, [Ljava/lang/Class;

    const/4 v10, 0x0

    const-class v11, Landroid/os/IBinder;

    aput-object v11, v9, v10

    invoke-virtual {v6, v8, v9}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    const/4 v8, 0x0

    const/4 v9, 0x1

    new-array v9, v9, [Ljava/lang/Object;

    const/4 v10, 0x0

    aput-object v0, v9, v10

    invoke-virtual {v6, v8, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 246
    const-string v6, "getStatistics"

    const/4 v8, 0x0

    new-array v8, v8, [Ljava/lang/Class;

    invoke-virtual {v5, v6, v8}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    const/4 v6, 0x0

    new-array v6, v6, [Ljava/lang/Object;

    invoke-virtual {v5, v0, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    check-cast v0, [B

    .line 249
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v5

    .line 250
    const/4 v6, 0x0

    array-length v8, v0

    invoke-virtual {v5, v0, v6, v8}, Landroid/os/Parcel;->unmarshall([BII)V

    .line 251
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 252
    const-string v0, "CREATOR"

    invoke-virtual {v7, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v6, 0x0

    invoke-virtual {v0, v6}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Parcelable$Creator;

    .line 255
    invoke-interface {v0, v5}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v8

    .line 258
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v5

    mul-long/2addr v5, v12

    .line 259
    const-string v0, "computeBatteryRealtime"

    const/4 v9, 0x2

    new-array v9, v9, [Ljava/lang/Class;

    const/4 v10, 0x0

    sget-object v11, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    aput-object v11, v9, v10

    const/4 v10, 0x1

    sget-object v11, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v11, v9, v10

    invoke-virtual {v7, v0, v9}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v9, 0x2

    new-array v9, v9, [Ljava/lang/Object;

    const/4 v10, 0x0

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v9, v10

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v9, v5

    invoke-virtual {v0, v8, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    .line 262
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v9

    mul-long/2addr v9, v12

    .line 263
    const-string v0, "computeBatteryUptime"

    const/4 v11, 0x2

    new-array v11, v11, [Ljava/lang/Class;

    const/4 v12, 0x0

    sget-object v13, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    aput-object v13, v11, v12

    const/4 v12, 0x1

    sget-object v13, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v13, v11, v12

    invoke-virtual {v7, v0, v11}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v11, 0x2

    new-array v11, v11, [Ljava/lang/Object;

    const/4 v12, 0x0

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    aput-object v9, v11, v12

    const/4 v9, 0x1

    const/4 v10, 0x0

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v11, v9

    invoke-virtual {v0, v8, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    const-wide/16 v11, 0x3e8

    div-long/2addr v9, v11

    .line 266
    const-string v0, "total_time_ms"

    const-wide/16 v11, 0x3e8

    div-long v11, v5, v11

    invoke-virtual {v1, v0, v11, v12}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;J)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 267
    const-string v0, "wake_time_ms"

    invoke-virtual {v1, v0, v9, v10}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;J)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 269
    const-string v0, "distributeWorkLocked"

    const/4 v9, 0x1

    new-array v9, v9, [Ljava/lang/Class;

    const/4 v10, 0x0

    sget-object v11, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v11, v9, v10

    invoke-virtual {v7, v0, v9}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v9, 0x1

    new-array v9, v9, [Ljava/lang/Object;

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    aput-object v11, v9, v10

    invoke-virtual {v0, v8, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 271
    const-string v0, "getUidStats"

    const/4 v9, 0x0

    new-array v9, v9, [Ljava/lang/Class;

    invoke-virtual {v7, v0, v9}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v7, 0x0

    new-array v7, v7, [Ljava/lang/Object;

    invoke-virtual {v0, v8, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/SparseArray;

    .line 275
    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v8

    move v7, v3

    move-object v3, v4

    .line 277
    :goto_0
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v4

    if-ge v7, v4, :cond_1

    .line 278
    invoke-virtual {v0, v7}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v4

    .line 279
    const-string v3, "getUid"

    const/4 v9, 0x0

    new-array v9, v9, [Ljava/lang/Class;

    invoke-virtual {v2, v3, v9}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    const/4 v9, 0x0

    new-array v9, v9, [Ljava/lang/Object;

    invoke-virtual {v3, v4, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 280
    if-eq v3, v8, :cond_0

    .line 277
    add-int/lit8 v3, v7, 0x1

    move v7, v3

    move-object v3, v4

    goto :goto_0

    :cond_0
    move-object v3, v4

    .line 286
    :cond_1
    if-nez v3, :cond_2

    .line 288
    iget-object v0, p0, Lcom/facebook/analytics/periodicreporters/k;->l:Lcom/facebook/common/e/h;

    const-string v1, "BatteryLogger"

    const-string v2, "Failed to find Uid"

    invoke-interface {v0, v1, v2}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 302
    :goto_1
    return-void

    .line 292
    :cond_2
    const/4 v0, 0x0

    invoke-direct {p0, v1, v2, v3, v0}, Lcom/facebook/analytics/periodicreporters/k;->a(Lcom/fasterxml/jackson/databind/node/ObjectNode;Ljava/lang/Class;Ljava/lang/Object;I)V

    .line 293
    const/4 v4, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/facebook/analytics/periodicreporters/k;->a(Lcom/fasterxml/jackson/databind/node/ObjectNode;Ljava/lang/Class;Ljava/lang/Object;IJ)V

    .line 294
    const/4 v0, 0x0

    invoke-direct {p0, v1, v2, v3, v0}, Lcom/facebook/analytics/periodicreporters/k;->b(Lcom/fasterxml/jackson/databind/node/ObjectNode;Ljava/lang/Class;Ljava/lang/Object;I)V

    .line 295
    const/4 v4, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/facebook/analytics/periodicreporters/k;->b(Lcom/fasterxml/jackson/databind/node/ObjectNode;Ljava/lang/Class;Ljava/lang/Object;IJ)V

    .line 297
    const-string v0, "detailed_battery"

    invoke-virtual {p1, v0, v1}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/analytics/cb;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 298
    :catch_0
    move-exception v0

    .line 300
    const-string v1, "Error in Initialization"

    invoke-direct {p0, v0, v1}, Lcom/facebook/analytics/periodicreporters/k;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    goto :goto_1
.end method

.method private b(Lcom/fasterxml/jackson/databind/node/ObjectNode;Ljava/lang/Class;Ljava/lang/Object;I)V
    .locals 6

    .prologue
    .line 393
    :try_start_0
    const-string v0, "getTcpBytesReceived"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Class;

    const/4 v2, 0x0

    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v3, v1, v2

    invoke-virtual {p2, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-virtual {v0, p3, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    .line 395
    const-string v0, "getTcpBytesSent"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Class;

    const/4 v4, 0x0

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v5, v3, v4

    invoke-virtual {p2, v0, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-virtual {v0, p3, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    .line 397
    const-string v0, "tcp_bytes_recvd"

    invoke-virtual {p1, v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;J)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 398
    const-string v0, "tcp_bytes_sent"

    invoke-virtual {p1, v0, v3, v4}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;J)Lcom/fasterxml/jackson/databind/node/ObjectNode;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 402
    :goto_0
    return-void

    .line 399
    :catch_0
    move-exception v0

    .line 400
    const-string v1, "Failed to extract data stats"

    invoke-direct {p0, v0, v1}, Lcom/facebook/analytics/periodicreporters/k;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    goto :goto_0
.end method

.method private b(Lcom/fasterxml/jackson/databind/node/ObjectNode;Ljava/lang/Class;Ljava/lang/Object;IJ)V
    .locals 11

    .prologue
    .line 411
    :try_start_0
    const-string v0, "com.android.internal.os.BatteryStatsImpl$Uid$Sensor"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    .line 412
    const-string v0, "com.android.internal.os.BatteryStatsImpl$Timer"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    .line 413
    const-string v0, "getSensorStats"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Class;

    invoke-virtual {p2, v0, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v0, p3, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    .line 416
    new-instance v3, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v4, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v3, v4}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 417
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 418
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    .line 419
    const-string v0, "getHandle"

    const/4 v6, 0x0

    new-array v6, v6, [Ljava/lang/Class;

    invoke-virtual {v1, v0, v6}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v6, 0x0

    new-array v6, v6, [Ljava/lang/Object;

    invoke-virtual {v0, v5, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v6

    .line 420
    const-string v0, "getSensorTime"

    const/4 v7, 0x0

    new-array v7, v7, [Ljava/lang/Class;

    invoke-virtual {v1, v0, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v7, 0x0

    new-array v7, v7, [Ljava/lang/Object;

    invoke-virtual {v0, v5, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 423
    const-string v5, "getTotalTimeLocked"

    const/4 v7, 0x2

    new-array v7, v7, [Ljava/lang/Class;

    const/4 v8, 0x0

    sget-object v9, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    aput-object v9, v7, v8

    const/4 v8, 0x1

    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v9, v7, v8

    invoke-virtual {v2, v5, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    const/4 v7, 0x2

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v8, 0x0

    invoke-static/range {p5 .. p6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    aput-object v9, v7, v8

    const/4 v8, 0x1

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    aput-object v9, v7, v8

    invoke-virtual {v5, v0, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    const-wide/16 v9, 0x3e8

    div-long/2addr v7, v9

    .line 426
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v5, ""

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0, v7, v8}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;J)Lcom/fasterxml/jackson/databind/node/ObjectNode;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 430
    :catch_0
    move-exception v0

    .line 431
    const-string v1, "Failed to extract sensor stats"

    invoke-direct {p0, v0, v1}, Lcom/facebook/analytics/periodicreporters/k;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 433
    :goto_1
    return-void

    .line 428
    :cond_0
    :try_start_1
    const-string v0, "sensor_times_ms"

    invoke-virtual {p1, v0, v3}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/JsonNode;
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1
.end method

.method private b()Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 190
    .line 191
    iget-object v1, p0, Lcom/facebook/analytics/periodicreporters/k;->i:Lcom/facebook/analytics/ak;

    invoke-interface {v1}, Lcom/facebook/analytics/ak;->b()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 192
    const/4 v0, 0x1

    .line 203
    :cond_0
    :goto_0
    if-eqz v0, :cond_2

    .line 204
    sget-object v1, Lcom/facebook/analytics/periodicreporters/k;->a:Ljava/lang/Class;

    const-string v2, "This user is selected for OPTIONAL logging!"

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 209
    :goto_1
    return v0

    .line 194
    :cond_1
    iget-object v1, p0, Lcom/facebook/analytics/periodicreporters/k;->e:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/analytics/periodicreporters/k;->b:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 198
    iget-object v1, p0, Lcom/facebook/analytics/periodicreporters/k;->e:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/analytics/periodicreporters/k;->b:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v1, v2, v0}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v0

    goto :goto_0

    .line 206
    :cond_2
    sget-object v1, Lcom/facebook/analytics/periodicreporters/k;->a:Ljava/lang/Class;

    const-string v2, "This user is NOT selected for OPTIONAL logging!"

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_1
.end method


# virtual methods
.method public a(Lcom/facebook/analytics/cb;J)Lcom/facebook/analytics/cb;
    .locals 3

    .prologue
    .line 138
    invoke-virtual {p1, p2, p3}, Lcom/facebook/analytics/cb;->a(J)Lcom/facebook/analytics/ca;

    .line 140
    const-string v0, "carrier"

    iget-object v1, p0, Lcom/facebook/analytics/periodicreporters/k;->f:Landroid/telephony/TelephonyManager;

    invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getNetworkOperatorName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 141
    const-string v0, "carrier_country_iso"

    iget-object v1, p0, Lcom/facebook/analytics/periodicreporters/k;->f:Landroid/telephony/TelephonyManager;

    invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getNetworkCountryIso()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 142
    const-string v0, "network_type"

    iget-object v1, p0, Lcom/facebook/analytics/periodicreporters/k;->f:Landroid/telephony/TelephonyManager;

    invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getNetworkType()I

    move-result v1

    invoke-static {v1}, Lcom/facebook/common/hardware/z;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 144
    const-string v0, "phone_type"

    iget-object v1, p0, Lcom/facebook/analytics/periodicreporters/k;->f:Landroid/telephony/TelephonyManager;

    invoke-static {v1}, Lcom/facebook/common/hardware/z;->b(Landroid/telephony/TelephonyManager;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 146
    const-string v0, "locale"

    iget-object v1, p0, Lcom/facebook/analytics/periodicreporters/k;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 149
    const-string v0, "sim_country_iso"

    iget-object v1, p0, Lcom/facebook/analytics/periodicreporters/k;->f:Landroid/telephony/TelephonyManager;

    invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getSimCountryIso()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 150
    iget-object v0, p0, Lcom/facebook/analytics/periodicreporters/k;->f:Landroid/telephony/TelephonyManager;

    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getSimState()I

    move-result v0

    iget-object v1, p0, Lcom/facebook/analytics/periodicreporters/k;->f:Landroid/telephony/TelephonyManager;

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    .line 151
    const-string v0, "sim_operator"

    iget-object v1, p0, Lcom/facebook/analytics/periodicreporters/k;->f:Landroid/telephony/TelephonyManager;

    invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getSimOperatorName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 154
    :cond_0
    const-string v0, "battery"

    iget-object v1, p0, Lcom/facebook/analytics/periodicreporters/k;->j:Lcom/facebook/common/hardware/a;

    invoke-interface {v1}, Lcom/facebook/common/hardware/a;->a()F

    move-result v1

    float-to-double v1, v1

    invoke-virtual {p1, v0, v1, v2}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;D)Lcom/facebook/analytics/cb;

    .line 155
    const-string v0, "charge_state"

    iget-object v1, p0, Lcom/facebook/analytics/periodicreporters/k;->j:Lcom/facebook/common/hardware/a;

    invoke-interface {v1}, Lcom/facebook/common/hardware/a;->b()Lcom/facebook/common/hardware/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/common/hardware/c;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 157
    const-string v0, "battery_health"

    iget-object v1, p0, Lcom/facebook/analytics/periodicreporters/k;->j:Lcom/facebook/common/hardware/a;

    invoke-interface {v1}, Lcom/facebook/common/hardware/a;->c()Lcom/facebook/common/hardware/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/common/hardware/d;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 160
    const-string v0, "wifi_enabled"

    iget-object v1, p0, Lcom/facebook/analytics/periodicreporters/k;->h:Lcom/facebook/e/c;

    invoke-virtual {v1}, Lcom/facebook/e/c;->b()Z

    move-result v1

    invoke-virtual {p1, v0, v1}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Z)Lcom/facebook/analytics/cb;

    .line 162
    iget-object v0, p0, Lcom/facebook/analytics/periodicreporters/k;->m:Lcom/facebook/analytics/i/a;

    invoke-virtual {v0, p1}, Lcom/facebook/analytics/i/a;->a(Lcom/facebook/analytics/cb;)V

    .line 163
    invoke-direct {p0, p1}, Lcom/facebook/analytics/periodicreporters/k;->a(Lcom/facebook/analytics/cb;)V

    .line 164
    iget-object v0, p0, Lcom/facebook/analytics/periodicreporters/k;->m:Lcom/facebook/analytics/i/a;

    iget-object v1, p0, Lcom/facebook/analytics/periodicreporters/k;->g:Lcom/facebook/common/hardware/k;

    invoke-virtual {v1}, Lcom/facebook/common/hardware/k;->c()Landroid/net/NetworkInfo;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/facebook/analytics/i/a;->a(Landroid/net/NetworkInfo;Lcom/facebook/analytics/cb;)V

    .line 166
    iget-object v0, p0, Lcom/facebook/analytics/periodicreporters/k;->m:Lcom/facebook/analytics/i/a;

    invoke-virtual {v0, p1}, Lcom/facebook/analytics/i/a;->e(Lcom/facebook/analytics/cb;)V

    .line 169
    iget-object v0, p0, Lcom/facebook/analytics/periodicreporters/k;->i:Lcom/facebook/analytics/ak;

    invoke-interface {v0}, Lcom/facebook/analytics/ak;->a()Lcom/facebook/analytics/al;

    move-result-object v0

    sget-object v1, Lcom/facebook/analytics/al;->CORE_AND_SAMPLED:Lcom/facebook/analytics/al;

    if-ne v0, v1, :cond_1

    .line 170
    iget-object v0, p0, Lcom/facebook/analytics/periodicreporters/k;->m:Lcom/facebook/analytics/i/a;

    invoke-virtual {v0, p1}, Lcom/facebook/analytics/i/a;->b(Lcom/facebook/analytics/cb;)V

    .line 171
    iget-object v0, p0, Lcom/facebook/analytics/periodicreporters/k;->m:Lcom/facebook/analytics/i/a;

    invoke-virtual {v0, p1}, Lcom/facebook/analytics/i/a;->c(Lcom/facebook/analytics/cb;)V

    .line 172
    iget-object v0, p0, Lcom/facebook/analytics/periodicreporters/k;->m:Lcom/facebook/analytics/i/a;

    invoke-virtual {v0, p1}, Lcom/facebook/analytics/i/a;->d(Lcom/facebook/analytics/cb;)V

    .line 175
    :cond_1
    invoke-direct {p0}, Lcom/facebook/analytics/periodicreporters/k;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 176
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x9

    if-lt v0, v1, :cond_2

    iget-object v0, p0, Lcom/facebook/analytics/periodicreporters/k;->k:Landroid/content/pm/PackageManager;

    const-string v1, "android.permission.BATTERY_STATS"

    iget-object v2, p0, Lcom/facebook/analytics/periodicreporters/k;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_2

    .line 179
    invoke-direct {p0, p1}, Lcom/facebook/analytics/periodicreporters/k;->b(Lcom/facebook/analytics/cb;)V

    .line 185
    :cond_2
    return-object p1
.end method

.method public a(JLjava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List",
            "<+",
            "Lcom/facebook/analytics/ca;",
            ">;"
        }
    .end annotation

    .prologue
    .line 111
    iput-wide p1, p0, Lcom/facebook/analytics/periodicreporters/k;->n:J

    .line 112
    invoke-virtual {p0, p1, p2}, Lcom/facebook/analytics/periodicreporters/k;->b(J)Lcom/facebook/analytics/ca;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public a(J)Z
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 101
    iget-object v1, p0, Lcom/facebook/analytics/periodicreporters/k;->d:Lcom/facebook/base/a/d;

    invoke-virtual {v1}, Lcom/facebook/base/a/d;->c()Z

    move-result v1

    if-nez v1, :cond_1

    .line 104
    :cond_0
    :goto_0
    return v0

    :cond_1
    iget-wide v1, p0, Lcom/facebook/analytics/periodicreporters/k;->n:J

    sub-long v1, p1, v1

    invoke-direct {p0}, Lcom/facebook/analytics/periodicreporters/k;->a()J

    move-result-wide v3

    cmp-long v1, v1, v3

    if-lez v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method b(J)Lcom/facebook/analytics/ca;
    .locals 2

    .prologue
    .line 127
    new-instance v0, Lcom/facebook/analytics/cb;

    const-string v1, "device_status"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    .line 128
    invoke-virtual {p0, v0, p1, p2}, Lcom/facebook/analytics/periodicreporters/k;->a(Lcom/facebook/analytics/cb;J)Lcom/facebook/analytics/cb;

    .line 129
    const-string v1, "device"

    invoke-virtual {v0, v1}, Lcom/facebook/analytics/cb;->e(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 130
    return-object v0
.end method
