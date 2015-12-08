.class public Lcom/cleanmaster/util/d;
.super Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;
.source "SourceFile"


# instance fields
.field private a:Lcom/cleanmaster/util/g;

.field private b:Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0}, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;-><init>()V

    .line 150
    return-void
.end method

.method private a()Ljava/lang/String;
    .locals 3

    .prologue
    .line 367
    invoke-static {}, Lcom/picksinit/PicksMob;->getInstance()Lcom/picksinit/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/picksinit/b;->isDebug()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 368
    invoke-static {}, Lcom/picksinit/PicksMob;->getInstance()Lcom/picksinit/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/picksinit/b;->getTestReportIp()Ljava/lang/String;

    move-result-object v0

    .line 369
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 370
    invoke-static {}, Lcom/cleanmaster/ui/app/market/d;->a()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 371
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "http://"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/rp/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 390
    :cond_0
    :goto_0
    return-object v0

    .line 373
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "https://"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/rp/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 376
    :cond_2
    invoke-static {}, Lcom/picksinit/PicksMob;->getInstance()Lcom/picksinit/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/picksinit/b;->getmAdResourceRp()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 377
    invoke-static {}, Lcom/cleanmaster/ui/app/market/d;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 378
    const-string v0, "http://rcv.mobad.ijinshan.com/rp/"

    goto :goto_0

    .line 380
    :cond_3
    invoke-static {}, Lcom/cleanmaster/ui/app/market/c;->e()Ljava/lang/String;

    move-result-object v0

    .line 381
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 384
    const-string v0, "https://ssdk.adkmob.com/rp/"

    goto :goto_0

    .line 387
    :cond_4
    invoke-static {}, Lcom/cleanmaster/ui/app/market/d;->a()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 388
    const-string v0, "http://unrcv.mobad.ijinshan.com/rp/"

    goto :goto_0

    .line 390
    :cond_5
    const-string v0, "http://unrcv.adkmob.com/rp/"

    goto :goto_0
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 413
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 453
    :cond_0
    :goto_0
    return-void

    .line 418
    :cond_1
    invoke-direct {p0}, Lcom/cleanmaster/util/d;->a()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/cleanmaster/util/e;

    invoke-direct {v2, p0}, Lcom/cleanmaster/util/e;-><init>(Lcom/cleanmaster/util/d;)V

    invoke-direct {p0, v0, v1, v2}, Lcom/cleanmaster/util/d;->a(Ljava/lang/String;Ljava/lang/String;Lcom/cleanmaster/util/h;)V

    goto :goto_0
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Lcom/cleanmaster/util/h;)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 466
    invoke-static {}, Lcom/picksinit/PicksMob;->getInstance()Lcom/picksinit/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/picksinit/b;->getContext()Landroid/content/Context;

    .line 468
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 546
    :cond_0
    :goto_0
    return-void

    .line 472
    :cond_1
    sget-boolean v0, Lcom/cleanmaster/util/j;->a:Z

    .line 476
    new-instance v0, Lorg/apache/http/params/BasicHttpParams;

    invoke-direct {v0}, Lorg/apache/http/params/BasicHttpParams;-><init>()V

    .line 477
    invoke-static {}, Lcom/cleanmaster/util/d;->b()I

    move-result v2

    invoke-static {v0, v2}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V

    .line 478
    invoke-static {}, Lcom/cleanmaster/util/d;->b()I

    move-result v2

    invoke-static {v0, v2}, Lorg/apache/http/params/HttpConnectionParams;->setSoTimeout(Lorg/apache/http/params/HttpParams;I)V

    .line 479
    new-instance v3, Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-direct {v3, v0}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/params/HttpParams;)V

    .line 484
    :try_start_0
    new-instance v0, Lorg/apache/http/client/methods/HttpPost;

    invoke-direct {v0, p1}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-object v2, v0

    .line 490
    :goto_1
    if-eqz v2, :cond_0

    .line 495
    :try_start_1
    new-instance v0, Lorg/apache/http/entity/StringEntity;

    invoke-direct {v0, p2}, Lorg/apache/http/entity/StringEntity;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    .line 502
    :goto_2
    :try_start_2
    invoke-interface {v3, v2}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
    :try_end_2
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_5

    move-result-object v0

    .line 511
    :goto_3
    if-eqz v0, :cond_0

    if-eqz p3, :cond_0

    .line 515
    invoke-interface {v0}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v0

    .line 519
    :try_start_3
    invoke-interface {v0}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;
    :try_end_3
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_6
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_7
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_8

    move-result-object v0

    .line 528
    :goto_4
    if-eqz p3, :cond_2

    .line 529
    invoke-interface {p3, v0}, Lcom/cleanmaster/util/h;->a(Ljava/io/InputStream;)V

    .line 533
    :cond_2
    if-eqz v0, :cond_0

    .line 535
    :try_start_4
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_0

    .line 538
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    .line 486
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    move-object v2, v1

    goto :goto_1

    .line 497
    :catch_2
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_2

    .line 504
    :catch_3
    move-exception v0

    invoke-virtual {v0}, Lorg/apache/http/client/ClientProtocolException;->printStackTrace()V

    move-object v0, v1

    .line 509
    goto :goto_3

    .line 506
    :catch_4
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    move-object v0, v1

    .line 509
    goto :goto_3

    .line 508
    :catch_5
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    move-object v0, v1

    goto :goto_3

    .line 521
    :catch_6
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/IllegalStateException;->printStackTrace()V

    move-object v0, v1

    .line 526
    goto :goto_4

    .line 523
    :catch_7
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    move-object v0, v1

    .line 526
    goto :goto_4

    .line 525
    :catch_8
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    move-object v0, v1

    goto :goto_4
.end method

.method private static b()I
    .locals 1

    .prologue
    .line 456
    invoke-static {}, Lcom/cleanmaster/ui/app/market/c;->b()I

    move-result v0

    .line 457
    if-lez v0, :cond_0

    .line 461
    :goto_0
    return v0

    :cond_0
    const/16 v0, 0x2710

    goto :goto_0
.end method

.method private g()Ljava/lang/String;
    .locals 5

    .prologue
    .line 551
    iget-object v0, p0, Lcom/cleanmaster/util/d;->b:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/cleanmaster/util/d;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 552
    :cond_0
    const/4 v0, 0x0

    .line 570
    :goto_0
    return-object v0

    .line 555
    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 556
    const-string v0, "&attach=["

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 558
    const/4 v0, 0x1

    .line 559
    iget-object v1, p0, Lcom/cleanmaster/util/d;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v1, v0

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/util/f;

    .line 560
    if-eqz v1, :cond_2

    .line 561
    const/4 v1, 0x0

    .line 565
    :goto_2
    invoke-virtual {v0}, Lcom/cleanmaster/util/f;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 563
    :cond_2
    const-string v4, ","

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 568
    :cond_3
    const-string v0, "]"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 570
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method protected bridge synthetic a([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 38
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/cleanmaster/util/d;->a([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method protected varargs a([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 400
    iget-object v0, p0, Lcom/cleanmaster/util/d;->a:Lcom/cleanmaster/util/g;

    if-nez v0, :cond_0

    .line 409
    :goto_0
    return-object v2

    .line 404
    :cond_0
    iget-object v0, p0, Lcom/cleanmaster/util/d;->a:Lcom/cleanmaster/util/g;

    invoke-virtual {v0}, Lcom/cleanmaster/util/g;->a()Ljava/lang/String;

    move-result-object v0

    .line 405
    invoke-direct {p0}, Lcom/cleanmaster/util/d;->g()Ljava/lang/String;

    move-result-object v1

    .line 407
    invoke-direct {p0, v0, v1}, Lcom/cleanmaster/util/d;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public a(Lcom/cleanmaster/util/f;Lcom/cleanmaster/util/g;)V
    .locals 1

    .prologue
    .line 353
    iput-object p2, p0, Lcom/cleanmaster/util/d;->a:Lcom/cleanmaster/util/g;

    .line 354
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/cleanmaster/util/d;->b:Ljava/util/List;

    .line 355
    iget-object v0, p0, Lcom/cleanmaster/util/d;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 356
    return-void
.end method
