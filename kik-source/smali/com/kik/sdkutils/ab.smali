.class public final Lcom/kik/sdkutils/ab;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile a:Ljava/lang/Long;


# direct methods
.method public static declared-synchronized a()J
    .locals 8

    .prologue
    .line 12
    const-class v1, Lcom/kik/sdkutils/ab;

    monitor-enter v1

    :try_start_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    .line 14
    sget-object v0, Lcom/kik/sdkutils/ab;->a:Ljava/lang/Long;

    if-nez v0, :cond_0

    .line 15
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v6

    sub-long/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    sput-object v0, Lcom/kik/sdkutils/ab;->a:Ljava/lang/Long;

    .line 18
    :cond_0
    sget-object v0, Lcom/kik/sdkutils/ab;->a:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v4

    add-long/2addr v2, v4

    monitor-exit v1

    return-wide v2

    .line 12
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method
