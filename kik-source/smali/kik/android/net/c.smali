.class public final Lkik/android/net/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/volley/h;


# static fields
.field protected static final a:Z

.field private static d:I

.field private static e:I


# instance fields
.field protected final b:Lcom/android/volley/toolbox/g;

.field protected final c:Lcom/android/volley/toolbox/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 60
    sget-boolean v0, Lcom/android/volley/x;->b:Z

    sput-boolean v0, Lkik/android/net/c;->a:Z

    .line 62
    const/16 v0, 0xbb8

    sput v0, Lkik/android/net/c;->d:I

    .line 64
    const/16 v0, 0x1000

    sput v0, Lkik/android/net/c;->e:I

    return-void
.end method

.method public constructor <init>(Lcom/android/volley/toolbox/g;)V
    .locals 2

    .prologue
    .line 77
    new-instance v0, Lcom/android/volley/toolbox/b;

    sget v1, Lkik/android/net/c;->e:I

    invoke-direct {v0, v1}, Lcom/android/volley/toolbox/b;-><init>(I)V

    invoke-direct {p0, p1, v0}, Lkik/android/net/c;-><init>(Lcom/android/volley/toolbox/g;Lcom/android/volley/toolbox/b;)V

    .line 78
    return-void
.end method

.method private constructor <init>(Lcom/android/volley/toolbox/g;Lcom/android/volley/toolbox/b;)V
    .locals 0

    .prologue
    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 86
    iput-object p1, p0, Lkik/android/net/c;->b:Lcom/android/volley/toolbox/g;

    .line 87
    iput-object p2, p0, Lkik/android/net/c;->c:Lcom/android/volley/toolbox/b;

    .line 88
    return-void
.end method

.method private static a([Lorg/apache/http/Header;)Ljava/util/Map;
    .locals 4

    .prologue
    .line 292
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 293
    const/4 v0, 0x0

    :goto_0
    array-length v2, p0

    if-ge v0, v2, :cond_0

    .line 294
    aget-object v2, p0, v0

    invoke-interface {v2}, Lorg/apache/http/Header;->getName()Ljava/lang/String;

    move-result-object v2

    aget-object v3, p0, v0

    invoke-interface {v3}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 293
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 296
    :cond_0
    return-object v1
.end method

.method private static a(Ljava/lang/String;Lcom/android/volley/n;Lcom/android/volley/w;)V
    .locals 6

    .prologue
    const/4 v3, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 218
    invoke-virtual {p1}, Lcom/android/volley/n;->q()Lcom/android/volley/t;

    move-result-object v0

    .line 219
    invoke-virtual {p1}, Lcom/android/volley/n;->p()I

    move-result v1

    .line 222
    :try_start_0
    invoke-interface {v0, p2}, Lcom/android/volley/t;->a(Lcom/android/volley/w;)V
    :try_end_0
    .catch Lcom/android/volley/w; {:try_start_0 .. :try_end_0} :catch_0

    .line 229
    const-string v0, "%s-retry [timeout=%s]"

    new-array v2, v3, [Ljava/lang/Object;

    aput-object p0, v2, v4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v2, v5

    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/volley/n;->a(Ljava/lang/String;)V

    .line 230
    return-void

    .line 224
    :catch_0
    move-exception v0

    .line 225
    const-string v2, "%s-timeout-giveup [timeout=%s]"

    new-array v3, v3, [Ljava/lang/Object;

    aput-object p0, v3, v4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v3, v5

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/android/volley/n;->a(Ljava/lang/String;)V

    .line 227
    throw v0
.end method

.method private a(Lorg/apache/http/HttpEntity;)[B
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 258
    new-instance v2, Lcom/android/volley/toolbox/s;

    iget-object v0, p0, Lkik/android/net/c;->c:Lcom/android/volley/toolbox/b;

    invoke-interface {p1}, Lorg/apache/http/HttpEntity;->getContentLength()J

    move-result-wide v4

    long-to-int v1, v4

    invoke-direct {v2, v0, v1}, Lcom/android/volley/toolbox/s;-><init>(Lcom/android/volley/toolbox/b;I)V

    .line 259
    const/4 v1, 0x0

    .line 261
    :try_start_0
    invoke-interface {p1}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    move-result-object v0

    .line 262
    if-nez v0, :cond_0

    .line 263
    new-instance v0, Lcom/android/volley/u;

    invoke-direct {v0}, Lcom/android/volley/u;-><init>()V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 273
    :catchall_0
    move-exception v0

    .line 275
    :try_start_1
    invoke-interface {p1}, Lorg/apache/http/HttpEntity;->consumeContent()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 282
    :goto_0
    iget-object v3, p0, Lkik/android/net/c;->c:Lcom/android/volley/toolbox/b;

    invoke-virtual {v3, v1}, Lcom/android/volley/toolbox/b;->a([B)V

    .line 283
    invoke-virtual {v2}, Lcom/android/volley/toolbox/s;->close()V

    throw v0

    .line 265
    :cond_0
    :try_start_2
    iget-object v3, p0, Lkik/android/net/c;->c:Lcom/android/volley/toolbox/b;

    const/16 v4, 0x400

    invoke-virtual {v3, v4}, Lcom/android/volley/toolbox/b;->a(I)[B

    move-result-object v1

    .line 267
    :goto_1
    invoke-virtual {v0, v1}, Ljava/io/InputStream;->read([B)I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_1

    .line 268
    const/4 v4, 0x0

    invoke-virtual {v2, v1, v4, v3}, Lcom/android/volley/toolbox/s;->write([BII)V

    goto :goto_1

    .line 270
    :cond_1
    invoke-virtual {v2}, Lcom/android/volley/toolbox/s;->toByteArray()[B
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v0

    .line 275
    :try_start_3
    invoke-interface {p1}, Lorg/apache/http/HttpEntity;->consumeContent()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    .line 282
    :goto_2
    iget-object v3, p0, Lkik/android/net/c;->c:Lcom/android/volley/toolbox/b;

    invoke-virtual {v3, v1}, Lcom/android/volley/toolbox/b;->a([B)V

    .line 283
    invoke-virtual {v2}, Lcom/android/volley/toolbox/s;->close()V

    return-object v0

    .line 280
    :catch_0
    move-exception v3

    const-string v3, "Error occured when calling consumingContent"

    new-array v4, v6, [Ljava/lang/Object;

    invoke-static {v3, v4}, Lcom/android/volley/x;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    :catch_1
    move-exception v3

    const-string v3, "Error occured when calling consumingContent"

    new-array v4, v6, [Ljava/lang/Object;

    invoke-static {v3, v4}, Lcom/android/volley/x;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method


# virtual methods
.method public final a(Lcom/android/volley/n;)Lcom/android/volley/k;
    .locals 17

    .prologue
    .line 93
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v8

    .line 95
    :goto_0
    const/4 v4, 0x0

    .line 96
    const/4 v5, 0x0

    .line 97
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 100
    :try_start_0
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 101
    invoke-virtual/range {p1 .. p1}, Lcom/android/volley/n;->f()Lcom/android/volley/b$a;

    move-result-object v6

    if-eqz v6, :cond_1

    iget-object v7, v6, Lcom/android/volley/b$a;->b:Ljava/lang/String;

    if-eqz v7, :cond_0

    const-string v7, "If-None-Match"

    iget-object v10, v6, Lcom/android/volley/b$a;->b:Ljava/lang/String;

    invoke-interface {v2, v7, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-wide v10, v6, Lcom/android/volley/b$a;->c:J

    const-wide/16 v12, 0x0

    cmp-long v7, v10, v12

    if-lez v7, :cond_1

    new-instance v7, Ljava/util/Date;

    iget-wide v10, v6, Lcom/android/volley/b$a;->c:J

    invoke-direct {v7, v10, v11}, Ljava/util/Date;-><init>(J)V

    const-string v6, "If-Modified-Since"

    invoke-static {v7}, Lorg/apache/http/impl/cookie/DateUtils;->formatDate(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v2, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    :cond_1
    move-object/from16 v0, p0

    iget-object v6, v0, Lkik/android/net/c;->b:Lcom/android/volley/toolbox/g;

    move-object/from16 v0, p1

    invoke-interface {v6, v0, v2}, Lcom/android/volley/toolbox/g;->a(Lcom/android/volley/n;Ljava/util/Map;)Lorg/apache/http/HttpResponse;
    :try_end_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4

    move-result-object v6

    .line 103
    :try_start_1
    invoke-interface {v6}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v7

    .line 104
    invoke-interface {v7}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v10

    .line 106
    invoke-interface {v6}, Lorg/apache/http/HttpResponse;->getAllHeaders()[Lorg/apache/http/Header;

    move-result-object v2

    invoke-static {v2}, Lkik/android/net/c;->a([Lorg/apache/http/Header;)Ljava/util/Map;
    :try_end_1
    .catch Ljava/net/SocketTimeoutException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/net/MalformedURLException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_5

    move-result-object v4

    .line 108
    const/16 v2, 0x130

    if-ne v10, v2, :cond_3

    .line 109
    :try_start_2
    new-instance v2, Lcom/android/volley/k;

    const/16 v7, 0x130

    invoke-virtual/range {p1 .. p1}, Lcom/android/volley/n;->f()Lcom/android/volley/b$a;

    move-result-object v3

    if-nez v3, :cond_2

    const/4 v3, 0x0

    :goto_1
    const/4 v10, 0x1

    invoke-direct {v2, v7, v3, v4, v10}, Lcom/android/volley/k;-><init>(I[BLjava/util/Map;Z)V

    .line 144
    :goto_2
    return-object v2

    .line 109
    :cond_2
    invoke-virtual/range {p1 .. p1}, Lcom/android/volley/n;->f()Lcom/android/volley/b$a;

    move-result-object v3

    iget-object v3, v3, Lcom/android/volley/b$a;->a:[B

    goto :goto_1

    .line 115
    :cond_3
    const/16 v2, 0x12d

    if-eq v10, v2, :cond_4

    const/16 v2, 0x12e

    if-ne v10, v2, :cond_5

    .line 116
    :cond_4
    move-object/from16 v0, p1

    instance-of v2, v0, Lcom/kik/cache/au;

    if-eqz v2, :cond_5

    .line 117
    const-string v2, "Location"

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 118
    move-object/from16 v0, p1

    check-cast v0, Lcom/kik/cache/au;

    move-object v3, v0

    invoke-interface {v3, v2}, Lcom/kik/cache/au;->a_(Ljava/lang/String;)V

    .line 123
    :cond_5
    invoke-interface {v6}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;
    :try_end_2
    .catch Ljava/net/SocketTimeoutException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/net/MalformedURLException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_6

    move-result-object v2

    if-eqz v2, :cond_9

    .line 125
    :try_start_3
    invoke-interface {v6}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v2

    move-object/from16 v0, p0

    invoke-direct {v0, v2}, Lkik/android/net/c;->a(Lorg/apache/http/HttpEntity;)[B
    :try_end_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/net/SocketTimeoutException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/net/MalformedURLException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_6

    move-result-object v3

    .line 138
    :goto_3
    :try_start_4
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v12

    sub-long/2addr v12, v8

    .line 139
    sget-boolean v2, Lkik/android/net/c;->a:Z

    if-nez v2, :cond_6

    sget v2, Lkik/android/net/c;->d:I

    int-to-long v14, v2

    cmp-long v2, v12, v14

    if-lez v2, :cond_7

    :cond_6
    const-string v5, "HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]"

    const/4 v2, 0x5

    new-array v11, v2, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v11, v2

    const/4 v2, 0x1

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    aput-object v12, v11, v2

    const/4 v12, 0x2

    if-eqz v3, :cond_a

    array-length v2, v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    :goto_4
    aput-object v2, v11, v12

    const/4 v2, 0x3

    invoke-interface {v7}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v11, v2

    const/4 v2, 0x4

    invoke-virtual/range {p1 .. p1}, Lcom/android/volley/n;->q()Lcom/android/volley/t;

    move-result-object v7

    invoke-interface {v7}, Lcom/android/volley/t;->b()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v11, v2

    invoke-static {v5, v11}, Lcom/android/volley/x;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 141
    :cond_7
    const/16 v2, 0xc8

    if-lt v10, v2, :cond_8

    const/16 v2, 0x12b

    if-le v10, v2, :cond_b

    .line 142
    :cond_8
    new-instance v2, Ljava/io/IOException;

    invoke-direct {v2}, Ljava/io/IOException;-><init>()V

    throw v2
    :try_end_4
    .catch Ljava/net/SocketTimeoutException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/net/MalformedURLException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_7

    .line 147
    :catch_0
    move-exception v2

    const-string v2, "socket"

    new-instance v3, Lcom/android/volley/v;

    invoke-direct {v3}, Lcom/android/volley/v;-><init>()V

    move-object/from16 v0, p1

    invoke-static {v2, v0, v3}, Lkik/android/net/c;->a(Ljava/lang/String;Lcom/android/volley/n;Lcom/android/volley/w;)V

    goto/16 :goto_0

    .line 127
    :catch_1
    move-exception v2

    .line 128
    :try_start_5
    new-instance v3, Lcom/android/volley/w;

    invoke-direct {v3, v2}, Lcom/android/volley/w;-><init>(Ljava/lang/Throwable;)V

    throw v3
    :try_end_5
    .catch Ljava/net/SocketTimeoutException; {:try_start_5 .. :try_end_5} :catch_0
    .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Ljava/net/MalformedURLException; {:try_start_5 .. :try_end_5} :catch_3
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_6

    .line 150
    :catch_2
    move-exception v2

    const-string v2, "connection"

    new-instance v3, Lcom/android/volley/v;

    invoke-direct {v3}, Lcom/android/volley/v;-><init>()V

    move-object/from16 v0, p1

    invoke-static {v2, v0, v3}, Lkik/android/net/c;->a(Ljava/lang/String;Lcom/android/volley/n;Lcom/android/volley/w;)V

    goto/16 :goto_0

    .line 134
    :cond_9
    const/4 v2, 0x0

    :try_start_6
    new-array v3, v2, [B
    :try_end_6
    .catch Ljava/net/SocketTimeoutException; {:try_start_6 .. :try_end_6} :catch_0
    .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/net/MalformedURLException; {:try_start_6 .. :try_end_6} :catch_3
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_6

    goto :goto_3

    .line 139
    :cond_a
    :try_start_7
    const-string v2, "null"

    goto :goto_4

    .line 144
    :cond_b
    new-instance v2, Lcom/android/volley/k;

    const/4 v5, 0x0

    invoke-direct {v2, v10, v3, v4, v5}, Lcom/android/volley/k;-><init>(I[BLjava/util/Map;Z)V
    :try_end_7
    .catch Ljava/net/SocketTimeoutException; {:try_start_7 .. :try_end_7} :catch_0
    .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_7 .. :try_end_7} :catch_2
    .catch Ljava/net/MalformedURLException; {:try_start_7 .. :try_end_7} :catch_3
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_7

    goto/16 :goto_2

    .line 152
    :catch_3
    move-exception v2

    .line 153
    new-instance v3, Ljava/lang/RuntimeException;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Bad URL "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/android/volley/n;->d()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v3

    .line 155
    :catch_4
    move-exception v2

    move-object/from16 v16, v5

    move-object v5, v4

    move-object/from16 v4, v16

    .line 156
    :goto_5
    if-eqz v5, :cond_e

    .line 159
    invoke-interface {v5}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v2

    invoke-interface {v2}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v5

    .line 164
    const/16 v2, 0x12d

    if-eq v5, v2, :cond_c

    const/16 v2, 0x12e

    if-ne v5, v2, :cond_f

    move-object/from16 v0, p1

    instance-of v2, v0, Lcom/kik/cache/au;

    if-eqz v2, :cond_f

    .line 166
    :cond_c
    const-string v6, "Request at %s has been redirected to %s"

    const/4 v2, 0x2

    new-array v7, v2, [Ljava/lang/Object;

    const/4 v10, 0x0

    move-object/from16 v2, p1

    check-cast v2, Lcom/kik/cache/au;

    invoke-interface {v2}, Lcom/kik/cache/au;->t()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v7, v10

    const/4 v2, 0x1

    invoke-virtual/range {p1 .. p1}, Lcom/android/volley/n;->d()Ljava/lang/String;

    move-result-object v10

    aput-object v10, v7, v2

    invoke-static {v6, v7}, Lcom/android/volley/x;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 171
    :goto_6
    if-eqz v4, :cond_13

    .line 172
    new-instance v2, Lcom/android/volley/k;

    const/4 v6, 0x0

    invoke-direct {v2, v5, v4, v3, v6}, Lcom/android/volley/k;-><init>(I[BLjava/util/Map;Z)V

    .line 174
    const/16 v3, 0x191

    if-eq v5, v3, :cond_d

    const/16 v3, 0x193

    if-ne v5, v3, :cond_10

    .line 176
    :cond_d
    const-string v3, "auth"

    new-instance v4, Lcom/android/volley/a;

    invoke-direct {v4, v2}, Lcom/android/volley/a;-><init>(Lcom/android/volley/k;)V

    move-object/from16 v0, p1

    invoke-static {v3, v0, v4}, Lkik/android/net/c;->a(Ljava/lang/String;Lcom/android/volley/n;Lcom/android/volley/w;)V

    goto/16 :goto_0

    .line 162
    :cond_e
    new-instance v3, Lcom/android/volley/l;

    invoke-direct {v3, v2}, Lcom/android/volley/l;-><init>(Ljava/lang/Throwable;)V

    throw v3

    .line 169
    :cond_f
    const-string v2, "Unexpected response code %d for %s"

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v6, v7

    const/4 v7, 0x1

    invoke-virtual/range {p1 .. p1}, Lcom/android/volley/n;->d()Ljava/lang/String;

    move-result-object v10

    aput-object v10, v6, v7

    invoke-static {v2, v6}, Lcom/android/volley/x;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_6

    .line 179
    :cond_10
    const/16 v3, 0x12d

    if-eq v5, v3, :cond_11

    const/16 v3, 0x12e

    if-ne v5, v3, :cond_12

    move-object/from16 v0, p1

    instance-of v3, v0, Lcom/kik/cache/au;

    if-eqz v3, :cond_12

    .line 181
    :cond_11
    const-string v3, "redirect"

    new-instance v4, Lcom/android/volley/a;

    invoke-direct {v4, v2}, Lcom/android/volley/a;-><init>(Lcom/android/volley/k;)V

    move-object/from16 v0, p1

    invoke-static {v3, v0, v4}, Lkik/android/net/c;->a(Ljava/lang/String;Lcom/android/volley/n;Lcom/android/volley/w;)V

    goto/16 :goto_0

    .line 186
    :cond_12
    new-instance v3, Lcom/android/volley/u;

    invoke-direct {v3, v2}, Lcom/android/volley/u;-><init>(Lcom/android/volley/k;)V

    throw v3

    .line 190
    :cond_13
    new-instance v2, Lcom/android/volley/j;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lcom/android/volley/j;-><init>(B)V

    throw v2

    .line 155
    :catch_5
    move-exception v2

    move-object v4, v5

    move-object v5, v6

    goto/16 :goto_5

    :catch_6
    move-exception v2

    move-object v3, v4

    move-object v4, v5

    move-object v5, v6

    goto/16 :goto_5

    :catch_7
    move-exception v2

    move-object v5, v6

    move-object/from16 v16, v3

    move-object v3, v4

    move-object/from16 v4, v16

    goto/16 :goto_5
.end method
