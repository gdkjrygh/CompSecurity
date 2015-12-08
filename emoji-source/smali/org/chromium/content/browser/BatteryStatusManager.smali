.class Lorg/chromium/content/browser/BatteryStatusManager;
.super Ljava/lang/Object;
.source "BatteryStatusManager.java"


# annotations
.annotation runtime Lorg/chromium/base/JNINamespace;
    value = "content"
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "BatteryStatusManager"


# instance fields
.field private final mAppContext:Landroid/content/Context;

.field private mEnabled:Z

.field private final mFilter:Landroid/content/IntentFilter;

.field private mNativePtr:J

.field private final mNativePtrLock:Ljava/lang/Object;

.field private final mReceiver:Landroid/content/BroadcastReceiver;


# direct methods
.method protected constructor <init>(Landroid/content/Context;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "android.intent.action.BATTERY_CHANGED"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lorg/chromium/content/browser/BatteryStatusManager;->mFilter:Landroid/content/IntentFilter;

    .line 30
    new-instance v0, Lorg/chromium/content/browser/BatteryStatusManager$1;

    invoke-direct {v0, p0}, Lorg/chromium/content/browser/BatteryStatusManager$1;-><init>(Lorg/chromium/content/browser/BatteryStatusManager;)V

    iput-object v0, p0, Lorg/chromium/content/browser/BatteryStatusManager;->mReceiver:Landroid/content/BroadcastReceiver;

    .line 41
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lorg/chromium/content/browser/BatteryStatusManager;->mNativePtrLock:Ljava/lang/Object;

    .line 43
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/chromium/content/browser/BatteryStatusManager;->mEnabled:Z

    .line 46
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lorg/chromium/content/browser/BatteryStatusManager;->mAppContext:Landroid/content/Context;

    .line 47
    return-void
.end method

.method static getInstance(Landroid/content/Context;)Lorg/chromium/content/browser/BatteryStatusManager;
    .locals 1
    .param p0, "appContext"    # Landroid/content/Context;
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 51
    new-instance v0, Lorg/chromium/content/browser/BatteryStatusManager;

    invoke-direct {v0, p0}, Lorg/chromium/content/browser/BatteryStatusManager;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method private native nativeGotBatteryStatus(JZDDD)V
.end method


# virtual methods
.method protected gotBatteryStatus(ZDDD)V
    .locals 12
    .param p1, "charging"    # Z
    .param p2, "chargingTime"    # D
    .param p4, "dischargingTime"    # D
    .param p6, "level"    # D

    .prologue
    .line 135
    iget-object v10, p0, Lorg/chromium/content/browser/BatteryStatusManager;->mNativePtrLock:Ljava/lang/Object;

    monitor-enter v10

    .line 136
    :try_start_0
    iget-wide v0, p0, Lorg/chromium/content/browser/BatteryStatusManager;->mNativePtr:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 137
    iget-wide v1, p0, Lorg/chromium/content/browser/BatteryStatusManager;->mNativePtr:J

    move-object v0, p0

    move v3, p1

    move-wide v4, p2

    move-wide/from16 v6, p4

    move-wide/from16 v8, p6

    invoke-direct/range {v0 .. v9}, Lorg/chromium/content/browser/BatteryStatusManager;->nativeGotBatteryStatus(JZDDD)V

    .line 139
    :cond_0
    monitor-exit v10

    .line 140
    return-void

    .line 139
    :catchall_0
    move-exception v0

    monitor-exit v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method protected ignoreBatteryPresentState()Z
    .locals 2

    .prologue
    .line 130
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "Galaxy Nexus"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method onReceive(Landroid/content/Intent;)V
    .locals 20
    .param p1, "intent"    # Landroid/content/Intent;
    .annotation build Lorg/chromium/base/VisibleForTesting;
    .end annotation

    .prologue
    .line 86
    invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    const-string v16, "android.intent.action.BATTERY_CHANGED"

    move-object/from16 v0, v16

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 87
    const-string v2, "BatteryStatusManager"

    const-string v16, "Unexpected intent."

    move-object/from16 v0, v16

    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 121
    :goto_0
    return-void

    .line 91
    :cond_0
    invoke-virtual/range {p0 .. p0}, Lorg/chromium/content/browser/BatteryStatusManager;->ignoreBatteryPresentState()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v14, 0x1

    .line 93
    .local v14, "present":Z
    :goto_1
    const-string v2, "plugged"

    const/16 v16, -0x1

    move-object/from16 v0, p1

    move/from16 v1, v16

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v13

    .line 95
    .local v13, "pluggedStatus":I
    if-eqz v14, :cond_1

    const/4 v2, -0x1

    if-ne v13, v2, :cond_3

    .line 97
    :cond_1
    const/4 v3, 0x1

    const-wide/16 v4, 0x0

    const-wide/high16 v6, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    const-wide/high16 v8, 0x3ff0000000000000L    # 1.0

    move-object/from16 v2, p0

    invoke-virtual/range {v2 .. v9}, Lorg/chromium/content/browser/BatteryStatusManager;->gotBatteryStatus(ZDDD)V

    goto :goto_0

    .line 91
    .end local v13    # "pluggedStatus":I
    .end local v14    # "present":Z
    :cond_2
    const-string v2, "present"

    const/16 v16, 0x0

    move-object/from16 v0, p1

    move/from16 v1, v16

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v14

    goto :goto_1

    .line 101
    .restart local v13    # "pluggedStatus":I
    .restart local v14    # "present":Z
    :cond_3
    if-eqz v13, :cond_6

    const/4 v3, 0x1

    .line 102
    .local v3, "charging":Z
    :goto_2
    const-string v2, "status"

    const/16 v16, -0x1

    move-object/from16 v0, p1

    move/from16 v1, v16

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v15

    .line 103
    .local v15, "status":I
    const/4 v2, 0x5

    if-ne v15, v2, :cond_7

    const/4 v10, 0x1

    .line 105
    .local v10, "batteryFull":Z
    :goto_3
    const-string v2, "level"

    const/16 v16, -0x1

    move-object/from16 v0, p1

    move/from16 v1, v16

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v11

    .line 106
    .local v11, "current":I
    const-string v2, "scale"

    const/16 v16, -0x1

    move-object/from16 v0, p1

    move/from16 v1, v16

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v12

    .line 107
    .local v12, "max":I
    int-to-double v0, v11

    move-wide/from16 v16, v0

    int-to-double v0, v12

    move-wide/from16 v18, v0

    div-double v8, v16, v18

    .line 108
    .local v8, "level":D
    const-wide/16 v16, 0x0

    cmpg-double v2, v8, v16

    if-ltz v2, :cond_4

    const-wide/high16 v16, 0x3ff0000000000000L    # 1.0

    cmpl-double v2, v8, v16

    if-lez v2, :cond_5

    .line 110
    :cond_4
    const-wide/high16 v8, 0x3ff0000000000000L    # 1.0

    .line 117
    :cond_5
    and-int v2, v3, v10

    if-eqz v2, :cond_8

    const-wide/16 v4, 0x0

    .line 118
    .local v4, "chargingTime":D
    :goto_4
    const-wide/high16 v6, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    .local v6, "dischargingTime":D
    move-object/from16 v2, p0

    .line 120
    invoke-virtual/range {v2 .. v9}, Lorg/chromium/content/browser/BatteryStatusManager;->gotBatteryStatus(ZDDD)V

    goto/16 :goto_0

    .line 101
    .end local v3    # "charging":Z
    .end local v4    # "chargingTime":D
    .end local v6    # "dischargingTime":D
    .end local v8    # "level":D
    .end local v10    # "batteryFull":Z
    .end local v11    # "current":I
    .end local v12    # "max":I
    .end local v15    # "status":I
    :cond_6
    const/4 v3, 0x0

    goto :goto_2

    .line 103
    .restart local v3    # "charging":Z
    .restart local v15    # "status":I
    :cond_7
    const/4 v10, 0x0

    goto :goto_3

    .line 117
    .restart local v8    # "level":D
    .restart local v10    # "batteryFull":Z
    .restart local v11    # "current":I
    .restart local v12    # "max":I
    :cond_8
    const-wide/high16 v4, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    goto :goto_4
.end method

.method start(J)Z
    .locals 5
    .param p1, "nativePtr"    # J
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 60
    iget-object v1, p0, Lorg/chromium/content/browser/BatteryStatusManager;->mNativePtrLock:Ljava/lang/Object;

    monitor-enter v1

    .line 61
    :try_start_0
    iget-boolean v0, p0, Lorg/chromium/content/browser/BatteryStatusManager;->mEnabled:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lorg/chromium/content/browser/BatteryStatusManager;->mAppContext:Landroid/content/Context;

    iget-object v2, p0, Lorg/chromium/content/browser/BatteryStatusManager;->mReceiver:Landroid/content/BroadcastReceiver;

    iget-object v3, p0, Lorg/chromium/content/browser/BatteryStatusManager;->mFilter:Landroid/content/IntentFilter;

    invoke-virtual {v0, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 63
    iput-wide p1, p0, Lorg/chromium/content/browser/BatteryStatusManager;->mNativePtr:J

    .line 64
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/chromium/content/browser/BatteryStatusManager;->mEnabled:Z

    .line 66
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    iget-boolean v0, p0, Lorg/chromium/content/browser/BatteryStatusManager;->mEnabled:Z

    return v0

    .line 66
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method stop()V
    .locals 4
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 75
    iget-object v1, p0, Lorg/chromium/content/browser/BatteryStatusManager;->mNativePtrLock:Ljava/lang/Object;

    monitor-enter v1

    .line 76
    :try_start_0
    iget-boolean v0, p0, Lorg/chromium/content/browser/BatteryStatusManager;->mEnabled:Z

    if-eqz v0, :cond_0

    .line 77
    iget-object v0, p0, Lorg/chromium/content/browser/BatteryStatusManager;->mAppContext:Landroid/content/Context;

    iget-object v2, p0, Lorg/chromium/content/browser/BatteryStatusManager;->mReceiver:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v2}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 78
    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lorg/chromium/content/browser/BatteryStatusManager;->mNativePtr:J

    .line 79
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/chromium/content/browser/BatteryStatusManager;->mEnabled:Z

    .line 81
    :cond_0
    monitor-exit v1

    .line 82
    return-void

    .line 81
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
