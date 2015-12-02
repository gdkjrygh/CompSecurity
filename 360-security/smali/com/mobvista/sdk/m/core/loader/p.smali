.class final Lcom/mobvista/sdk/m/core/loader/p;
.super Landroid/webkit/WebViewClient;
.source "360Security"


# instance fields
.field final synthetic a:Lcom/mobvista/sdk/m/core/loader/n;


# direct methods
.method constructor <init>(Lcom/mobvista/sdk/m/core/loader/n;)V
    .locals 0

    .prologue
    .line 117
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/loader/p;->a:Lcom/mobvista/sdk/m/core/loader/n;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method

.method private a()Z
    .locals 1

    .prologue
    .line 120
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/p;->a:Lcom/mobvista/sdk/m/core/loader/n;

    iget-boolean v0, v0, Lcom/mobvista/sdk/m/core/loader/n;->a:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/p;->a:Lcom/mobvista/sdk/m/core/loader/n;

    iget-boolean v0, v0, Lcom/mobvista/sdk/m/core/loader/n;->b:Z

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 4

    .prologue
    const/4 v2, 0x1

    .line 125
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/p;->a:Lcom/mobvista/sdk/m/core/loader/n;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/loader/n;->b(Lcom/mobvista/sdk/m/core/loader/n;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 126
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/p;->a:Lcom/mobvista/sdk/m/core/loader/n;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/loader/n;->c(Lcom/mobvista/sdk/m/core/loader/n;)V

    .line 159
    :goto_0
    return-void

    .line 130
    :cond_0
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/p;->a:Lcom/mobvista/sdk/m/core/loader/n;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/mobvista/sdk/m/core/loader/n;->b:Z

    .line 133
    invoke-virtual {p1}, Landroid/webkit/WebView;->getTag()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2

    .line 134
    const-string/jumbo v0, "has_first_started"

    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->setTag(Ljava/lang/Object;)V

    .line 139
    :goto_1
    invoke-static {}, Lcom/mobvista/sdk/m/core/loader/n;->a()Ljava/lang/String;

    move-result-object v1

    monitor-enter v1

    .line 140
    :try_start_0
    const-string/jumbo v0, "\u52a0\u8f7d\u9875\u9762-\u5f00\u59cb\uff1a"

    .line 141
    invoke-direct {p0}, Lcom/mobvista/sdk/m/core/loader/p;->a()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 142
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v2, "\uff08\u91cd\u5b9a\u5411\uff09"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 145
    :cond_1
    invoke-static {p2}, Landroid/webkit/URLUtil;->isHttpsUrl(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 146
    invoke-static {}, Lcom/mobvista/sdk/m/core/loader/n;->a()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 151
    :goto_2
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/p;->a:Lcom/mobvista/sdk/m/core/loader/n;

    invoke-static {v0, p2}, Lcom/mobvista/sdk/m/core/loader/n;->a(Lcom/mobvista/sdk/m/core/loader/n;Ljava/lang/String;)Ljava/lang/String;

    .line 153
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/p;->a:Lcom/mobvista/sdk/m/core/loader/n;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/loader/n;->d(Lcom/mobvista/sdk/m/core/loader/n;)Lcom/mobvista/sdk/m/core/loader/t;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/p;->a:Lcom/mobvista/sdk/m/core/loader/n;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/loader/n;->d(Lcom/mobvista/sdk/m/core/loader/n;)Lcom/mobvista/sdk/m/core/loader/t;

    move-result-object v0

    invoke-interface {v0, p2}, Lcom/mobvista/sdk/m/core/loader/t;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 154
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/p;->a:Lcom/mobvista/sdk/m/core/loader/n;

    const/4 v2, 0x1

    invoke-static {v0, v2}, Lcom/mobvista/sdk/m/core/loader/n;->a(Lcom/mobvista/sdk/m/core/loader/n;Z)Z

    .line 155
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/p;->a:Lcom/mobvista/sdk/m/core/loader/n;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/loader/n;->c(Lcom/mobvista/sdk/m/core/loader/n;)V

    .line 159
    :goto_3
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0

    .line 136
    :cond_2
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/p;->a:Lcom/mobvista/sdk/m/core/loader/n;

    iput-boolean v2, v0, Lcom/mobvista/sdk/m/core/loader/n;->a:Z

    goto :goto_1

    .line 148
    :cond_3
    :try_start_1
    invoke-static {}, Lcom/mobvista/sdk/m/core/loader/n;->a()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    .line 157
    :cond_4
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/p;->a:Lcom/mobvista/sdk/m/core/loader/n;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/loader/n;->e(Lcom/mobvista/sdk/m/core/loader/n;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3
.end method

.method public final onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 204
    invoke-static {}, Lcom/mobvista/sdk/m/core/loader/n;->a()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "onReceivedError: errno = "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, ", url: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, ",\n onReceivedError\uff1a, description: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, ", failingUrl: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 205
    invoke-static {}, Lcom/mobvista/sdk/m/core/loader/n;->a()Ljava/lang/String;

    move-result-object v1

    monitor-enter v1

    .line 206
    :try_start_0
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/p;->a:Lcom/mobvista/sdk/m/core/loader/n;

    const/4 v2, 0x1

    invoke-static {v0, v2}, Lcom/mobvista/sdk/m/core/loader/n;->a(Lcom/mobvista/sdk/m/core/loader/n;Z)Z

    .line 207
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/p;->a:Lcom/mobvista/sdk/m/core/loader/n;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/loader/n;->i(Lcom/mobvista/sdk/m/core/loader/n;)V

    .line 208
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/p;->a:Lcom/mobvista/sdk/m/core/loader/n;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/loader/n;->c(Lcom/mobvista/sdk/m/core/loader/n;)V

    .line 209
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method public final onReceivedSslError(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V
    .locals 0

    .prologue
    .line 215
    if-eqz p2, :cond_0

    .line 216
    invoke-virtual {p2}, Landroid/webkit/SslErrorHandler;->proceed()V

    .line 218
    :cond_0
    return-void
.end method

.method public final shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 165
    invoke-static {}, Lcom/mobvista/sdk/m/core/loader/n;->a()Ljava/lang/String;

    move-result-object v1

    monitor-enter v1

    .line 166
    :try_start_0
    invoke-static {}, Lcom/mobvista/sdk/m/core/loader/n;->a()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string/jumbo v3, "override js\u8df3\u8f6c\uff1a"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 175
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/p;->a:Lcom/mobvista/sdk/m/core/loader/n;

    const/4 v2, 0x1

    iput-boolean v2, v0, Lcom/mobvista/sdk/m/core/loader/n;->b:Z

    .line 177
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/p;->a:Lcom/mobvista/sdk/m/core/loader/n;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/loader/n;->f(Lcom/mobvista/sdk/m/core/loader/n;)V

    .line 179
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/p;->a:Lcom/mobvista/sdk/m/core/loader/n;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/loader/n;->b(Lcom/mobvista/sdk/m/core/loader/n;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 180
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/p;->a:Lcom/mobvista/sdk/m/core/loader/n;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/loader/n;->g(Lcom/mobvista/sdk/m/core/loader/n;)V

    .line 181
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/p;->a:Lcom/mobvista/sdk/m/core/loader/n;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/loader/n;->c(Lcom/mobvista/sdk/m/core/loader/n;)V

    .line 182
    monitor-exit v1

    .line 199
    :goto_0
    return v4

    .line 185
    :cond_0
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/p;->a:Lcom/mobvista/sdk/m/core/loader/n;

    invoke-static {v0, p2}, Lcom/mobvista/sdk/m/core/loader/n;->a(Lcom/mobvista/sdk/m/core/loader/n;Ljava/lang/String;)Ljava/lang/String;

    .line 187
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/p;->a:Lcom/mobvista/sdk/m/core/loader/n;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/loader/n;->d(Lcom/mobvista/sdk/m/core/loader/n;)Lcom/mobvista/sdk/m/core/loader/t;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/p;->a:Lcom/mobvista/sdk/m/core/loader/n;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/loader/n;->d(Lcom/mobvista/sdk/m/core/loader/n;)Lcom/mobvista/sdk/m/core/loader/t;

    move-result-object v0

    invoke-interface {v0, p2}, Lcom/mobvista/sdk/m/core/loader/t;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 189
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/p;->a:Lcom/mobvista/sdk/m/core/loader/n;

    const/4 v2, 0x1

    invoke-static {v0, v2}, Lcom/mobvista/sdk/m/core/loader/n;->a(Lcom/mobvista/sdk/m/core/loader/n;Z)Z

    .line 190
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/p;->a:Lcom/mobvista/sdk/m/core/loader/n;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/loader/n;->g(Lcom/mobvista/sdk/m/core/loader/n;)V

    .line 191
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/p;->a:Lcom/mobvista/sdk/m/core/loader/n;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/loader/n;->c(Lcom/mobvista/sdk/m/core/loader/n;)V

    .line 192
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 194
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0

    :cond_1
    monitor-exit v1

    .line 198
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/p;->a:Lcom/mobvista/sdk/m/core/loader/n;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/loader/n;->h(Lcom/mobvista/sdk/m/core/loader/n;)Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    goto :goto_0
.end method
