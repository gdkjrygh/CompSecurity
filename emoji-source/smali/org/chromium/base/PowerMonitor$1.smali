.class final Lorg/chromium/base/PowerMonitor$1;
.super Ljava/lang/Object;
.source "PowerMonitor.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/chromium/base/PowerMonitor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 0

    .prologue
    .line 36
    # invokes: Lorg/chromium/base/PowerMonitor;->nativeOnMainActivitySuspended()V
    invoke-static {}, Lorg/chromium/base/PowerMonitor;->access$100()V

    .line 37
    return-void
.end method
