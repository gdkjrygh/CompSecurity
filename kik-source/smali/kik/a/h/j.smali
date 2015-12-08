.class public final Lkik/a/h/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile a:J

.field private static volatile b:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 6
    const-wide/16 v0, 0x0

    sput-wide v0, Lkik/a/h/j;->a:J

    .line 7
    const-wide/16 v0, -0x1

    sput-wide v0, Lkik/a/h/j;->b:J

    return-void
.end method

.method public static declared-synchronized a()J
    .locals 4

    .prologue
    .line 25
    const-class v0, Lkik/a/h/j;

    monitor-enter v0

    :try_start_0
    sget-wide v2, Lkik/a/h/j;->a:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-wide v2

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static declared-synchronized a(J)V
    .locals 4

    .prologue
    .line 20
    const-class v1, Lkik/a/h/j;

    monitor-enter v1

    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long v2, p0, v2

    invoke-static {v2, v3}, Lkik/a/h/j;->d(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    monitor-exit v1

    return-void

    .line 20
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method public static declared-synchronized b()J
    .locals 6

    .prologue
    .line 30
    const-class v1, Lkik/a/h/j;

    monitor-enter v1

    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sget-wide v4, Lkik/a/h/j;->a:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-long/2addr v2, v4

    monitor-exit v1

    return-wide v2

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method public static b(J)J
    .locals 2

    .prologue
    .line 35
    sget-wide v0, Lkik/a/h/j;->a:J

    sub-long v0, p0, v0

    return-wide v0
.end method

.method public static declared-synchronized c()J
    .locals 4

    .prologue
    .line 61
    const-class v0, Lkik/a/h/j;

    monitor-enter v0

    :try_start_0
    sget-wide v2, Lkik/a/h/j;->b:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-wide v2

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static declared-synchronized c(J)J
    .locals 12

    .prologue
    .line 45
    const-class v2, Lkik/a/h/j;

    monitor-enter v2

    const-wide/32 v0, 0xff00

    and-long/2addr v0, p0

    const/16 v3, 0x8

    shr-long/2addr v0, v3

    const-wide/32 v4, 0xff0000

    and-long/2addr v4, p0

    const/16 v3, 0x10

    shr-long/2addr v4, v3

    xor-long/2addr v0, v4

    const-wide/32 v4, -0x1000000

    and-long/2addr v4, p0

    const/16 v3, 0x18

    shr-long/2addr v4, v3

    xor-long/2addr v0, v4

    const-wide/16 v4, 0x1e

    and-long/2addr v4, v0

    .line 46
    const-wide/16 v0, 0xe0

    and-long/2addr v0, p0

    const/4 v3, 0x5

    shr-long/2addr v0, v3

    .line 47
    const-wide/16 v6, -0xff

    and-long/2addr v6, p0

    .line 49
    const-wide/16 v8, 0x4

    :try_start_0
    rem-long v8, v4, v8

    const-wide/16 v10, 0x0

    cmp-long v3, v8, v10

    if-nez v3, :cond_0

    .line 50
    const-wide/16 v8, 0x3

    div-long/2addr v0, v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-wide/16 v8, 0x3

    mul-long/2addr v0, v8

    .line 56
    :goto_0
    const/4 v3, 0x5

    shl-long/2addr v0, v3

    or-long/2addr v0, v6

    or-long/2addr v0, v4

    monitor-exit v2

    return-wide v0

    .line 53
    :cond_0
    const-wide/16 v8, 0x2

    :try_start_1
    div-long/2addr v0, v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-wide/16 v8, 0x2

    mul-long/2addr v0, v8

    goto :goto_0

    .line 45
    :catchall_0
    move-exception v0

    monitor-exit v2

    throw v0
.end method

.method private static declared-synchronized d(J)V
    .locals 4

    .prologue
    .line 14
    const-class v1, Lkik/a/h/j;

    monitor-enter v1

    :try_start_0
    sput-wide p0, Lkik/a/h/j;->a:J

    .line 15
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sput-wide v2, Lkik/a/h/j;->b:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    monitor-exit v1

    return-void

    .line 14
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method
