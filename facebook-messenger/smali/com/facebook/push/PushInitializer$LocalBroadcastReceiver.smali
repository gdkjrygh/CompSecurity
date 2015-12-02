.class public Lcom/facebook/push/PushInitializer$LocalBroadcastReceiver;
.super Lcom/facebook/c/k;
.source "PushInitializer.java"


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 107
    const-string v0, "com.facebook.orca.push.ACTION_ALARM"

    new-instance v1, Lcom/facebook/push/d;

    invoke-direct {v1}, Lcom/facebook/push/d;-><init>()V

    invoke-direct {p0, v0, v1}, Lcom/facebook/c/k;-><init>(Ljava/lang/String;Lcom/facebook/c/b;)V

    .line 108
    return-void
.end method
