.class Lorg/chromium/content/browser/TimeZoneMonitor$1;
.super Landroid/content/BroadcastReceiver;
.source "TimeZoneMonitor.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/chromium/content/browser/TimeZoneMonitor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/chromium/content/browser/TimeZoneMonitor;


# direct methods
.method constructor <init>(Lorg/chromium/content/browser/TimeZoneMonitor;)V
    .locals 0

    .prologue
    .line 25
    iput-object p1, p0, Lorg/chromium/content/browser/TimeZoneMonitor$1;->this$0:Lorg/chromium/content/browser/TimeZoneMonitor;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "intent"    # Landroid/content/Intent;

    .prologue
    .line 28
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "android.intent.action.TIMEZONE_CHANGED"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 29
    const-string v0, "TimeZoneMonitor"

    const-string v1, "unexpected intent"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 34
    :goto_0
    return-void

    .line 33
    :cond_0
    iget-object v0, p0, Lorg/chromium/content/browser/TimeZoneMonitor$1;->this$0:Lorg/chromium/content/browser/TimeZoneMonitor;

    iget-object v1, p0, Lorg/chromium/content/browser/TimeZoneMonitor$1;->this$0:Lorg/chromium/content/browser/TimeZoneMonitor;

    # getter for: Lorg/chromium/content/browser/TimeZoneMonitor;->mNativePtr:J
    invoke-static {v1}, Lorg/chromium/content/browser/TimeZoneMonitor;->access$000(Lorg/chromium/content/browser/TimeZoneMonitor;)J

    move-result-wide v2

    # invokes: Lorg/chromium/content/browser/TimeZoneMonitor;->nativeTimeZoneChangedFromJava(J)V
    invoke-static {v0, v2, v3}, Lorg/chromium/content/browser/TimeZoneMonitor;->access$100(Lorg/chromium/content/browser/TimeZoneMonitor;J)V

    goto :goto_0
.end method
