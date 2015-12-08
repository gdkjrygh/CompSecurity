.class public final Lcom/squareup/okhttp/internal/http/OkResponseCacheAdapter;
.super Ljava/lang/Object;
.source "OkResponseCacheAdapter.java"

# interfaces
.implements Lcom/squareup/okhttp/OkResponseCache;


# instance fields
.field private final responseCache:Ljava/net/ResponseCache;


# direct methods
.method public constructor <init>(Ljava/net/ResponseCache;)V
    .locals 0
    .param p1, "responseCache"    # Ljava/net/ResponseCache;

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/squareup/okhttp/internal/http/OkResponseCacheAdapter;->responseCache:Ljava/net/ResponseCache;

    .line 34
    return-void
.end method


# virtual methods
.method public get(Ljava/net/URI;Ljava/lang/String;Ljava/util/Map;)Ljava/net/CacheResponse;
    .locals 1
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

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 38
    .local p3, "requestHeaders":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;>;"
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/OkResponseCacheAdapter;->responseCache:Ljava/net/ResponseCache;

    invoke-virtual {v0, p1, p2, p3}, Ljava/net/ResponseCache;->get(Ljava/net/URI;Ljava/lang/String;Ljava/util/Map;)Ljava/net/CacheResponse;

    move-result-object v0

    return-object v0
.end method

.method public maybeRemove(Ljava/lang/String;Ljava/net/URI;)V
    .locals 0
    .param p1, "requestMethod"    # Ljava/lang/String;
    .param p2, "uri"    # Ljava/net/URI;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 46
    return-void
.end method

.method public put(Ljava/net/URI;Ljava/net/URLConnection;)Ljava/net/CacheRequest;
    .locals 1
    .param p1, "uri"    # Ljava/net/URI;
    .param p2, "urlConnection"    # Ljava/net/URLConnection;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 42
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/OkResponseCacheAdapter;->responseCache:Ljava/net/ResponseCache;

    invoke-virtual {v0, p1, p2}, Ljava/net/ResponseCache;->put(Ljava/net/URI;Ljava/net/URLConnection;)Ljava/net/CacheRequest;

    move-result-object v0

    return-object v0
.end method

.method public trackConditionalCacheHit()V
    .locals 0

    .prologue
    .line 53
    return-void
.end method

.method public trackResponse(Lcom/squareup/okhttp/ResponseSource;)V
    .locals 0
    .param p1, "source"    # Lcom/squareup/okhttp/ResponseSource;

    .prologue
    .line 56
    return-void
.end method

.method public update(Ljava/net/CacheResponse;Ljava/net/HttpURLConnection;)V
    .locals 0
    .param p1, "conditionalCacheHit"    # Ljava/net/CacheResponse;
    .param p2, "connection"    # Ljava/net/HttpURLConnection;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 50
    return-void
.end method
