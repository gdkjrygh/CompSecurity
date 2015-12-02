.class public Lcom/facebook/orca/g/e;
.super Ljava/lang/Object;
.source "DbClock.java"

# interfaces
.implements Lcom/facebook/common/time/a;


# instance fields
.field private a:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public declared-synchronized a()J
    .locals 4

    .prologue
    .line 21
    monitor-enter p0

    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 22
    iget-wide v2, p0, Lcom/facebook/orca/g/e;->a:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    cmp-long v2, v0, v2

    if-lez v2, :cond_0

    .line 26
    :goto_0
    monitor-exit p0

    return-wide v0

    .line 25
    :cond_0
    :try_start_1
    iget-wide v0, p0, Lcom/facebook/orca/g/e;->a:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/facebook/orca/g/e;->a:J

    .line 26
    iget-wide v0, p0, Lcom/facebook/orca/g/e;->a:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 21
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized a(J)V
    .locals 2

    .prologue
    .line 16
    monitor-enter p0

    :try_start_0
    iget-wide v0, p0, Lcom/facebook/orca/g/e;->a:J

    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/g/e;->a:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    monitor-exit p0

    return-void

    .line 16
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
