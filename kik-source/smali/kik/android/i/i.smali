.class public final Lkik/android/i/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x12
.end annotation


# static fields
.field private static c:Lkik/android/i/i;


# instance fields
.field protected a:Lcom/kik/l/ab;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected b:Lcom/kik/android/a;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private d:Ljava/util/concurrent/ExecutorService;

.field private e:Ljava/util/Map;


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lkik/android/i/i;->d:Ljava/util/concurrent/ExecutorService;

    .line 40
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lkik/android/i/i;->e:Ljava/util/Map;

    .line 47
    return-void
.end method

.method static synthetic a(Lkik/android/i/i;)Ljava/util/Map;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lkik/android/i/i;->e:Ljava/util/Map;

    return-object v0
.end method

.method public static a()Lkik/android/i/i;
    .locals 1

    .prologue
    .line 51
    sget-object v0, Lkik/android/i/i;->c:Lkik/android/i/i;

    if-nez v0, :cond_0

    .line 52
    new-instance v0, Lkik/android/i/i;

    invoke-direct {v0}, Lkik/android/i/i;-><init>()V

    sput-object v0, Lkik/android/i/i;->c:Lkik/android/i/i;

    .line 54
    :cond_0
    sget-object v0, Lkik/android/i/i;->c:Lkik/android/i/i;

    return-object v0
.end method


# virtual methods
.method public final declared-synchronized a(Ljava/lang/String;)Lcom/kik/g/p;
    .locals 1

    .prologue
    .line 70
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lkik/android/i/i;->e:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 71
    iget-object v0, p0, Lkik/android/i/i;->e:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Pair;

    iget-object v0, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Lcom/kik/g/p;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    :goto_0
    monitor-exit p0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 70
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized a(Ljava/lang/String;ILjava/lang/String;)Lcom/kik/g/p;
    .locals 13

    .prologue
    .line 87
    monitor-enter p0

    :try_start_0
    invoke-virtual {p0, p1}, Lkik/android/i/i;->a(Ljava/lang/String;)Lcom/kik/g/p;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 88
    if-eqz v0, :cond_0

    .line 178
    :goto_0
    monitor-exit p0

    return-object v0

    .line 92
    :cond_0
    :try_start_1
    new-instance v0, Landroid/media/MediaMetadataRetriever;

    invoke-direct {v0}, Landroid/media/MediaMetadataRetriever;-><init>()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 94
    :try_start_2
    invoke-virtual {v0, p1}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 100
    const/16 v1, 0x14

    :try_start_3
    invoke-static {v0, v1}, Lkik/android/util/ct;->a(Landroid/media/MediaMetadataRetriever;I)I

    move-result v9

    .line 101
    const/16 v1, 0x12

    invoke-static {v0, v1}, Lkik/android/util/ct;->a(Landroid/media/MediaMetadataRetriever;I)I

    move-result v7

    .line 102
    const/16 v1, 0x13

    invoke-static {v0, v1}, Lkik/android/util/ct;->a(Landroid/media/MediaMetadataRetriever;I)I

    move-result v8

    .line 103
    const/16 v1, 0x18

    invoke-static {v0, v1}, Lkik/android/util/ct;->a(Landroid/media/MediaMetadataRetriever;I)I

    move-result v4

    .line 104
    const/16 v1, 0x9

    invoke-static {v0, v1}, Lkik/android/util/ct;->b(Landroid/media/MediaMetadataRetriever;I)J

    move-result-wide v10

    .line 105
    invoke-virtual {v0}, Landroid/media/MediaMetadataRetriever;->release()V

    .line 107
    iget-object v0, p0, Lkik/android/i/i;->a:Lcom/kik/l/ab;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/kik/l/ab;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 108
    new-instance v0, Lkik/android/i/h;

    new-instance v3, Landroid/graphics/Point;

    invoke-direct {v3, v7, v8}, Landroid/graphics/Point;-><init>(II)V

    move-object v1, p1

    move v5, p2

    invoke-direct/range {v0 .. v5}, Lkik/android/i/h;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Point;II)V

    .line 109
    invoke-virtual {v0}, Lkik/android/i/h;->a()Lcom/kik/g/p;

    move-result-object v12

    .line 110
    iget-object v1, p0, Lkik/android/i/i;->d:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object v0

    .line 111
    iget-object v1, p0, Lkik/android/i/i;->e:Ljava/util/Map;

    new-instance v3, Landroid/util/Pair;

    invoke-direct {v3, v12, v0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v1, p1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 113
    new-instance v0, Lkik/android/i/j;

    move-object v1, p0

    move-object v3, p1

    move-object/from16 v6, p3

    invoke-direct/range {v0 .. v11}, Lkik/android/i/j;-><init>(Lkik/android/i/i;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;IIIJ)V

    invoke-virtual {v12, v0}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    move-object v0, v12

    .line 178
    goto :goto_0

    .line 96
    :catch_0
    move-exception v0

    invoke-static {v0}, Lcom/kik/g/s;->a(Ljava/lang/Throwable;)Lcom/kik/g/p;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-result-object v0

    goto :goto_0

    .line 87
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized b(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 183
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lkik/android/i/i;->e:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Pair;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 184
    if-nez v0, :cond_1

    .line 200
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    .line 188
    :cond_1
    :try_start_1
    iget-object v1, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/Future;

    .line 189
    if-eqz v1, :cond_2

    .line 192
    const/4 v2, 0x1

    invoke-interface {v1, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 195
    :cond_2
    iget-object v0, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Lcom/kik/g/p;

    .line 196
    if-eqz v0, :cond_0

    .line 198
    invoke-virtual {v0}, Lcom/kik/g/p;->e()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 183
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
