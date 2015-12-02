.class public Lcom/qihoo360/mobilesafe/b/f;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field private static a:J


# direct methods
.method public static declared-synchronized a()Z
    .locals 8

    .prologue
    .line 22
    const-class v1, Lcom/qihoo360/mobilesafe/b/f;

    monitor-enter v1

    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 23
    sget-wide v4, Lcom/qihoo360/mobilesafe/b/f;->a:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sub-long v4, v2, v4

    .line 24
    const-wide/16 v6, 0x0

    cmp-long v0, v4, v6

    if-lez v0, :cond_0

    const-wide/16 v6, 0x320

    cmp-long v0, v4, v6

    if-gez v0, :cond_0

    .line 25
    const/4 v0, 0x1

    .line 28
    :goto_0
    monitor-exit v1

    return v0

    .line 27
    :cond_0
    :try_start_1
    sput-wide v2, Lcom/qihoo360/mobilesafe/b/f;->a:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    const/4 v0, 0x0

    goto :goto_0

    .line 22
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method public static declared-synchronized b()Z
    .locals 8

    .prologue
    .line 37
    const-class v1, Lcom/qihoo360/mobilesafe/b/f;

    monitor-enter v1

    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 38
    sget-wide v4, Lcom/qihoo360/mobilesafe/b/f;->a:J

    sub-long v4, v2, v4

    .line 39
    const-wide/16 v6, 0x320

    cmp-long v0, v4, v6

    if-lez v0, :cond_0

    .line 40
    sput-wide v2, Lcom/qihoo360/mobilesafe/b/f;->a:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    const/4 v0, 0x1

    .line 43
    :goto_0
    monitor-exit v1

    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 37
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method
