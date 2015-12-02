.class public Lcom/facebook/orca/push/sms/MmsBroadcastReceiver;
.super Lcom/facebook/c/k;
.source "MmsBroadcastReceiver.java"


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 18
    const-string v0, "android.provider.Telephony.WAP_PUSH_RECEIVED"

    new-instance v1, Lcom/facebook/orca/push/sms/c;

    invoke-direct {v1}, Lcom/facebook/orca/push/sms/c;-><init>()V

    invoke-direct {p0, v0, v1}, Lcom/facebook/c/k;-><init>(Ljava/lang/String;Lcom/facebook/c/b;)V

    .line 19
    return-void
.end method
