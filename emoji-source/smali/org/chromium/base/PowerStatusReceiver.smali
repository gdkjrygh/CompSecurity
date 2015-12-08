.class public Lorg/chromium/base/PowerStatusReceiver;
.super Landroid/content/BroadcastReceiver;
.source "PowerStatusReceiver.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "intent"    # Landroid/content/Intent;

    .prologue
    .line 21
    invoke-static {p2}, Lorg/chromium/base/PowerMonitor;->onBatteryChargingChanged(Landroid/content/Intent;)V

    .line 22
    return-void
.end method
