.class public Lcom/facebook/push/mqtt/ch;
.super Lcom/facebook/common/hardware/aa;
.source "MqttReceiverWakeLockHolder.java"


# direct methods
.method public constructor <init>(Lcom/facebook/common/hardware/n;)V
    .locals 1

    .prologue
    .line 15
    const-string v0, "MQTT"

    invoke-direct {p0, p1, v0}, Lcom/facebook/common/hardware/aa;-><init>(Lcom/facebook/common/hardware/n;Ljava/lang/String;)V

    .line 16
    return-void
.end method
