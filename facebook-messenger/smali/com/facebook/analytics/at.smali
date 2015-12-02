.class final Lcom/facebook/analytics/at;
.super Ljava/io/FilterInputStream;
.source "AnalyticsFbHttpClientObserver.java"


# instance fields
.field final synthetic a:Lcom/facebook/analytics/ar;


# direct methods
.method public constructor <init>(Lcom/facebook/analytics/ar;Ljava/io/InputStream;)V
    .locals 0

    .prologue
    .line 133
    iput-object p1, p0, Lcom/facebook/analytics/at;->a:Lcom/facebook/analytics/ar;

    .line 134
    invoke-direct {p0, p2}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    .line 135
    return-void
.end method


# virtual methods
.method public read()I
    .locals 5

    .prologue
    .line 140
    :try_start_0
    iget-object v0, p0, Lcom/facebook/analytics/at;->in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    return v0

    .line 141
    :catch_0
    move-exception v0

    .line 142
    iget-object v1, p0, Lcom/facebook/analytics/at;->a:Lcom/facebook/analytics/ar;

    iget-object v1, v1, Lcom/facebook/analytics/ar;->a:Lcom/facebook/analytics/an;

    invoke-static {v1}, Lcom/facebook/analytics/an;->d(Lcom/facebook/analytics/an;)Lcom/facebook/http/b/au;

    move-result-object v1

    sget-object v2, Lcom/facebook/http/b/av;->READ_RESPONSE_BODY:Lcom/facebook/http/b/av;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/facebook/analytics/at;->a:Lcom/facebook/analytics/ar;

    invoke-static {v4}, Lcom/facebook/analytics/ar;->a(Lcom/facebook/analytics/ar;)Lorg/apache/http/protocol/HttpContext;

    move-result-object v4

    invoke-interface {v1, v2, v0, v3, v4}, Lcom/facebook/http/b/au;->a(Lcom/facebook/http/b/av;Ljava/io/IOException;Lorg/apache/http/HttpRequest;Lorg/apache/http/protocol/HttpContext;)V

    .line 144
    throw v0
.end method

.method public read([BII)I
    .locals 5

    .prologue
    .line 151
    :try_start_0
    iget-object v0, p0, Lcom/facebook/analytics/at;->in:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    return v0

    .line 152
    :catch_0
    move-exception v0

    .line 153
    iget-object v1, p0, Lcom/facebook/analytics/at;->a:Lcom/facebook/analytics/ar;

    iget-object v1, v1, Lcom/facebook/analytics/ar;->a:Lcom/facebook/analytics/an;

    invoke-static {v1}, Lcom/facebook/analytics/an;->d(Lcom/facebook/analytics/an;)Lcom/facebook/http/b/au;

    move-result-object v1

    sget-object v2, Lcom/facebook/http/b/av;->READ_RESPONSE_BODY:Lcom/facebook/http/b/av;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/facebook/analytics/at;->a:Lcom/facebook/analytics/ar;

    invoke-static {v4}, Lcom/facebook/analytics/ar;->a(Lcom/facebook/analytics/ar;)Lorg/apache/http/protocol/HttpContext;

    move-result-object v4

    invoke-interface {v1, v2, v0, v3, v4}, Lcom/facebook/http/b/au;->a(Lcom/facebook/http/b/av;Ljava/io/IOException;Lorg/apache/http/HttpRequest;Lorg/apache/http/protocol/HttpContext;)V

    .line 155
    throw v0
.end method

.method public skip(J)J
    .locals 5

    .prologue
    .line 162
    :try_start_0
    iget-object v0, p0, Lcom/facebook/analytics/at;->in:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2}, Ljava/io/InputStream;->skip(J)J
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    return-wide v0

    .line 163
    :catch_0
    move-exception v0

    .line 164
    iget-object v1, p0, Lcom/facebook/analytics/at;->a:Lcom/facebook/analytics/ar;

    iget-object v1, v1, Lcom/facebook/analytics/ar;->a:Lcom/facebook/analytics/an;

    invoke-static {v1}, Lcom/facebook/analytics/an;->d(Lcom/facebook/analytics/an;)Lcom/facebook/http/b/au;

    move-result-object v1

    sget-object v2, Lcom/facebook/http/b/av;->READ_RESPONSE_BODY:Lcom/facebook/http/b/av;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/facebook/analytics/at;->a:Lcom/facebook/analytics/ar;

    invoke-static {v4}, Lcom/facebook/analytics/ar;->a(Lcom/facebook/analytics/ar;)Lorg/apache/http/protocol/HttpContext;

    move-result-object v4

    invoke-interface {v1, v2, v0, v3, v4}, Lcom/facebook/http/b/au;->a(Lcom/facebook/http/b/av;Ljava/io/IOException;Lorg/apache/http/HttpRequest;Lorg/apache/http/protocol/HttpContext;)V

    .line 166
    throw v0
.end method
