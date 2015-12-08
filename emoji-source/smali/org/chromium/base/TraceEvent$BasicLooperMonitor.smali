.class Lorg/chromium/base/TraceEvent$BasicLooperMonitor;
.super Ljava/lang/Object;
.source "TraceEvent.java"

# interfaces
.implements Landroid/util/Printer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/chromium/base/TraceEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "BasicLooperMonitor"
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 24
    const-class v0, Lorg/chromium/base/TraceEvent;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lorg/chromium/base/TraceEvent$BasicLooperMonitor;->$assertionsDisabled:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lorg/chromium/base/TraceEvent$1;)V
    .locals 0
    .param p1, "x0"    # Lorg/chromium/base/TraceEvent$1;

    .prologue
    .line 24
    invoke-direct {p0}, Lorg/chromium/base/TraceEvent$BasicLooperMonitor;-><init>()V

    return-void
.end method


# virtual methods
.method beginHandling(Ljava/lang/String;)V
    .locals 1
    .param p1, "line"    # Ljava/lang/String;

    .prologue
    .line 36
    # getter for: Lorg/chromium/base/TraceEvent;->sEnabled:Z
    invoke-static {}, Lorg/chromium/base/TraceEvent;->access$000()Z

    move-result v0

    if-eqz v0, :cond_0

    # invokes: Lorg/chromium/base/TraceEvent;->nativeBeginToplevel()V
    invoke-static {}, Lorg/chromium/base/TraceEvent;->access$100()V

    .line 37
    :cond_0
    return-void
.end method

.method endHandling(Ljava/lang/String;)V
    .locals 1
    .param p1, "line"    # Ljava/lang/String;

    .prologue
    .line 40
    # getter for: Lorg/chromium/base/TraceEvent;->sEnabled:Z
    invoke-static {}, Lorg/chromium/base/TraceEvent;->access$000()Z

    move-result v0

    if-eqz v0, :cond_0

    # invokes: Lorg/chromium/base/TraceEvent;->nativeEndToplevel()V
    invoke-static {}, Lorg/chromium/base/TraceEvent;->access$200()V

    .line 41
    :cond_0
    return-void
.end method

.method public println(Ljava/lang/String;)V
    .locals 1
    .param p1, "line"    # Ljava/lang/String;

    .prologue
    .line 27
    const-string v0, ">"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 28
    invoke-virtual {p0, p1}, Lorg/chromium/base/TraceEvent$BasicLooperMonitor;->beginHandling(Ljava/lang/String;)V

    .line 33
    :goto_0
    return-void

    .line 30
    :cond_0
    sget-boolean v0, Lorg/chromium/base/TraceEvent$BasicLooperMonitor;->$assertionsDisabled:Z

    if-nez v0, :cond_1

    const-string v0, "<"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 31
    :cond_1
    invoke-virtual {p0, p1}, Lorg/chromium/base/TraceEvent$BasicLooperMonitor;->endHandling(Ljava/lang/String;)V

    goto :goto_0
.end method
