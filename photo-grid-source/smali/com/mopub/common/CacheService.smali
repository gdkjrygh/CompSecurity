.class public Lcom/mopub/common/CacheService;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lcom/mopub/common/DiskLruCache;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 215
    return-void
.end method

.method public static clearAndNullCaches()V
    .locals 2
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 235
    sget-object v0, Lcom/mopub/common/CacheService;->a:Lcom/mopub/common/DiskLruCache;

    if-eqz v0, :cond_0

    .line 237
    :try_start_0
    sget-object v0, Lcom/mopub/common/CacheService;->a:Lcom/mopub/common/DiskLruCache;

    invoke-virtual {v0}, Lcom/mopub/common/DiskLruCache;->delete()V

    .line 238
    const/4 v0, 0x0

    sput-object v0, Lcom/mopub/common/CacheService;->a:Lcom/mopub/common/DiskLruCache;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 243
    :cond_0
    :goto_0
    return-void

    .line 240
    :catch_0
    move-exception v0

    sput-object v1, Lcom/mopub/common/CacheService;->a:Lcom/mopub/common/DiskLruCache;

    goto :goto_0
.end method

.method public static containsKeyDiskCache(Ljava/lang/String;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 72
    sget-object v1, Lcom/mopub/common/CacheService;->a:Lcom/mopub/common/DiskLruCache;

    if-nez v1, :cond_1

    .line 80
    :cond_0
    :goto_0
    return v0

    .line 77
    :cond_1
    :try_start_0
    sget-object v1, Lcom/mopub/common/CacheService;->a:Lcom/mopub/common/DiskLruCache;

    invoke-static {p0}, Lcom/mopub/common/CacheService;->createValidDiskCacheKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/mopub/common/DiskLruCache;->get(Ljava/lang/String;)Lcom/mopub/common/DiskLruCache$Snapshot;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 78
    if-eqz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    .line 80
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public static createValidDiskCacheKey(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 63
    invoke-static {p0}, Lcom/mopub/common/util/Utils;->sha1(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getDiskCacheDirectory(Landroid/content/Context;)Ljava/io/File;
    .locals 3

    .prologue
    .line 67
    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    .line 68
    new-instance v1, Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "mopub-cache"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    return-object v1
.end method

.method public static getDiskLruCache()Lcom/mopub/common/DiskLruCache;
    .locals 1
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 249
    sget-object v0, Lcom/mopub/common/CacheService;->a:Lcom/mopub/common/DiskLruCache;

    return-object v0
.end method

.method public static getFilePathDiskCache(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 85
    sget-object v0, Lcom/mopub/common/CacheService;->a:Lcom/mopub/common/DiskLruCache;

    if-nez v0, :cond_0

    .line 86
    const/4 v0, 0x0

    .line 92
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/mopub/common/CacheService;->a:Lcom/mopub/common/DiskLruCache;

    invoke-virtual {v1}, Lcom/mopub/common/DiskLruCache;->getDirectory()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p0}, Lcom/mopub/common/CacheService;->createValidDiskCacheKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".0"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static getFromDiskCache(Ljava/lang/String;)[B
    .locals 7

    .prologue
    const/4 v0, 0x0

    .line 100
    sget-object v1, Lcom/mopub/common/CacheService;->a:Lcom/mopub/common/DiskLruCache;

    if-nez v1, :cond_1

    .line 130
    :cond_0
    :goto_0
    return-object v0

    .line 107
    :cond_1
    :try_start_0
    sget-object v1, Lcom/mopub/common/CacheService;->a:Lcom/mopub/common/DiskLruCache;

    invoke-static {p0}, Lcom/mopub/common/CacheService;->createValidDiskCacheKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/mopub/common/DiskLruCache;->get(Ljava/lang/String;)Lcom/mopub/common/DiskLruCache$Snapshot;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result-object v2

    .line 108
    if-nez v2, :cond_2

    .line 125
    if-eqz v2, :cond_0

    .line 126
    invoke-virtual {v2}, Lcom/mopub/common/DiskLruCache$Snapshot;->close()V

    goto :goto_0

    .line 112
    :cond_2
    const/4 v1, 0x0

    :try_start_1
    invoke-virtual {v2, v1}, Lcom/mopub/common/DiskLruCache$Snapshot;->getInputStream(I)Ljava/io/InputStream;

    move-result-object v3

    .line 113
    if-eqz v3, :cond_3

    .line 114
    const/4 v1, 0x0

    invoke-virtual {v2, v1}, Lcom/mopub/common/DiskLruCache$Snapshot;->getLength(I)J

    move-result-wide v4

    long-to-int v1, v4

    new-array v1, v1, [B
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 115
    :try_start_2
    new-instance v0, Ljava/io/BufferedInputStream;

    invoke-direct {v0, v3}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 117
    :try_start_3
    invoke-static {v0, v1}, Lcom/mopub/common/util/Streams;->readStream(Ljava/io/InputStream;[B)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 119
    :try_start_4
    invoke-static {v0}, Lcom/mopub/common/util/Streams;->closeStream(Ljava/io/Closeable;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    move-object v0, v1

    .line 125
    :cond_3
    if-eqz v2, :cond_0

    .line 126
    invoke-virtual {v2}, Lcom/mopub/common/DiskLruCache$Snapshot;->close()V

    goto :goto_0

    .line 119
    :catchall_0
    move-exception v3

    :try_start_5
    invoke-static {v0}, Lcom/mopub/common/util/Streams;->closeStream(Ljava/io/Closeable;)V

    throw v3
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 122
    :catch_0
    move-exception v0

    move-object v6, v0

    move-object v0, v1

    move-object v1, v6

    .line 123
    :goto_1
    :try_start_6
    const-string v3, "Unable to get from DiskLruCache"

    invoke-static {v3, v1}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 125
    if-eqz v2, :cond_0

    .line 126
    invoke-virtual {v2}, Lcom/mopub/common/DiskLruCache$Snapshot;->close()V

    goto :goto_0

    .line 125
    :catchall_1
    move-exception v1

    move-object v2, v0

    move-object v0, v1

    :goto_2
    if-eqz v2, :cond_4

    .line 126
    invoke-virtual {v2}, Lcom/mopub/common/DiskLruCache$Snapshot;->close()V

    :cond_4
    throw v0

    .line 125
    :catchall_2
    move-exception v0

    goto :goto_2

    .line 122
    :catch_1
    move-exception v1

    move-object v2, v0

    goto :goto_1

    :catch_2
    move-exception v1

    goto :goto_1
.end method

.method public static getFromDiskCacheAsync(Ljava/lang/String;Lcom/mopub/common/CacheService$DiskLruCacheGetListener;)V
    .locals 2

    .prologue
    .line 134
    new-instance v0, Lcom/mopub/common/a;

    invoke-direct {v0, p0, p1}, Lcom/mopub/common/a;-><init>(Ljava/lang/String;Lcom/mopub/common/CacheService$DiskLruCacheGetListener;)V

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lcom/mopub/common/a;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 135
    return-void
.end method

.method public static initialize(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 59
    invoke-static {p0}, Lcom/mopub/common/CacheService;->initializeDiskCache(Landroid/content/Context;)Z

    .line 60
    return-void
.end method

.method public static initializeDiskCache(Landroid/content/Context;)Z
    .locals 6

    .prologue
    const/4 v0, 0x1

    .line 37
    if-nez p0, :cond_1

    .line 38
    const/4 v0, 0x0

    .line 55
    :cond_0
    :goto_0
    return v0

    .line 41
    :cond_1
    sget-object v1, Lcom/mopub/common/CacheService;->a:Lcom/mopub/common/DiskLruCache;

    if-nez v1, :cond_0

    .line 42
    invoke-static {p0}, Lcom/mopub/common/CacheService;->getDiskCacheDirectory(Landroid/content/Context;)Ljava/io/File;

    move-result-object v1

    .line 43
    invoke-static {v1}, Lcom/mopub/common/util/DeviceUtils;->diskCacheSizeBytes(Ljava/io/File;)J

    move-result-wide v2

    .line 45
    const/4 v4, 0x1

    const/4 v5, 0x1

    :try_start_0
    invoke-static {v1, v4, v5, v2, v3}, Lcom/mopub/common/DiskLruCache;->open(Ljava/io/File;IIJ)Lcom/mopub/common/DiskLruCache;

    move-result-object v1

    sput-object v1, Lcom/mopub/common/CacheService;->a:Lcom/mopub/common/DiskLruCache;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 51
    :catch_0
    move-exception v1

    .line 52
    const-string v2, "Unable to create DiskLruCache"

    invoke-static {v2, v1}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public static putToDiskCache(Ljava/lang/String;Ljava/io/InputStream;)Z
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 142
    sget-object v1, Lcom/mopub/common/CacheService;->a:Lcom/mopub/common/DiskLruCache;

    if-nez v1, :cond_1

    .line 174
    :cond_0
    :goto_0
    return v0

    .line 146
    :cond_1
    const/4 v2, 0x0

    .line 148
    :try_start_0
    sget-object v1, Lcom/mopub/common/CacheService;->a:Lcom/mopub/common/DiskLruCache;

    invoke-static {p0}, Lcom/mopub/common/CacheService;->createValidDiskCacheKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/mopub/common/DiskLruCache;->edit(Ljava/lang/String;)Lcom/mopub/common/DiskLruCache$Editor;

    move-result-object v2

    .line 150
    if-eqz v2, :cond_0

    .line 155
    new-instance v1, Ljava/io/BufferedOutputStream;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/mopub/common/DiskLruCache$Editor;->newOutputStream(I)Ljava/io/OutputStream;

    move-result-object v3

    invoke-direct {v1, v3}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 157
    invoke-static {p1, v1}, Lcom/mopub/common/util/Streams;->copyContent(Ljava/io/InputStream;Ljava/io/OutputStream;)V

    .line 158
    invoke-virtual {v1}, Ljava/io/OutputStream;->flush()V

    .line 159
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    .line 161
    sget-object v1, Lcom/mopub/common/CacheService;->a:Lcom/mopub/common/DiskLruCache;

    invoke-virtual {v1}, Lcom/mopub/common/DiskLruCache;->flush()V

    .line 162
    invoke-virtual {v2}, Lcom/mopub/common/DiskLruCache$Editor;->commit()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 174
    const/4 v0, 0x1

    goto :goto_0

    .line 163
    :catch_0
    move-exception v1

    .line 164
    const-string v3, "Unable to put to DiskLruCache"

    invoke-static {v3, v1}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 166
    if-eqz v2, :cond_0

    .line 167
    :try_start_1
    invoke-virtual {v2}, Lcom/mopub/common/DiskLruCache$Editor;->abort()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception v1

    goto :goto_0
.end method

.method public static putToDiskCache(Ljava/lang/String;[B)Z
    .locals 1

    .prologue
    .line 138
    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-static {p0, v0}, Lcom/mopub/common/CacheService;->putToDiskCache(Ljava/lang/String;Ljava/io/InputStream;)Z

    move-result v0

    return v0
.end method

.method public static putToDiskCacheAsync(Ljava/lang/String;[B)V
    .locals 2

    .prologue
    .line 178
    new-instance v0, Lcom/mopub/common/b;

    invoke-direct {v0, p0, p1}, Lcom/mopub/common/b;-><init>(Ljava/lang/String;[B)V

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lcom/mopub/common/b;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 179
    return-void
.end method
