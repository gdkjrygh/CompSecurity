.class final Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;
.super Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;
.source "HttpsURLConnectionImpl.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "HttpUrlConnectionDelegate"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;


# direct methods
.method private constructor <init>(Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;Ljava/net/URL;Lcom/squareup/okhttp/OkHttpClient;)V
    .locals 0
    .param p2, "url"    # Ljava/net/URL;
    .param p3, "client"    # Lcom/squareup/okhttp/OkHttpClient;

    .prologue
    .line 352
    iput-object p1, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->this$0:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;

    .line 353
    invoke-direct {p0, p2, p3}, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;-><init>(Ljava/net/URL;Lcom/squareup/okhttp/OkHttpClient;)V

    .line 354
    return-void
.end method

.method synthetic constructor <init>(Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;Ljava/net/URL;Lcom/squareup/okhttp/OkHttpClient;Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$1;)V
    .locals 0
    .param p1, "x0"    # Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;
    .param p2, "x1"    # Ljava/net/URL;
    .param p3, "x2"    # Lcom/squareup/okhttp/OkHttpClient;
    .param p4, "x3"    # Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$1;

    .prologue
    .line 351
    invoke-direct {p0, p1, p2, p3}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;-><init>(Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;Ljava/net/URL;Lcom/squareup/okhttp/OkHttpClient;)V

    return-void
.end method


# virtual methods
.method public getHttpConnectionToCache()Ljava/net/HttpURLConnection;
    .locals 1

    .prologue
    .line 357
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->this$0:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;

    return-object v0
.end method

.method public getSecureCacheResponse()Ljava/net/SecureCacheResponse;
    .locals 1

    .prologue
    .line 361
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    instance-of v0, v0, Lcom/squareup/okhttp/internal/http/HttpsEngine;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    .line 362
    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->getCacheResponse()Ljava/net/CacheResponse;

    move-result-object v0

    check-cast v0, Ljava/net/SecureCacheResponse;

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
