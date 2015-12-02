.class public Lcom/qihoo/antivirus/update/p;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo/antivirus/update/z;


# instance fields
.field final a:Landroid/content/Context;

.field b:Lorg/apache/http/client/HttpClient;

.field c:Lorg/apache/http/client/methods/HttpPost;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 134
    iput-object v0, p0, Lcom/qihoo/antivirus/update/p;->b:Lorg/apache/http/client/HttpClient;

    .line 136
    iput-object v0, p0, Lcom/qihoo/antivirus/update/p;->c:Lorg/apache/http/client/methods/HttpPost;

    .line 24
    iput-object p1, p0, Lcom/qihoo/antivirus/update/p;->a:Landroid/content/Context;

    .line 25
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;[BI)[B
    .locals 10

    .prologue
    .line 41
    iget-object v0, p0, Lcom/qihoo/antivirus/update/p;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/antivirus/update/x;->f(Landroid/content/Context;)Lorg/apache/http/HttpHost;

    move-result-object v0

    .line 42
    mul-int/lit8 v1, p4, 0x6

    .line 41
    invoke-static {v0, p4, v1}, Lcom/qihoo/antivirus/update/w;->a(Lorg/apache/http/HttpHost;II)Lorg/apache/http/client/HttpClient;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/antivirus/update/p;->b:Lorg/apache/http/client/HttpClient;

    .line 43
    new-instance v0, Lorg/apache/http/client/methods/HttpPost;

    invoke-direct {v0, p1}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/qihoo/antivirus/update/p;->c:Lorg/apache/http/client/methods/HttpPost;

    .line 45
    if-nez p2, :cond_0

    .line 46
    iget-object v0, p0, Lcom/qihoo/antivirus/update/p;->b:Lorg/apache/http/client/HttpClient;

    iget-object v1, p0, Lcom/qihoo/antivirus/update/p;->c:Lorg/apache/http/client/methods/HttpPost;

    const-string/jumbo v2, "application/octet-stream"

    invoke-static {v0, v1, v2, p3}, Lcom/qihoo/antivirus/update/w;->a(Lorg/apache/http/client/HttpClient;Lorg/apache/http/client/methods/HttpPost;Ljava/lang/String;[B)Ljava/io/InputStream;

    move-result-object v0

    move-object v1, v0

    .line 84
    :goto_0
    if-eqz v1, :cond_4

    .line 87
    :try_start_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    const/16 v2, 0x400

    invoke-direct {v0, v2}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 89
    invoke-static {v1, v0}, Lcom/qihoo/antivirus/update/af;->a(Ljava/io/InputStream;Ljava/io/OutputStream;)V

    .line 90
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 102
    :try_start_1
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 105
    :goto_1
    iget-object v1, p0, Lcom/qihoo/antivirus/update/p;->b:Lorg/apache/http/client/HttpClient;

    invoke-interface {v1}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;

    move-result-object v1

    invoke-interface {v1}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V

    .line 106
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/qihoo/antivirus/update/p;->b:Lorg/apache/http/client/HttpClient;

    .line 107
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/qihoo/antivirus/update/p;->c:Lorg/apache/http/client/methods/HttpPost;

    .line 110
    :goto_2
    return-object v0

    .line 48
    :cond_0
    new-instance v1, Lorg/apache/http/entity/mime/f;

    sget-object v0, Lorg/apache/http/entity/mime/HttpMultipartMode;->BROWSER_COMPATIBLE:Lorg/apache/http/entity/mime/HttpMultipartMode;

    invoke-direct {v1, v0}, Lorg/apache/http/entity/mime/f;-><init>(Lorg/apache/http/entity/mime/HttpMultipartMode;)V

    .line 49
    const-string/jumbo v0, "\n"

    invoke-virtual {p2, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 50
    const/4 v0, 0x0

    aget-object v0, v2, v0

    new-instance v3, Lorg/apache/http/entity/mime/a/b;

    .line 51
    const-string/jumbo v4, "application/octet-stream"

    const/4 v5, 0x0

    invoke-direct {v3, p3, v4, v5}, Lorg/apache/http/entity/mime/a/b;-><init>([BLjava/lang/String;Ljava/lang/String;)V

    .line 50
    invoke-virtual {v1, v0, v3}, Lorg/apache/http/entity/mime/f;->a(Ljava/lang/String;Lorg/apache/http/entity/mime/a/c;)V

    .line 55
    const/4 v0, 0x1

    :goto_3
    array-length v3, v2

    if-lt v0, v3, :cond_1

    .line 81
    iget-object v0, p0, Lcom/qihoo/antivirus/update/p;->b:Lorg/apache/http/client/HttpClient;

    iget-object v2, p0, Lcom/qihoo/antivirus/update/p;->c:Lorg/apache/http/client/methods/HttpPost;

    invoke-static {v0, v2, v1}, Lcom/qihoo/antivirus/update/w;->a(Lorg/apache/http/client/HttpClient;Lorg/apache/http/client/methods/HttpPost;Lorg/apache/http/entity/mime/f;)Ljava/io/InputStream;

    move-result-object v0

    move-object v1, v0

    goto :goto_0

    .line 56
    :cond_1
    aget-object v3, v2, v0

    const-string/jumbo v4, "="

    const/4 v5, 0x2

    invoke-virtual {v3, v4, v5}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v3

    .line 57
    array-length v4, v3

    const/4 v5, 0x2

    if-eq v4, v5, :cond_2

    .line 61
    const/4 v0, 0x0

    goto :goto_2

    .line 67
    :cond_2
    new-instance v4, Ljava/io/File;

    const/4 v5, 0x1

    aget-object v5, v3, v5

    invoke-direct {v4, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 68
    invoke-virtual {v4}, Ljava/io/File;->isFile()Z

    move-result v5

    if-eqz v5, :cond_3

    .line 72
    new-instance v5, Lorg/apache/http/entity/mime/a/e;

    const-string/jumbo v6, "analysis_%03d.dat"

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v8, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    aput-object v9, v7, v8

    invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const-string/jumbo v7, "application/octet-stream"

    const/4 v8, 0x0

    invoke-direct {v5, v4, v6, v7, v8}, Lorg/apache/http/entity/mime/a/e;-><init>(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    const/4 v4, 0x0

    aget-object v3, v3, v4

    invoke-virtual {v1, v3, v5}, Lorg/apache/http/entity/mime/f;->a(Ljava/lang/String;Lorg/apache/http/entity/mime/a/c;)V

    .line 55
    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    .line 94
    :catch_0
    move-exception v0

    .line 102
    :try_start_2
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    .line 105
    :goto_4
    iget-object v0, p0, Lcom/qihoo/antivirus/update/p;->b:Lorg/apache/http/client/HttpClient;

    invoke-interface {v0}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V

    .line 106
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/antivirus/update/p;->b:Lorg/apache/http/client/HttpClient;

    .line 107
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/antivirus/update/p;->c:Lorg/apache/http/client/methods/HttpPost;

    .line 98
    const/4 v0, 0x0

    goto/16 :goto_2

    .line 99
    :catchall_0
    move-exception v0

    .line 102
    :try_start_3
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3

    .line 105
    :goto_5
    iget-object v1, p0, Lcom/qihoo/antivirus/update/p;->b:Lorg/apache/http/client/HttpClient;

    invoke-interface {v1}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;

    move-result-object v1

    invoke-interface {v1}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V

    .line 106
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/qihoo/antivirus/update/p;->b:Lorg/apache/http/client/HttpClient;

    .line 107
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/qihoo/antivirus/update/p;->c:Lorg/apache/http/client/methods/HttpPost;

    .line 108
    throw v0

    .line 110
    :cond_4
    const/4 v0, 0x0

    goto/16 :goto_2

    .line 103
    :catch_1
    move-exception v1

    goto/16 :goto_1

    :catch_2
    move-exception v0

    goto :goto_4

    :catch_3
    move-exception v1

    goto :goto_5
.end method
