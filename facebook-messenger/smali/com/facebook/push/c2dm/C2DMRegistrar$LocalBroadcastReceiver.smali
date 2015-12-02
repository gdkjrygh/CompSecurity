.class public Lcom/facebook/push/c2dm/C2DMRegistrar$LocalBroadcastReceiver;
.super Lcom/facebook/c/k;
.source "C2DMRegistrar.java"


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 381
    const-string v0, "com.facebook.orca.push.ACTION_ALARM"

    new-instance v1, Lcom/facebook/push/c2dm/p;

    invoke-direct {v1}, Lcom/facebook/push/c2dm/p;-><init>()V

    invoke-direct {p0, v0, v1}, Lcom/facebook/c/k;-><init>(Ljava/lang/String;Lcom/facebook/c/b;)V

    .line 390
    return-void
.end method
