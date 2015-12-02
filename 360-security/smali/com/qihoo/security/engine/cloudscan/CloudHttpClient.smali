.class public Lcom/qihoo/security/engine/cloudscan/CloudHttpClient;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/qihoo/security/engine/cloudscan/ICloudHttpClient;


# instance fields
.field final a:Landroid/content/Context;

.field b:Lorg/apache/http/client/HttpClient;

.field c:Lorg/apache/http/client/methods/HttpPost;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/engine/cloudscan/CloudHttpClient;->b:Lorg/apache/http/client/HttpClient;

    iput-object v0, p0, Lcom/qihoo/security/engine/cloudscan/CloudHttpClient;->c:Lorg/apache/http/client/methods/HttpPost;

    iput-object p1, p0, Lcom/qihoo/security/engine/cloudscan/CloudHttpClient;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public Cancel()Z
    .locals 1

    iget-object v0, p0, Lcom/qihoo/security/engine/cloudscan/CloudHttpClient;->c:Lorg/apache/http/client/methods/HttpPost;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/engine/cloudscan/CloudHttpClient;->c:Lorg/apache/http/client/methods/HttpPost;

    invoke-virtual {v0}, Lorg/apache/http/client/methods/HttpPost;->abort()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/engine/cloudscan/CloudHttpClient;->c:Lorg/apache/http/client/methods/HttpPost;

    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/engine/cloudscan/CloudHttpClient;->b:Lorg/apache/http/client/HttpClient;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/qihoo/security/engine/cloudscan/CloudHttpClient;->b:Lorg/apache/http/client/HttpClient;

    invoke-interface {v0}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V

    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public RequestCallback(Ljava/lang/String;Ljava/lang/String;[BI[I)[B
    .locals 10

    iget-object v0, p0, Lcom/qihoo/security/engine/cloudscan/CloudHttpClient;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo360/common/e/c;->a(Landroid/content/Context;)Lorg/apache/http/HttpHost;

    move-result-object v0

    mul-int/lit8 v1, p4, 0x6

    invoke-static {v0, p4, v1}, Lcom/qihoo360/common/e/a;->a(Lorg/apache/http/HttpHost;II)Lorg/apache/http/client/HttpClient;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/engine/cloudscan/CloudHttpClient;->b:Lorg/apache/http/client/HttpClient;

    new-instance v0, Lorg/apache/http/client/methods/HttpPost;

    invoke-direct {v0, p1}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/qihoo/security/engine/cloudscan/CloudHttpClient;->c:Lorg/apache/http/client/methods/HttpPost;

    if-nez p2, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/engine/cloudscan/CloudHttpClient;->b:Lorg/apache/http/client/HttpClient;

    iget-object v1, p0, Lcom/qihoo/security/engine/cloudscan/CloudHttpClient;->c:Lorg/apache/http/client/methods/HttpPost;

    const-string/jumbo v2, "application/octet-stream"

    invoke-static {v0, v1, v2, p3, p5}, Lcom/qihoo360/common/e/a;->a(Lorg/apache/http/client/HttpClient;Lorg/apache/http/client/methods/HttpPost;Ljava/lang/String;[B[I)Ljava/io/InputStream;

    move-result-object v0

    :goto_0
    sget-object v1, Lcom/qihoo/security/services/ScanEngineService;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    array-length v2, p3

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    if-eqz v0, :cond_4

    :try_start_0
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    const/16 v2, 0x400

    invoke-direct {v1, v2}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    invoke-static {v0, v1}, Lcom/qihoo360/common/utils/FileUtil;->copyStream(Ljava/io/InputStream;Ljava/io/OutputStream;)V

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    sget-object v2, Lcom/qihoo/security/services/ScanEngineService;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    array-length v3, v1

    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    :goto_1
    iget-object v0, p0, Lcom/qihoo/security/engine/cloudscan/CloudHttpClient;->b:Lorg/apache/http/client/HttpClient;

    invoke-interface {v0}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/engine/cloudscan/CloudHttpClient;->b:Lorg/apache/http/client/HttpClient;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/engine/cloudscan/CloudHttpClient;->c:Lorg/apache/http/client/methods/HttpPost;

    move-object v0, v1

    :goto_2
    return-object v0

    :cond_0
    new-instance v1, Lorg/apache/http/entity/mime/f;

    sget-object v0, Lorg/apache/http/entity/mime/HttpMultipartMode;->BROWSER_COMPATIBLE:Lorg/apache/http/entity/mime/HttpMultipartMode;

    invoke-direct {v1, v0}, Lorg/apache/http/entity/mime/f;-><init>(Lorg/apache/http/entity/mime/HttpMultipartMode;)V

    const-string/jumbo v0, "\n"

    invoke-virtual {p2, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    const/4 v0, 0x0

    aget-object v0, v2, v0

    new-instance v3, Lorg/apache/http/entity/mime/a/b;

    const-string/jumbo v4, "application/octet-stream"

    const/4 v5, 0x0

    invoke-direct {v3, p3, v4, v5}, Lorg/apache/http/entity/mime/a/b;-><init>([BLjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v0, v3}, Lorg/apache/http/entity/mime/f;->a(Ljava/lang/String;Lorg/apache/http/entity/mime/a/c;)V

    const/4 v0, 0x1

    :goto_3
    array-length v3, v2

    if-lt v0, v3, :cond_1

    iget-object v0, p0, Lcom/qihoo/security/engine/cloudscan/CloudHttpClient;->b:Lorg/apache/http/client/HttpClient;

    iget-object v2, p0, Lcom/qihoo/security/engine/cloudscan/CloudHttpClient;->c:Lorg/apache/http/client/methods/HttpPost;

    invoke-static {v0, v2, v1, p5}, Lcom/qihoo360/common/e/a;->a(Lorg/apache/http/client/HttpClient;Lorg/apache/http/client/methods/HttpPost;Lorg/apache/http/entity/mime/f;[I)Ljava/io/InputStream;

    move-result-object v0

    goto :goto_0

    :cond_1
    aget-object v3, v2, v0

    const-string/jumbo v4, "="

    const/4 v5, 0x2

    invoke-virtual {v3, v4, v5}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v3

    array-length v4, v3

    const/4 v5, 0x2

    if-eq v4, v5, :cond_2

    const/4 v0, 0x0

    goto :goto_2

    :cond_2
    new-instance v4, Ljava/io/File;

    const/4 v5, 0x1

    aget-object v5, v3, v5

    invoke-direct {v4, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/io/File;->isFile()Z

    move-result v5

    if-eqz v5, :cond_3

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

    const/4 v4, 0x0

    aget-object v3, v3, v4

    invoke-virtual {v1, v3, v5}, Lorg/apache/http/entity/mime/f;->a(Ljava/lang/String;Lorg/apache/http/entity/mime/a/c;)V

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :catch_0
    move-exception v1

    :try_start_2
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    :goto_4
    iget-object v0, p0, Lcom/qihoo/security/engine/cloudscan/CloudHttpClient;->b:Lorg/apache/http/client/HttpClient;

    invoke-interface {v0}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/engine/cloudscan/CloudHttpClient;->b:Lorg/apache/http/client/HttpClient;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/engine/cloudscan/CloudHttpClient;->c:Lorg/apache/http/client/methods/HttpPost;

    const/4 v0, 0x0

    goto :goto_2

    :catchall_0
    move-exception v1

    :try_start_3
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3

    :goto_5
    iget-object v0, p0, Lcom/qihoo/security/engine/cloudscan/CloudHttpClient;->b:Lorg/apache/http/client/HttpClient;

    invoke-interface {v0}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/engine/cloudscan/CloudHttpClient;->b:Lorg/apache/http/client/HttpClient;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/engine/cloudscan/CloudHttpClient;->c:Lorg/apache/http/client/methods/HttpPost;

    throw v1

    :cond_4
    const/4 v0, 0x0

    goto/16 :goto_2

    :catch_1
    move-exception v0

    goto/16 :goto_1

    :catch_2
    move-exception v0

    goto :goto_4

    :catch_3
    move-exception v0

    goto :goto_5
.end method
