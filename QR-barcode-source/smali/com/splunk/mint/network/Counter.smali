.class public Lcom/splunk/mint/network/Counter;
.super Lcom/splunk/mint/network/Metric;
.source "Counter.java"


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
.field private count:Ljava/util/concurrent/atomic/AtomicLong;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1, "name"    # Ljava/lang/String;

    .prologue
    .line 10
    invoke-direct {p0, p1}, Lcom/splunk/mint/network/Metric;-><init>(Ljava/lang/String;)V

    .line 11
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object v0, p0, Lcom/splunk/mint/network/Counter;->count:Ljava/util/concurrent/atomic/AtomicLong;

    .line 12
    return-void
.end method


# virtual methods
.method public dec()V
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lcom/splunk/mint/network/Counter;->count:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->decrementAndGet()J

    .line 29
    return-void
.end method

.method public dec(J)V
    .locals 5
    .param p1, "delta"    # J

    .prologue
    .line 32
    iget-object v0, p0, Lcom/splunk/mint/network/Counter;->count:Ljava/util/concurrent/atomic/AtomicLong;

    neg-long v2, p1

    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;->getAndAdd(J)J

    .line 33
    return-void
.end method

.method public bridge synthetic getValue()Ljava/io/Serializable;
    .locals 1

    .prologue
    .line 5
    invoke-virtual {p0}, Lcom/splunk/mint/network/Counter;->getValue()Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public getValue()Ljava/lang/Long;
    .locals 2

    .prologue
    .line 16
    iget-object v0, p0, Lcom/splunk/mint/network/Counter;->count:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public inc()V
    .locals 1

    .prologue
    .line 20
    iget-object v0, p0, Lcom/splunk/mint/network/Counter;->count:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    .line 21
    return-void
.end method

.method public inc(J)V
    .locals 1
    .param p1, "delta"    # J

    .prologue
    .line 24
    iget-object v0, p0, Lcom/splunk/mint/network/Counter;->count:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    .line 25
    return-void
.end method
