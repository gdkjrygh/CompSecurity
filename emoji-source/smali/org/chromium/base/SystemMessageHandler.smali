.class Lorg/chromium/base/SystemMessageHandler;
.super Landroid/os/Handler;
.source "SystemMessageHandler.java"


# static fields
.field static final synthetic $assertionsDisabled:Z

.field private static final DELAYED_SCHEDULED_WORK:I = 0x2

.field private static final SCHEDULED_WORK:I = 0x1

.field private static final TAG:Ljava/lang/String; = "SystemMessageHandler"


# instance fields
.field private mDelayedScheduledTimeTicks:J

.field private mMessagePumpDelegateNative:J

.field private mMessageQueue:Landroid/os/MessageQueue;

.field private mMessageQueueMessageField:Ljava/lang/reflect/Field;

.field private mMessageTargetField:Ljava/lang/reflect/Field;

.field private mQueueHasSyncBarrier:Z

.field private mSyncBarrierTraceId:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 17
    const-class v0, Lorg/chromium/base/SystemMessageHandler;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lorg/chromium/base/SystemMessageHandler;->$assertionsDisabled:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private constructor <init>(J)V
    .locals 3
    .param p1, "messagePumpDelegateNative"    # J

    .prologue
    const-wide/16 v0, 0x0

    .line 37
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 25
    iput-wide v0, p0, Lorg/chromium/base/SystemMessageHandler;->mMessagePumpDelegateNative:J

    .line 26
    iput-wide v0, p0, Lorg/chromium/base/SystemMessageHandler;->mDelayedScheduledTimeTicks:J

    .line 38
    iput-wide p1, p0, Lorg/chromium/base/SystemMessageHandler;->mMessagePumpDelegateNative:J

    .line 39
    invoke-direct {p0}, Lorg/chromium/base/SystemMessageHandler;->tryEnableSyncBarrierDetection()V

    .line 40
    return-void
.end method

.method private static create(J)Lorg/chromium/base/SystemMessageHandler;
    .locals 2
    .param p0, "messagePumpDelegateNative"    # J
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 161
    new-instance v0, Lorg/chromium/base/SystemMessageHandler;

    invoke-direct {v0, p0, p1}, Lorg/chromium/base/SystemMessageHandler;-><init>(J)V

    return-object v0
.end method

.method private disableSyncBarrierDetection()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 132
    const-string v0, "SystemMessageHandler"

    const-string v1, "Unexpected error with sync barrier detection, disabling."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 133
    iput-object v2, p0, Lorg/chromium/base/SystemMessageHandler;->mMessageQueue:Landroid/os/MessageQueue;

    .line 134
    iput-object v2, p0, Lorg/chromium/base/SystemMessageHandler;->mMessageQueueMessageField:Ljava/lang/reflect/Field;

    .line 135
    iput-object v2, p0, Lorg/chromium/base/SystemMessageHandler;->mMessageTargetField:Ljava/lang/reflect/Field;

    .line 136
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lorg/chromium/base/SystemMessageHandler;->setqueueHasSyncBarrier(Z)V

    .line 137
    return-void
.end method

.method private getField(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;
    .locals 4
    .param p1, "object"    # Ljava/lang/Object;
    .param p2, "field"    # Ljava/lang/reflect/Field;

    .prologue
    .line 151
    :try_start_0
    invoke-virtual {p2, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 156
    :goto_0
    return-object v1

    .line 152
    :catch_0
    move-exception v0

    .line 153
    .local v0, "e":Ljava/lang/IllegalAccessException;
    const-string v1, "SystemMessageHandler"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed field access: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 154
    invoke-direct {p0}, Lorg/chromium/base/SystemMessageHandler;->disableSyncBarrierDetection()V

    .line 156
    const/4 v1, 0x0

    goto :goto_0
.end method

.method private isSyncBarrierMessage(Landroid/os/Message;)Z
    .locals 2
    .param p1, "message"    # Landroid/os/Message;

    .prologue
    const/4 v0, 0x0

    .line 92
    if-nez p1, :cond_1

    .line 94
    :cond_0
    :goto_0
    return v0

    :cond_1
    iget-object v1, p0, Lorg/chromium/base/SystemMessageHandler;->mMessageTargetField:Ljava/lang/reflect/Field;

    invoke-direct {p0, p1, v1}, Lorg/chromium/base/SystemMessageHandler;->getField(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method private native nativeDoRunLoopOnce(JJ)V
.end method

.method private removeAllPendingMessages()V
    .locals 1
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 74
    invoke-direct {p0}, Lorg/chromium/base/SystemMessageHandler;->updateWhetherQueueHasBlockingSyncBarrier()V

    .line 75
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lorg/chromium/base/SystemMessageHandler;->removeMessages(I)V

    .line 76
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lorg/chromium/base/SystemMessageHandler;->removeMessages(I)V

    .line 77
    return-void
.end method

.method private scheduleDelayedWork(JJ)V
    .locals 5
    .param p1, "delayedTimeTicks"    # J
    .param p3, "millis"    # J
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    const/4 v4, 0x2

    .line 62
    iget-wide v0, p0, Lorg/chromium/base/SystemMessageHandler;->mDelayedScheduledTimeTicks:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 63
    invoke-virtual {p0, v4}, Lorg/chromium/base/SystemMessageHandler;->removeMessages(I)V

    .line 65
    :cond_0
    iput-wide p1, p0, Lorg/chromium/base/SystemMessageHandler;->mDelayedScheduledTimeTicks:J

    .line 66
    invoke-direct {p0}, Lorg/chromium/base/SystemMessageHandler;->updateWhetherQueueHasBlockingSyncBarrier()V

    .line 67
    iget-boolean v0, p0, Lorg/chromium/base/SystemMessageHandler;->mQueueHasSyncBarrier:Z

    if-eqz v0, :cond_1

    const-string v0, "SystemMessageHandler:delayedWorkBlocked"

    invoke-static {v0}, Lorg/chromium/base/TraceEvent;->instant(Ljava/lang/String;)V

    .line 68
    :cond_1
    invoke-virtual {p0, v4, p3, p4}, Lorg/chromium/base/SystemMessageHandler;->sendEmptyMessageDelayed(IJ)Z

    .line 69
    return-void
.end method

.method private scheduleWork()V
    .locals 1
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 54
    invoke-direct {p0}, Lorg/chromium/base/SystemMessageHandler;->updateWhetherQueueHasBlockingSyncBarrier()V

    .line 55
    iget-boolean v0, p0, Lorg/chromium/base/SystemMessageHandler;->mQueueHasSyncBarrier:Z

    if-eqz v0, :cond_0

    const-string v0, "SystemMessageHandler:immediateWorkBlocked"

    invoke-static {v0}, Lorg/chromium/base/TraceEvent;->instant(Ljava/lang/String;)V

    .line 56
    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lorg/chromium/base/SystemMessageHandler;->sendEmptyMessage(I)Z

    .line 57
    return-void
.end method

.method private setqueueHasSyncBarrier(Z)V
    .locals 4
    .param p1, "queueHasSyncBarrier"    # Z

    .prologue
    .line 140
    iget-boolean v0, p0, Lorg/chromium/base/SystemMessageHandler;->mQueueHasSyncBarrier:Z

    if-ne p1, v0, :cond_0

    .line 147
    :goto_0
    return-void

    .line 141
    :cond_0
    iput-boolean p1, p0, Lorg/chromium/base/SystemMessageHandler;->mQueueHasSyncBarrier:Z

    .line 142
    iget-boolean v0, p0, Lorg/chromium/base/SystemMessageHandler;->mQueueHasSyncBarrier:Z

    if-eqz v0, :cond_1

    .line 143
    const-string v0, "SyncBarrier"

    iget-wide v2, p0, Lorg/chromium/base/SystemMessageHandler;->mSyncBarrierTraceId:J

    invoke-static {v0, v2, v3}, Lorg/chromium/base/TraceEvent;->startAsync(Ljava/lang/String;J)V

    goto :goto_0

    .line 145
    :cond_1
    const-string v0, "SyncBarrier"

    iget-wide v2, p0, Lorg/chromium/base/SystemMessageHandler;->mSyncBarrierTraceId:J

    invoke-static {v0, v2, v3}, Lorg/chromium/base/TraceEvent;->finishAsync(Ljava/lang/String;J)V

    goto :goto_0
.end method

.method private tryEnableSyncBarrierDetection()V
    .locals 6

    .prologue
    .line 98
    sget-boolean v3, Lorg/chromium/base/SystemMessageHandler;->$assertionsDisabled:Z

    if-nez v3, :cond_0

    iget-object v3, p0, Lorg/chromium/base/SystemMessageHandler;->mMessageQueue:Landroid/os/MessageQueue;

    if-eqz v3, :cond_0

    new-instance v3, Ljava/lang/AssertionError;

    invoke-direct {v3}, Ljava/lang/AssertionError;-><init>()V

    throw v3

    .line 100
    :cond_0
    const/4 v2, 0x0

    .line 102
    .local v2, "success":Z
    :try_start_0
    const-class v3, Landroid/os/Looper;

    const-string v4, "getQueue"

    const/4 v5, 0x0

    new-array v5, v5, [Ljava/lang/Class;

    invoke-virtual {v3, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    .line 103
    .local v1, "getQueueMethod":Ljava/lang/reflect/Method;
    invoke-virtual {p0}, Lorg/chromium/base/SystemMessageHandler;->getLooper()Landroid/os/Looper;

    move-result-object v3

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {v1, v3, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/os/MessageQueue;

    iput-object v3, p0, Lorg/chromium/base/SystemMessageHandler;->mMessageQueue:Landroid/os/MessageQueue;

    .line 105
    iget-object v3, p0, Lorg/chromium/base/SystemMessageHandler;->mMessageQueue:Landroid/os/MessageQueue;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    const-string v4, "mMessages"

    invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v3

    iput-object v3, p0, Lorg/chromium/base/SystemMessageHandler;->mMessageQueueMessageField:Ljava/lang/reflect/Field;

    .line 106
    iget-object v3, p0, Lorg/chromium/base/SystemMessageHandler;->mMessageQueueMessageField:Ljava/lang/reflect/Field;

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 108
    const-class v3, Landroid/os/Message;

    const-string v4, "target"

    invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v3

    iput-object v3, p0, Lorg/chromium/base/SystemMessageHandler;->mMessageTargetField:Ljava/lang/reflect/Field;

    .line 109
    iget-object v3, p0, Lorg/chromium/base/SystemMessageHandler;->mMessageTargetField:Ljava/lang/reflect/Field;

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 111
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v3

    int-to-long v4, v3

    iput-wide v4, p0, Lorg/chromium/base/SystemMessageHandler;->mSyncBarrierTraceId:J
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_5
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 113
    const/4 v2, 0x1

    .line 127
    if-nez v2, :cond_1

    invoke-direct {p0}, Lorg/chromium/base/SystemMessageHandler;->disableSyncBarrierDetection()V

    .line 129
    .end local v1    # "getQueueMethod":Ljava/lang/reflect/Method;
    :cond_1
    :goto_0
    return-void

    .line 114
    :catch_0
    move-exception v0

    .line 115
    .local v0, "e":Ljava/lang/NoSuchMethodException;
    :try_start_1
    const-string v3, "SystemMessageHandler"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Failed to load method: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 127
    if-nez v2, :cond_1

    invoke-direct {p0}, Lorg/chromium/base/SystemMessageHandler;->disableSyncBarrierDetection()V

    goto :goto_0

    .line 116
    .end local v0    # "e":Ljava/lang/NoSuchMethodException;
    :catch_1
    move-exception v0

    .line 117
    .local v0, "e":Ljava/lang/NoSuchFieldException;
    :try_start_2
    const-string v3, "SystemMessageHandler"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Failed to load field: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 127
    if-nez v2, :cond_1

    invoke-direct {p0}, Lorg/chromium/base/SystemMessageHandler;->disableSyncBarrierDetection()V

    goto :goto_0

    .line 118
    .end local v0    # "e":Ljava/lang/NoSuchFieldException;
    :catch_2
    move-exception v0

    .line 119
    .local v0, "e":Ljava/lang/reflect/InvocationTargetException;
    :try_start_3
    const-string v3, "SystemMessageHandler"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Failed invocation: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 127
    if-nez v2, :cond_1

    invoke-direct {p0}, Lorg/chromium/base/SystemMessageHandler;->disableSyncBarrierDetection()V

    goto :goto_0

    .line 120
    .end local v0    # "e":Ljava/lang/reflect/InvocationTargetException;
    :catch_3
    move-exception v0

    .line 121
    .local v0, "e":Ljava/lang/IllegalAccessException;
    :try_start_4
    const-string v3, "SystemMessageHandler"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Illegal access to reflected invocation: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 127
    if-nez v2, :cond_1

    invoke-direct {p0}, Lorg/chromium/base/SystemMessageHandler;->disableSyncBarrierDetection()V

    goto :goto_0

    .line 122
    .end local v0    # "e":Ljava/lang/IllegalAccessException;
    :catch_4
    move-exception v0

    .line 123
    .local v0, "e":Ljava/lang/IllegalArgumentException;
    :try_start_5
    const-string v3, "SystemMessageHandler"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Illegal argument to reflected invocation: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 127
    if-nez v2, :cond_1

    invoke-direct {p0}, Lorg/chromium/base/SystemMessageHandler;->disableSyncBarrierDetection()V

    goto/16 :goto_0

    .line 124
    .end local v0    # "e":Ljava/lang/IllegalArgumentException;
    :catch_5
    move-exception v0

    .line 125
    .local v0, "e":Ljava/lang/RuntimeException;
    :try_start_6
    const-string v3, "SystemMessageHandler"

    invoke-virtual {v0}, Ljava/lang/RuntimeException;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 127
    if-nez v2, :cond_1

    invoke-direct {p0}, Lorg/chromium/base/SystemMessageHandler;->disableSyncBarrierDetection()V

    goto/16 :goto_0

    .end local v0    # "e":Ljava/lang/RuntimeException;
    :catchall_0
    move-exception v3

    if-nez v2, :cond_2

    invoke-direct {p0}, Lorg/chromium/base/SystemMessageHandler;->disableSyncBarrierDetection()V

    :cond_2
    throw v3
.end method

.method private updateWhetherQueueHasBlockingSyncBarrier()V
    .locals 3

    .prologue
    .line 80
    iget-object v1, p0, Lorg/chromium/base/SystemMessageHandler;->mMessageQueue:Landroid/os/MessageQueue;

    if-nez v1, :cond_0

    .line 89
    :goto_0
    return-void

    .line 83
    :cond_0
    invoke-static {}, Lorg/chromium/base/TraceEvent;->enabled()Z

    move-result v1

    if-nez v1, :cond_1

    .line 84
    const/4 v1, 0x0

    iput-boolean v1, p0, Lorg/chromium/base/SystemMessageHandler;->mQueueHasSyncBarrier:Z

    goto :goto_0

    .line 87
    :cond_1
    iget-object v1, p0, Lorg/chromium/base/SystemMessageHandler;->mMessageQueue:Landroid/os/MessageQueue;

    iget-object v2, p0, Lorg/chromium/base/SystemMessageHandler;->mMessageQueueMessageField:Ljava/lang/reflect/Field;

    invoke-direct {p0, v1, v2}, Lorg/chromium/base/SystemMessageHandler;->getField(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Message;

    .line 88
    .local v0, "queueHead":Landroid/os/Message;
    invoke-direct {p0, v0}, Lorg/chromium/base/SystemMessageHandler;->isSyncBarrierMessage(Landroid/os/Message;)Z

    move-result v1

    invoke-direct {p0, v1}, Lorg/chromium/base/SystemMessageHandler;->setqueueHasSyncBarrier(Z)V

    goto :goto_0
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4
    .param p1, "msg"    # Landroid/os/Message;

    .prologue
    .line 44
    invoke-direct {p0}, Lorg/chromium/base/SystemMessageHandler;->updateWhetherQueueHasBlockingSyncBarrier()V

    .line 45
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 46
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lorg/chromium/base/SystemMessageHandler;->mDelayedScheduledTimeTicks:J

    .line 48
    :cond_0
    iget-wide v0, p0, Lorg/chromium/base/SystemMessageHandler;->mMessagePumpDelegateNative:J

    iget-wide v2, p0, Lorg/chromium/base/SystemMessageHandler;->mDelayedScheduledTimeTicks:J

    invoke-direct {p0, v0, v1, v2, v3}, Lorg/chromium/base/SystemMessageHandler;->nativeDoRunLoopOnce(JJ)V

    .line 49
    return-void
.end method
