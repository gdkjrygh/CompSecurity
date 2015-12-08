.class public final Lcom/cm/kinfoc/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/cm/kinfoc/c;


# instance fields
.field private a:Ljava/util/concurrent/ThreadPoolExecutor;


# direct methods
.method public constructor <init>()V
    .locals 8

    .prologue
    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    const/4 v2, 0x1

    const/4 v3, 0x5

    const-wide/32 v4, 0xea60

    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v7, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v7}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    invoke-direct/range {v1 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    iput-object v1, p0, Lcom/cm/kinfoc/j;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 71
    return-void
.end method

.method public static b(Lcom/cm/kinfoc/i;Ljava/lang/String;Lcom/cm/kinfoc/d;)Z
    .locals 8

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 90
    new-instance v2, Lorg/apache/http/params/BasicHttpParams;

    invoke-direct {v2}, Lorg/apache/http/params/BasicHttpParams;-><init>()V

    .line 91
    const v3, 0xea60

    invoke-static {v2, v3}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V

    .line 92
    new-instance v3, Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-direct {v3, v2}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/params/HttpParams;)V

    .line 93
    new-instance v4, Lorg/apache/http/client/methods/HttpPost;

    invoke-direct {v4, p1}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V

    .line 95
    const/4 v2, 0x0

    .line 99
    :try_start_0
    new-instance v5, Lorg/apache/http/entity/ByteArrayEntity;

    invoke-virtual {p0}, Lcom/cm/kinfoc/i;->a()[B

    move-result-object v6

    invoke-direct {v5, v6}, Lorg/apache/http/entity/ByteArrayEntity;-><init>([B)V

    invoke-virtual {v4, v5}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V

    .line 100
    invoke-interface {v3, v4}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v3

    .line 101
    invoke-interface {v3}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v3

    .line 102
    invoke-interface {v3}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    move-result-object v3

    .line 103
    new-instance v5, Ljava/io/BufferedReader;

    new-instance v4, Ljava/io/InputStreamReader;

    invoke-direct {v4, v3}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v5, v4}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 104
    const-string v3, ""

    move v4, v1

    .line 107
    :cond_0
    invoke-virtual {v5}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_1

    .line 108
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 109
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v6, "\r\n"

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 110
    add-int/lit8 v4, v4, 0x1

    .line 112
    const/4 v6, 0x4

    if-le v4, v6, :cond_0

    .line 118
    :cond_1
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ", at "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    invoke-static {v3}, Lcom/cm/kinfoc/b;->a(Ljava/lang/String;)Lcom/cm/kinfoc/b;

    move-result-object v2

    .line 121
    if-eqz v2, :cond_5

    .line 2019
    iget v3, v2, Lcom/cm/kinfoc/b;->b:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_1

    if-ne v3, v0, :cond_3

    move v3, v0

    .line 121
    :goto_0
    if-eqz v3, :cond_5

    :goto_1
    move v1, v0

    .line 135
    :goto_2
    if-eqz p2, :cond_2

    .line 136
    if-eqz v1, :cond_4

    .line 137
    iget-wide v2, v2, Lcom/cm/kinfoc/b;->a:J

    invoke-interface {p2, v2, v3, p0}, Lcom/cm/kinfoc/d;->a(JLcom/cm/kinfoc/i;)V

    .line 143
    :cond_2
    :goto_3
    return v1

    :cond_3
    move v3, v1

    .line 2019
    goto :goto_0

    .line 125
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_2

    .line 127
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Error;->printStackTrace()V

    goto :goto_2

    .line 139
    :cond_4
    invoke-interface {p2, p0}, Lcom/cm/kinfoc/d;->a(Lcom/cm/kinfoc/i;)V

    goto :goto_3

    :cond_5
    move v0, v1

    goto :goto_1
.end method


# virtual methods
.method public final a(Lcom/cm/kinfoc/i;Ljava/lang/String;Lcom/cm/kinfoc/d;)V
    .locals 6

    .prologue
    .line 54
    invoke-virtual {p1}, Lcom/cm/kinfoc/i;->g()I

    move-result v0

    if-ltz v0, :cond_0

    invoke-virtual {p1}, Lcom/cm/kinfoc/i;->g()I

    move-result v0

    const/4 v1, 0x2

    if-lt v0, v1, :cond_1

    .line 55
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "server priority is out of range"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1037
    :cond_1
    sget-boolean v0, Lcom/cm/kinfoc/ag;->a:Z

    .line 60
    new-instance v0, Lcom/cm/kinfoc/k;

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Lcom/cm/kinfoc/k;-><init>(Lcom/cm/kinfoc/j;Lcom/cm/kinfoc/i;Ljava/lang/String;Lcom/cm/kinfoc/d;B)V

    .line 63
    iget-object v1, p0, Lcom/cm/kinfoc/j;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    if-nez v1, :cond_2

    .line 64
    invoke-virtual {v0}, Lcom/cm/kinfoc/k;->start()V

    .line 68
    :goto_0
    return-void

    .line 66
    :cond_2
    iget-object v1, p0, Lcom/cm/kinfoc/j;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    goto :goto_0
.end method
