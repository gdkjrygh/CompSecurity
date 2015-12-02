.class public Lcom/facebook/analytics/e/a;
.super Ljava/lang/Object;
.source "DefaultPerformanceLogger.java"

# interfaces
.implements Lcom/facebook/analytics/e/i;


# annotations
.annotation build Ljavax/annotation/concurrent/ThreadSafe;
.end annotation


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Lcom/facebook/analytics/av;

.field private final c:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/analytics/e/j;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/lang/String;

.field private final e:Ljava/util/concurrent/Executor;

.field private final f:Lcom/facebook/common/time/a;

.field private g:Z

.field private h:J

.field private i:J

.field private j:Ljava/lang/Boolean;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 87
    const-class v0, Lcom/facebook/analytics/e/a;

    sput-object v0, Lcom/facebook/analytics/e/a;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/analytics/av;Ljava/util/concurrent/Executor;Lcom/facebook/common/time/a;)V
    .locals 8

    .prologue
    const-wide/16 v2, 0x0

    const/4 v1, 0x0

    const/4 v7, 0x0

    const/4 v6, 0x1

    .line 113
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 102
    iput-boolean v6, p0, Lcom/facebook/analytics/e/a;->g:Z

    .line 103
    iput-wide v2, p0, Lcom/facebook/analytics/e/a;->h:J

    .line 104
    iput-wide v2, p0, Lcom/facebook/analytics/e/a;->i:J

    .line 114
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/av;

    iput-object v0, p0, Lcom/facebook/analytics/e/a;->b:Lcom/facebook/analytics/av;

    .line 115
    invoke-static {p2}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/Executor;

    iput-object v0, p0, Lcom/facebook/analytics/e/a;->e:Ljava/util/concurrent/Executor;

    .line 116
    invoke-static {p3}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/time/a;

    iput-object v0, p0, Lcom/facebook/analytics/e/a;->f:Lcom/facebook/common/time/a;

    .line 117
    new-instance v0, Lcom/google/common/a/hy;

    invoke-direct {v0}, Lcom/google/common/a/hy;-><init>()V

    const/16 v2, 0x19

    invoke-virtual {v0, v2}, Lcom/google/common/a/hy;->a(I)Lcom/google/common/a/hy;

    move-result-object v0

    const-wide/16 v2, 0x12c

    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v2, v3, v4}, Lcom/google/common/a/hy;->a(JLjava/util/concurrent/TimeUnit;)Lcom/google/common/a/hy;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/hy;->n()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/analytics/e/a;->c:Ljava/util/concurrent/ConcurrentMap;

    .line 121
    const-string v0, "scenario"

    invoke-static {v0, v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/analytics/e/a;->d:Ljava/lang/String;

    .line 125
    :try_start_0
    const-string v0, "android.os.SystemProperties"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 126
    const-string v2, "get"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Class;

    const/4 v4, 0x0

    const-class v5, Ljava/lang/String;

    aput-object v5, v3, v4

    invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 127
    const/4 v2, 0x0

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    const-string v5, "persist.facebook.LogPerf"

    aput-object v5, v3, v4

    invoke-virtual {v0, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_3

    .line 133
    :goto_0
    if-eqz v0, :cond_0

    .line 135
    const-string v1, "1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 136
    invoke-virtual {p0, v6}, Lcom/facebook/analytics/e/a;->a(Z)V

    .line 141
    :cond_0
    :goto_1
    return-void

    .line 128
    :catch_0
    move-exception v0

    move-object v0, v1

    .line 132
    goto :goto_0

    .line 129
    :catch_1
    move-exception v0

    move-object v0, v1

    .line 132
    goto :goto_0

    .line 130
    :catch_2
    move-exception v0

    move-object v0, v1

    .line 132
    goto :goto_0

    .line 131
    :catch_3
    move-exception v0

    move-object v0, v1

    goto :goto_0

    .line 137
    :cond_1
    const-string v1, "0"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 138
    invoke-virtual {p0, v7}, Lcom/facebook/analytics/e/a;->a(Z)V

    goto :goto_1
.end method

.method private a(J)J
    .locals 2

    .prologue
    .line 165
    const-wide/16 v0, -0x1

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    .line 166
    iget-object v0, p0, Lcom/facebook/analytics/e/a;->f:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide p1

    .line 168
    :cond_0
    return-wide p1
.end method

.method static synthetic a(Lcom/facebook/analytics/e/a;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 77
    invoke-direct {p0, p1, p2}, Lcom/facebook/analytics/e/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/facebook/analytics/e/j;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 172
    iget-object v0, p1, Lcom/facebook/analytics/e/j;->a:Ljava/lang/String;

    invoke-direct {p0, v0, p2}, Lcom/facebook/analytics/e/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 176
    if-nez p2, :cond_0

    :goto_0
    return-object p1

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0
.end method

.method static synthetic a(Lcom/facebook/analytics/e/a;)Ljava/util/concurrent/ConcurrentMap;
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lcom/facebook/analytics/e/a;->c:Ljava/util/concurrent/ConcurrentMap;

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/analytics/e/a;Lcom/facebook/analytics/e/j;Lcom/facebook/analytics/e/h;JLjava/util/Map;)V
    .locals 0

    .prologue
    .line 77
    invoke-direct/range {p0 .. p5}, Lcom/facebook/analytics/e/a;->a(Lcom/facebook/analytics/e/j;Lcom/facebook/analytics/e/h;JLjava/util/Map;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/analytics/e/a;Lcom/facebook/analytics/e/j;Ljava/lang/String;JZLjava/util/Map;)V
    .locals 0

    .prologue
    .line 77
    invoke-direct/range {p0 .. p6}, Lcom/facebook/analytics/e/a;->a(Lcom/facebook/analytics/e/j;Ljava/lang/String;JZLjava/util/Map;)V

    return-void
.end method

.method private declared-synchronized a(Lcom/facebook/analytics/e/j;Lcom/facebook/analytics/e/h;JLjava/util/Map;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/analytics/e/j;",
            "Lcom/facebook/analytics/e/h;",
            "J",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 887
    monitor-enter p0

    if-nez p1, :cond_1

    .line 939
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    .line 892
    :cond_1
    :try_start_0
    new-instance v0, Lcom/facebook/analytics/e/f;

    iget-object v1, p1, Lcom/facebook/analytics/e/j;->a:Ljava/lang/String;

    iget-object v2, p1, Lcom/facebook/analytics/e/j;->b:Ljava/lang/String;

    invoke-virtual {p2}, Lcom/facebook/analytics/e/h;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/facebook/analytics/e/j;->a()D

    move-result-wide v4

    iget-object v8, p0, Lcom/facebook/analytics/e/a;->d:Ljava/lang/String;

    move-wide/from16 v6, p3

    invoke-direct/range {v0 .. v8}, Lcom/facebook/analytics/e/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DJLjava/lang/String;)V

    .line 902
    if-eqz p5, :cond_2

    .line 903
    invoke-interface/range {p5 .. p5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 904
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Lcom/facebook/analytics/e/f;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    .line 887
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 907
    :cond_2
    :try_start_1
    iget-object v1, p0, Lcom/facebook/analytics/e/a;->b:Lcom/facebook/analytics/av;

    invoke-interface {v1, v0}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 910
    invoke-virtual {v0}, Lcom/facebook/analytics/e/f;->b()J

    move-result-wide v11

    .line 911
    invoke-virtual {p1}, Lcom/facebook/analytics/e/j;->b()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_3

    .line 912
    invoke-virtual {p1, v11, v12}, Lcom/facebook/analytics/e/j;->a(J)V

    .line 914
    :cond_3
    invoke-virtual {p1}, Lcom/facebook/analytics/e/j;->b()J

    move-result-wide v0

    sub-long v9, v11, v0

    .line 915
    invoke-virtual {p1, v11, v12}, Lcom/facebook/analytics/e/j;->a(J)V

    .line 919
    const-wide/16 v0, 0x0

    cmp-long v0, v9, v0

    if-lez v0, :cond_4

    sget-object v0, Lcom/facebook/analytics/e/h;->STOP:Lcom/facebook/analytics/e/h;

    if-ne p2, v0, :cond_4

    .line 920
    new-instance v0, Lcom/facebook/analytics/e/f;

    iget-object v1, p1, Lcom/facebook/analytics/e/j;->a:Ljava/lang/String;

    iget-object v2, p1, Lcom/facebook/analytics/e/j;->b:Ljava/lang/String;

    sget-object v3, Lcom/facebook/analytics/e/h;->CLIENT_TTI:Lcom/facebook/analytics/e/h;

    invoke-virtual {v3}, Lcom/facebook/analytics/e/h;->toString()Ljava/lang/String;

    move-result-object v3

    long-to-double v4, v9

    iget-object v8, p0, Lcom/facebook/analytics/e/a;->d:Ljava/lang/String;

    move-wide/from16 v6, p3

    invoke-direct/range {v0 .. v8}, Lcom/facebook/analytics/e/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DJLjava/lang/String;)V

    .line 928
    iget-object v1, p0, Lcom/facebook/analytics/e/a;->b:Lcom/facebook/analytics/av;

    invoke-interface {v1, v0}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 932
    :cond_4
    invoke-virtual {p0}, Lcom/facebook/analytics/e/a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x3

    invoke-static {v0}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 934
    sget-object v0, Lcom/facebook/analytics/e/h;->STOP:Lcom/facebook/analytics/e/h;

    if-ne p2, v0, :cond_5

    move-wide v0, v9

    .line 936
    :goto_2
    sget-object v2, Lcom/facebook/analytics/e/a;->a:Ljava/lang/Class;

    const-string v3, "Name: %s; Timestamp (ms): %d; Elapsed (ms): %d"

    const/4 v4, 0x3

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    iget-object v6, p1, Lcom/facebook/analytics/e/j;->a:Ljava/lang/String;

    aput-object v6, v4, v5

    const/4 v5, 0x1

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    aput-object v6, v4, v5

    const/4 v5, 0x2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    aput-object v0, v4, v5

    invoke-static {v2, v3, v4}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_0

    .line 934
    :cond_5
    const-wide/16 v0, 0x0

    goto :goto_2
.end method

.method private declared-synchronized a(Lcom/facebook/analytics/e/j;Ljava/lang/String;JZLjava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/analytics/e/j;",
            "Ljava/lang/String;",
            "JZ",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 145
    monitor-enter p0

    :try_start_0
    invoke-direct {p0, p1, p2}, Lcom/facebook/analytics/e/a;->a(Lcom/facebook/analytics/e/j;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 146
    iget-object v1, p0, Lcom/facebook/analytics/e/a;->c:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v1, v0}, Ljava/util/concurrent/ConcurrentMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    .line 147
    if-nez v1, :cond_1

    .line 148
    iget-object v1, p0, Lcom/facebook/analytics/e/a;->c:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v1, v0, p1}, Ljava/util/concurrent/ConcurrentMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    sget-object v2, Lcom/facebook/analytics/e/h;->START:Lcom/facebook/analytics/e/h;

    move-object v0, p0

    move-object v1, p1

    move-wide v3, p3

    move-object v5, p6

    invoke-direct/range {v0 .. v5}, Lcom/facebook/analytics/e/a;->a(Lcom/facebook/analytics/e/j;Lcom/facebook/analytics/e/h;JLjava/util/Map;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 156
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    .line 150
    :cond_1
    if-eqz p5, :cond_0

    .line 153
    :try_start_1
    iget-object v1, p0, Lcom/facebook/analytics/e/a;->c:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v1, v0}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/analytics/e/j;

    .line 154
    sget-object v2, Lcom/facebook/analytics/e/h;->START:Lcom/facebook/analytics/e/h;

    move-object v0, p0

    move-wide v3, p3

    move-object v5, p6

    invoke-direct/range {v0 .. v5}, Lcom/facebook/analytics/e/a;->a(Lcom/facebook/analytics/e/j;Lcom/facebook/analytics/e/h;JLjava/util/Map;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 145
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private declared-synchronized a(Ljava/lang/String;Ljava/lang/String;JLjava/util/Map;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "J",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 626
    monitor-enter p0

    :try_start_0
    invoke-direct {p0, p3, p4}, Lcom/facebook/analytics/e/a;->a(J)J

    move-result-wide v4

    .line 631
    iget-object v7, p0, Lcom/facebook/analytics/e/a;->e:Ljava/util/concurrent/Executor;

    new-instance v0, Lcom/facebook/analytics/e/d;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/facebook/analytics/e/d;-><init>(Lcom/facebook/analytics/e/a;Ljava/lang/String;Ljava/lang/String;JLjava/util/Map;)V

    invoke-interface {v7, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 651
    monitor-exit p0

    return-void

    .line 626
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;JZLjava/util/Map;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "JZ",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 327
    invoke-direct {p0, p3, p4}, Lcom/facebook/analytics/e/a;->a(J)J

    move-result-wide v5

    .line 330
    iget-object v8, p0, Lcom/facebook/analytics/e/a;->e:Ljava/util/concurrent/Executor;

    new-instance v0, Lcom/facebook/analytics/e/b;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lcom/facebook/analytics/e/b;-><init>(Lcom/facebook/analytics/e/a;Ljava/lang/String;Ljava/lang/String;ZJLjava/util/Map;)V

    invoke-interface {v8, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 344
    return-void
.end method

.method private declared-synchronized b()Z
    .locals 7

    .prologue
    const/4 v0, 0x1

    const-wide/16 v5, 0x0

    .line 656
    monitor-enter p0

    :try_start_0
    iget-wide v1, p0, Lcom/facebook/analytics/e/a;->h:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    cmp-long v1, v1, v5

    if-nez v1, :cond_1

    .line 674
    :cond_0
    :goto_0
    monitor-exit p0

    return v0

    .line 659
    :cond_1
    :try_start_1
    iget-object v1, p0, Lcom/facebook/analytics/e/a;->j:Ljava/lang/Boolean;

    if-nez v1, :cond_5

    .line 662
    iget-wide v1, p0, Lcom/facebook/analytics/e/a;->i:J

    cmp-long v1, v1, v5

    if-lez v1, :cond_3

    iget-wide v1, p0, Lcom/facebook/analytics/e/a;->i:J

    .line 665
    :goto_1
    iget-wide v3, p0, Lcom/facebook/analytics/e/a;->h:J

    sub-long/2addr v1, v3

    .line 666
    const-wide/16 v3, 0x7d0

    cmp-long v1, v1, v3

    if-lez v1, :cond_4

    .line 669
    :goto_2
    if-nez v0, :cond_2

    iget-wide v1, p0, Lcom/facebook/analytics/e/a;->i:J

    cmp-long v1, v1, v5

    if-lez v1, :cond_0

    .line 670
    :cond_2
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/analytics/e/a;->j:Ljava/lang/Boolean;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 656
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 662
    :cond_3
    :try_start_2
    invoke-static {}, Lcom/facebook/common/time/c;->b()Lcom/facebook/common/time/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/common/time/c;->a()J

    move-result-wide v1

    goto :goto_1

    .line 666
    :cond_4
    const/4 v0, 0x0

    goto :goto_2

    .line 674
    :cond_5
    iget-object v0, p0, Lcom/facebook/analytics/e/a;->j:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result v0

    goto :goto_0
.end method

.method static synthetic b(Lcom/facebook/analytics/e/a;)Z
    .locals 1

    .prologue
    .line 77
    invoke-direct {p0}, Lcom/facebook/analytics/e/a;->b()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public a(Lcom/facebook/analytics/e/g;)V
    .locals 1

    .prologue
    .line 465
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/facebook/analytics/e/a;->a(Lcom/facebook/analytics/e/g;Z)V

    .line 466
    return-void
.end method

.method public a(Lcom/facebook/analytics/e/g;Z)V
    .locals 7

    .prologue
    .line 478
    invoke-virtual {p1}, Lcom/facebook/analytics/e/g;->d()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/facebook/analytics/e/a;->a(J)J

    move-result-wide v4

    .line 482
    if-nez p2, :cond_0

    invoke-virtual {p1}, Lcom/facebook/analytics/e/g;->c()D

    move-result-wide v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    cmpg-double v0, v0, v2

    if-gez v0, :cond_0

    .line 483
    iget-object v0, p0, Lcom/facebook/analytics/e/a;->c:Ljava/util/concurrent/ConcurrentMap;

    invoke-virtual {p1}, Lcom/facebook/analytics/e/g;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/analytics/e/g;->b()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v1, v2}, Lcom/facebook/analytics/e/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/concurrent/ConcurrentMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    .line 486
    if-nez v0, :cond_0

    .line 487
    invoke-virtual {p1}, Lcom/facebook/analytics/e/g;->c()D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/facebook/analytics/e/a;->a(D)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 520
    :goto_0
    return-void

    .line 493
    :cond_0
    iget-object v6, p0, Lcom/facebook/analytics/e/a;->e:Ljava/util/concurrent/Executor;

    new-instance v0, Lcom/facebook/analytics/e/c;

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    invoke-direct/range {v0 .. v5}, Lcom/facebook/analytics/e/c;-><init>(Lcom/facebook/analytics/e/a;Lcom/facebook/analytics/e/g;ZJ)V

    invoke-interface {v6, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method public a(Ljava/lang/String;)V
    .locals 7

    .prologue
    const/4 v2, 0x0

    .line 436
    const-wide/16 v3, -0x1

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v6, v2

    invoke-direct/range {v0 .. v6}, Lcom/facebook/analytics/e/a;->a(Ljava/lang/String;Ljava/lang/String;JZLjava/util/Map;)V

    .line 437
    return-void
.end method

.method public declared-synchronized a(Ljava/lang/String;D)V
    .locals 1

    .prologue
    .line 787
    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0, p1, v0, p2, p3}, Lcom/facebook/analytics/e/a;->a(Ljava/lang/String;Ljava/lang/String;D)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 788
    monitor-exit p0

    return-void

    .line 787
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(Ljava/lang/String;Ljava/lang/String;D)V
    .locals 9

    .prologue
    .line 807
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/analytics/e/a;->f:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v6

    .line 808
    iget-object v8, p0, Lcom/facebook/analytics/e/a;->e:Ljava/util/concurrent/Executor;

    new-instance v0, Lcom/facebook/analytics/e/e;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-wide v4, p3

    invoke-direct/range {v0 .. v7}, Lcom/facebook/analytics/e/e;-><init>(Lcom/facebook/analytics/e/a;Ljava/lang/String;Ljava/lang/String;DJ)V

    invoke-interface {v8, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 819
    monitor-exit p0

    return-void

    .line 807
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(Z)V
    .locals 1

    .prologue
    .line 947
    monitor-enter p0

    :try_start_0
    iput-boolean p1, p0, Lcom/facebook/analytics/e/a;->g:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 948
    monitor-exit p0

    return-void

    .line 947
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a()Z
    .locals 1

    .prologue
    .line 956
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/facebook/analytics/e/a;->g:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method protected a(D)Z
    .locals 2

    .prologue
    .line 523
    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v0

    cmpl-double v0, v0, p1

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b(Lcom/facebook/analytics/e/g;)V
    .locals 6

    .prologue
    .line 537
    invoke-virtual {p1}, Lcom/facebook/analytics/e/g;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/analytics/e/g;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/facebook/analytics/e/g;->e()J

    move-result-wide v3

    invoke-virtual {p1}, Lcom/facebook/analytics/e/g;->j()Ljava/util/Map;

    move-result-object v5

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/facebook/analytics/e/a;->a(Ljava/lang/String;Ljava/lang/String;JLjava/util/Map;)V

    .line 543
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 6

    .prologue
    const/4 v2, 0x0

    .line 555
    const-wide/16 v3, -0x1

    move-object v0, p0

    move-object v1, p1

    move-object v5, v2

    invoke-direct/range {v0 .. v5}, Lcom/facebook/analytics/e/a;->a(Ljava/lang/String;Ljava/lang/String;JLjava/util/Map;)V

    .line 556
    return-void
.end method
