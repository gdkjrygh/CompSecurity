.class Lorg/chromium/ui/VSyncMonitor$1;
.super Ljava/lang/Object;
.source "VSyncMonitor.java"

# interfaces
.implements Landroid/view/Choreographer$FrameCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/chromium/ui/VSyncMonitor;-><init>(Landroid/content/Context;Lorg/chromium/ui/VSyncMonitor$Listener;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/chromium/ui/VSyncMonitor;


# direct methods
.method constructor <init>(Lorg/chromium/ui/VSyncMonitor;)V
    .locals 0

    .prologue
    .line 88
    iput-object p1, p0, Lorg/chromium/ui/VSyncMonitor$1;->this$0:Lorg/chromium/ui/VSyncMonitor;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public doFrame(J)V
    .locals 5
    .param p1, "frameTimeNanos"    # J

    .prologue
    .line 91
    const-string v0, "VSync"

    invoke-static {v0}, Lorg/chromium/base/TraceEvent;->begin(Ljava/lang/String;)V

    .line 92
    iget-object v0, p0, Lorg/chromium/ui/VSyncMonitor$1;->this$0:Lorg/chromium/ui/VSyncMonitor;

    # setter for: Lorg/chromium/ui/VSyncMonitor;->mGoodStartingPointNano:J
    invoke-static {v0, p1, p2}, Lorg/chromium/ui/VSyncMonitor;->access$002(Lorg/chromium/ui/VSyncMonitor;J)J

    .line 93
    iget-object v0, p0, Lorg/chromium/ui/VSyncMonitor$1;->this$0:Lorg/chromium/ui/VSyncMonitor;

    iget-object v1, p0, Lorg/chromium/ui/VSyncMonitor$1;->this$0:Lorg/chromium/ui/VSyncMonitor;

    # invokes: Lorg/chromium/ui/VSyncMonitor;->getCurrentNanoTime()J
    invoke-static {v1}, Lorg/chromium/ui/VSyncMonitor;->access$100(Lorg/chromium/ui/VSyncMonitor;)J

    move-result-wide v2

    # invokes: Lorg/chromium/ui/VSyncMonitor;->onVSyncCallback(JJ)V
    invoke-static {v0, p1, p2, v2, v3}, Lorg/chromium/ui/VSyncMonitor;->access$200(Lorg/chromium/ui/VSyncMonitor;JJ)V

    .line 94
    const-string v0, "VSync"

    invoke-static {v0}, Lorg/chromium/base/TraceEvent;->end(Ljava/lang/String;)V

    .line 95
    return-void
.end method
