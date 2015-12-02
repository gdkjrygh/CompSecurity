.class final Lcom/facebook/analytics/as;
.super Ljava/io/FilterInputStream;
.source "AnalyticsFbHttpClientObserver.java"


# instance fields
.field final synthetic a:Lcom/facebook/analytics/ar;


# direct methods
.method public constructor <init>(Lcom/facebook/analytics/ar;Ljava/io/InputStream;)V
    .locals 1

    .prologue
    .line 173
    iput-object p1, p0, Lcom/facebook/analytics/as;->a:Lcom/facebook/analytics/ar;

    .line 174
    new-instance v0, Lcom/google/common/b/d;

    invoke-direct {v0, p2}, Lcom/google/common/b/d;-><init>(Ljava/io/InputStream;)V

    invoke-direct {p0, v0}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    .line 175
    return-void
.end method

.method private declared-synchronized a()V
    .locals 7

    .prologue
    .line 199
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/analytics/as;->in:Ljava/io/InputStream;

    check-cast v0, Lcom/google/common/b/d;

    invoke-virtual {v0}, Lcom/google/common/b/d;->a()J

    move-result-wide v0

    .line 205
    iget-object v2, p0, Lcom/facebook/analytics/as;->a:Lcom/facebook/analytics/ar;

    invoke-static {v2}, Lcom/facebook/analytics/ar;->b(Lcom/facebook/analytics/ar;)J

    move-result-wide v2

    cmp-long v2, v0, v2

    if-lez v2, :cond_0

    .line 206
    iget-object v2, p0, Lcom/facebook/analytics/as;->a:Lcom/facebook/analytics/ar;

    iget-object v2, v2, Lcom/facebook/analytics/ar;->a:Lcom/facebook/analytics/an;

    invoke-static {v2}, Lcom/facebook/analytics/an;->c(Lcom/facebook/analytics/an;)Lcom/facebook/analytics/ck;

    move-result-object v2

    iget-object v3, p0, Lcom/facebook/analytics/as;->a:Lcom/facebook/analytics/ar;

    invoke-static {v3}, Lcom/facebook/analytics/ar;->c(Lcom/facebook/analytics/ar;)Ljava/net/URI;

    move-result-object v3

    iget-object v4, p0, Lcom/facebook/analytics/as;->a:Lcom/facebook/analytics/ar;

    invoke-static {v4}, Lcom/facebook/analytics/ar;->d(Lcom/facebook/analytics/ar;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/facebook/analytics/as;->a:Lcom/facebook/analytics/ar;

    invoke-static {v5}, Lcom/facebook/analytics/ar;->b(Lcom/facebook/analytics/ar;)J

    move-result-wide v5

    sub-long v5, v0, v5

    invoke-interface {v2, v3, v4, v5, v6}, Lcom/facebook/analytics/ck;->a(Ljava/net/URI;Ljava/lang/String;J)V

    .line 207
    iget-object v2, p0, Lcom/facebook/analytics/as;->a:Lcom/facebook/analytics/ar;

    invoke-static {v2, v0, v1}, Lcom/facebook/analytics/ar;->a(Lcom/facebook/analytics/ar;J)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 209
    :cond_0
    monitor-exit p0

    return-void

    .line 199
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public read()I
    .locals 1

    .prologue
    .line 179
    iget-object v0, p0, Lcom/facebook/analytics/as;->in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    .line 180
    invoke-direct {p0}, Lcom/facebook/analytics/as;->a()V

    .line 181
    return v0
.end method

.method public read([BII)I
    .locals 1

    .prologue
    .line 186
    iget-object v0, p0, Lcom/facebook/analytics/as;->in:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result v0

    .line 187
    invoke-direct {p0}, Lcom/facebook/analytics/as;->a()V

    .line 188
    return v0
.end method

.method public skip(J)J
    .locals 2

    .prologue
    .line 193
    iget-object v0, p0, Lcom/facebook/analytics/as;->in:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2}, Ljava/io/InputStream;->skip(J)J

    move-result-wide v0

    .line 194
    invoke-direct {p0}, Lcom/facebook/analytics/as;->a()V

    .line 195
    return-wide v0
.end method
