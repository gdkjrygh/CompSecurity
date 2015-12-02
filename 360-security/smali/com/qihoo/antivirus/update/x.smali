.class public Lcom/qihoo/antivirus/update/x;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/antivirus/update/x$a;
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
    .line 755
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/qihoo/antivirus/update/x;->a:Ljava/lang/Object;

    .line 756
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    sput-object v0, Lcom/qihoo/antivirus/update/x;->b:Ljava/util/Locale;

    .line 758
    const/4 v0, 0x0

    sput-object v0, Lcom/qihoo/antivirus/update/x;->c:Ljava/lang/String;

    return-void
.end method

.method public static a(Lorg/apache/http/client/HttpClient;Ljava/lang/String;Ljava/io/OutputStream;JLcom/qihoo/antivirus/update/x$a;JJ)I
    .locals 8

    .prologue
    .line 308
    :try_start_0
    new-instance v1, Lorg/apache/http/client/methods/HttpGet;

    invoke-direct {v1, p1}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 319
    const-wide/16 v2, 0x0

    cmp-long v0, p3, v2

    if-lez v0, :cond_0

    .line 320
    const-string/jumbo v0, "Range"

    const-string/jumbo v2, "bytes=%d-"

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

    .line 322
    invoke-static/range {v0 .. v7}, Lcom/qihoo/antivirus/update/x;->a(Lorg/apache/http/client/HttpClient;Lorg/apache/http/client/methods/HttpUriRequest;Ljava/io/OutputStream;Lcom/qihoo/antivirus/update/x$a;JJ)I

    move-result v0

    :goto_0
    return v0

    .line 309
    :catch_0
    move-exception v0

    .line 313
    if-eqz p5, :cond_1

    .line 314
    const/16 v1, -0x61

    invoke-virtual {v0}, Ljava/lang/Exception;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p5, v1, v0}, Lcom/qihoo/antivirus/update/x$a;->a(ILjava/lang/String;)V

    .line 316
    :cond_1
    const/16 v0, -0x61

    goto :goto_0
.end method

.method private static a(Lorg/apache/http/client/HttpClient;Lorg/apache/http/client/methods/HttpUriRequest;Ljava/io/OutputStream;Lcom/qihoo/antivirus/update/x$a;JJ)I
    .locals 12

    .prologue
    .line 424
    const-string/jumbo v0, "Accept"

    const-string/jumbo v1, "*/*"

    invoke-interface {p1, v0, v1}, Lorg/apache/http/client/methods/HttpUriRequest;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 425
    const-string/jumbo v0, "Cache-Control"

    const-string/jumbo v1, "no-cache"

    invoke-interface {p1, v0, v1}, Lorg/apache/http/client/methods/HttpUriRequest;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 426
    const-string/jumbo v0, "Pragma"

    const-string/jumbo v1, "no-cache"

    invoke-interface {p1, v0, v1}, Lorg/apache/http/client/methods/HttpUriRequest;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 430
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

    move-result-object v2

    .line 490
    const/4 v1, 0x0

    .line 491
    const/4 v0, 0x0

    .line 493
    const/4 v3, 0x0

    .line 496
    :try_start_1
    invoke-interface {v2}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v4

    .line 497
    if-eqz v4, :cond_25

    .line 499
    if-eqz p3, :cond_0

    .line 500
    invoke-interface {p3, v2}, Lcom/qihoo/antivirus/update/x$a;->a(Lorg/apache/http/HttpResponse;)V

    .line 502
    :cond_0
    invoke-interface {v4}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v5

    .line 503
    const/16 v6, 0xc8

    if-lt v5, v6, :cond_21

    const/16 v6, 0x12c

    if-ge v5, v6, :cond_21

    .line 504
    invoke-interface {v2}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_17
    .catch Ljava/net/SocketTimeoutException; {:try_start_1 .. :try_end_1} :catch_8
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_9
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_a
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v2

    .line 505
    :try_start_2
    invoke-interface {v2}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_18
    .catch Ljava/net/SocketTimeoutException; {:try_start_2 .. :try_end_2} :catch_14
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_11
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_e
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-result-object v1

    .line 506
    :try_start_3
    invoke-interface {v2}, Lorg/apache/http/HttpEntity;->getContentLength()J

    move-result-wide v4

    .line 511
    const-wide/16 v6, 0x0

    cmp-long v0, p4, v6

    if-lez v0, :cond_c

    cmp-long v0, v4, p4

    if-lez v0, :cond_c

    .line 512
    if-eqz p3, :cond_1

    .line 513
    const/16 v0, -0x9

    const-string/jumbo v3, "invalidate data"

    invoke-interface {p3, v0, v3}, Lcom/qihoo/antivirus/update/x$a;->a(ILjava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_7
    .catch Ljava/net/SocketTimeoutException; {:try_start_3 .. :try_end_3} :catch_15
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_12
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_f
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 641
    :cond_1
    :goto_0
    if-eqz v1, :cond_2

    .line 642
    :try_start_4
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 643
    :cond_2
    if-eqz v2, :cond_3

    .line 644
    invoke-interface {v2}, Lorg/apache/http/HttpEntity;->consumeContent()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1f

    .line 518
    :cond_3
    :goto_1
    const/16 v0, -0x9

    .line 649
    :cond_4
    :goto_2
    return v0

    .line 431
    :catch_0
    move-exception v0

    .line 435
    if-eqz p3, :cond_5

    .line 436
    const/4 v1, -0x1

    invoke-virtual {v0}, Ljava/net/UnknownHostException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p3, v1, v0}, Lcom/qihoo/antivirus/update/x$a;->a(ILjava/lang/String;)V

    .line 438
    :cond_5
    const/4 v0, -0x1

    goto :goto_2

    .line 439
    :catch_1
    move-exception v0

    .line 443
    if-eqz p3, :cond_6

    .line 444
    const/4 v1, -0x2

    invoke-virtual {v0}, Lorg/apache/http/conn/ConnectTimeoutException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p3, v1, v0}, Lcom/qihoo/antivirus/update/x$a;->a(ILjava/lang/String;)V

    .line 446
    :cond_6
    const/4 v0, -0x2

    goto :goto_2

    .line 447
    :catch_2
    move-exception v0

    .line 451
    if-eqz p3, :cond_7

    .line 452
    const/4 v1, -0x2

    invoke-virtual {v0}, Ljava/net/SocketTimeoutException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p3, v1, v0}, Lcom/qihoo/antivirus/update/x$a;->a(ILjava/lang/String;)V

    .line 454
    :cond_7
    const/4 v0, -0x2

    goto :goto_2

    .line 455
    :catch_3
    move-exception v0

    .line 459
    if-eqz p3, :cond_8

    .line 460
    const/4 v1, -0x3

    invoke-virtual {v0}, Lorg/apache/http/conn/HttpHostConnectException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p3, v1, v0}, Lcom/qihoo/antivirus/update/x$a;->a(ILjava/lang/String;)V

    .line 462
    :cond_8
    const/4 v0, -0x3

    goto :goto_2

    .line 463
    :catch_4
    move-exception v0

    .line 467
    if-eqz p3, :cond_9

    .line 468
    const/4 v1, -0x4

    invoke-virtual {v0}, Lorg/apache/http/client/ClientProtocolException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p3, v1, v0}, Lcom/qihoo/antivirus/update/x$a;->a(ILjava/lang/String;)V

    .line 470
    :cond_9
    const/4 v0, -0x4

    goto :goto_2

    .line 471
    :catch_5
    move-exception v0

    .line 475
    if-eqz p3, :cond_a

    .line 476
    const/4 v1, -0x5

    invoke-virtual {v0}, Ljava/io/IOException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p3, v1, v0}, Lcom/qihoo/antivirus/update/x$a;->a(ILjava/lang/String;)V

    .line 478
    :cond_a
    const/4 v0, -0x5

    goto :goto_2

    .line 479
    :catch_6
    move-exception v0

    .line 484
    if-eqz p3, :cond_b

    .line 485
    const/16 v1, -0x63

    invoke-virtual {v0}, Ljava/lang/Exception;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p3, v1, v0}, Lcom/qihoo/antivirus/update/x$a;->a(ILjava/lang/String;)V

    .line 487
    :cond_b
    const/16 v0, -0x63

    goto :goto_2

    .line 522
    :cond_c
    const-wide/16 v6, 0x0

    cmp-long v0, p6, v6

    if-lez v0, :cond_f

    const-wide/16 v6, 0x0

    cmp-long v0, v4, v6

    if-lez v0, :cond_f

    cmp-long v0, v4, p6

    if-eqz v0, :cond_f

    .line 523
    if-eqz p3, :cond_1

    .line 524
    const/16 v0, -0x9

    :try_start_5
    const-string/jumbo v3, "invalidate data"

    invoke-interface {p3, v0, v3}, Lcom/qihoo/antivirus/update/x$a;->a(ILjava/lang/String;)V
    :try_end_5
    .catch Ljava/lang/InterruptedException; {:try_start_5 .. :try_end_5} :catch_7
    .catch Ljava/net/SocketTimeoutException; {:try_start_5 .. :try_end_5} :catch_15
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_12
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_f
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto/16 :goto_0

    .line 607
    :catch_7
    move-exception v0

    move-object v0, v1

    move-object v1, v2

    .line 641
    :goto_3
    if-eqz v0, :cond_d

    .line 642
    :try_start_6
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 643
    :cond_d
    if-eqz v1, :cond_e

    .line 644
    invoke-interface {v1}, Lorg/apache/http/HttpEntity;->consumeContent()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_16

    .line 611
    :cond_e
    :goto_4
    const/16 v0, -0x62

    goto/16 :goto_2

    .line 533
    :cond_f
    if-eqz v1, :cond_1d

    .line 534
    const/16 v0, 0x1000

    :try_start_7
    new-array v6, v0, [B

    move v0, v3

    .line 536
    :cond_10
    invoke-virtual {v1, v6}, Ljava/io/InputStream;->read([B)I

    move-result v3

    if-gtz v3, :cond_14

    .line 569
    const-wide/16 v4, 0x0

    cmp-long v3, p6, v4

    if-lez v3, :cond_34

    int-to-long v4, v0

    cmp-long v3, v4, p6

    if-eqz v3, :cond_34

    .line 570
    if-eqz p3, :cond_11

    .line 571
    const/16 v0, -0x9

    const-string/jumbo v3, "invalidate data"

    invoke-interface {p3, v0, v3}, Lcom/qihoo/antivirus/update/x$a;->a(ILjava/lang/String;)V
    :try_end_7
    .catch Ljava/lang/InterruptedException; {:try_start_7 .. :try_end_7} :catch_7
    .catch Ljava/net/SocketTimeoutException; {:try_start_7 .. :try_end_7} :catch_15
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_12
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_f
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 641
    :cond_11
    if-eqz v1, :cond_12

    .line 642
    :try_start_8
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 643
    :cond_12
    if-eqz v2, :cond_13

    .line 644
    invoke-interface {v2}, Lorg/apache/http/HttpEntity;->consumeContent()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_1c

    .line 576
    :cond_13
    :goto_5
    const/16 v0, -0x9

    goto/16 :goto_2

    .line 537
    :cond_14
    const/4 v7, 0x0

    :try_start_9
    invoke-virtual {p2, v6, v7, v3}, Ljava/io/OutputStream;->write([BII)V

    .line 538
    add-int/2addr v0, v3

    .line 540
    if-eqz p3, :cond_15

    .line 541
    int-to-long v8, v0

    invoke-interface {p3, v8, v9, v4, v5}, Lcom/qihoo/antivirus/update/x$a;->a(JJ)V

    .line 543
    :cond_15
    const-wide/16 v8, 0x0

    cmp-long v3, p4, v8

    if-lez v3, :cond_19

    int-to-long v8, v0

    cmp-long v3, v8, p4

    if-lez v3, :cond_19

    .line 544
    if-eqz p3, :cond_16

    .line 545
    const/16 v0, -0x9

    const-string/jumbo v3, "invalidate data"

    invoke-interface {p3, v0, v3}, Lcom/qihoo/antivirus/update/x$a;->a(ILjava/lang/String;)V
    :try_end_9
    .catch Ljava/lang/InterruptedException; {:try_start_9 .. :try_end_9} :catch_7
    .catch Ljava/net/SocketTimeoutException; {:try_start_9 .. :try_end_9} :catch_15
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_12
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_f
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 641
    :cond_16
    if-eqz v1, :cond_17

    .line 642
    :try_start_a
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 643
    :cond_17
    if-eqz v2, :cond_18

    .line 644
    invoke-interface {v2}, Lorg/apache/http/HttpEntity;->consumeContent()V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_1e

    .line 550
    :cond_18
    :goto_6
    const/16 v0, -0x9

    goto/16 :goto_2

    .line 554
    :cond_19
    const-wide/16 v8, 0x0

    cmp-long v3, p6, v8

    if-lez v3, :cond_10

    int-to-long v8, v0

    cmp-long v3, v8, p6

    if-lez v3, :cond_10

    .line 555
    if-eqz p3, :cond_1a

    .line 556
    const/16 v0, -0x9

    :try_start_b
    const-string/jumbo v3, "invalidate data"

    invoke-interface {p3, v0, v3}, Lcom/qihoo/antivirus/update/x$a;->a(ILjava/lang/String;)V
    :try_end_b
    .catch Ljava/lang/InterruptedException; {:try_start_b .. :try_end_b} :catch_7
    .catch Ljava/net/SocketTimeoutException; {:try_start_b .. :try_end_b} :catch_15
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_12
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_f
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 641
    :cond_1a
    if-eqz v1, :cond_1b

    .line 642
    :try_start_c
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 643
    :cond_1b
    if-eqz v2, :cond_1c

    .line 644
    invoke-interface {v2}, Lorg/apache/http/HttpEntity;->consumeContent()V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_1d

    .line 561
    :cond_1c
    :goto_7
    const/16 v0, -0x9

    goto/16 :goto_2

    .line 580
    :cond_1d
    if-eqz p3, :cond_1e

    .line 581
    const/4 v0, -0x7

    :try_start_d
    const-string/jumbo v3, "Empty body"

    invoke-interface {p3, v0, v3}, Lcom/qihoo/antivirus/update/x$a;->a(ILjava/lang/String;)V
    :try_end_d
    .catch Ljava/lang/InterruptedException; {:try_start_d .. :try_end_d} :catch_7
    .catch Ljava/net/SocketTimeoutException; {:try_start_d .. :try_end_d} :catch_15
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_12
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_f
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    .line 641
    :cond_1e
    if-eqz v1, :cond_1f

    .line 642
    :try_start_e
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 643
    :cond_1f
    if-eqz v2, :cond_20

    .line 644
    invoke-interface {v2}, Lorg/apache/http/HttpEntity;->consumeContent()V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_1b

    .line 586
    :cond_20
    :goto_8
    const/4 v0, -0x7

    goto/16 :goto_2

    .line 592
    :cond_21
    if-eqz p3, :cond_22

    .line 593
    const/4 v2, -0x8

    :try_start_f
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p3, v2, v3}, Lcom/qihoo/antivirus/update/x$a;->a(ILjava/lang/String;)V
    :try_end_f
    .catch Ljava/lang/InterruptedException; {:try_start_f .. :try_end_f} :catch_17
    .catch Ljava/net/SocketTimeoutException; {:try_start_f .. :try_end_f} :catch_8
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_9
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_a
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    .line 641
    :cond_22
    if-eqz v0, :cond_23

    .line 642
    :try_start_10
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 643
    :cond_23
    if-eqz v1, :cond_24

    .line 644
    invoke-interface {v1}, Lorg/apache/http/HttpEntity;->consumeContent()V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_1a

    .line 595
    :cond_24
    :goto_9
    const/4 v0, -0x8

    goto/16 :goto_2

    .line 598
    :cond_25
    if-eqz p3, :cond_26

    .line 599
    const/4 v2, -0x7

    :try_start_11
    const-string/jumbo v3, "Empty header"

    invoke-interface {p3, v2, v3}, Lcom/qihoo/antivirus/update/x$a;->a(ILjava/lang/String;)V
    :try_end_11
    .catch Ljava/lang/InterruptedException; {:try_start_11 .. :try_end_11} :catch_17
    .catch Ljava/net/SocketTimeoutException; {:try_start_11 .. :try_end_11} :catch_8
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_9
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_a
    .catchall {:try_start_11 .. :try_end_11} :catchall_0

    .line 641
    :cond_26
    if-eqz v0, :cond_27

    .line 642
    :try_start_12
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 643
    :cond_27
    if-eqz v1, :cond_28

    .line 644
    invoke-interface {v1}, Lorg/apache/http/HttpEntity;->consumeContent()V
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_19

    .line 604
    :cond_28
    :goto_a
    const/4 v0, -0x7

    goto/16 :goto_2

    .line 612
    :catch_8
    move-exception v2

    move-object v10, v2

    move-object v2, v1

    move-object v1, v0

    move-object v0, v10

    .line 616
    :goto_b
    if-eqz p3, :cond_29

    .line 617
    const/4 v3, -0x6

    :try_start_13
    invoke-virtual {v0}, Ljava/net/SocketTimeoutException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p3, v3, v0}, Lcom/qihoo/antivirus/update/x$a;->a(ILjava/lang/String;)V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_2

    .line 641
    :cond_29
    if-eqz v1, :cond_2a

    .line 642
    :try_start_14
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 643
    :cond_2a
    if-eqz v2, :cond_2b

    .line 644
    invoke-interface {v2}, Lorg/apache/http/HttpEntity;->consumeContent()V
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_13

    .line 619
    :cond_2b
    :goto_c
    const/4 v0, -0x6

    goto/16 :goto_2

    .line 620
    :catch_9
    move-exception v2

    move-object v10, v2

    move-object v2, v1

    move-object v1, v0

    move-object v0, v10

    .line 625
    :goto_d
    if-eqz p3, :cond_2c

    .line 626
    const/16 v3, -0xa

    :try_start_15
    invoke-virtual {v0}, Ljava/io/IOException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p3, v3, v0}, Lcom/qihoo/antivirus/update/x$a;->a(ILjava/lang/String;)V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_2

    .line 641
    :cond_2c
    if-eqz v1, :cond_2d

    .line 642
    :try_start_16
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 643
    :cond_2d
    if-eqz v2, :cond_2e

    .line 644
    invoke-interface {v2}, Lorg/apache/http/HttpEntity;->consumeContent()V
    :try_end_16
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_16} :catch_10

    .line 628
    :cond_2e
    :goto_e
    const/16 v0, -0xa

    goto/16 :goto_2

    .line 629
    :catch_a
    move-exception v2

    move-object v10, v2

    move-object v2, v1

    move-object v1, v0

    move-object v0, v10

    .line 634
    :goto_f
    if-eqz p3, :cond_2f

    .line 635
    const/16 v3, -0x63

    :try_start_17
    invoke-virtual {v0}, Ljava/lang/Exception;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p3, v3, v0}, Lcom/qihoo/antivirus/update/x$a;->a(ILjava/lang/String;)V
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_2

    .line 641
    :cond_2f
    if-eqz v1, :cond_30

    .line 642
    :try_start_18
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 643
    :cond_30
    if-eqz v2, :cond_31

    .line 644
    invoke-interface {v2}, Lorg/apache/http/HttpEntity;->consumeContent()V
    :try_end_18
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_18} :catch_d

    .line 637
    :cond_31
    :goto_10
    const/16 v0, -0x63

    goto/16 :goto_2

    .line 638
    :catchall_0
    move-exception v2

    move-object v10, v2

    move-object v2, v1

    move-object v1, v0

    move-object v0, v10

    .line 641
    :goto_11
    if-eqz v1, :cond_32

    .line 642
    :try_start_19
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 643
    :cond_32
    if-eqz v2, :cond_33

    .line 644
    invoke-interface {v2}, Lorg/apache/http/HttpEntity;->consumeContent()V
    :try_end_19
    .catch Ljava/lang/Exception; {:try_start_19 .. :try_end_19} :catch_c

    .line 647
    :cond_33
    :goto_12
    throw v0

    .line 641
    :cond_34
    if-eqz v1, :cond_35

    .line 642
    :try_start_1a
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 643
    :cond_35
    if-eqz v2, :cond_4

    .line 644
    invoke-interface {v2}, Lorg/apache/http/HttpEntity;->consumeContent()V
    :try_end_1a
    .catch Ljava/lang/Exception; {:try_start_1a .. :try_end_1a} :catch_b

    goto/16 :goto_2

    .line 645
    :catch_b
    move-exception v1

    goto/16 :goto_2

    :catch_c
    move-exception v1

    goto :goto_12

    .line 638
    :catchall_1
    move-exception v1

    move-object v10, v1

    move-object v1, v0

    move-object v0, v10

    goto :goto_11

    :catchall_2
    move-exception v0

    goto :goto_11

    .line 645
    :catch_d
    move-exception v0

    goto :goto_10

    .line 629
    :catch_e
    move-exception v1

    move-object v10, v1

    move-object v1, v0

    move-object v0, v10

    goto :goto_f

    :catch_f
    move-exception v0

    goto :goto_f

    .line 645
    :catch_10
    move-exception v0

    goto :goto_e

    .line 620
    :catch_11
    move-exception v1

    move-object v10, v1

    move-object v1, v0

    move-object v0, v10

    goto :goto_d

    :catch_12
    move-exception v0

    goto :goto_d

    .line 645
    :catch_13
    move-exception v0

    goto :goto_c

    .line 612
    :catch_14
    move-exception v1

    move-object v10, v1

    move-object v1, v0

    move-object v0, v10

    goto/16 :goto_b

    :catch_15
    move-exception v0

    goto/16 :goto_b

    .line 645
    :catch_16
    move-exception v0

    goto/16 :goto_4

    .line 607
    :catch_17
    move-exception v2

    goto/16 :goto_3

    :catch_18
    move-exception v1

    move-object v1, v2

    goto/16 :goto_3

    .line 645
    :catch_19
    move-exception v0

    goto/16 :goto_a

    :catch_1a
    move-exception v0

    goto/16 :goto_9

    :catch_1b
    move-exception v0

    goto/16 :goto_8

    :catch_1c
    move-exception v0

    goto/16 :goto_5

    :catch_1d
    move-exception v0

    goto/16 :goto_7

    :catch_1e
    move-exception v0

    goto/16 :goto_6

    :catch_1f
    move-exception v0

    goto/16 :goto_1
.end method

.method public static declared-synchronized a()Ljava/lang/String;
    .locals 7

    .prologue
    const/16 v6, 0x30

    const/4 v0, 0x0

    .line 766
    const-class v1, Lcom/qihoo/antivirus/update/x;

    monitor-enter v1

    :try_start_0
    sget-object v2, Lcom/qihoo/antivirus/update/x;->c:Ljava/lang/String;

    if-eqz v2, :cond_0

    .line 767
    sget-object v0, Lcom/qihoo/antivirus/update/x;->c:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 842
    :goto_0
    monitor-exit v1

    return-object v0

    .line 771
    :cond_0
    :try_start_1
    sget-object v2, Lcom/qihoo/antivirus/update/x;->a:Ljava/lang/Object;

    monitor-enter v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 772
    :try_start_2
    sget-object v3, Lcom/qihoo/antivirus/update/x;->b:Ljava/util/Locale;

    .line 771
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 774
    :try_start_3
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 780
    sget-object v4, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 781
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_1

    .line 782
    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 784
    :cond_1
    const-string/jumbo v4, "; "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 789
    sget-object v4, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 790
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_4

    .line 791
    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 796
    :goto_1
    const-string/jumbo v4, "; "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 803
    sget-object v4, Landroid/os/Build;->DISPLAY:Ljava/lang/String;

    .line 804
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_2

    .line 806
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    if-le v5, v6, :cond_5

    .line 807
    const/4 v5, 0x0

    const/16 v6, 0x30

    invoke-virtual {v4, v5, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 808
    const-string/jumbo v4, "..."

    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 814
    :cond_2
    :goto_2
    const-string/jumbo v4, "; "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 817
    invoke-virtual {v3}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v4

    .line 818
    if-eqz v4, :cond_6

    .line 819
    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 820
    invoke-virtual {v3}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v3

    .line 821
    if-eqz v3, :cond_3

    .line 822
    const-string/jumbo v4, "-"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 823
    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 832
    :cond_3
    :goto_3
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    .line 833
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 834
    :goto_4
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    if-lt v0, v4, :cond_7

    .line 840
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo/antivirus/update/x;->c:Ljava/lang/String;

    .line 842
    sget-object v0, Lcom/qihoo/antivirus/update/x;->c:Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto/16 :goto_0

    .line 771
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

    .line 766
    :catchall_1
    move-exception v0

    monitor-exit v1

    throw v0

    .line 794
    :cond_4
    :try_start_6
    const-string/jumbo v4, "1.0"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_1

    .line 810
    :cond_5
    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_2

    .line 827
    :cond_6
    const-string/jumbo v3, "en"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_3

    .line 835
    :cond_7
    invoke-virtual {v2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v4

    .line 836
    const/16 v5, 0x20

    if-lt v4, v5, :cond_8

    const/16 v5, 0x7e

    if-gt v4, v5, :cond_8

    .line 837
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 834
    :cond_8
    add-int/lit8 v0, v0, 0x1

    goto :goto_4
.end method

.method public static a(Lorg/apache/http/HttpHost;I)Lorg/apache/http/client/HttpClient;
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 94
    const/4 v0, 0x0

    invoke-static {p0, v1, v0, v1, p1}, Lcom/qihoo/antivirus/update/x;->a(Lorg/apache/http/HttpHost;Ljava/lang/String;ILorg/apache/http/conn/scheme/SocketFactory;I)Lorg/apache/http/client/HttpClient;

    move-result-object v0

    return-object v0
.end method

.method private static a(Lorg/apache/http/HttpHost;Ljava/lang/String;ILorg/apache/http/conn/scheme/SocketFactory;I)Lorg/apache/http/client/HttpClient;
    .locals 6

    .prologue
    .line 111
    .line 113
    const/16 v0, 0x7530

    .line 119
    div-int/lit16 v1, p4, 0x3e8

    if-lez v1, :cond_1

    .line 126
    :goto_0
    invoke-static {}, Lcom/qihoo/antivirus/update/x;->a()Ljava/lang/String;

    move-result-object v0

    .line 128
    new-instance v1, Lorg/apache/http/params/BasicHttpParams;

    invoke-direct {v1}, Lorg/apache/http/params/BasicHttpParams;-><init>()V

    .line 129
    sget-object v2, Lorg/apache/http/HttpVersion;->HTTP_1_1:Lorg/apache/http/HttpVersion;

    invoke-static {v1, v2}, Lorg/apache/http/params/HttpProtocolParams;->setVersion(Lorg/apache/http/params/HttpParams;Lorg/apache/http/ProtocolVersion;)V

    .line 130
    invoke-static {v1, v0}, Lorg/apache/http/params/HttpProtocolParams;->setUserAgent(Lorg/apache/http/params/HttpParams;Ljava/lang/String;)V

    .line 132
    const/16 v0, 0xa

    invoke-static {v1, v0}, Lorg/apache/http/conn/params/ConnManagerParams;->setMaxTotalConnections(Lorg/apache/http/params/HttpParams;I)V

    .line 133
    const-wide/16 v2, 0x2710

    invoke-static {v1, v2, v3}, Lorg/apache/http/conn/params/ConnManagerParams;->setTimeout(Lorg/apache/http/params/HttpParams;J)V

    .line 135
    const/16 v0, 0x2710

    invoke-static {v1, v0}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V

    .line 137
    invoke-static {v1, p4}, Lorg/apache/http/params/HttpConnectionParams;->setSoTimeout(Lorg/apache/http/params/HttpParams;I)V

    .line 139
    const/4 v0, 0x1

    invoke-static {v1, v0}, Lorg/apache/http/params/HttpConnectionParams;->setStaleCheckingEnabled(Lorg/apache/http/params/HttpParams;Z)V

    .line 140
    const/16 v0, 0x2000

    invoke-static {v1, v0}, Lorg/apache/http/params/HttpConnectionParams;->setSocketBufferSize(Lorg/apache/http/params/HttpParams;I)V

    .line 142
    invoke-static {v1, p0}, Lorg/apache/http/conn/params/ConnRouteParams;->setDefaultProxy(Lorg/apache/http/params/HttpParams;Lorg/apache/http/HttpHost;)V

    .line 144
    new-instance v0, Lorg/apache/http/conn/scheme/SchemeRegistry;

    invoke-direct {v0}, Lorg/apache/http/conn/scheme/SchemeRegistry;-><init>()V

    .line 146
    new-instance v2, Lorg/apache/http/conn/scheme/Scheme;

    const-string/jumbo v3, "http"

    invoke-static {}, Lorg/apache/http/conn/scheme/PlainSocketFactory;->getSocketFactory()Lorg/apache/http/conn/scheme/PlainSocketFactory;

    move-result-object v4

    const/16 v5, 0x50

    invoke-direct {v2, v3, v4, v5}, Lorg/apache/http/conn/scheme/Scheme;-><init>(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V

    invoke-virtual {v0, v2}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;

    .line 148
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 149
    new-instance v2, Lorg/apache/http/conn/scheme/Scheme;

    invoke-direct {v2, p1, p3, p2}, Lorg/apache/http/conn/scheme/Scheme;-><init>(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V

    invoke-virtual {v0, v2}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;

    .line 152
    :cond_0
    new-instance v2, Lorg/apache/http/impl/client/DefaultHttpClient;

    new-instance v3, Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager;

    invoke-direct {v3, v1, v0}, Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager;-><init>(Lorg/apache/http/params/HttpParams;Lorg/apache/http/conn/scheme/SchemeRegistry;)V

    invoke-direct {v2, v3, v1}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/conn/ClientConnectionManager;Lorg/apache/http/params/HttpParams;)V

    return-object v2

    :cond_1
    move p4, v0

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;)Z
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 157
    const-string/jumbo v0, "connectivity"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    .line 158
    if-eqz v0, :cond_0

    .line 159
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getAllNetworkInfo()[Landroid/net/NetworkInfo;

    move-result-object v2

    .line 160
    if-eqz v2, :cond_0

    .line 161
    array-length v3, v2

    move v0, v1

    :goto_0
    if-lt v0, v3, :cond_1

    :cond_0
    move v0, v1

    .line 168
    :goto_1
    return v0

    .line 161
    :cond_1
    aget-object v4, v2, v0

    .line 162
    invoke-virtual {v4}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 163
    const/4 v0, 0x1

    goto :goto_1

    .line 161
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public static b(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 172
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 173
    const-string/jumbo v1, "connectivity"

    .line 172
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    .line 175
    const/4 v1, 0x0

    .line 177
    const/4 v2, 0x1

    :try_start_0
    invoke-virtual {v0, v2}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 185
    :goto_0
    if-eqz v0, :cond_0

    .line 186
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    .line 188
    :goto_1
    return v0

    .line 178
    :catch_0
    move-exception v0

    move-object v0, v1

    goto :goto_0

    .line 188
    :cond_0
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public static c(Landroid/content/Context;)I
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 226
    invoke-static {p0}, Lcom/qihoo/antivirus/update/x;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 227
    const/16 v0, 0x63

    .line 260
    :goto_0
    return v0

    .line 229
    :cond_0
    invoke-static {p0}, Lcom/qihoo/antivirus/update/x;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 230
    const/4 v0, 0x1

    goto :goto_0

    .line 232
    :cond_1
    const-string/jumbo v0, "phone"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/TelephonyManager;

    .line 233
    if-eqz v0, :cond_2

    .line 234
    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getNetworkType()I

    move-result v0

    .line 235
    packed-switch v0, :pswitch_data_0

    move v0, v1

    .line 256
    goto :goto_0

    .line 242
    :pswitch_0
    const/4 v0, 0x2

    goto :goto_0

    .line 252
    :pswitch_1
    const/4 v0, 0x3

    goto :goto_0

    .line 254
    :pswitch_2
    const/4 v0, 0x4

    goto :goto_0

    :cond_2
    move v0, v1

    .line 260
    goto :goto_0

    .line 235
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static d(Landroid/content/Context;)Ljava/lang/String;
    .locals 8

    .prologue
    const/4 v7, 0x0

    .line 699
    const-string/jumbo v0, "content://telephony/carriers/preferapn"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    .line 701
    const-string/jumbo v6, "UNKNOWN"

    .line 704
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

    .line 705
    if-eqz v1, :cond_0

    .line 706
    :try_start_1
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 707
    const-string/jumbo v0, "apn"

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 708
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 709
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-object v0

    .line 719
    :goto_0
    invoke-static {v1}, Lcom/qihoo/antivirus/update/af;->a(Landroid/database/Cursor;)V

    .line 725
    :goto_1
    return-object v0

    .line 714
    :catch_0
    move-exception v0

    move-object v0, v7

    .line 719
    :goto_2
    invoke-static {v0}, Lcom/qihoo/antivirus/update/af;->a(Landroid/database/Cursor;)V

    move-object v0, v6

    goto :goto_1

    .line 718
    :catchall_0
    move-exception v0

    move-object v1, v7

    .line 719
    :goto_3
    invoke-static {v1}, Lcom/qihoo/antivirus/update/af;->a(Landroid/database/Cursor;)V

    .line 720
    throw v0

    .line 718
    :catchall_1
    move-exception v0

    goto :goto_3

    .line 714
    :catch_1
    move-exception v0

    move-object v0, v1

    goto :goto_2

    :cond_0
    move-object v0, v6

    goto :goto_0
.end method

.method public static e(Landroid/content/Context;)Lorg/apache/http/HttpHost;
    .locals 1

    .prologue
    .line 732
    invoke-static {p0}, Lcom/qihoo/antivirus/update/x;->f(Landroid/content/Context;)Lorg/apache/http/HttpHost;

    move-result-object v0

    return-object v0
.end method

.method public static f(Landroid/content/Context;)Lorg/apache/http/HttpHost;
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 740
    invoke-static {p0}, Lcom/qihoo/antivirus/update/af;->a(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 750
    :cond_0
    :goto_0
    return-object v0

    .line 744
    :cond_1
    invoke-static {}, Landroid/net/Proxy;->getDefaultHost()Ljava/lang/String;

    move-result-object v1

    .line 745
    invoke-static {}, Landroid/net/Proxy;->getDefaultPort()I

    move-result v2

    .line 747
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_0

    .line 748
    new-instance v0, Lorg/apache/http/HttpHost;

    invoke-direct {v0, v1, v2}, Lorg/apache/http/HttpHost;-><init>(Ljava/lang/String;I)V

    goto :goto_0
.end method

.method public static g(Landroid/content/Context;)Ljava/lang/String;
    .locals 5

    .prologue
    const/16 v2, 0x8

    .line 860
    const/16 v1, 0x9

    .line 861
    const/4 v0, 0x0

    .line 865
    invoke-static {p0}, Lcom/qihoo/antivirus/update/af;->a(Landroid/content/Context;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 866
    const/4 v1, 0x0

    .line 907
    :cond_0
    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 908
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 909
    const-string/jumbo v4, " "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 911
    if-le v1, v2, :cond_1

    if-eqz v0, :cond_1

    .line 912
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 915
    :cond_1
    invoke-static {}, Landroid/net/Proxy;->getDefaultHost()Ljava/lang/String;

    move-result-object v0

    .line 916
    if-eqz v0, :cond_2

    .line 917
    const-string/jumbo v1, " "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 918
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 919
    const-string/jumbo v0, " "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 920
    invoke-static {}, Landroid/net/Proxy;->getDefaultPort()I

    move-result v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 923
    :cond_2
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 871
    :cond_3
    invoke-static {p0}, Lcom/qihoo/antivirus/update/x;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 872
    const-string/jumbo v3, "cmwap"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 873
    const/4 v1, 0x1

    .line 874
    goto :goto_0

    .line 876
    :cond_4
    const-string/jumbo v3, "cmnet"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 877
    const/4 v1, 0x2

    .line 878
    goto :goto_0

    .line 880
    :cond_5
    const-string/jumbo v3, "uniwap"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 881
    const/4 v1, 0x3

    .line 882
    goto :goto_0

    .line 884
    :cond_6
    const-string/jumbo v3, "uninet"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 885
    const/4 v1, 0x4

    .line 886
    goto :goto_0

    .line 888
    :cond_7
    const-string/jumbo v3, "3gwap"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    .line 889
    const/4 v1, 0x5

    .line 890
    goto :goto_0

    .line 892
    :cond_8
    const-string/jumbo v3, "3gnet"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_9

    .line 893
    const/4 v1, 0x6

    .line 894
    goto :goto_0

    .line 896
    :cond_9
    const-string/jumbo v3, "ctwap"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    .line 897
    const/4 v1, 0x7

    .line 898
    goto/16 :goto_0

    .line 900
    :cond_a
    const-string/jumbo v3, "ctnet"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v1, v2

    .line 901
    goto/16 :goto_0
.end method
