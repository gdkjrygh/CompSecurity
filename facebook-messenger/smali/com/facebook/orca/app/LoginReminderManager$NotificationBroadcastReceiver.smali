.class public Lcom/facebook/orca/app/LoginReminderManager$NotificationBroadcastReceiver;
.super Lcom/facebook/c/k;
.source "LoginReminderManager.java"


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 251
    const-string v0, "com.facebook.orca.app.ACTION_NOTIFICATION_ALARM"

    new-instance v1, Lcom/facebook/orca/app/f;

    invoke-direct {v1}, Lcom/facebook/orca/app/f;-><init>()V

    invoke-direct {p0, v0, v1}, Lcom/facebook/c/k;-><init>(Ljava/lang/String;Lcom/facebook/c/b;)V

    .line 252
    return-void
.end method
