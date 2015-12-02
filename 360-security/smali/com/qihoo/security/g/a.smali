.class public Lcom/qihoo/security/g/a;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/g/a$a;
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/Object;

.field private static final b:Ljava/util/Locale;

.field private static c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 754
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/qihoo/security/g/a;->a:Ljava/lang/Object;

    .line 755
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/g/a;->b:Ljava/util/Locale;

    .line 757
    const/4 v0, 0x0

    sput-object v0, Lcom/qihoo/security/g/a;->c:Ljava/lang/String;

    return-void
.end method

.method public static a(Lorg/apache/http/client/HttpClient;Ljava/lang/String;Ljava/io/OutputStream;JLcom/qihoo/security/g/a$a;)I
    .locals 11

    .prologue
    const-wide/16 v6, 0x0

    .line 305
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-wide v3, p3

    move-object/from16 v5, p5

    move-wide v8, v6

    invoke-static/range {v0 .. v9}, Lcom/qihoo/security/g/a;->a(Lorg/apache/http/client/HttpClient;Ljava/lang/String;Ljava/io/OutputStream;JLcom/qihoo/security/g/a$a;JJ)I

    move-result v0

    return v0
.end method

.method public static a(Lorg/apache/http/client/HttpClient;Ljava/lang/String;Ljava/io/OutputStream;JLcom/qihoo/security/g/a$a;JJ)I
    .locals 8

    .prologue
    .line 233
    :try_start_0
    new-instance v1, Lorg/apache/http/client/methods/HttpGet;

    invoke-direct {v1, p1}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 244
    const-wide/16 v2, 0x0

    cmp-long v0, p3, v2

    if-lez v0, :cond_0

    .line 245
    const-string/jumbo v0, "Range"

    const-string/jumbo v2, "bytes = %d-"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lorg/apache/http/client/methods/HttpGet;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    move-object v0, p0

    move-object v2, p2

    move-object v3, p5

    move-wide v4, p6

    move-wide/from16 v6, p8

    .line 247
    invoke-static/range {v0 .. v7}, Lcom/qihoo/security/g/a;->a(Lorg/apache/http/client/HttpClient;Lorg/apache/http/client/methods/HttpUriRequest;Ljava/io/OutputStream;Lcom/qihoo/security/g/a$a;JJ)I

    move-result v0

    :goto_0
    return v0

    .line 234
    :catch_0
    move-exception v0

    .line 238
    if-eqz p5, :cond_1

    .line 239
    const/16 v1, -0x61

    invoke-virtual {v0}, Ljava/lang/Exception;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p5, v1, v0}, Lcom/qihoo/security/g/a$a;->a(ILjava/lang/String;)V

    .line 241
    :cond_1
    const/16 v0, -0x61

    goto :goto_0
.end method

.method public static a(Lorg/apache/http/client/HttpClient;Ljava/lang/String;Ljava/io/OutputStream;Lcom/qihoo/security/g/a$a;)I
    .locals 7

    .prologue
    .line 207
    const-wide/16 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v6, p3

    invoke-static/range {v1 .. v6}, Lcom/qihoo/security/g/a;->a(Lorg/apache/http/client/HttpClient;Ljava/lang/String;Ljava/io/OutputStream;JLcom/qihoo/security/g/a$a;)I

    move-result v0

    return v0
.end method

.method public static a(Lorg/apache/http/client/HttpClient;Ljava/lang/String;[BLjava/io/OutputStream;Lcom/qihoo/security/g/a$a;)I
    .locals 3

    .prologue
    .line 327
    new-instance v0, Lorg/apache/http/client/methods/HttpPost;

    invoke-direct {v0, p1}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V

    .line 328
    new-instance v1, Lorg/apache/http/entity/ByteArrayEntity;

    invoke-direct {v1, p2}, Lorg/apache/http/entity/ByteArrayEntity;-><init>([B)V

    .line 329
    const-string/jumbo v2, "application/x-www-form-urlencoded"

    invoke-virtual {v1, v2}, Lorg/apache/http/entity/ByteArrayEntity;->setContentType(Ljava/lang/String;)V

    .line 330
    invoke-virtual {v0, v1}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V

    .line 331
    if-eqz p4, :cond_0

    .line 332
    invoke-interface {p4, v0}, Lcom/qihoo/security/g/a$a;->a(Lorg/apache/http/HttpEntityEnclosingRequest;)V

    .line 335
    :cond_0
    invoke-static {p0, v0, p3, p4}, Lcom/qihoo/security/g/a;->a(Lorg/apache/http/client/HttpClient;Lorg/apache/http/client/methods/HttpUriRequest;Ljava/io/OutputStream;Lcom/qihoo/security/g/a$a;)I

    move-result v0

    return v0
.end method

.method private static a(Lorg/apache/http/client/HttpClient;Lorg/apache/http/client/methods/HttpUriRequest;Ljava/io/OutputStream;Lcom/qihoo/security/g/a$a;)I
    .locals 8

    .prologue
    const-wide/16 v4, 0x0

    .line 393
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-wide v6, v4

    invoke-static/range {v0 .. v7}, Lcom/qihoo/security/g/a;->a(Lorg/apache/http/client/HttpClient;Lorg/apache/http/client/methods/HttpUriRequest;Ljava/io/OutputStream;Lcom/qihoo/security/g/a$a;JJ)I

    move-result v0

    return v0
.end method

.method private static a(Lorg/apache/http/client/HttpClient;Lorg/apache/http/client/methods/HttpUriRequest;Ljava/io/OutputStream;Lcom/qihoo/security/g/a$a;JJ)I
    .locals 8

    .prologue
    .line 403
    .line 405
    :try_start_0
    invoke-interface {p0, p1}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
    :try_end_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lorg/apache/http/conn/HttpHostConnectException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_6
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_7

    move-result-object v3

    .line 483
    const/4 v2, 0x0

    .line 484
    const/4 v1, 0x0

    .line 486
    const/4 v0, 0x0

    .line 489
    :try_start_1
    invoke-interface {v3}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v4

    .line 490
    if-eqz v4, :cond_20

    .line 492
    if-eqz p3, :cond_0

    .line 493
    invoke-interface {p3, v3}, Lcom/qihoo/security/g/a$a;->a(Lorg/apache/http/HttpResponse;)V

    .line 496
    :cond_0
    invoke-interface {v4}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v5

    .line 497
    const/16 v6, 0xc8

    if-lt v5, v6, :cond_1d

    const/16 v6, 0x12c

    if-ge v5, v6, :cond_1d

    .line 498
    invoke-interface {v3}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v2

    .line 499
    invoke-interface {v2}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    move-result-object v1

    .line 500
    invoke-interface {v2}, Lorg/apache/http/HttpEntity;->getContentLength()J

    move-result-wide v4

    .line 505
    const-wide/16 v6, 0x0

    cmp-long v3, p4, v6

    if-lez v3, :cond_c

    cmp-long v3, v4, p4

    if-lez v3, :cond_c

    .line 506
    if-eqz p3, :cond_1

    .line 507
    const/16 v0, -0x9

    const-string/jumbo v3, "invalidate data"

    invoke-interface {p3, v0, v3}, Lcom/qihoo/security/g/a$a;->a(ILjava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_10
    .catch Ljava/net/SocketTimeoutException; {:try_start_1 .. :try_end_1} :catch_12
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_14
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_16
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 509
    :cond_1
    const/16 v0, -0x9

    .line 611
    if-eqz v1, :cond_2

    .line 612
    :try_start_2
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 614
    :cond_2
    if-eqz v2, :cond_3

    .line 615
    invoke-interface {v2}, Lorg/apache/http/HttpEntity;->consumeContent()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_19

    .line 621
    :cond_3
    :goto_0
    return v0

    .line 406
    :catch_0
    move-exception v0

    .line 410
    if-eqz p3, :cond_4

    .line 411
    const/4 v1, -0x1

    invoke-virtual {v0}, Ljava/net/UnknownHostException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p3, v1, v0}, Lcom/qihoo/security/g/a$a;->a(ILjava/lang/String;)V

    .line 413
    :cond_4
    const/4 v0, -0x1

    goto :goto_0

    .line 414
    :catch_1
    move-exception v0

    .line 418
    if-eqz p3, :cond_5

    .line 419
    const/4 v1, -0x2

    invoke-virtual {v0}, Lorg/apache/http/conn/ConnectTimeoutException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p3, v1, v0}, Lcom/qihoo/security/g/a$a;->a(ILjava/lang/String;)V

    .line 421
    :cond_5
    const/4 v0, -0x2

    goto :goto_0

    .line 422
    :catch_2
    move-exception v0

    .line 426
    if-eqz p3, :cond_6

    .line 427
    const/4 v1, -0x2

    invoke-virtual {v0}, Ljava/net/SocketTimeoutException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p3, v1, v0}, Lcom/qihoo/security/g/a$a;->a(ILjava/lang/String;)V

    .line 429
    :cond_6
    const/4 v0, -0x2

    goto :goto_0

    .line 430
    :catch_3
    move-exception v0

    .line 434
    if-eqz p3, :cond_7

    .line 435
    const/4 v1, -0x3

    invoke-virtual {v0}, Lorg/apache/http/conn/HttpHostConnectException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p3, v1, v0}, Lcom/qihoo/security/g/a$a;->a(ILjava/lang/String;)V

    .line 437
    :cond_7
    const/4 v0, -0x3

    goto :goto_0

    .line 438
    :catch_4
    move-exception v0

    .line 442
    if-eqz p3, :cond_8

    .line 443
    const/4 v1, -0x4

    invoke-virtual {v0}, Lorg/apache/http/client/ClientProtocolException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p3, v1, v0}, Lcom/qihoo/security/g/a$a;->a(ILjava/lang/String;)V

    .line 445
    :cond_8
    const/4 v0, -0x4

    goto :goto_0

    .line 446
    :catch_5
    move-exception v0

    .line 450
    if-eqz p3, :cond_9

    .line 451
    const/4 v1, -0x5

    invoke-virtual {v0}, Ljava/io/IOException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p3, v1, v0}, Lcom/qihoo/security/g/a$a;->a(ILjava/lang/String;)V

    .line 453
    :cond_9
    const/4 v0, -0x5

    goto :goto_0

    .line 454
    :catch_6
    move-exception v0

    .line 459
    if-eqz p3, :cond_a

    .line 460
    const/16 v1, -0x63

    invoke-virtual {v0}, Ljava/lang/Exception;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p3, v1, v0}, Lcom/qihoo/security/g/a$a;->a(ILjava/lang/String;)V

    .line 462
    :cond_a
    const/16 v0, -0x63

    goto :goto_0

    .line 463
    :catch_7
    move-exception v0

    .line 477
    if-eqz p3, :cond_b

    .line 478
    const/16 v1, -0x63

    invoke-virtual {v0}, Ljava/lang/Error;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p3, v1, v0}, Lcom/qihoo/security/g/a$a;->a(ILjava/lang/String;)V

    .line 480
    :cond_b
    const/16 v0, -0x63

    goto :goto_0

    .line 513
    :cond_c
    const-wide/16 v6, 0x0

    cmp-long v3, p6, v6

    if-lez v3, :cond_f

    const-wide/16 v6, 0x0

    cmp-long v3, v4, v6

    if-lez v3, :cond_f

    cmp-long v3, v4, p6

    if-eqz v3, :cond_f

    .line 514
    if-eqz p3, :cond_d

    .line 515
    const/16 v0, -0x9

    :try_start_3
    const-string/jumbo v3, "invalidate data"

    invoke-interface {p3, v0, v3}, Lcom/qihoo/security/g/a$a;->a(ILjava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_10
    .catch Ljava/net/SocketTimeoutException; {:try_start_3 .. :try_end_3} :catch_12
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_14
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_16
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 517
    :cond_d
    const/16 v0, -0x9

    .line 611
    if-eqz v1, :cond_e

    .line 612
    :try_start_4
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 614
    :cond_e
    if-eqz v2, :cond_3

    .line 615
    invoke-interface {v2}, Lorg/apache/http/HttpEntity;->consumeContent()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_8

    goto/16 :goto_0

    .line 617
    :catch_8
    move-exception v1

    goto/16 :goto_0

    .line 520
    :cond_f
    if-eqz v1, :cond_1a

    .line 521
    const/16 v3, 0x1000

    :try_start_5
    new-array v3, v3, [B

    .line 523
    :cond_10
    invoke-virtual {v1, v3}, Ljava/io/InputStream;->read([B)I

    move-result v6

    if-lez v6, :cond_17

    .line 524
    const/4 v7, 0x0

    invoke-virtual {p2, v3, v7, v6}, Ljava/io/OutputStream;->write([BII)V

    .line 525
    add-int/2addr v0, v6

    .line 527
    if-eqz p3, :cond_11

    .line 528
    int-to-long v6, v0

    invoke-interface {p3, v6, v7, v4, v5}, Lcom/qihoo/security/g/a$a;->a(JJ)V

    .line 531
    :cond_11
    const-wide/16 v6, 0x0

    cmp-long v6, p4, v6

    if-lez v6, :cond_14

    int-to-long v6, v0

    cmp-long v6, v6, p4

    if-lez v6, :cond_14

    .line 532
    if-eqz p3, :cond_12

    .line 533
    const/16 v0, -0x9

    const-string/jumbo v3, "invalidate data"

    invoke-interface {p3, v0, v3}, Lcom/qihoo/security/g/a$a;->a(ILjava/lang/String;)V
    :try_end_5
    .catch Ljava/lang/InterruptedException; {:try_start_5 .. :try_end_5} :catch_10
    .catch Ljava/net/SocketTimeoutException; {:try_start_5 .. :try_end_5} :catch_12
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_14
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_16
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 535
    :cond_12
    const/16 v0, -0x9

    .line 611
    if-eqz v1, :cond_13

    .line 612
    :try_start_6
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 614
    :cond_13
    if-eqz v2, :cond_3

    .line 615
    invoke-interface {v2}, Lorg/apache/http/HttpEntity;->consumeContent()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_9

    goto/16 :goto_0

    .line 617
    :catch_9
    move-exception v1

    goto/16 :goto_0

    .line 539
    :cond_14
    const-wide/16 v6, 0x0

    cmp-long v6, p6, v6

    if-lez v6, :cond_10

    int-to-long v6, v0

    cmp-long v6, v6, p6

    if-lez v6, :cond_10

    .line 540
    if-eqz p3, :cond_15

    .line 541
    const/16 v0, -0x9

    :try_start_7
    const-string/jumbo v3, "invalidate data"

    invoke-interface {p3, v0, v3}, Lcom/qihoo/security/g/a$a;->a(ILjava/lang/String;)V
    :try_end_7
    .catch Ljava/lang/InterruptedException; {:try_start_7 .. :try_end_7} :catch_10
    .catch Ljava/net/SocketTimeoutException; {:try_start_7 .. :try_end_7} :catch_12
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_14
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_16
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 543
    :cond_15
    const/16 v0, -0x9

    .line 611
    if-eqz v1, :cond_16

    .line 612
    :try_start_8
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 614
    :cond_16
    if-eqz v2, :cond_3

    .line 615
    invoke-interface {v2}, Lorg/apache/http/HttpEntity;->consumeContent()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_a

    goto/16 :goto_0

    .line 617
    :catch_a
    move-exception v1

    goto/16 :goto_0

    .line 548
    :cond_17
    const-wide/16 v4, 0x0

    cmp-long v3, p6, v4

    if-lez v3, :cond_23

    int-to-long v4, v0

    cmp-long v3, v4, p6

    if-eqz v3, :cond_23

    .line 549
    if-eqz p3, :cond_18

    .line 550
    const/16 v0, -0x9

    :try_start_9
    const-string/jumbo v3, "invalidate data"

    invoke-interface {p3, v0, v3}, Lcom/qihoo/security/g/a$a;->a(ILjava/lang/String;)V
    :try_end_9
    .catch Ljava/lang/InterruptedException; {:try_start_9 .. :try_end_9} :catch_10
    .catch Ljava/net/SocketTimeoutException; {:try_start_9 .. :try_end_9} :catch_12
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_14
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_16
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 552
    :cond_18
    const/16 v0, -0x9

    .line 611
    if-eqz v1, :cond_19

    .line 612
    :try_start_a
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 614
    :cond_19
    if-eqz v2, :cond_3

    .line 615
    invoke-interface {v2}, Lorg/apache/http/HttpEntity;->consumeContent()V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_b

    goto/16 :goto_0

    .line 617
    :catch_b
    move-exception v1

    goto/16 :goto_0

    .line 556
    :cond_1a
    if-eqz p3, :cond_1b

    .line 557
    const/4 v0, -0x7

    :try_start_b
    const-string/jumbo v3, "Empty body"

    invoke-interface {p3, v0, v3}, Lcom/qihoo/security/g/a$a;->a(ILjava/lang/String;)V
    :try_end_b
    .catch Ljava/lang/InterruptedException; {:try_start_b .. :try_end_b} :catch_10
    .catch Ljava/net/SocketTimeoutException; {:try_start_b .. :try_end_b} :catch_12
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_14
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_16
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 559
    :cond_1b
    const/4 v0, -0x7

    .line 611
    if-eqz v1, :cond_1c

    .line 612
    :try_start_c
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 614
    :cond_1c
    if-eqz v2, :cond_3

    .line 615
    invoke-interface {v2}, Lorg/apache/http/HttpEntity;->consumeContent()V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_c

    goto/16 :goto_0

    .line 617
    :catch_c
    move-exception v1

    goto/16 :goto_0

    .line 565
    :cond_1d
    if-eqz p3, :cond_1e

    .line 566
    const/4 v0, -0x8

    :try_start_d
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p3, v0, v3}, Lcom/qihoo/security/g/a$a;->a(ILjava/lang/String;)V
    :try_end_d
    .catch Ljava/lang/InterruptedException; {:try_start_d .. :try_end_d} :catch_10
    .catch Ljava/net/SocketTimeoutException; {:try_start_d .. :try_end_d} :catch_12
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_14
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_16
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    .line 568
    :cond_1e
    const/4 v0, -0x8

    .line 611
    if-eqz v1, :cond_1f

    .line 612
    :try_start_e
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 614
    :cond_1f
    if-eqz v2, :cond_3

    .line 615
    invoke-interface {v2}, Lorg/apache/http/HttpEntity;->consumeContent()V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_d

    goto/16 :goto_0

    .line 617
    :catch_d
    move-exception v1

    goto/16 :goto_0

    .line 571
    :cond_20
    if-eqz p3, :cond_21

    .line 572
    const/4 v0, -0x7

    :try_start_f
    const-string/jumbo v3, "Empty header"

    invoke-interface {p3, v0, v3}, Lcom/qihoo/security/g/a$a;->a(ILjava/lang/String;)V
    :try_end_f
    .catch Ljava/lang/InterruptedException; {:try_start_f .. :try_end_f} :catch_10
    .catch Ljava/net/SocketTimeoutException; {:try_start_f .. :try_end_f} :catch_12
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_14
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_16
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    .line 574
    :cond_21
    const/4 v0, -0x7

    .line 611
    if-eqz v1, :cond_22

    .line 612
    :try_start_10
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 614
    :cond_22
    if-eqz v2, :cond_3

    .line 615
    invoke-interface {v2}, Lorg/apache/http/HttpEntity;->consumeContent()V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_e

    goto/16 :goto_0

    .line 617
    :catch_e
    move-exception v1

    goto/16 :goto_0

    .line 611
    :cond_23
    if-eqz v1, :cond_24

    .line 612
    :try_start_11
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 614
    :cond_24
    if-eqz v2, :cond_3

    .line 615
    invoke-interface {v2}, Lorg/apache/http/HttpEntity;->consumeContent()V
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_f

    goto/16 :goto_0

    .line 617
    :catch_f
    move-exception v1

    goto/16 :goto_0

    .line 577
    :catch_10
    move-exception v0

    .line 581
    const/16 v0, -0x62

    .line 611
    if-eqz v1, :cond_25

    .line 612
    :try_start_12
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 614
    :cond_25
    if-eqz v2, :cond_3

    .line 615
    invoke-interface {v2}, Lorg/apache/http/HttpEntity;->consumeContent()V
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_11

    goto/16 :goto_0

    .line 617
    :catch_11
    move-exception v1

    goto/16 :goto_0

    .line 582
    :catch_12
    move-exception v0

    .line 586
    if-eqz p3, :cond_26

    .line 587
    const/4 v3, -0x6

    :try_start_13
    invoke-virtual {v0}, Ljava/net/SocketTimeoutException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p3, v3, v0}, Lcom/qihoo/security/g/a$a;->a(ILjava/lang/String;)V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_0

    .line 589
    :cond_26
    const/4 v0, -0x6

    .line 611
    if-eqz v1, :cond_27

    .line 612
    :try_start_14
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 614
    :cond_27
    if-eqz v2, :cond_3

    .line 615
    invoke-interface {v2}, Lorg/apache/http/HttpEntity;->consumeContent()V
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_13

    goto/16 :goto_0

    .line 617
    :catch_13
    move-exception v1

    goto/16 :goto_0

    .line 590
    :catch_14
    move-exception v0

    .line 595
    if-eqz p3, :cond_28

    .line 596
    const/16 v3, -0xa

    :try_start_15
    invoke-virtual {v0}, Ljava/io/IOException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p3, v3, v0}, Lcom/qihoo/security/g/a$a;->a(ILjava/lang/String;)V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_0

    .line 598
    :cond_28
    const/16 v0, -0xa

    .line 611
    if-eqz v1, :cond_29

    .line 612
    :try_start_16
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 614
    :cond_29
    if-eqz v2, :cond_3

    .line 615
    invoke-interface {v2}, Lorg/apache/http/HttpEntity;->consumeContent()V
    :try_end_16
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_16} :catch_15

    goto/16 :goto_0

    .line 617
    :catch_15
    move-exception v1

    goto/16 :goto_0

    .line 599
    :catch_16
    move-exception v0

    .line 604
    if-eqz p3, :cond_2a

    .line 605
    const/16 v3, -0x63

    :try_start_17
    invoke-virtual {v0}, Ljava/lang/Exception;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p3, v3, v0}, Lcom/qihoo/security/g/a$a;->a(ILjava/lang/String;)V
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_0

    .line 607
    :cond_2a
    const/16 v0, -0x63

    .line 611
    if-eqz v1, :cond_2b

    .line 612
    :try_start_18
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 614
    :cond_2b
    if-eqz v2, :cond_3

    .line 615
    invoke-interface {v2}, Lorg/apache/http/HttpEntity;->consumeContent()V
    :try_end_18
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_18} :catch_17

    goto/16 :goto_0

    .line 617
    :catch_17
    move-exception v1

    goto/16 :goto_0

    .line 610
    :catchall_0
    move-exception v0

    .line 611
    if-eqz v1, :cond_2c

    .line 612
    :try_start_19
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 614
    :cond_2c
    if-eqz v2, :cond_2d

    .line 615
    invoke-interface {v2}, Lorg/apache/http/HttpEntity;->consumeContent()V
    :try_end_19
    .catch Ljava/lang/Exception; {:try_start_19 .. :try_end_19} :catch_18

    .line 618
    :cond_2d
    :goto_1
    throw v0

    .line 617
    :catch_18
    move-exception v1

    goto :goto_1

    :catch_19
    move-exception v1

    goto/16 :goto_0
.end method

.method public static declared-synchronized a()Ljava/lang/String;
    .locals 7

    .prologue
    const/16 v6, 0x30

    const/4 v0, 0x0

    .line 765
    const-class v1, Lcom/qihoo/security/g/a;

    monitor-enter v1

    :try_start_0
    sget-object v2, Lcom/qihoo/security/g/a;->c:Ljava/lang/String;

    if-eqz v2, :cond_0

    .line 766
    sget-object v0, Lcom/qihoo/security/g/a;->c:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 841
    :goto_0
    monitor-exit v1

    return-object v0

    .line 770
    :cond_0
    :try_start_1
    sget-object v2, Lcom/qihoo/security/g/a;->a:Ljava/lang/Object;

    monitor-enter v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 771
    :try_start_2
    sget-object v3, Lcom/qihoo/security/g/a;->b:Ljava/util/Locale;

    .line 772
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 773
    :try_start_3
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 779
    sget-object v4, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 780
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_1

    .line 781
    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 783
    :cond_1
    const-string/jumbo v4, "; "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 788
    sget-object v4, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 789
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_5

    .line 790
    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 795
    :goto_1
    const-string/jumbo v4, "; "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 802
    sget-object v4, Landroid/os/Build;->DISPLAY:Ljava/lang/String;

    .line 803
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_2

    .line 805
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    if-le v5, v6, :cond_6

    .line 806
    const/4 v5, 0x0

    const/16 v6, 0x30

    invoke-virtual {v4, v5, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 807
    const-string/jumbo v4, "..."

    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 813
    :cond_2
    :goto_2
    const-string/jumbo v4, "; "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 816
    invoke-virtual {v3}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v4

    .line 817
    if-eqz v4, :cond_7

    .line 818
    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 819
    invoke-virtual {v3}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v3

    .line 820
    if-eqz v3, :cond_3

    .line 821
    const-string/jumbo v4, "-"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 822
    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 831
    :cond_3
    :goto_3
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    .line 832
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 833
    :goto_4
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v0, v4, :cond_8

    .line 834
    invoke-virtual {v2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v4

    .line 835
    const/16 v5, 0x20

    if-lt v4, v5, :cond_4

    const/16 v5, 0x7e

    if-gt v4, v5, :cond_4

    .line 836
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 833
    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    .line 772
    :catchall_0
    move-exception v0

    :try_start_4
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 765
    :catchall_1
    move-exception v0

    monitor-exit v1

    throw v0

    .line 793
    :cond_5
    :try_start_6
    const-string/jumbo v4, "1.0"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_1

    .line 809
    :cond_6
    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_2

    .line 826
    :cond_7
    const-string/jumbo v3, "en"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_3

    .line 839
    :cond_8
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/g/a;->c:Ljava/lang/String;

    .line 841
    sget-object v0, Lcom/qihoo/security/g/a;->c:Ljava/lang/String;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto/16 :goto_0
.end method

.method public static a(Landroid/content/Context;)Ljava/lang/String;
    .locals 8

    .prologue
    const/4 v7, 0x0

    .line 671
    const-string/jumbo v0, "content://telephony/carriers/preferapn"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    .line 673
    const-string/jumbo v6, "UNKNOWN"

    .line 676
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v1

    .line 677
    if-eqz v1, :cond_0

    .line 678
    :try_start_1
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 679
    const-string/jumbo v0, "apn"

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 680
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 681
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-object v0

    .line 691
    :goto_0
    invoke-static {v1}, Lcom/qihoo360/common/utils/Utils;->closeCursor(Landroid/database/Cursor;)V

    .line 697
    :goto_1
    return-object v0

    .line 686
    :catch_0
    move-exception v0

    move-object v0, v7

    .line 691
    :goto_2
    invoke-static {v0}, Lcom/qihoo360/common/utils/Utils;->closeCursor(Landroid/database/Cursor;)V

    move-object v0, v6

    .line 692
    goto :goto_1

    .line 691
    :catchall_0
    move-exception v0

    move-object v1, v7

    :goto_3
    invoke-static {v1}, Lcom/qihoo360/common/utils/Utils;->closeCursor(Landroid/database/Cursor;)V

    throw v0

    :catchall_1
    move-exception v0

    goto :goto_3

    .line 686
    :catch_1
    move-exception v0

    move-object v0, v1

    goto :goto_2

    :cond_0
    move-object v0, v6

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;Lcom/qihoo/security/d/a;)Lorg/apache/http/HttpHost;
    .locals 1

    .prologue
    .line 703
    invoke-static {p0}, Lcom/qihoo360/mobilesafe/b/o;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 704
    invoke-static {p0, p1}, Lcom/qihoo/security/g/a;->b(Landroid/content/Context;Lcom/qihoo/security/d/a;)Lorg/apache/http/HttpHost;

    move-result-object v0

    .line 707
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(Lorg/apache/http/HttpHost;)Lorg/apache/http/client/HttpClient;
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 104
    const/4 v0, 0x0

    invoke-static {p0, v1, v0, v1}, Lcom/qihoo/security/g/a;->a(Lorg/apache/http/HttpHost;Ljava/lang/String;ILorg/apache/http/conn/scheme/SocketFactory;)Lorg/apache/http/client/HttpClient;

    move-result-object v0

    return-object v0
.end method

.method private static a(Lorg/apache/http/HttpHost;Ljava/lang/String;ILorg/apache/http/conn/scheme/SocketFactory;)Lorg/apache/http/client/HttpClient;
    .locals 6

    .prologue
    .line 115
    .line 123
    invoke-static {}, Lcom/qihoo/security/g/a;->a()Ljava/lang/String;

    move-result-object v0

    .line 125
    new-instance v1, Lorg/apache/http/params/BasicHttpParams;

    invoke-direct {v1}, Lorg/apache/http/params/BasicHttpParams;-><init>()V

    .line 126
    sget-object v2, Lorg/apache/http/HttpVersion;->HTTP_1_1:Lorg/apache/http/HttpVersion;

    invoke-static {v1, v2}, Lorg/apache/http/params/HttpProtocolParams;->setVersion(Lorg/apache/http/params/HttpParams;Lorg/apache/http/ProtocolVersion;)V

    .line 127
    invoke-static {v1, v0}, Lorg/apache/http/params/HttpProtocolParams;->setUserAgent(Lorg/apache/http/params/HttpParams;Ljava/lang/String;)V

    .line 129
    const/16 v0, 0xa

    invoke-static {v1, v0}, Lorg/apache/http/conn/params/ConnManagerParams;->setMaxTotalConnections(Lorg/apache/http/params/HttpParams;I)V

    .line 130
    const-wide/16 v2, 0x1388

    invoke-static {v1, v2, v3}, Lorg/apache/http/conn/params/ConnManagerParams;->setTimeout(Lorg/apache/http/params/HttpParams;J)V

    .line 132
    const/16 v0, 0x1388

    invoke-static {v1, v0}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V

    .line 134
    const/16 v0, 0x7530

    invoke-static {v1, v0}, Lorg/apache/http/params/HttpConnectionParams;->setSoTimeout(Lorg/apache/http/params/HttpParams;I)V

    .line 136
    const/4 v0, 0x1

    invoke-static {v1, v0}, Lorg/apache/http/params/HttpConnectionParams;->setStaleCheckingEnabled(Lorg/apache/http/params/HttpParams;Z)V

    .line 137
    const/16 v0, 0x2000

    invoke-static {v1, v0}, Lorg/apache/http/params/HttpConnectionParams;->setSocketBufferSize(Lorg/apache/http/params/HttpParams;I)V

    .line 139
    invoke-static {v1, p0}, Lorg/apache/http/conn/params/ConnRouteParams;->setDefaultProxy(Lorg/apache/http/params/HttpParams;Lorg/apache/http/HttpHost;)V

    .line 141
    new-instance v0, Lorg/apache/http/conn/scheme/SchemeRegistry;

    invoke-direct {v0}, Lorg/apache/http/conn/scheme/SchemeRegistry;-><init>()V

    .line 143
    new-instance v2, Lorg/apache/http/conn/scheme/Scheme;

    const-string/jumbo v3, "http"

    invoke-static {}, Lorg/apache/http/conn/scheme/PlainSocketFactory;->getSocketFactory()Lorg/apache/http/conn/scheme/PlainSocketFactory;

    move-result-object v4

    const/16 v5, 0x50

    invoke-direct {v2, v3, v4, v5}, Lorg/apache/http/conn/scheme/Scheme;-><init>(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V

    invoke-virtual {v0, v2}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;

    .line 145
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 146
    new-instance v2, Lorg/apache/http/conn/scheme/Scheme;

    invoke-direct {v2, p1, p3, p2}, Lorg/apache/http/conn/scheme/Scheme;-><init>(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V

    invoke-virtual {v0, v2}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;

    .line 149
    :cond_0
    new-instance v2, Lorg/apache/http/impl/client/DefaultHttpClient;

    new-instance v3, Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager;

    invoke-direct {v3, v1, v0}, Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager;-><init>(Lorg/apache/http/params/HttpParams;Lorg/apache/http/conn/scheme/SchemeRegistry;)V

    invoke-direct {v2, v3, v1}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/conn/ClientConnectionManager;Lorg/apache/http/params/HttpParams;)V

    return-object v2
.end method

.method public static b(Landroid/content/Context;)Lorg/apache/http/HttpHost;
    .locals 3

    .prologue
    .line 743
    invoke-static {}, Landroid/net/Proxy;->getDefaultHost()Ljava/lang/String;

    move-result-object v1

    .line 744
    invoke-static {}, Landroid/net/Proxy;->getDefaultPort()I

    move-result v2

    .line 746
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 747
    new-instance v0, Lorg/apache/http/HttpHost;

    invoke-direct {v0, v1, v2}, Lorg/apache/http/HttpHost;-><init>(Ljava/lang/String;I)V

    .line 749
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static b(Landroid/content/Context;Lcom/qihoo/security/d/a;)Lorg/apache/http/HttpHost;
    .locals 5

    .prologue
    const/4 v0, 0x0

    const/4 v3, 0x2

    .line 717
    invoke-static {p0}, Lcom/qihoo/security/g/a;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    .line 718
    const-string/jumbo v2, "apn"

    invoke-virtual {p1, v2, v1}, Lcom/qihoo/security/d/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 719
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 720
    invoke-static {p0}, Lcom/qihoo/security/g/a;->b(Landroid/content/Context;)Lorg/apache/http/HttpHost;

    move-result-object v0

    .line 737
    :cond_0
    :goto_0
    return-object v0

    .line 723
    :cond_1
    const-string/jumbo v2, "<none>"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 727
    const-string/jumbo v2, ":"

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v2

    .line 728
    if-eqz v2, :cond_0

    array-length v1, v2

    if-ne v1, v3, :cond_0

    .line 731
    :try_start_0
    new-instance v1, Lorg/apache/http/HttpHost;

    const/4 v3, 0x0

    aget-object v3, v2, v3

    const/4 v4, 0x1

    aget-object v2, v2, v4

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    invoke-direct {v1, v3, v2}, Lorg/apache/http/HttpHost;-><init>(Ljava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    goto :goto_0

    .line 732
    :catch_0
    move-exception v1

    .line 733
    const-string/jumbo v2, "HttpEngine"

    const-string/jumbo v3, "getOverridedApnProxy()"

    invoke-static {v2, v3, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method
