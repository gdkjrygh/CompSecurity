.class final Lorg/chromium/base/TraceEvent$IdleTracingLooperMonitor;
.super Lorg/chromium/base/TraceEvent$BasicLooperMonitor;
.source "TraceEvent.java"

# interfaces
.implements Landroid/os/MessageQueue$IdleHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/chromium/base/TraceEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "IdleTracingLooperMonitor"
.end annotation


# static fields
.field private static final FRAME_DURATION_MILLIS:J = 0x10L

.field private static final IDLE_EVENT_NAME:Ljava/lang/String; = "Looper.queueIdle"

.field private static final MIN_INTERESTING_BURST_DURATION_MILLIS:J = 0x30L

.field private static final MIN_INTERESTING_DURATION_MILLIS:J = 0x10L

.field private static final TAG:Ljava/lang/String; = "TraceEvent.LooperMonitor"


# instance fields
.field private mIdleMonitorAttached:Z

.field private mLastIdleStartedAt:J

.field private mLastWorkStartedAt:J

.field private mNumIdlesSeen:I

.field private mNumTasksSeen:I

.field private mNumTasksSinceLastIdle:I


# direct methods
.method private constructor <init>()V
    .locals 4

    .prologue
    const-wide/16 v2, 0x0

    const/4 v1, 0x0

    .line 65
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lorg/chromium/base/TraceEvent$BasicLooperMonitor;-><init>(Lorg/chromium/base/TraceEvent$1;)V

    .line 81
    iput-wide v2, p0, Lorg/chromium/base/TraceEvent$IdleTracingLooperMonitor;->mLastIdleStartedAt:J

    .line 82
    iput-wide v2, p0, Lorg/chromium/base/TraceEvent$IdleTracingLooperMonitor;->mLastWorkStartedAt:J

    .line 83
    iput v1, p0, Lorg/chromium/base/TraceEvent$IdleTracingLooperMonitor;->mNumTasksSeen:I

    .line 84
    iput v1, p0, Lorg/chromium/base/TraceEvent$IdleTracingLooperMonitor;->mNumIdlesSeen:I

    .line 85
    iput v1, p0, Lorg/chromium/base/TraceEvent$IdleTracingLooperMonitor;->mNumTasksSinceLastIdle:I

    .line 88
    iput-boolean v1, p0, Lorg/chromium/base/TraceEvent$IdleTracingLooperMonitor;->mIdleMonitorAttached:Z

    return-void
.end method

.method synthetic constructor <init>(Lorg/chromium/base/TraceEvent$1;)V
    .locals 0
    .param p1, "x0"    # Lorg/chromium/base/TraceEvent$1;

    .prologue
    .line 65
    invoke-direct {p0}, Lorg/chromium/base/TraceEvent$IdleTracingLooperMonitor;-><init>()V

    return-void
.end method

.method private final syncIdleMonitoring()V
    .locals 2

    .prologue
    .line 94
    # getter for: Lorg/chromium/base/TraceEvent;->sEnabled:Z
    invoke-static {}, Lorg/chromium/base/TraceEvent;->access$000()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lorg/chromium/base/TraceEvent$IdleTracingLooperMonitor;->mIdleMonitorAttached:Z

    if-nez v0, :cond_1

    .line 96
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lorg/chromium/base/TraceEvent$IdleTracingLooperMonitor;->mLastIdleStartedAt:J

    .line 97
    invoke-static {}, Landroid/os/Looper;->myQueue()Landroid/os/MessageQueue;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/os/MessageQueue;->addIdleHandler(Landroid/os/MessageQueue$IdleHandler;)V

    .line 98
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/chromium/base/TraceEvent$IdleTracingLooperMonitor;->mIdleMonitorAttached:Z

    .line 99
    const-string v0, "TraceEvent.LooperMonitor"

    const-string v1, "attached idle handler"

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 105
    :cond_0
    :goto_0
    return-void

    .line 100
    :cond_1
    iget-boolean v0, p0, Lorg/chromium/base/TraceEvent$IdleTracingLooperMonitor;->mIdleMonitorAttached:Z

    if-eqz v0, :cond_0

    # getter for: Lorg/chromium/base/TraceEvent;->sEnabled:Z
    invoke-static {}, Lorg/chromium/base/TraceEvent;->access$000()Z

    move-result v0

    if-nez v0, :cond_0

    .line 101
    invoke-static {}, Landroid/os/Looper;->myQueue()Landroid/os/MessageQueue;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/os/MessageQueue;->removeIdleHandler(Landroid/os/MessageQueue$IdleHandler;)V

    .line 102
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/chromium/base/TraceEvent$IdleTracingLooperMonitor;->mIdleMonitorAttached:Z

    .line 103
    const-string v0, "TraceEvent.LooperMonitor"

    const-string v1, "detached idle handler"

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method private static traceAndLog(ILjava/lang/String;)V
    .locals 1
    .param p0, "level"    # I
    .param p1, "message"    # Ljava/lang/String;

    .prologue
    .line 133
    const-string v0, "TraceEvent.LooperMonitor:IdleStats"

    invoke-static {v0, p1}, Lorg/chromium/base/TraceEvent;->instant(Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    const-string v0, "TraceEvent.LooperMonitor"

    invoke-static {p0, v0, p1}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I

    .line 135
    return-void
.end method


# virtual methods
.method final beginHandling(Ljava/lang/String;)V
    .locals 2
    .param p1, "line"    # Ljava/lang/String;

    .prologue
    .line 110
    iget v0, p0, Lorg/chromium/base/TraceEvent$IdleTracingLooperMonitor;->mNumTasksSinceLastIdle:I

    if-nez v0, :cond_0

    .line 111
    const-string v0, "Looper.queueIdle"

    invoke-static {v0}, Lorg/chromium/base/TraceEvent;->end(Ljava/lang/String;)V

    .line 113
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lorg/chromium/base/TraceEvent$IdleTracingLooperMonitor;->mLastWorkStartedAt:J

    .line 114
    invoke-direct {p0}, Lorg/chromium/base/TraceEvent$IdleTracingLooperMonitor;->syncIdleMonitoring()V

    .line 115
    invoke-super {p0, p1}, Lorg/chromium/base/TraceEvent$BasicLooperMonitor;->beginHandling(Ljava/lang/String;)V

    .line 116
    return-void
.end method

.method final endHandling(Ljava/lang/String;)V
    .locals 6
    .param p1, "line"    # Ljava/lang/String;

    .prologue
    .line 120
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iget-wide v4, p0, Lorg/chromium/base/TraceEvent$IdleTracingLooperMonitor;->mLastWorkStartedAt:J

    sub-long v0, v2, v4

    .line 122
    .local v0, "elapsed":J
    const-wide/16 v2, 0x10

    cmp-long v2, v0, v2

    if-lez v2, :cond_0

    .line 123
    const/4 v2, 0x5

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "observed a task that took "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "ms: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lorg/chromium/base/TraceEvent$IdleTracingLooperMonitor;->traceAndLog(ILjava/lang/String;)V

    .line 126
    :cond_0
    invoke-super {p0, p1}, Lorg/chromium/base/TraceEvent$BasicLooperMonitor;->endHandling(Ljava/lang/String;)V

    .line 127
    invoke-direct {p0}, Lorg/chromium/base/TraceEvent$IdleTracingLooperMonitor;->syncIdleMonitoring()V

    .line 128
    iget v2, p0, Lorg/chromium/base/TraceEvent$IdleTracingLooperMonitor;->mNumTasksSeen:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lorg/chromium/base/TraceEvent$IdleTracingLooperMonitor;->mNumTasksSeen:I

    .line 129
    iget v2, p0, Lorg/chromium/base/TraceEvent$IdleTracingLooperMonitor;->mNumTasksSinceLastIdle:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lorg/chromium/base/TraceEvent$IdleTracingLooperMonitor;->mNumTasksSinceLastIdle:I

    .line 130
    return-void
.end method

.method public final queueIdle()Z
    .locals 10

    .prologue
    .line 139
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    .line 140
    .local v2, "now":J
    iget-wide v6, p0, Lorg/chromium/base/TraceEvent$IdleTracingLooperMonitor;->mLastIdleStartedAt:J

    const-wide/16 v8, 0x0

    cmp-long v5, v6, v8

    if-nez v5, :cond_0

    iput-wide v2, p0, Lorg/chromium/base/TraceEvent$IdleTracingLooperMonitor;->mLastIdleStartedAt:J

    .line 141
    :cond_0
    iget-wide v6, p0, Lorg/chromium/base/TraceEvent$IdleTracingLooperMonitor;->mLastIdleStartedAt:J

    sub-long v0, v2, v6

    .line 142
    .local v0, "elapsed":J
    iget v5, p0, Lorg/chromium/base/TraceEvent$IdleTracingLooperMonitor;->mNumIdlesSeen:I

    add-int/lit8 v5, v5, 0x1

    iput v5, p0, Lorg/chromium/base/TraceEvent$IdleTracingLooperMonitor;->mNumIdlesSeen:I

    .line 143
    const-string v5, "Looper.queueIdle"

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget v7, p0, Lorg/chromium/base/TraceEvent$IdleTracingLooperMonitor;->mNumTasksSinceLastIdle:I

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, " tasks since last idle."

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lorg/chromium/base/TraceEvent;->begin(Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    const-wide/16 v6, 0x30

    cmp-long v5, v0, v6

    if-lez v5, :cond_1

    .line 146
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    iget v6, p0, Lorg/chromium/base/TraceEvent$IdleTracingLooperMonitor;->mNumTasksSeen:I

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, " tasks and "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    iget v6, p0, Lorg/chromium/base/TraceEvent$IdleTracingLooperMonitor;->mNumIdlesSeen:I

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, " idles processed so far, "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    iget v6, p0, Lorg/chromium/base/TraceEvent$IdleTracingLooperMonitor;->mNumTasksSinceLastIdle:I

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, " tasks bursted and "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "ms elapsed since last idle"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 150
    .local v4, "statsString":Ljava/lang/String;
    const/4 v5, 0x3

    invoke-static {v5, v4}, Lorg/chromium/base/TraceEvent$IdleTracingLooperMonitor;->traceAndLog(ILjava/lang/String;)V

    .line 152
    .end local v4    # "statsString":Ljava/lang/String;
    :cond_1
    iput-wide v2, p0, Lorg/chromium/base/TraceEvent$IdleTracingLooperMonitor;->mLastIdleStartedAt:J

    .line 153
    const/4 v5, 0x0

    iput v5, p0, Lorg/chromium/base/TraceEvent$IdleTracingLooperMonitor;->mNumTasksSinceLastIdle:I

    .line 154
    const/4 v5, 0x1

    return v5
.end method
