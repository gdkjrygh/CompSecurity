.class public Lcom/facebook/push/c2dm/FacebookPushServerRegistrar$LocalBroadcastReceiver;
.super Lcom/facebook/c/k;
.source "FacebookPushServerRegistrar.java"


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 314
    const-string v0, "com.facebook.orca.push.ACTION_ALARM"

    new-instance v1, Lcom/facebook/push/c2dm/w;

    invoke-direct {v1}, Lcom/facebook/push/c2dm/w;-><init>()V

    invoke-direct {p0, v0, v1}, Lcom/facebook/c/k;-><init>(Ljava/lang/String;Lcom/facebook/c/b;)V

    .line 327
    return-void
.end method
