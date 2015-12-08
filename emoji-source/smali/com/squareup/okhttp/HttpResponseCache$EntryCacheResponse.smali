.class Lcom/squareup/okhttp/HttpResponseCache$EntryCacheResponse;
.super Ljava/net/CacheResponse;
.source "HttpResponseCache.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/okhttp/HttpResponseCache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "EntryCacheResponse"
.end annotation


# instance fields
.field private final entry:Lcom/squareup/okhttp/HttpResponseCache$Entry;

.field private final in:Ljava/io/InputStream;

.field private final snapshot:Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;


# direct methods
.method public constructor <init>(Lcom/squareup/okhttp/HttpResponseCache$Entry;Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;)V
    .locals 1
    .param p1, "entry"    # Lcom/squareup/okhttp/HttpResponseCache$Entry;
    .param p2, "snapshot"    # Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;

    .prologue
    .line 655
    invoke-direct {p0}, Ljava/net/CacheResponse;-><init>()V

    .line 656
    iput-object p1, p0, Lcom/squareup/okhttp/HttpResponseCache$EntryCacheResponse;->entry:Lcom/squareup/okhttp/HttpResponseCache$Entry;

    .line 657
    iput-object p2, p0, Lcom/squareup/okhttp/HttpResponseCache$EntryCacheResponse;->snapshot:Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;

    .line 658
    # invokes: Lcom/squareup/okhttp/HttpResponseCache;->newBodyInputStream(Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;)Ljava/io/InputStream;
    invoke-static {p2}, Lcom/squareup/okhttp/HttpResponseCache;->access$1000(Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;)Ljava/io/InputStream;

    move-result-object v0

    iput-object v0, p0, Lcom/squareup/okhttp/HttpResponseCache$EntryCacheResponse;->in:Ljava/io/InputStream;

    .line 659
    return-void
.end method

.method static synthetic access$500(Lcom/squareup/okhttp/HttpResponseCache$EntryCacheResponse;)Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;
    .locals 1
    .param p0, "x0"    # Lcom/squareup/okhttp/HttpResponseCache$EntryCacheResponse;

    .prologue
    .line 650
    iget-object v0, p0, Lcom/squareup/okhttp/HttpResponseCache$EntryCacheResponse;->snapshot:Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;

    return-object v0
.end method


# virtual methods
.method public getBody()Ljava/io/InputStream;
    .locals 1

    .prologue
    .line 666
    iget-object v0, p0, Lcom/squareup/okhttp/HttpResponseCache$EntryCacheResponse;->in:Ljava/io/InputStream;

    return-object v0
.end method

.method public getHeaders()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .prologue
    .line 662
    iget-object v0, p0, Lcom/squareup/okhttp/HttpResponseCache$EntryCacheResponse;->entry:Lcom/squareup/okhttp/HttpResponseCache$Entry;

    # getter for: Lcom/squareup/okhttp/HttpResponseCache$Entry;->responseHeaders:Lcom/squareup/okhttp/internal/http/RawHeaders;
    invoke-static {v0}, Lcom/squareup/okhttp/HttpResponseCache$Entry;->access$1100(Lcom/squareup/okhttp/HttpResponseCache$Entry;)Lcom/squareup/okhttp/internal/http/RawHeaders;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/squareup/okhttp/internal/http/RawHeaders;->toMultimap(Z)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
