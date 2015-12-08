.class final Lcom/mopub/mraid/ac;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/String;",
        "Ljava/lang/Void;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/mopub/mraid/ad;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/mopub/mraid/ad;)V
    .locals 1

    .prologue
    .line 454
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 455
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/mraid/ac;->a:Landroid/content/Context;

    .line 456
    iput-object p2, p0, Lcom/mopub/mraid/ac;->b:Lcom/mopub/mraid/ad;

    .line 457
    return-void
.end method

.method private a([Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 6

    .prologue
    const/4 v2, 0x0

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 461
    array-length v3, p1

    if-lez v3, :cond_1

    :goto_0
    invoke-static {v0}, Lcom/mopub/common/Preconditions;->checkState(Z)V

    .line 462
    aget-object v0, p1, v1

    invoke-static {v0}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;)V

    .line 1540
    new-instance v4, Ljava/io/File;

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v0

    const-string v3, "Pictures"

    invoke-direct {v4, v0, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 467
    invoke-virtual {v4}, Ljava/io/File;->mkdirs()Z

    .line 469
    aget-object v0, p1, v1

    .line 470
    invoke-static {v0}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v0

    .line 472
    invoke-static {}, Lcom/mopub/mobileads/factories/HttpClientFactory;->create()Lorg/apache/http/impl/client/DefaultHttpClient;

    move-result-object v1

    .line 473
    invoke-virtual {v0}, Ljava/net/URI;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/mopub/common/HttpClient;->initializeHttpGet(Ljava/lang/String;)Lorg/apache/http/client/methods/HttpGet;

    move-result-object v3

    .line 478
    :try_start_0
    invoke-interface {v1, v3}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v1

    .line 479
    invoke-interface {v1}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v3

    invoke-interface {v3}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v3

    .line 481
    :try_start_1
    sget-object v5, Lcom/mopub/common/util/ResponseHeader;->LOCATION:Lcom/mopub/common/util/ResponseHeader;

    invoke-static {v1, v5}, Lcom/mopub/network/HeaderUtils;->extractHeader(Lorg/apache/http/HttpResponse;Lcom/mopub/common/util/ResponseHeader;)Ljava/lang/String;

    move-result-object v5

    .line 482
    if-eqz v5, :cond_0

    .line 483
    invoke-static {v5}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v0

    .line 486
    :cond_0
    invoke-static {v0, v1}, Lcom/mopub/mraid/ac;->a(Ljava/net/URI;Lorg/apache/http/HttpResponse;)Ljava/lang/String;

    move-result-object v0

    .line 487
    new-instance v5, Ljava/io/File;

    invoke-direct {v5, v4, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 488
    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, v5}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 489
    :try_start_2
    invoke-static {v3, v1}, Lcom/mopub/common/util/Streams;->copyContent(Ljava/io/InputStream;Ljava/io/OutputStream;)V

    .line 491
    invoke-virtual {v5}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1544
    new-instance v2, Lcom/mopub/mraid/ae;

    const/4 v4, 0x0

    invoke-direct {v2, v0, v4}, Lcom/mopub/mraid/ae;-><init>(Ljava/lang/String;B)V

    .line 1546
    new-instance v0, Landroid/media/MediaScannerConnection;

    iget-object v4, p0, Lcom/mopub/mraid/ac;->a:Landroid/content/Context;

    invoke-direct {v0, v4, v2}, Landroid/media/MediaScannerConnection;-><init>(Landroid/content/Context;Landroid/media/MediaScannerConnection$MediaScannerConnectionClient;)V

    .line 1548
    invoke-static {v2, v0}, Lcom/mopub/mraid/ae;->a(Lcom/mopub/mraid/ae;Landroid/media/MediaScannerConnection;)V

    .line 1549
    invoke-virtual {v0}, Landroid/media/MediaScannerConnection;->connect()V

    .line 494
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-result-object v0

    .line 498
    invoke-static {v3}, Lcom/mopub/common/util/Streams;->closeStream(Ljava/io/Closeable;)V

    .line 499
    invoke-static {v1}, Lcom/mopub/common/util/Streams;->closeStream(Ljava/io/Closeable;)V

    :goto_1
    return-object v0

    :cond_1
    move v0, v1

    .line 461
    goto :goto_0

    .line 496
    :catch_0
    move-exception v0

    move-object v1, v2

    :goto_2
    const/4 v0, 0x0

    :try_start_3
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    move-result-object v0

    .line 498
    invoke-static {v2}, Lcom/mopub/common/util/Streams;->closeStream(Ljava/io/Closeable;)V

    .line 499
    invoke-static {v1}, Lcom/mopub/common/util/Streams;->closeStream(Ljava/io/Closeable;)V

    goto :goto_1

    .line 498
    :catchall_0
    move-exception v0

    move-object v3, v2

    :goto_3
    invoke-static {v3}, Lcom/mopub/common/util/Streams;->closeStream(Ljava/io/Closeable;)V

    .line 499
    invoke-static {v2}, Lcom/mopub/common/util/Streams;->closeStream(Ljava/io/Closeable;)V

    throw v0

    .line 498
    :catchall_1
    move-exception v0

    goto :goto_3

    :catchall_2
    move-exception v0

    move-object v2, v1

    goto :goto_3

    :catchall_3
    move-exception v0

    move-object v3, v2

    move-object v2, v1

    goto :goto_3

    .line 496
    :catch_1
    move-exception v0

    move-object v1, v2

    move-object v2, v3

    goto :goto_2

    :catch_2
    move-exception v0

    move-object v2, v3

    goto :goto_2
.end method

.method private static a(Ljava/net/URI;Lorg/apache/http/HttpResponse;)Ljava/lang/String;
    .locals 6

    .prologue
    .line 513
    invoke-virtual {p0}, Ljava/net/URI;->getPath()Ljava/lang/String;

    move-result-object v0

    .line 515
    if-nez v0, :cond_1

    .line 516
    const/4 v0, 0x0

    .line 536
    :cond_0
    :goto_0
    return-object v0

    .line 519
    :cond_1
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    .line 521
    const-string v1, "Content-Type"

    invoke-interface {p1, v1}, Lorg/apache/http/HttpResponse;->getFirstHeader(Ljava/lang/String;)Lorg/apache/http/Header;

    move-result-object v1

    .line 522
    if-eqz v1, :cond_0

    .line 523
    invoke-interface {v1}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v1

    const-string v2, ";"

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 524
    array-length v3, v2

    const/4 v1, 0x0

    :goto_1
    if-ge v1, v3, :cond_0

    aget-object v4, v2, v1

    .line 526
    const-string v5, "image/"

    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 527
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "."

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, "/"

    invoke-virtual {v4, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 528
    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 529
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 524
    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1
.end method


# virtual methods
.method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 442
    check-cast p1, [Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/mopub/mraid/ac;->a([Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method protected final synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 442
    check-cast p1, Ljava/lang/Boolean;

    .line 2505
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2506
    iget-object v0, p0, Lcom/mopub/mraid/ac;->b:Lcom/mopub/mraid/ad;

    invoke-interface {v0}, Lcom/mopub/mraid/ad;->onSuccess()V

    :goto_0
    return-void

    .line 2508
    :cond_0
    iget-object v0, p0, Lcom/mopub/mraid/ac;->b:Lcom/mopub/mraid/ad;

    invoke-interface {v0}, Lcom/mopub/mraid/ad;->onFailure()V

    goto :goto_0
.end method
