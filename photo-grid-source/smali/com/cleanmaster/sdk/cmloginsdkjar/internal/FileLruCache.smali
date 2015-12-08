.class public final Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final HEADER_CACHEKEY_KEY:Ljava/lang/String; = "key"

.field private static final HEADER_CACHE_CONTENT_TAG_KEY:Ljava/lang/String; = "tag"

.field static final TAG:Ljava/lang/String;

.field private static final bufferIndex:Ljava/util/concurrent/atomic/AtomicLong;


# instance fields
.field private final directory:Ljava/io/File;

.field private isTrimInProgress:Z

.field private isTrimPending:Z

.field private lastClearCacheTime:Ljava/util/concurrent/atomic/AtomicLong;

.field private final limits:Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache$Limits;

.field private final lock:Ljava/lang/Object;

.field private final tag:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 43
    const-class v0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;->TAG:Ljava/lang/String;

    .line 47
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    sput-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;->bufferIndex:Ljava/util/concurrent/atomic/AtomicLong;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache$Limits;)V
    .locals 4

    .prologue
    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v2, 0x0

    invoke-direct {v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;->lastClearCacheTime:Ljava/util/concurrent/atomic/AtomicLong;

    .line 59
    iput-object p2, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;->tag:Ljava/lang/String;

    .line 60
    iput-object p3, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;->limits:Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache$Limits;

    .line 61
    new-instance v0, Ljava/io/File;

    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v1

    invoke-direct {v0, v1, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;->directory:Ljava/io/File;

    .line 62
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;->lock:Ljava/lang/Object;

    .line 65
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;->directory:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;->directory:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 67
    :cond_0
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;->directory:Ljava/io/File;

    invoke-static {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/d;->a(Ljava/io/File;)V

    .line 69
    :cond_1
    return-void
.end method

.method static synthetic access$000(Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;)Ljava/util/concurrent/atomic/AtomicLong;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;->lastClearCacheTime:Ljava/util/concurrent/atomic/AtomicLong;

    return-object v0
.end method

.method static synthetic access$100(Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;Ljava/lang/String;Ljava/io/File;)V
    .locals 0

    .prologue
    .line 42
    invoke-direct {p0, p1, p2}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;->renameToTargetAndTrim(Ljava/lang/String;Ljava/io/File;)V

    return-void
.end method

.method static synthetic access$200(Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;)V
    .locals 0

    .prologue
    .line 42
    invoke-direct {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;->trim()V

    return-void
.end method

.method static synthetic access$300()Ljava/util/concurrent/atomic/AtomicLong;
    .locals 1

    .prologue
    .line 42
    sget-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;->bufferIndex:Ljava/util/concurrent/atomic/AtomicLong;

    return-object v0
.end method

.method private postTrim()V
    .locals 3

    .prologue
    .line 250
    iget-object v1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;->lock:Ljava/lang/Object;

    monitor-enter v1

    .line 251
    :try_start_0
    iget-boolean v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;->isTrimPending:Z

    if-nez v0, :cond_0

    .line 252
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;->isTrimPending:Z

    .line 253
    invoke-static {}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->getExecutor()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v2, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/c;

    invoke-direct {v2, p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/c;-><init>(Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;)V

    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 260
    :cond_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private renameToTargetAndTrim(Ljava/lang/String;Ljava/io/File;)V
    .locals 3

    .prologue
    .line 223
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;->directory:Ljava/io/File;

    invoke-static {p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Utility;->md5hash(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 230
    invoke-virtual {p2, v0}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 231
    invoke-virtual {p2}, Ljava/io/File;->delete()Z

    .line 234
    :cond_0
    invoke-direct {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;->postTrim()V

    .line 235
    return-void
.end method

.method private trim()V
    .locals 14

    .prologue
    .line 264
    iget-object v1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;->lock:Ljava/lang/Object;

    monitor-enter v1

    .line 265
    const/4 v0, 0x0

    :try_start_0
    iput-boolean v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;->isTrimPending:Z

    .line 266
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;->isTrimInProgress:Z

    .line 267
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 269
    :try_start_1
    sget-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;->TAG:Ljava/lang/String;

    const-string v1, "trim started"

    invoke-static {v0, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 270
    new-instance v8, Ljava/util/PriorityQueue;

    invoke-direct {v8}, Ljava/util/PriorityQueue;-><init>()V

    .line 271
    const-wide/16 v2, 0x0

    .line 272
    const-wide/16 v0, 0x0

    .line 273
    iget-object v4, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;->directory:Ljava/io/File;

    invoke-static {}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/d;->a()Ljava/io/FilenameFilter;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v5

    .line 274
    if-eqz v5, :cond_2

    .line 275
    array-length v9, v5

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v9, :cond_2

    aget-object v6, v5, v4

    .line 276
    new-instance v7, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/i;

    invoke-direct {v7, v6}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/i;-><init>(Ljava/io/File;)V

    .line 277
    invoke-virtual {v8, v7}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    .line 278
    sget-object v10, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;->TAG:Ljava/lang/String;

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "  trim considering time="

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/i;->b()J

    move-result-wide v12

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v11

    const-string v12, " name="

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v7}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/i;->a()Ljava/io/File;

    move-result-object v7

    invoke-virtual {v7}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v10, v7}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 281
    invoke-virtual {v6}, Ljava/io/File;->length()J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    move-result-wide v6

    add-long/2addr v6, v2

    .line 282
    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    .line 275
    add-int/lit8 v0, v4, 0x1

    move v4, v0

    move-wide v0, v2

    move-wide v2, v6

    goto :goto_0

    .line 267
    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 286
    :goto_1
    :try_start_3
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;->limits:Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache$Limits;

    invoke-virtual {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache$Limits;->getByteCount()I

    move-result v0

    int-to-long v0, v0

    cmp-long v0, v4, v0

    if-gtz v0, :cond_0

    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;->limits:Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache$Limits;

    invoke-virtual {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache$Limits;->getFileCount()I

    move-result v0

    int-to-long v0, v0

    cmp-long v0, v2, v0

    if-lez v0, :cond_1

    .line 287
    :cond_0
    invoke-virtual {v8}, Ljava/util/PriorityQueue;->remove()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/i;

    invoke-virtual {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/i;->a()Ljava/io/File;

    move-result-object v6

    .line 288
    sget-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v7, "  trim removing "

    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 289
    invoke-virtual {v6}, Ljava/io/File;->length()J

    move-result-wide v0

    sub-long/2addr v4, v0

    .line 290
    const-wide/16 v0, 0x1

    sub-long v0, v2, v0

    .line 291
    invoke-virtual {v6}, Ljava/io/File;->delete()Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    move-wide v2, v0

    .line 292
    goto :goto_1

    .line 294
    :cond_1
    iget-object v1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;->lock:Ljava/lang/Object;

    monitor-enter v1

    .line 295
    const/4 v0, 0x0

    :try_start_4
    iput-boolean v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;->isTrimInProgress:Z

    .line 296
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;->lock:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    .line 297
    monitor-exit v1

    return-void

    :catchall_1
    move-exception v0

    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v0

    .line 294
    :catchall_2
    move-exception v0

    iget-object v1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;->lock:Ljava/lang/Object;

    monitor-enter v1

    .line 295
    const/4 v2, 0x0

    :try_start_5
    iput-boolean v2, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;->isTrimInProgress:Z

    .line 296
    iget-object v2, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;->lock:Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->notifyAll()V

    .line 297
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    throw v0

    :catchall_3
    move-exception v0

    :try_start_6
    monitor-exit v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    throw v0

    :cond_2
    move-wide v4, v2

    move-wide v2, v0

    goto :goto_1
.end method


# virtual methods
.method public final clearCache()V
    .locals 4

    .prologue
    .line 208
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;->directory:Ljava/io/File;

    invoke-static {}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/d;->a()Ljava/io/FilenameFilter;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v0

    .line 209
    iget-object v1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;->lastClearCacheTime:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 210
    if-eqz v0, :cond_0

    .line 211
    invoke-static {}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->getExecutor()Ljava/util/concurrent/Executor;

    move-result-object v1

    new-instance v2, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/b;

    invoke-direct {v2, p0, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/b;-><init>(Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;[Ljava/io/File;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 220
    :cond_0
    return-void
.end method

.method public final get(Ljava/lang/String;)Ljava/io/InputStream;
    .locals 1

    .prologue
    .line 98
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;->get(Ljava/lang/String;Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public final get(Ljava/lang/String;Ljava/lang/String;)Ljava/io/InputStream;
    .locals 7

    .prologue
    const/4 v0, 0x0

    .line 102
    new-instance v2, Ljava/io/File;

    iget-object v1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;->directory:Ljava/io/File;

    invoke-static {p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Utility;->md5hash(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 106
    :try_start_0
    new-instance v3, Ljava/io/FileInputStream;

    invoke-direct {v3, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 111
    new-instance v1, Ljava/io/BufferedInputStream;

    const/16 v4, 0x2000

    invoke-direct {v1, v3, v4}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    .line 115
    :try_start_1
    invoke-static {v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/k;->a(Ljava/io/InputStream;)Lorg/json/JSONObject;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v3

    .line 116
    if-nez v3, :cond_0

    .line 141
    invoke-virtual {v1}, Ljava/io/BufferedInputStream;->close()V

    :goto_0
    return-object v0

    .line 120
    :cond_0
    :try_start_2
    const-string v4, "key"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 121
    if-eqz v4, :cond_1

    invoke-virtual {v4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result v4

    if-nez v4, :cond_2

    .line 141
    :cond_1
    invoke-virtual {v1}, Ljava/io/BufferedInputStream;->close()V

    goto :goto_0

    .line 125
    :cond_2
    :try_start_3
    const-string v4, "tag"

    const/4 v5, 0x0

    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 127
    if-nez p2, :cond_3

    if-nez v3, :cond_4

    :cond_3
    if-eqz p2, :cond_5

    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-result v3

    if-nez v3, :cond_5

    .line 141
    :cond_4
    invoke-virtual {v1}, Ljava/io/BufferedInputStream;->close()V

    goto :goto_0

    .line 132
    :cond_5
    :try_start_4
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    .line 133
    sget-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v6, "Setting lastModified to "

    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v6, " for "

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    invoke-virtual {v2, v4, v5}, Ljava/io/File;->setLastModified(J)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-object v0, v1

    .line 141
    goto :goto_0

    .line 140
    :catchall_0
    move-exception v0

    .line 141
    invoke-virtual {v1}, Ljava/io/BufferedInputStream;->close()V

    throw v0

    .line 108
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public final interceptAndPut(Ljava/lang/String;Ljava/io/InputStream;)Ljava/io/InputStream;
    .locals 2

    .prologue
    .line 241
    invoke-virtual {p0, p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;->openPutStream(Ljava/lang/String;)Ljava/io/OutputStream;

    move-result-object v0

    .line 242
    new-instance v1, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/h;

    invoke-direct {v1, p2, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/h;-><init>(Ljava/io/InputStream;Ljava/io/OutputStream;)V

    return-object v1
.end method

.method final openPutStream(Ljava/lang/String;)Ljava/io/OutputStream;
    .locals 1

    .prologue
    .line 147
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;->openPutStream(Ljava/lang/String;Ljava/lang/String;)Ljava/io/OutputStream;

    move-result-object v0

    return-object v0
.end method

.method public final openPutStream(Ljava/lang/String;Ljava/lang/String;)Ljava/io/OutputStream;
    .locals 7

    .prologue
    const/4 v5, 0x5

    .line 151
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;->directory:Ljava/io/File;

    invoke-static {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/d;->b(Ljava/io/File;)Ljava/io/File;

    move-result-object v4

    .line 152
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    .line 153
    invoke-virtual {v4}, Ljava/io/File;->createNewFile()Z

    move-result v0

    if-nez v0, :cond_0

    .line 154
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Could not create file at "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 159
    :cond_0
    :try_start_0
    new-instance v6, Ljava/io/FileOutputStream;

    invoke-direct {v6, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 165
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 166
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/a;

    move-object v1, p0

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/a;-><init>(Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;JLjava/io/File;Ljava/lang/String;)V

    .line 179
    new-instance v1, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/g;

    invoke-direct {v1, v6, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/g;-><init>(Ljava/io/OutputStream;Lcom/cleanmaster/sdk/cmloginsdkjar/internal/j;)V

    .line 180
    new-instance v2, Ljava/io/BufferedOutputStream;

    const/16 v0, 0x2000

    invoke-direct {v2, v1, v0}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V

    .line 185
    :try_start_1
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 186
    const-string v1, "key"

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 187
    invoke-static {p2}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 188
    const-string v1, "tag"

    invoke-virtual {v0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1353
    :cond_1
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1354
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    .line 1357
    const/4 v1, 0x0

    invoke-virtual {v2, v1}, Ljava/io/OutputStream;->write(I)V

    .line 1358
    array-length v1, v0

    shr-int/lit8 v1, v1, 0x10

    and-int/lit16 v1, v1, 0xff

    invoke-virtual {v2, v1}, Ljava/io/OutputStream;->write(I)V

    .line 1359
    array-length v1, v0

    shr-int/lit8 v1, v1, 0x8

    and-int/lit16 v1, v1, 0xff

    invoke-virtual {v2, v1}, Ljava/io/OutputStream;->write(I)V

    .line 1360
    array-length v1, v0

    shr-int/lit8 v1, v1, 0x0

    and-int/lit16 v1, v1, 0xff

    invoke-virtual {v2, v1}, Ljava/io/OutputStream;->write(I)V

    .line 1362
    invoke-virtual {v2, v0}, Ljava/io/OutputStream;->write([B)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 201
    return-object v2

    .line 160
    :catch_0
    move-exception v0

    .line 161
    sget-object v1, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Error creating buffer output stream: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v5, v1, v2}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;->log(ILjava/lang/String;Ljava/lang/String;)V

    .line 162
    new-instance v1, Ljava/io/IOException;

    invoke-virtual {v0}, Ljava/io/FileNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 195
    :catch_1
    move-exception v0

    .line 197
    const/4 v1, 0x5

    :try_start_2
    sget-object v3, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;->TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Error creating JSON header for cache file: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v3, v4}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;->log(ILjava/lang/String;Ljava/lang/String;)V

    .line 198
    new-instance v1, Ljava/io/IOException;

    invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 200
    :catchall_0
    move-exception v0

    .line 201
    invoke-virtual {v2}, Ljava/io/BufferedOutputStream;->close()V

    throw v0
.end method

.method final sizeInBytesForTest()J
    .locals 7

    .prologue
    .line 77
    iget-object v1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;->lock:Ljava/lang/Object;

    monitor-enter v1

    .line 78
    :goto_0
    :try_start_0
    iget-boolean v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;->isTrimPending:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;->isTrimInProgress:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_1

    .line 80
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;->lock:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 83
    :catch_0
    move-exception v0

    goto :goto_0

    .line 85
    :cond_1
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 87
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;->directory:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v3

    .line 88
    const-wide/16 v0, 0x0

    .line 89
    if-eqz v3, :cond_2

    .line 90
    array-length v6, v3

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v6, :cond_2

    aget-object v4, v3, v2

    .line 91
    invoke-virtual {v4}, Ljava/io/File;->length()J

    move-result-wide v4

    add-long/2addr v4, v0

    .line 90
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    move-wide v0, v4

    goto :goto_1

    .line 85
    :catchall_0
    move-exception v0

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0

    .line 94
    :cond_2
    return-wide v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 246
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "{FileLruCache: tag:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;->tag:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " file:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;->directory:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
