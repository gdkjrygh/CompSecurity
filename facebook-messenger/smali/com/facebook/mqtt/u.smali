.class public Lcom/facebook/mqtt/u;
.super Ljava/lang/Exception;
.source "MqttException.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 16
    return-void
.end method

.method public constructor <init>(Lcom/facebook/mqtt/v;)V
    .locals 1

    .prologue
    .line 19
    invoke-virtual {p1}, Lcom/facebook/mqtt/v;->name()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 20
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0, p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 24
    return-void
.end method
