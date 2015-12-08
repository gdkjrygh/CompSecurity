.class final Lcom/mopub/volley/toolbox/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public etag:Ljava/lang/String;

.field public key:Ljava/lang/String;

.field public responseHeaders:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public serverDate:J

.field public size:J

.field public softTtl:J

.field public ttl:J


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 361
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/mopub/volley/Cache$Entry;)V
    .locals 2

    .prologue
    .line 368
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 369
    iput-object p1, p0, Lcom/mopub/volley/toolbox/b;->key:Ljava/lang/String;

    .line 370
    iget-object v0, p2, Lcom/mopub/volley/Cache$Entry;->data:[B

    array-length v0, v0

    int-to-long v0, v0

    iput-wide v0, p0, Lcom/mopub/volley/toolbox/b;->size:J

    .line 371
    iget-object v0, p2, Lcom/mopub/volley/Cache$Entry;->etag:Ljava/lang/String;

    iput-object v0, p0, Lcom/mopub/volley/toolbox/b;->etag:Ljava/lang/String;

    .line 372
    iget-wide v0, p2, Lcom/mopub/volley/Cache$Entry;->serverDate:J

    iput-wide v0, p0, Lcom/mopub/volley/toolbox/b;->serverDate:J

    .line 373
    iget-wide v0, p2, Lcom/mopub/volley/Cache$Entry;->ttl:J

    iput-wide v0, p0, Lcom/mopub/volley/toolbox/b;->ttl:J

    .line 374
    iget-wide v0, p2, Lcom/mopub/volley/Cache$Entry;->softTtl:J

    iput-wide v0, p0, Lcom/mopub/volley/toolbox/b;->softTtl:J

    .line 375
    iget-object v0, p2, Lcom/mopub/volley/Cache$Entry;->responseHeaders:Ljava/util/Map;

    iput-object v0, p0, Lcom/mopub/volley/toolbox/b;->responseHeaders:Ljava/util/Map;

    .line 376
    return-void
.end method

.method public static readHeader(Ljava/io/InputStream;)Lcom/mopub/volley/toolbox/b;
    .locals 4

    .prologue
    .line 384
    new-instance v0, Lcom/mopub/volley/toolbox/b;

    invoke-direct {v0}, Lcom/mopub/volley/toolbox/b;-><init>()V

    .line 385
    invoke-static {p0}, Lcom/mopub/volley/toolbox/DiskBasedCache;->a(Ljava/io/InputStream;)I

    move-result v1

    .line 386
    const v2, 0x20140623

    if-eq v1, v2, :cond_0

    .line 388
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0}, Ljava/io/IOException;-><init>()V

    throw v0

    .line 390
    :cond_0
    invoke-static {p0}, Lcom/mopub/volley/toolbox/DiskBasedCache;->c(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/mopub/volley/toolbox/b;->key:Ljava/lang/String;

    .line 391
    invoke-static {p0}, Lcom/mopub/volley/toolbox/DiskBasedCache;->c(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/mopub/volley/toolbox/b;->etag:Ljava/lang/String;

    .line 392
    iget-object v1, v0, Lcom/mopub/volley/toolbox/b;->etag:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 393
    const/4 v1, 0x0

    iput-object v1, v0, Lcom/mopub/volley/toolbox/b;->etag:Ljava/lang/String;

    .line 395
    :cond_1
    invoke-static {p0}, Lcom/mopub/volley/toolbox/DiskBasedCache;->b(Ljava/io/InputStream;)J

    move-result-wide v2

    iput-wide v2, v0, Lcom/mopub/volley/toolbox/b;->serverDate:J

    .line 396
    invoke-static {p0}, Lcom/mopub/volley/toolbox/DiskBasedCache;->b(Ljava/io/InputStream;)J

    move-result-wide v2

    iput-wide v2, v0, Lcom/mopub/volley/toolbox/b;->ttl:J

    .line 397
    invoke-static {p0}, Lcom/mopub/volley/toolbox/DiskBasedCache;->b(Ljava/io/InputStream;)J

    move-result-wide v2

    iput-wide v2, v0, Lcom/mopub/volley/toolbox/b;->softTtl:J

    .line 398
    invoke-static {p0}, Lcom/mopub/volley/toolbox/DiskBasedCache;->d(Ljava/io/InputStream;)Ljava/util/Map;

    move-result-object v1

    iput-object v1, v0, Lcom/mopub/volley/toolbox/b;->responseHeaders:Ljava/util/Map;

    .line 399
    return-object v0
.end method


# virtual methods
.method public final toCacheEntry([B)Lcom/mopub/volley/Cache$Entry;
    .locals 4

    .prologue
    .line 406
    new-instance v0, Lcom/mopub/volley/Cache$Entry;

    invoke-direct {v0}, Lcom/mopub/volley/Cache$Entry;-><init>()V

    .line 407
    iput-object p1, v0, Lcom/mopub/volley/Cache$Entry;->data:[B

    .line 408
    iget-object v1, p0, Lcom/mopub/volley/toolbox/b;->etag:Ljava/lang/String;

    iput-object v1, v0, Lcom/mopub/volley/Cache$Entry;->etag:Ljava/lang/String;

    .line 409
    iget-wide v2, p0, Lcom/mopub/volley/toolbox/b;->serverDate:J

    iput-wide v2, v0, Lcom/mopub/volley/Cache$Entry;->serverDate:J

    .line 410
    iget-wide v2, p0, Lcom/mopub/volley/toolbox/b;->ttl:J

    iput-wide v2, v0, Lcom/mopub/volley/Cache$Entry;->ttl:J

    .line 411
    iget-wide v2, p0, Lcom/mopub/volley/toolbox/b;->softTtl:J

    iput-wide v2, v0, Lcom/mopub/volley/Cache$Entry;->softTtl:J

    .line 412
    iget-object v1, p0, Lcom/mopub/volley/toolbox/b;->responseHeaders:Ljava/util/Map;

    iput-object v1, v0, Lcom/mopub/volley/Cache$Entry;->responseHeaders:Ljava/util/Map;

    .line 413
    return-object v0
.end method

.method public final writeHeader(Ljava/io/OutputStream;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 422
    const v2, 0x20140623

    :try_start_0
    invoke-static {p1, v2}, Lcom/mopub/volley/toolbox/DiskBasedCache;->a(Ljava/io/OutputStream;I)V

    .line 423
    iget-object v2, p0, Lcom/mopub/volley/toolbox/b;->key:Ljava/lang/String;

    invoke-static {p1, v2}, Lcom/mopub/volley/toolbox/DiskBasedCache;->a(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 424
    iget-object v2, p0, Lcom/mopub/volley/toolbox/b;->etag:Ljava/lang/String;

    if-nez v2, :cond_0

    const-string v2, ""

    :goto_0
    invoke-static {p1, v2}, Lcom/mopub/volley/toolbox/DiskBasedCache;->a(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 425
    iget-wide v2, p0, Lcom/mopub/volley/toolbox/b;->serverDate:J

    invoke-static {p1, v2, v3}, Lcom/mopub/volley/toolbox/DiskBasedCache;->a(Ljava/io/OutputStream;J)V

    .line 426
    iget-wide v2, p0, Lcom/mopub/volley/toolbox/b;->ttl:J

    invoke-static {p1, v2, v3}, Lcom/mopub/volley/toolbox/DiskBasedCache;->a(Ljava/io/OutputStream;J)V

    .line 427
    iget-wide v2, p0, Lcom/mopub/volley/toolbox/b;->softTtl:J

    invoke-static {p1, v2, v3}, Lcom/mopub/volley/toolbox/DiskBasedCache;->a(Ljava/io/OutputStream;J)V

    .line 428
    iget-object v2, p0, Lcom/mopub/volley/toolbox/b;->responseHeaders:Ljava/util/Map;

    invoke-static {v2, p1}, Lcom/mopub/volley/toolbox/DiskBasedCache;->a(Ljava/util/Map;Ljava/io/OutputStream;)V

    .line 429
    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V

    .line 433
    :goto_1
    return v0

    .line 424
    :cond_0
    iget-object v2, p0, Lcom/mopub/volley/toolbox/b;->etag:Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 431
    :catch_0
    move-exception v2

    .line 432
    const-string v3, "%s"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v3, v0}, Lcom/mopub/volley/VolleyLog;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    move v0, v1

    .line 433
    goto :goto_1
.end method
