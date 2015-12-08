.class public Lcom/splunk/mint/network/Timer;
.super Lcom/splunk/mint/network/Metric;
.source "Timer.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/splunk/mint/network/Metric",
        "<",
        "Ljava/lang/Long;",
        ">;"
    }
.end annotation


# instance fields
.field private end:Ljava/lang/Long;

.field private start:Ljava/lang/Long;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2
    .param p1, "name"    # Ljava/lang/String;

    .prologue
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "-timer"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/splunk/mint/network/Metric;-><init>(Ljava/lang/String;)V

    .line 6
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/splunk/mint/network/Timer;->start:Ljava/lang/Long;

    .line 7
    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/splunk/mint/network/Timer;->end:Ljava/lang/Long;

    .line 11
    return-void
.end method


# virtual methods
.method public done()V
    .locals 2

    .prologue
    .line 23
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/splunk/mint/network/Timer;->end:Ljava/lang/Long;

    .line 25
    return-void
.end method

.method public getStartValue()J
    .locals 2

    .prologue
    .line 29
    iget-object v0, p0, Lcom/splunk/mint/network/Timer;->start:Ljava/lang/Long;

    if-nez v0, :cond_0

    .line 30
    const-wide/16 v0, 0x0

    .line 32
    :goto_0
    return-wide v0

    :cond_0
    iget-object v0, p0, Lcom/splunk/mint/network/Timer;->start:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    goto :goto_0
.end method

.method public getStopValue()J
    .locals 2

    .prologue
    .line 36
    iget-object v0, p0, Lcom/splunk/mint/network/Timer;->end:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public bridge synthetic getValue()Ljava/io/Serializable;
    .locals 1

    .prologue
    .line 4
    invoke-virtual {p0}, Lcom/splunk/mint/network/Timer;->getValue()Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public getValue()Ljava/lang/Long;
    .locals 4

    .prologue
    .line 41
    iget-object v0, p0, Lcom/splunk/mint/network/Timer;->start:Ljava/lang/Long;

    if-nez v0, :cond_0

    .line 42
    const/4 v0, 0x0

    .line 48
    :goto_0
    return-object v0

    .line 44
    :cond_0
    iget-object v0, p0, Lcom/splunk/mint/network/Timer;->end:Ljava/lang/Long;

    if-eqz v0, :cond_1

    .line 45
    iget-object v0, p0, Lcom/splunk/mint/network/Timer;->end:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iget-object v2, p0, Lcom/splunk/mint/network/Timer;->start:Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_0

    .line 48
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lcom/splunk/mint/network/Timer;->start:Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_0
.end method

.method public start()V
    .locals 2

    .prologue
    .line 15
    iget-object v0, p0, Lcom/splunk/mint/network/Timer;->start:Ljava/lang/Long;

    if-nez v0, :cond_0

    .line 16
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/splunk/mint/network/Timer;->start:Ljava/lang/Long;

    .line 19
    :cond_0
    return-void
.end method
