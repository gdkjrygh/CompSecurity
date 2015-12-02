.class public Lcom/facebook/sms/receiver/SmsLowPriBroadcastReceiver;
.super Lcom/facebook/c/k;
.source "SmsLowPriBroadcastReceiver.java"


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    .line 20
    const-string v0, "android.provider.Telephony.SMS_RECEIVED"

    new-instance v1, Lcom/facebook/sms/receiver/a;

    const-class v2, Lcom/facebook/sms/annotation/LowPriHandler;

    invoke-direct {v1, v2}, Lcom/facebook/sms/receiver/a;-><init>(Ljava/lang/Class;)V

    invoke-direct {p0, v0, v1}, Lcom/facebook/c/k;-><init>(Ljava/lang/String;Lcom/facebook/c/b;)V

    .line 22
    return-void
.end method
