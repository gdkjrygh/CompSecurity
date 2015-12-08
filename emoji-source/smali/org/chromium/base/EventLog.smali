.class public Lorg/chromium/base/EventLog;
.super Ljava/lang/Object;
.source "EventLog.java"


# annotations
.annotation runtime Lorg/chromium/base/JNINamespace;
    value = "base::android"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static writeEvent(II)V
    .locals 0
    .param p0, "tag"    # I
    .param p1, "value"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 15
    invoke-static {p0, p1}, Landroid/util/EventLog;->writeEvent(II)I

    .line 16
    return-void
.end method
