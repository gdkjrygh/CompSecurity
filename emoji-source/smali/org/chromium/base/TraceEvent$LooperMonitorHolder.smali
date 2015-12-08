.class final Lorg/chromium/base/TraceEvent$LooperMonitorHolder;
.super Ljava/lang/Object;
.source "TraceEvent.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/chromium/base/TraceEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "LooperMonitorHolder"
.end annotation


# static fields
.field private static final sInstance:Lorg/chromium/base/TraceEvent$BasicLooperMonitor;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 160
    invoke-static {}, Lorg/chromium/base/CommandLine;->getInstance()Lorg/chromium/base/CommandLine;

    move-result-object v0

    const-string v1, "enable-idle-tracing"

    invoke-virtual {v0, v1}, Lorg/chromium/base/CommandLine;->hasSwitch(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lorg/chromium/base/TraceEvent$IdleTracingLooperMonitor;

    invoke-direct {v0, v2}, Lorg/chromium/base/TraceEvent$IdleTracingLooperMonitor;-><init>(Lorg/chromium/base/TraceEvent$1;)V

    :goto_0
    sput-object v0, Lorg/chromium/base/TraceEvent$LooperMonitorHolder;->sInstance:Lorg/chromium/base/TraceEvent$BasicLooperMonitor;

    return-void

    :cond_0
    new-instance v0, Lorg/chromium/base/TraceEvent$BasicLooperMonitor;

    invoke-direct {v0, v2}, Lorg/chromium/base/TraceEvent$BasicLooperMonitor;-><init>(Lorg/chromium/base/TraceEvent$1;)V

    goto :goto_0
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 159
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$500()Lorg/chromium/base/TraceEvent$BasicLooperMonitor;
    .locals 1

    .prologue
    .line 159
    sget-object v0, Lorg/chromium/base/TraceEvent$LooperMonitorHolder;->sInstance:Lorg/chromium/base/TraceEvent$BasicLooperMonitor;

    return-object v0
.end method
