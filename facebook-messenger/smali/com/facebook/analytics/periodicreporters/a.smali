.class public Lcom/facebook/analytics/periodicreporters/a;
.super Lcom/facebook/c/k;
.source "AnalyticsAlarmReceiver.java"


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    .line 30
    const-string v0, "com.facebook.analytics.periodicreporters.AnalyticsAlarmReceiver.alarm_action"

    new-instance v1, Lcom/facebook/analytics/periodicreporters/c;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/facebook/analytics/periodicreporters/c;-><init>(Lcom/facebook/analytics/periodicreporters/b;)V

    invoke-direct {p0, v0, v1}, Lcom/facebook/c/k;-><init>(Ljava/lang/String;Lcom/facebook/c/b;)V

    .line 31
    return-void
.end method
