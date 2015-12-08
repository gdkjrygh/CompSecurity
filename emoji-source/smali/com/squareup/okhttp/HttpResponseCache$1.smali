.class Lcom/squareup/okhttp/HttpResponseCache$1;
.super Ljava/lang/Object;
.source "HttpResponseCache.java"

# interfaces
.implements Lcom/squareup/okhttp/OkResponseCache;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/okhttp/HttpResponseCache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/squareup/okhttp/HttpResponseCache;


# direct methods
.method constructor <init>(Lcom/squareup/okhttp/HttpResponseCache;)V
    .locals 0
    .param p1, "this$0"    # Lcom/squareup/okhttp/HttpResponseCache;

    .prologue
    .line 140
    iput-object p1, p0, Lcom/squareup/okhttp/HttpResponseCache$1;->this$0:Lcom/squareup/okhttp/HttpResponseCache;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
    .line 143
    .local p3, "requestHeaders":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;>;"
    iget-object v0, p0, Lcom/squareup/okhttp/HttpResponseCache$1;->this$0:Lcom/squareup/okhttp/HttpResponseCache;

    invoke-virtual {v0, p1, p2, p3}, Lcom/squareup/okhttp/HttpResponseCache;->get(Ljava/net/URI;Ljava/lang/String;Ljava/util/Map;)Ljava/net/CacheResponse;

    move-result-object v0

    return-object v0
.end method

.method public maybeRemove(Ljava/lang/String;Ljava/net/URI;)V
    .locals 1
    .param p1, "requestMethod"    # Ljava/lang/String;
    .param p2, "uri"    # Ljava/net/URI;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 151
    iget-object v0, p0, Lcom/squareup/okhttp/HttpResponseCache$1;->this$0:Lcom/squareup/okhttp/HttpResponseCache;

    # invokes: Lcom/squareup/okhttp/HttpResponseCache;->maybeRemove(Ljava/lang/String;Ljava/net/URI;)Z
    invoke-static {v0, p1, p2}, Lcom/squareup/okhttp/HttpResponseCache;->access$000(Lcom/squareup/okhttp/HttpResponseCache;Ljava/lang/String;Ljava/net/URI;)Z

    .line 152
    return-void
.end method

.method public put(Ljava/net/URI;Ljava/net/URLConnection;)Ljava/net/CacheRequest;
    .locals 1
    .param p1, "uri"    # Ljava/net/URI;
    .param p2, "connection"    # Ljava/net/URLConnection;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 147
    iget-object v0, p0, Lcom/squareup/okhttp/HttpResponseCache$1;->this$0:Lcom/squareup/okhttp/HttpResponseCache;

    invoke-virtual {v0, p1, p2}, Lcom/squareup/okhttp/HttpResponseCache;->put(Ljava/net/URI;Ljava/net/URLConnection;)Ljava/net/CacheRequest;

    move-result-object v0

    return-object v0
.end method

.method public trackConditionalCacheHit()V
    .locals 1

    .prologue
    .line 160
    iget-object v0, p0, Lcom/squareup/okhttp/HttpResponseCache$1;->this$0:Lcom/squareup/okhttp/HttpResponseCache;

    # invokes: Lcom/squareup/okhttp/HttpResponseCache;->trackConditionalCacheHit()V
    invoke-static {v0}, Lcom/squareup/okhttp/HttpResponseCache;->access$200(Lcom/squareup/okhttp/HttpResponseCache;)V

    .line 161
    return-void
.end method

.method public trackResponse(Lcom/squareup/okhttp/ResponseSource;)V
    .locals 1
    .param p1, "source"    # Lcom/squareup/okhttp/ResponseSource;

    .prologue
    .line 164
    iget-object v0, p0, Lcom/squareup/okhttp/HttpResponseCache$1;->this$0:Lcom/squareup/okhttp/HttpResponseCache;

    # invokes: Lcom/squareup/okhttp/HttpResponseCache;->trackResponse(Lcom/squareup/okhttp/ResponseSource;)V
    invoke-static {v0, p1}, Lcom/squareup/okhttp/HttpResponseCache;->access$300(Lcom/squareup/okhttp/HttpResponseCache;Lcom/squareup/okhttp/ResponseSource;)V

    .line 165
    return-void
.end method

.method public update(Ljava/net/CacheResponse;Ljava/net/HttpURLConnection;)V
    .locals 1
    .param p1, "conditionalCacheHit"    # Ljava/net/CacheResponse;
    .param p2, "connection"    # Ljava/net/HttpURLConnection;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 156
    iget-object v0, p0, Lcom/squareup/okhttp/HttpResponseCache$1;->this$0:Lcom/squareup/okhttp/HttpResponseCache;

    # invokes: Lcom/squareup/okhttp/HttpResponseCache;->update(Ljava/net/CacheResponse;Ljava/net/HttpURLConnection;)V
    invoke-static {v0, p1, p2}, Lcom/squareup/okhttp/HttpResponseCache;->access$100(Lcom/squareup/okhttp/HttpResponseCache;Ljava/net/CacheResponse;Ljava/net/HttpURLConnection;)V

    .line 157
    return-void
.end method
