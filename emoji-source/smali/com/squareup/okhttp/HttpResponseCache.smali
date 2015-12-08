.class public final Lcom/squareup/okhttp/HttpResponseCache;
.super Ljava/net/ResponseCache;
.source "HttpResponseCache.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/squareup/okhttp/HttpResponseCache$EntrySecureCacheResponse;,
        Lcom/squareup/okhttp/HttpResponseCache$EntryCacheResponse;,
        Lcom/squareup/okhttp/HttpResponseCache$Entry;,
        Lcom/squareup/okhttp/HttpResponseCache$CacheRequestImpl;
    }
.end annotation


# static fields
.field private static final ENTRY_BODY:I = 0x1

.field private static final ENTRY_COUNT:I = 0x2

.field private static final ENTRY_METADATA:I = 0x0

.field private static final VERSION:I = 0x31191


# instance fields
.field private final cache:Lcom/squareup/okhttp/internal/DiskLruCache;

.field private hitCount:I

.field private networkCount:I

.field final okResponseCache:Lcom/squareup/okhttp/OkResponseCache;

.field private requestCount:I

.field private writeAbortCount:I

.field private writeSuccessCount:I


# direct methods
.method public constructor <init>(Ljava/io/File;J)V
    .locals 2
    .param p1, "directory"    # Ljava/io/File;
    .param p2, "maxSize"    # J
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 168
    invoke-direct {p0}, Ljava/net/ResponseCache;-><init>()V

    .line 140
    new-instance v0, Lcom/squareup/okhttp/HttpResponseCache$1;

    invoke-direct {v0, p0}, Lcom/squareup/okhttp/HttpResponseCache$1;-><init>(Lcom/squareup/okhttp/HttpResponseCache;)V

    iput-object v0, p0, Lcom/squareup/okhttp/HttpResponseCache;->okResponseCache:Lcom/squareup/okhttp/OkResponseCache;

    .line 169
    const v0, 0x31191

    const/4 v1, 0x2

    invoke-static {p1, v0, v1, p2, p3}, Lcom/squareup/okhttp/internal/DiskLruCache;->open(Ljava/io/File;IIJ)Lcom/squareup/okhttp/internal/DiskLruCache;

    move-result-object v0

    iput-object v0, p0, Lcom/squareup/okhttp/HttpResponseCache;->cache:Lcom/squareup/okhttp/internal/DiskLruCache;

    .line 170
    return-void
.end method

.method private abortQuietly(Lcom/squareup/okhttp/internal/DiskLruCache$Editor;)V
    .locals 1
    .param p1, "editor"    # Lcom/squareup/okhttp/internal/DiskLruCache$Editor;

    .prologue
    .line 290
    if-eqz p1, :cond_0

    .line 291
    :try_start_0
    invoke-virtual {p1}, Lcom/squareup/okhttp/internal/DiskLruCache$Editor;->abort()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 295
    :cond_0
    :goto_0
    return-void

    .line 293
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method static synthetic access$000(Lcom/squareup/okhttp/HttpResponseCache;Ljava/lang/String;Ljava/net/URI;)Z
    .locals 1
    .param p0, "x0"    # Lcom/squareup/okhttp/HttpResponseCache;
    .param p1, "x1"    # Ljava/lang/String;
    .param p2, "x2"    # Ljava/net/URI;

    .prologue
    .line 118
    invoke-direct {p0, p1, p2}, Lcom/squareup/okhttp/HttpResponseCache;->maybeRemove(Ljava/lang/String;Ljava/net/URI;)Z

    move-result v0

    return v0
.end method

.method static synthetic access$100(Lcom/squareup/okhttp/HttpResponseCache;Ljava/net/CacheResponse;Ljava/net/HttpURLConnection;)V
    .locals 0
    .param p0, "x0"    # Lcom/squareup/okhttp/HttpResponseCache;
    .param p1, "x1"    # Ljava/net/CacheResponse;
    .param p2, "x2"    # Ljava/net/HttpURLConnection;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 118
    invoke-direct {p0, p1, p2}, Lcom/squareup/okhttp/HttpResponseCache;->update(Ljava/net/CacheResponse;Ljava/net/HttpURLConnection;)V

    return-void
.end method

.method static synthetic access$1000(Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;)Ljava/io/InputStream;
    .locals 1
    .param p0, "x0"    # Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;

    .prologue
    .line 118
    invoke-static {p0}, Lcom/squareup/okhttp/HttpResponseCache;->newBodyInputStream(Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;)Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$200(Lcom/squareup/okhttp/HttpResponseCache;)V
    .locals 0
    .param p0, "x0"    # Lcom/squareup/okhttp/HttpResponseCache;

    .prologue
    .line 118
    invoke-direct {p0}, Lcom/squareup/okhttp/HttpResponseCache;->trackConditionalCacheHit()V

    return-void
.end method

.method static synthetic access$300(Lcom/squareup/okhttp/HttpResponseCache;Lcom/squareup/okhttp/ResponseSource;)V
    .locals 0
    .param p0, "x0"    # Lcom/squareup/okhttp/HttpResponseCache;
    .param p1, "x1"    # Lcom/squareup/okhttp/ResponseSource;

    .prologue
    .line 118
    invoke-direct {p0, p1}, Lcom/squareup/okhttp/HttpResponseCache;->trackResponse(Lcom/squareup/okhttp/ResponseSource;)V

    return-void
.end method

.method static synthetic access$808(Lcom/squareup/okhttp/HttpResponseCache;)I
    .locals 2
    .param p0, "x0"    # Lcom/squareup/okhttp/HttpResponseCache;

    .prologue
    .line 118
    iget v0, p0, Lcom/squareup/okhttp/HttpResponseCache;->writeSuccessCount:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/squareup/okhttp/HttpResponseCache;->writeSuccessCount:I

    return v0
.end method

.method static synthetic access$908(Lcom/squareup/okhttp/HttpResponseCache;)I
    .locals 2
    .param p0, "x0"    # Lcom/squareup/okhttp/HttpResponseCache;

    .prologue
    .line 118
    iget v0, p0, Lcom/squareup/okhttp/HttpResponseCache;->writeAbortCount:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/squareup/okhttp/HttpResponseCache;->writeAbortCount:I

    return v0
.end method

.method private getHttpEngine(Ljava/net/URLConnection;)Lcom/squareup/okhttp/internal/http/HttpEngine;
    .locals 1
    .param p1, "httpConnection"    # Ljava/net/URLConnection;

    .prologue
    .line 298
    instance-of v0, p1, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;

    if-eqz v0, :cond_0

    .line 299
    check-cast p1, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;

    .end local p1    # "httpConnection":Ljava/net/URLConnection;
    invoke-virtual {p1}, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->getHttpEngine()Lcom/squareup/okhttp/internal/http/HttpEngine;

    move-result-object v0

    .line 303
    :goto_0
    return-object v0

    .line 300
    .restart local p1    # "httpConnection":Ljava/net/URLConnection;
    :cond_0
    instance-of v0, p1, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;

    if-eqz v0, :cond_1

    .line 301
    check-cast p1, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;

    .end local p1    # "httpConnection":Ljava/net/URLConnection;
    invoke-virtual {p1}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->getHttpEngine()Lcom/squareup/okhttp/internal/http/HttpEngine;

    move-result-object v0

    goto :goto_0

    .line 303
    .restart local p1    # "httpConnection":Ljava/net/URLConnection;
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private maybeRemove(Ljava/lang/String;Ljava/net/URI;)Z
    .locals 2
    .param p1, "requestMethod"    # Ljava/lang/String;
    .param p2, "uri"    # Ljava/net/URI;

    .prologue
    .line 252
    const-string v0, "POST"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "PUT"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "DELETE"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 255
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/squareup/okhttp/HttpResponseCache;->cache:Lcom/squareup/okhttp/internal/DiskLruCache;

    invoke-direct {p0, p2}, Lcom/squareup/okhttp/HttpResponseCache;->uriToKey(Ljava/net/URI;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/squareup/okhttp/internal/DiskLruCache;->remove(Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 259
    :goto_0
    const/4 v0, 0x1

    .line 261
    :goto_1
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    .line 256
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private static newBodyInputStream(Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;)Ljava/io/InputStream;
    .locals 2
    .param p0, "snapshot"    # Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;

    .prologue
    .line 642
    new-instance v0, Lcom/squareup/okhttp/HttpResponseCache$2;

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;->getInputStream(I)Ljava/io/InputStream;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Lcom/squareup/okhttp/HttpResponseCache$2;-><init>(Ljava/io/InputStream;Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;)V

    return-object v0
.end method

.method private declared-synchronized trackConditionalCacheHit()V
    .locals 1

    .prologue
    .line 363
    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/squareup/okhttp/HttpResponseCache;->hitCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/squareup/okhttp/HttpResponseCache;->hitCount:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 364
    monitor-exit p0

    return-void

    .line 363
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private declared-synchronized trackResponse(Lcom/squareup/okhttp/ResponseSource;)V
    .locals 2
    .param p1, "source"    # Lcom/squareup/okhttp/ResponseSource;

    .prologue
    .line 349
    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/squareup/okhttp/HttpResponseCache;->requestCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/squareup/okhttp/HttpResponseCache;->requestCount:I

    .line 351
    sget-object v0, Lcom/squareup/okhttp/HttpResponseCache$3;->$SwitchMap$com$squareup$okhttp$ResponseSource:[I

    invoke-virtual {p1}, Lcom/squareup/okhttp/ResponseSource;->ordinal()I

    move-result v1

    aget v0, v0, v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    packed-switch v0, :pswitch_data_0

    .line 360
    :goto_0
    monitor-exit p0

    return-void

    .line 353
    :pswitch_0
    :try_start_1
    iget v0, p0, Lcom/squareup/okhttp/HttpResponseCache;->hitCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/squareup/okhttp/HttpResponseCache;->hitCount:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 349
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 357
    :pswitch_1
    :try_start_2
    iget v0, p0, Lcom/squareup/okhttp/HttpResponseCache;->networkCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/squareup/okhttp/HttpResponseCache;->networkCount:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 351
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method private update(Ljava/net/CacheResponse;Ljava/net/HttpURLConnection;)V
    .locals 10
    .param p1, "conditionalCacheHit"    # Ljava/net/CacheResponse;
    .param p2, "httpConnection"    # Ljava/net/HttpURLConnection;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 266
    invoke-direct {p0, p2}, Lcom/squareup/okhttp/HttpResponseCache;->getHttpEngine(Ljava/net/URLConnection;)Lcom/squareup/okhttp/internal/http/HttpEngine;

    move-result-object v3

    .line 267
    .local v3, "httpEngine":Lcom/squareup/okhttp/internal/http/HttpEngine;
    invoke-virtual {v3}, Lcom/squareup/okhttp/internal/http/HttpEngine;->getUri()Ljava/net/URI;

    move-result-object v6

    .line 268
    .local v6, "uri":Ljava/net/URI;
    invoke-virtual {v3}, Lcom/squareup/okhttp/internal/http/HttpEngine;->getResponseHeaders()Lcom/squareup/okhttp/internal/http/ResponseHeaders;

    move-result-object v4

    .line 270
    .local v4, "response":Lcom/squareup/okhttp/internal/http/ResponseHeaders;
    invoke-virtual {v3}, Lcom/squareup/okhttp/internal/http/HttpEngine;->getRequestHeaders()Lcom/squareup/okhttp/internal/http/RequestHeaders;

    move-result-object v8

    invoke-virtual {v8}, Lcom/squareup/okhttp/internal/http/RequestHeaders;->getHeaders()Lcom/squareup/okhttp/internal/http/RawHeaders;

    move-result-object v8

    invoke-virtual {v4}, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->getVaryFields()Ljava/util/Set;

    move-result-object v9

    invoke-virtual {v8, v9}, Lcom/squareup/okhttp/internal/http/RawHeaders;->getAll(Ljava/util/Set;)Lcom/squareup/okhttp/internal/http/RawHeaders;

    move-result-object v7

    .line 271
    .local v7, "varyHeaders":Lcom/squareup/okhttp/internal/http/RawHeaders;
    new-instance v2, Lcom/squareup/okhttp/HttpResponseCache$Entry;

    invoke-direct {v2, v6, v7, p2}, Lcom/squareup/okhttp/HttpResponseCache$Entry;-><init>(Ljava/net/URI;Lcom/squareup/okhttp/internal/http/RawHeaders;Ljava/net/HttpURLConnection;)V

    .line 272
    .local v2, "entry":Lcom/squareup/okhttp/HttpResponseCache$Entry;
    instance-of v8, p1, Lcom/squareup/okhttp/HttpResponseCache$EntryCacheResponse;

    if-eqz v8, :cond_1

    check-cast p1, Lcom/squareup/okhttp/HttpResponseCache$EntryCacheResponse;

    .line 273
    .end local p1    # "conditionalCacheHit":Ljava/net/CacheResponse;
    # getter for: Lcom/squareup/okhttp/HttpResponseCache$EntryCacheResponse;->snapshot:Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;
    invoke-static {p1}, Lcom/squareup/okhttp/HttpResponseCache$EntryCacheResponse;->access$500(Lcom/squareup/okhttp/HttpResponseCache$EntryCacheResponse;)Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;

    move-result-object v5

    .line 275
    .local v5, "snapshot":Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;
    :goto_0
    const/4 v1, 0x0

    .line 277
    .local v1, "editor":Lcom/squareup/okhttp/internal/DiskLruCache$Editor;
    :try_start_0
    invoke-virtual {v5}, Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;->edit()Lcom/squareup/okhttp/internal/DiskLruCache$Editor;

    move-result-object v1

    .line 278
    if-eqz v1, :cond_0

    .line 279
    invoke-virtual {v2, v1}, Lcom/squareup/okhttp/HttpResponseCache$Entry;->writeTo(Lcom/squareup/okhttp/internal/DiskLruCache$Editor;)V

    .line 280
    invoke-virtual {v1}, Lcom/squareup/okhttp/internal/DiskLruCache$Editor;->commit()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 285
    :cond_0
    :goto_1
    return-void

    .line 273
    .end local v1    # "editor":Lcom/squareup/okhttp/internal/DiskLruCache$Editor;
    .end local v5    # "snapshot":Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;
    .restart local p1    # "conditionalCacheHit":Ljava/net/CacheResponse;
    :cond_1
    check-cast p1, Lcom/squareup/okhttp/HttpResponseCache$EntrySecureCacheResponse;

    .line 274
    .end local p1    # "conditionalCacheHit":Ljava/net/CacheResponse;
    # getter for: Lcom/squareup/okhttp/HttpResponseCache$EntrySecureCacheResponse;->snapshot:Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;
    invoke-static {p1}, Lcom/squareup/okhttp/HttpResponseCache$EntrySecureCacheResponse;->access$600(Lcom/squareup/okhttp/HttpResponseCache$EntrySecureCacheResponse;)Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;

    move-result-object v5

    goto :goto_0

    .line 282
    .restart local v1    # "editor":Lcom/squareup/okhttp/internal/DiskLruCache$Editor;
    .restart local v5    # "snapshot":Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;
    :catch_0
    move-exception v0

    .line 283
    .local v0, "e":Ljava/io/IOException;
    invoke-direct {p0, v1}, Lcom/squareup/okhttp/HttpResponseCache;->abortQuietly(Lcom/squareup/okhttp/internal/DiskLruCache$Editor;)V

    goto :goto_1
.end method

.method private uriToKey(Ljava/net/URI;)Ljava/lang/String;
    .locals 1
    .param p1, "uri"    # Ljava/net/URI;

    .prologue
    .line 173
    invoke-virtual {p1}, Ljava/net/URI;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/squareup/okhttp/internal/Util;->hash(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 337
    iget-object v0, p0, Lcom/squareup/okhttp/HttpResponseCache;->cache:Lcom/squareup/okhttp/internal/DiskLruCache;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/DiskLruCache;->close()V

    .line 338
    return-void
.end method

.method public delete()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 313
    iget-object v0, p0, Lcom/squareup/okhttp/HttpResponseCache;->cache:Lcom/squareup/okhttp/internal/DiskLruCache;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/DiskLruCache;->delete()V

    .line 314
    return-void
.end method

.method public flush()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 333
    iget-object v0, p0, Lcom/squareup/okhttp/HttpResponseCache;->cache:Lcom/squareup/okhttp/internal/DiskLruCache;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/DiskLruCache;->flush()V

    .line 334
    return-void
.end method

.method public get(Ljava/net/URI;Ljava/lang/String;Ljava/util/Map;)Ljava/net/CacheResponse;
    .locals 6
    .param p1, "uri"    # Ljava/net/URI;
    .param p2, "requestMethod"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/URI;",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/net/CacheResponse;"
        }
    .end annotation

    .prologue
    .local p3, "requestHeaders":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;>;"
    const/4 v4, 0x0

    .line 178
    invoke-direct {p0, p1}, Lcom/squareup/okhttp/HttpResponseCache;->uriToKey(Ljava/net/URI;)Ljava/lang/String;

    move-result-object v2

    .line 182
    .local v2, "key":Ljava/lang/String;
    :try_start_0
    iget-object v5, p0, Lcom/squareup/okhttp/HttpResponseCache;->cache:Lcom/squareup/okhttp/internal/DiskLruCache;

    invoke-virtual {v5, v2}, Lcom/squareup/okhttp/internal/DiskLruCache;->get(Ljava/lang/String;)Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;

    move-result-object v3

    .line 183
    .local v3, "snapshot":Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;
    if-nez v3, :cond_0

    .line 197
    .end local v3    # "snapshot":Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;
    :goto_0
    return-object v4

    .line 186
    .restart local v3    # "snapshot":Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;
    :cond_0
    new-instance v1, Lcom/squareup/okhttp/HttpResponseCache$Entry;

    const/4 v5, 0x0

    invoke-virtual {v3, v5}, Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;->getInputStream(I)Ljava/io/InputStream;

    move-result-object v5

    invoke-direct {v1, v5}, Lcom/squareup/okhttp/HttpResponseCache$Entry;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 192
    .local v1, "entry":Lcom/squareup/okhttp/HttpResponseCache$Entry;
    invoke-virtual {v1, p1, p2, p3}, Lcom/squareup/okhttp/HttpResponseCache$Entry;->matches(Ljava/net/URI;Ljava/lang/String;Ljava/util/Map;)Z

    move-result v5

    if-nez v5, :cond_1

    .line 193
    invoke-virtual {v3}, Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;->close()V

    goto :goto_0

    .line 187
    .end local v1    # "entry":Lcom/squareup/okhttp/HttpResponseCache$Entry;
    .end local v3    # "snapshot":Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;
    :catch_0
    move-exception v0

    .line 189
    .local v0, "e":Ljava/io/IOException;
    goto :goto_0

    .line 197
    .end local v0    # "e":Ljava/io/IOException;
    .restart local v1    # "entry":Lcom/squareup/okhttp/HttpResponseCache$Entry;
    .restart local v3    # "snapshot":Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;
    :cond_1
    # invokes: Lcom/squareup/okhttp/HttpResponseCache$Entry;->isHttps()Z
    invoke-static {v1}, Lcom/squareup/okhttp/HttpResponseCache$Entry;->access$400(Lcom/squareup/okhttp/HttpResponseCache$Entry;)Z

    move-result v4

    if-eqz v4, :cond_2

    new-instance v4, Lcom/squareup/okhttp/HttpResponseCache$EntrySecureCacheResponse;

    invoke-direct {v4, v1, v3}, Lcom/squareup/okhttp/HttpResponseCache$EntrySecureCacheResponse;-><init>(Lcom/squareup/okhttp/HttpResponseCache$Entry;Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;)V

    goto :goto_0

    :cond_2
    new-instance v4, Lcom/squareup/okhttp/HttpResponseCache$EntryCacheResponse;

    invoke-direct {v4, v1, v3}, Lcom/squareup/okhttp/HttpResponseCache$EntryCacheResponse;-><init>(Lcom/squareup/okhttp/HttpResponseCache$Entry;Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;)V

    goto :goto_0
.end method

.method public getDirectory()Ljava/io/File;
    .locals 1

    .prologue
    .line 341
    iget-object v0, p0, Lcom/squareup/okhttp/HttpResponseCache;->cache:Lcom/squareup/okhttp/internal/DiskLruCache;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/DiskLruCache;->getDirectory()Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method public declared-synchronized getHitCount()I
    .locals 1

    .prologue
    .line 371
    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/squareup/okhttp/HttpResponseCache;->hitCount:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public getMaxSize()J
    .locals 2

    .prologue
    .line 329
    iget-object v0, p0, Lcom/squareup/okhttp/HttpResponseCache;->cache:Lcom/squareup/okhttp/internal/DiskLruCache;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/DiskLruCache;->getMaxSize()J

    move-result-wide v0

    return-wide v0
.end method

.method public declared-synchronized getNetworkCount()I
    .locals 1

    .prologue
    .line 367
    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/squareup/okhttp/HttpResponseCache;->networkCount:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized getRequestCount()I
    .locals 1

    .prologue
    .line 375
    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/squareup/okhttp/HttpResponseCache;->requestCount:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public getSize()J
    .locals 2

    .prologue
    .line 325
    iget-object v0, p0, Lcom/squareup/okhttp/HttpResponseCache;->cache:Lcom/squareup/okhttp/internal/DiskLruCache;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/DiskLruCache;->size()J

    move-result-wide v0

    return-wide v0
.end method

.method public declared-synchronized getWriteAbortCount()I
    .locals 1

    .prologue
    .line 317
    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/squareup/okhttp/HttpResponseCache;->writeAbortCount:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized getWriteSuccessCount()I
    .locals 1

    .prologue
    .line 321
    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/squareup/okhttp/HttpResponseCache;->writeSuccessCount:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public isClosed()Z
    .locals 1

    .prologue
    .line 345
    iget-object v0, p0, Lcom/squareup/okhttp/HttpResponseCache;->cache:Lcom/squareup/okhttp/internal/DiskLruCache;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/DiskLruCache;->isClosed()Z

    move-result v0

    return v0
.end method

.method public put(Ljava/net/URI;Ljava/net/URLConnection;)Ljava/net/CacheRequest;
    .locals 11
    .param p1, "uri"    # Ljava/net/URI;
    .param p2, "urlConnection"    # Ljava/net/URLConnection;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v8, 0x0

    .line 202
    instance-of v9, p2, Ljava/net/HttpURLConnection;

    if-nez v9, :cond_1

    .line 243
    :cond_0
    :goto_0
    return-object v8

    :cond_1
    move-object v3, p2

    .line 206
    check-cast v3, Ljava/net/HttpURLConnection;

    .line 207
    .local v3, "httpConnection":Ljava/net/HttpURLConnection;
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getRequestMethod()Ljava/lang/String;

    move-result-object v5

    .line 209
    .local v5, "requestMethod":Ljava/lang/String;
    invoke-direct {p0, v5, p1}, Lcom/squareup/okhttp/HttpResponseCache;->maybeRemove(Ljava/lang/String;Ljava/net/URI;)Z

    move-result v9

    if-nez v9, :cond_0

    .line 212
    const-string v9, "GET"

    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_0

    .line 219
    invoke-direct {p0, v3}, Lcom/squareup/okhttp/HttpResponseCache;->getHttpEngine(Ljava/net/URLConnection;)Lcom/squareup/okhttp/internal/http/HttpEngine;

    move-result-object v4

    .line 220
    .local v4, "httpEngine":Lcom/squareup/okhttp/internal/http/HttpEngine;
    if-eqz v4, :cond_0

    .line 225
    invoke-virtual {v4}, Lcom/squareup/okhttp/internal/http/HttpEngine;->getResponseHeaders()Lcom/squareup/okhttp/internal/http/ResponseHeaders;

    move-result-object v6

    .line 226
    .local v6, "response":Lcom/squareup/okhttp/internal/http/ResponseHeaders;
    invoke-virtual {v6}, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->hasVaryAll()Z

    move-result v9

    if-nez v9, :cond_0

    .line 231
    invoke-virtual {v4}, Lcom/squareup/okhttp/internal/http/HttpEngine;->getRequestHeaders()Lcom/squareup/okhttp/internal/http/RequestHeaders;

    move-result-object v9

    invoke-virtual {v9}, Lcom/squareup/okhttp/internal/http/RequestHeaders;->getHeaders()Lcom/squareup/okhttp/internal/http/RawHeaders;

    move-result-object v9

    invoke-virtual {v6}, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->getVaryFields()Ljava/util/Set;

    move-result-object v10

    invoke-virtual {v9, v10}, Lcom/squareup/okhttp/internal/http/RawHeaders;->getAll(Ljava/util/Set;)Lcom/squareup/okhttp/internal/http/RawHeaders;

    move-result-object v7

    .line 232
    .local v7, "varyHeaders":Lcom/squareup/okhttp/internal/http/RawHeaders;
    new-instance v2, Lcom/squareup/okhttp/HttpResponseCache$Entry;

    invoke-direct {v2, p1, v7, v3}, Lcom/squareup/okhttp/HttpResponseCache$Entry;-><init>(Ljava/net/URI;Lcom/squareup/okhttp/internal/http/RawHeaders;Ljava/net/HttpURLConnection;)V

    .line 233
    .local v2, "entry":Lcom/squareup/okhttp/HttpResponseCache$Entry;
    const/4 v1, 0x0

    .line 235
    .local v1, "editor":Lcom/squareup/okhttp/internal/DiskLruCache$Editor;
    :try_start_0
    iget-object v9, p0, Lcom/squareup/okhttp/HttpResponseCache;->cache:Lcom/squareup/okhttp/internal/DiskLruCache;

    invoke-direct {p0, p1}, Lcom/squareup/okhttp/HttpResponseCache;->uriToKey(Ljava/net/URI;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Lcom/squareup/okhttp/internal/DiskLruCache;->edit(Ljava/lang/String;)Lcom/squareup/okhttp/internal/DiskLruCache$Editor;

    move-result-object v1

    .line 236
    if-eqz v1, :cond_0

    .line 239
    invoke-virtual {v2, v1}, Lcom/squareup/okhttp/HttpResponseCache$Entry;->writeTo(Lcom/squareup/okhttp/internal/DiskLruCache$Editor;)V

    .line 240
    new-instance v9, Lcom/squareup/okhttp/HttpResponseCache$CacheRequestImpl;

    invoke-direct {v9, p0, v1}, Lcom/squareup/okhttp/HttpResponseCache$CacheRequestImpl;-><init>(Lcom/squareup/okhttp/HttpResponseCache;Lcom/squareup/okhttp/internal/DiskLruCache$Editor;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v8, v9

    goto :goto_0

    .line 241
    :catch_0
    move-exception v0

    .line 242
    .local v0, "e":Ljava/io/IOException;
    invoke-direct {p0, v1}, Lcom/squareup/okhttp/HttpResponseCache;->abortQuietly(Lcom/squareup/okhttp/internal/DiskLruCache$Editor;)V

    goto :goto_0
.end method
