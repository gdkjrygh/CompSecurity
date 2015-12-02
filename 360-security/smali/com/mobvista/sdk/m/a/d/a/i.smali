.class public final Lcom/mobvista/sdk/m/a/d/a/i;
.super Lcom/mobvista/sdk/m/a/e/c;
.source "360Security"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Z

.field private h:Lcom/mobvista/sdk/m/a/d/a/j;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 73
    invoke-direct {p0}, Lcom/mobvista/sdk/m/a/e/c;-><init>()V

    .line 31
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/mobvista/sdk/m/a/d/a/i;->g:Z

    .line 74
    iput-object p1, p0, Lcom/mobvista/sdk/m/a/d/a/i;->a:Ljava/lang/String;

    .line 75
    iput-object p2, p0, Lcom/mobvista/sdk/m/a/d/a/i;->b:Ljava/lang/String;

    .line 76
    iput-object p3, p0, Lcom/mobvista/sdk/m/a/d/a/i;->f:Ljava/lang/String;

    .line 77
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 221
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/d/a/i;->h:Lcom/mobvista/sdk/m/a/d/a/j;

    if-eqz v0, :cond_0

    .line 222
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/d/a/i;->h:Lcom/mobvista/sdk/m/a/d/a/j;

    invoke-interface {v0, p1, p2}, Lcom/mobvista/sdk/m/a/d/a/j;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 224
    :cond_0
    return-void
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 233
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/d/a/i;->h:Lcom/mobvista/sdk/m/a/d/a/j;

    if-eqz v0, :cond_0

    .line 234
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/d/a/i;->h:Lcom/mobvista/sdk/m/a/d/a/j;

    invoke-interface {v0, p1}, Lcom/mobvista/sdk/m/a/d/a/j;->a(Ljava/lang/String;)V

    .line 236
    :cond_0
    return-void
.end method

.method private c()V
    .locals 1

    .prologue
    .line 102
    invoke-direct {p0}, Lcom/mobvista/sdk/m/a/d/a/i;->d()Z

    move-result v0

    .line 103
    if-eqz v0, :cond_0

    .line 104
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/d/a/i;->f:Ljava/lang/String;

    .line 105
    invoke-direct {p0}, Lcom/mobvista/sdk/m/a/d/a/i;->e()V

    .line 107
    :cond_0
    return-void
.end method

.method private d()Z
    .locals 10

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 125
    .line 126
    const/4 v2, 0x0

    .line 128
    :try_start_0
    new-instance v4, Ljava/io/File;

    iget-object v3, p0, Lcom/mobvista/sdk/m/a/d/a/i;->f:Ljava/lang/String;

    invoke-direct {v4, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 129
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_0

    .line 130
    invoke-virtual {v4}, Ljava/io/File;->mkdirs()Z

    .line 134
    :cond_0
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 135
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    .line 138
    :cond_1
    new-instance v5, Ljava/io/File;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v6, p0, Lcom/mobvista/sdk/m/a/d/a/i;->f:Ljava/lang/String;

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string/jumbo v6, ".temp"

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v5, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 140
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 141
    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    .line 143
    :cond_2
    new-instance v3, Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-direct {v3}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V

    .line 144
    invoke-virtual {v3}, Lorg/apache/http/impl/client/DefaultHttpClient;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v6

    .line 145
    const-string/jumbo v7, "http.protocol.expect-continue"

    const/4 v8, 0x0

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    invoke-interface {v6, v7, v8}, Lorg/apache/http/params/HttpParams;->setParameter(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/http/params/HttpParams;

    .line 147
    new-instance v7, Lorg/apache/http/impl/client/DefaultHttpRequestRetryHandler;

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct {v7, v8, v9}, Lorg/apache/http/impl/client/DefaultHttpRequestRetryHandler;-><init>(IZ)V

    invoke-virtual {v3, v7}, Lorg/apache/http/impl/client/DefaultHttpClient;->setHttpRequestRetryHandler(Lorg/apache/http/client/HttpRequestRetryHandler;)V

    .line 148
    const/16 v7, 0x7530

    invoke-static {v6, v7}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V

    .line 149
    const/16 v7, 0x7530

    invoke-static {v6, v7}, Lorg/apache/http/params/HttpConnectionParams;->setSoTimeout(Lorg/apache/http/params/HttpParams;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 151
    :try_start_1
    new-instance v2, Lorg/apache/http/client/methods/HttpGet;

    iget-object v6, p0, Lcom/mobvista/sdk/m/a/d/a/i;->b:Ljava/lang/String;

    invoke-direct {v2, v6}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V

    .line 155
    invoke-interface {v3, v2}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v2

    .line 157
    invoke-interface {v2}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v6

    .line 158
    invoke-interface {v6}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v6

    .line 161
    const/16 v7, 0xc8

    if-ne v6, v7, :cond_5

    .line 162
    invoke-interface {v2}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v2

    .line 163
    invoke-interface {v2}, Lorg/apache/http/HttpEntity;->getContentLength()J

    .line 164
    invoke-interface {v2}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    move-result-object v2

    .line 165
    new-instance v6, Ljava/io/FileOutputStream;

    const/4 v7, 0x1

    invoke-direct {v6, v5, v7}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V

    .line 167
    const/16 v7, 0x800

    new-array v7, v7, [B

    .line 169
    :goto_0
    invoke-virtual {v2, v7}, Ljava/io/InputStream;->read([B)I

    move-result v8

    const/4 v9, -0x1

    if-eq v8, v9, :cond_4

    .line 170
    const/4 v9, 0x0

    invoke-virtual {v6, v7, v9, v8}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    .line 183
    :catch_0
    move-exception v0

    move-object v2, v3

    .line 184
    :goto_1
    :try_start_2
    iget-object v3, p0, Lcom/mobvista/sdk/m/a/d/a/i;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-direct {p0, v3, v4}, Lcom/mobvista/sdk/m/a/d/a/i;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 186
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 191
    if-eqz v2, :cond_3

    .line 193
    invoke-interface {v2}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V

    .line 197
    :cond_3
    :goto_2
    return v1

    .line 172
    :cond_4
    :try_start_3
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 173
    invoke-virtual {v6}, Ljava/io/FileOutputStream;->flush()V

    .line 174
    invoke-virtual {v6}, Ljava/io/FileOutputStream;->close()V

    .line 175
    invoke-virtual {v5, v4}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 177
    const-string/jumbo v2, "ImageWorker"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string/jumbo v5, "download file from ["

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, p0, Lcom/mobvista/sdk/m/a/d/a/i;->b:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string/jumbo v5, "] save to ["

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v5, p0, Lcom/mobvista/sdk/m/a/d/a/i;->f:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string/jumbo v5, "]"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lcom/mobvista/sdk/m/a/b/a/a;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 191
    :goto_3
    invoke-interface {v3}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;

    move-result-object v1

    invoke-interface {v1}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V

    move v1, v0

    .line 195
    goto :goto_2

    .line 180
    :cond_5
    :try_start_4
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/d/a/i;->b:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string/jumbo v4, "load image from http faild because http return code: "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string/jumbo v4, ".image url is "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v4, p0, Lcom/mobvista/sdk/m/a/d/a/i;->b:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0, v2}, Lcom/mobvista/sdk/m/a/d/a/i;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    move v0, v1

    .line 181
    goto :goto_3

    .line 187
    :catch_1
    move-exception v0

    move-object v3, v2

    .line 188
    :goto_4
    :try_start_5
    iget-object v2, p0, Lcom/mobvista/sdk/m/a/d/a/i;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v2, v0}, Lcom/mobvista/sdk/m/a/d/a/i;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 191
    if-eqz v3, :cond_3

    .line 193
    invoke-interface {v3}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V

    goto :goto_2

    .line 191
    :catchall_0
    move-exception v0

    move-object v3, v2

    :goto_5
    if-eqz v3, :cond_6

    .line 193
    invoke-interface {v3}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;

    move-result-object v1

    invoke-interface {v1}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V

    .line 195
    :cond_6
    throw v0

    .line 191
    :catchall_1
    move-exception v0

    goto :goto_5

    :catchall_2
    move-exception v0

    move-object v3, v2

    goto :goto_5

    .line 187
    :catch_2
    move-exception v0

    goto :goto_4

    .line 183
    :catch_3
    move-exception v0

    goto/16 :goto_1
.end method

.method private e()V
    .locals 2

    .prologue
    .line 204
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/mobvista/sdk/m/a/d/a/i;->f:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 205
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 206
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/d/a/i;->b:Ljava/lang/String;

    iget-object v1, p0, Lcom/mobvista/sdk/m/a/d/a/i;->f:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lcom/mobvista/sdk/m/a/d/a/i;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 212
    :goto_0
    return-void

    .line 208
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string/jumbo v1, "load image faild.because file["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/mobvista/sdk/m/a/d/a/i;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "] is not exist!"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 209
    const-string/jumbo v1, "ImageWorker"

    invoke-static {v1, v0}, Lcom/mobvista/sdk/m/a/b/a/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 210
    iget-object v1, p0, Lcom/mobvista/sdk/m/a/d/a/i;->b:Ljava/lang/String;

    invoke-direct {p0, v1, v0}, Lcom/mobvista/sdk/m/a/d/a/i;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method


# virtual methods
.method public final a()V
    .locals 4

    .prologue
    .line 81
    iget-boolean v0, p0, Lcom/mobvista/sdk/m/a/d/a/i;->g:Z

    if-nez v0, :cond_3

    .line 82
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/d/a/i;->f:Ljava/lang/String;

    invoke-static {v0}, Lcom/mobvista/sdk/m/a/f/j;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 83
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/d/a/i;->b:Ljava/lang/String;

    const-string/jumbo v1, "save path is null."

    invoke-direct {p0, v0, v1}, Lcom/mobvista/sdk/m/a/d/a/i;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    :goto_0
    return-void

    .line 87
    :cond_0
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/mobvista/sdk/m/a/d/a/i;->f:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 88
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gtz v0, :cond_2

    .line 89
    :cond_1
    invoke-direct {p0}, Lcom/mobvista/sdk/m/a/d/a/i;->c()V

    goto :goto_0

    .line 91
    :cond_2
    invoke-direct {p0}, Lcom/mobvista/sdk/m/a/d/a/i;->e()V

    goto :goto_0

    .line 94
    :cond_3
    invoke-direct {p0}, Lcom/mobvista/sdk/m/a/d/a/i;->c()V

    goto :goto_0
.end method

.method public final a(Lcom/mobvista/sdk/m/a/d/a/j;)V
    .locals 0

    .prologue
    .line 70
    iput-object p1, p0, Lcom/mobvista/sdk/m/a/d/a/i;->h:Lcom/mobvista/sdk/m/a/d/a/j;

    .line 71
    return-void
.end method

.method public final a(Z)V
    .locals 0

    .prologue
    .line 62
    iput-boolean p1, p0, Lcom/mobvista/sdk/m/a/d/a/i;->g:Z

    .line 63
    return-void
.end method
