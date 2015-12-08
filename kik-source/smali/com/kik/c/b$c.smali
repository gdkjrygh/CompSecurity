.class final Lcom/kik/c/b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/c/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lcom/kik/c/b;

.field private final b:Ljava/io/File;


# direct methods
.method private constructor <init>(Lcom/kik/c/b;Ljava/io/File;)V
    .locals 0

    .prologue
    .line 358
    iput-object p1, p0, Lcom/kik/c/b$c;->a:Lcom/kik/c/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 359
    iput-object p2, p0, Lcom/kik/c/b$c;->b:Ljava/io/File;

    .line 360
    return-void
.end method

.method synthetic constructor <init>(Lcom/kik/c/b;Ljava/io/File;B)V
    .locals 0

    .prologue
    .line 353
    invoke-direct {p0, p1, p2}, Lcom/kik/c/b$c;-><init>(Lcom/kik/c/b;Ljava/io/File;)V

    return-void
.end method

.method private a()V
    .locals 3

    .prologue
    .line 426
    iget-object v0, p0, Lcom/kik/c/b$c;->b:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    move-result v0

    if-nez v0, :cond_0

    .line 427
    invoke-static {}, Lcom/kik/c/b;->b()Lorg/c/b;

    move-result-object v0

    const-string v1, "Failed to delete file: {}"

    iget-object v2, p0, Lcom/kik/c/b$c;->b:Ljava/io/File;

    invoke-interface {v0, v1, v2}, Lorg/c/b;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 429
    :cond_0
    return-void
.end method

.method private b()I
    .locals 8

    .prologue
    const/4 v1, 0x0

    .line 433
    const/4 v3, -0x1

    .line 438
    :try_start_0
    new-instance v2, Ljava/io/FileInputStream;

    iget-object v0, p0, Lcom/kik/c/b$c;->b:Ljava/io/File;

    invoke-direct {v2, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 440
    :try_start_1
    new-instance v0, Ljava/net/URL;

    iget-object v4, p0, Lcom/kik/c/b$c;->a:Lcom/kik/c/b;

    invoke-static {v4}, Lcom/kik/c/b;->g(Lcom/kik/c/b;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v4}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 441
    :try_start_2
    const-string v1, "POST"

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 442
    const-string v1, "Content-Type"

    const-string v4, "application/json"

    invoke-virtual {v0, v1, v4}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 443
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    .line 445
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->connect()V

    .line 446
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v1

    .line 448
    invoke-static {v2, v1}, Lorg/a/a/a/c;->a(Ljava/io/InputStream;Ljava/io/OutputStream;)I

    .line 449
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-result v1

    .line 450
    const/16 v3, 0xc8

    if-eq v1, v3, :cond_0

    .line 451
    :try_start_3
    invoke-static {}, Lcom/kik/c/b;->b()Lorg/c/b;

    move-result-object v3

    const-string v4, "Upload failed {} {}"

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v3, v4, v5, v6}, Lorg/c/b;->b(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 454
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object v3

    .line 455
    if-eqz v3, :cond_0

    .line 456
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object v3

    invoke-static {v3}, Lorg/a/a/a/c;->c(Ljava/io/InputStream;)Ljava/lang/String;
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 464
    :cond_0
    invoke-static {v2}, Lorg/a/a/a/c;->a(Ljava/io/InputStream;)V

    .line 465
    if-eqz v0, :cond_3

    .line 466
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    move v0, v1

    .line 469
    :cond_1
    :goto_0
    return v0

    .line 461
    :catch_0
    move-exception v0

    move-object v2, v1

    move v0, v3

    :goto_1
    invoke-static {v1}, Lorg/a/a/a/c;->a(Ljava/io/InputStream;)V

    .line 465
    if-eqz v2, :cond_1

    .line 466
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    goto :goto_0

    .line 464
    :catchall_0
    move-exception v0

    move-object v2, v1

    :goto_2
    invoke-static {v2}, Lorg/a/a/a/c;->a(Ljava/io/InputStream;)V

    .line 465
    if-eqz v1, :cond_2

    .line 466
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_2
    throw v0

    .line 464
    :catchall_1
    move-exception v0

    goto :goto_2

    :catchall_2
    move-exception v1

    move-object v7, v1

    move-object v1, v0

    move-object v0, v7

    goto :goto_2

    .line 461
    :catch_1
    move-exception v0

    move v0, v3

    move-object v7, v1

    move-object v1, v2

    move-object v2, v7

    goto :goto_1

    :catch_2
    move-exception v1

    move-object v1, v2

    move-object v2, v0

    move v0, v3

    goto :goto_1

    :catch_3
    move-exception v3

    move-object v7, v2

    move-object v2, v0

    move v0, v1

    move-object v1, v7

    goto :goto_1

    :cond_3
    move v0, v1

    goto :goto_0
.end method


# virtual methods
.method public final run()V
    .locals 6

    .prologue
    .line 366
    iget-object v0, p0, Lcom/kik/c/b$c;->b:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    .line 367
    invoke-static {}, Lcom/kik/c/b;->b()Lorg/c/b;

    move-result-object v0

    const-string v1, "Can\'t upload, file doesn\'t exist: {}"

    iget-object v2, p0, Lcom/kik/c/b$c;->b:Ljava/io/File;

    invoke-interface {v0, v1, v2}, Lorg/c/b;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 422
    :cond_0
    :goto_0
    return-void

    .line 371
    :cond_1
    iget-object v0, p0, Lcom/kik/c/b$c;->a:Lcom/kik/c/b;

    iget-object v0, v0, Lcom/kik/c/b;->b:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gtz v0, :cond_0

    .line 376
    iget-object v0, p0, Lcom/kik/c/b$c;->b:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\\."

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    .line 380
    :try_start_0
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    .line 387
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long v0, v2, v0

    const-wide/32 v2, 0xf731400

    cmp-long v0, v0, v2

    if-lez v0, :cond_2

    .line 388
    invoke-static {}, Lcom/kik/c/b;->b()Lorg/c/b;

    move-result-object v0

    const-string v1, "File too old, deleting: {}"

    iget-object v2, p0, Lcom/kik/c/b$c;->b:Ljava/io/File;

    invoke-interface {v0, v1, v2}, Lorg/c/b;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 389
    invoke-direct {p0}, Lcom/kik/c/b$c;->a()V

    goto :goto_0

    .line 383
    :catch_0
    move-exception v0

    invoke-static {}, Lcom/kik/c/b;->b()Lorg/c/b;

    move-result-object v0

    const-string v1, "failed to parse timestamp from file name: {}"

    iget-object v2, p0, Lcom/kik/c/b$c;->b:Ljava/io/File;

    invoke-interface {v0, v1, v2}, Lorg/c/b;->c(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    .line 393
    :cond_2
    iget-object v0, p0, Lcom/kik/c/b$c;->a:Lcom/kik/c/b;

    iget-object v0, v0, Lcom/kik/c/b;->a:Lcom/c/a/h/a/a;

    iget-object v1, p0, Lcom/kik/c/b$c;->b:Ljava/io/File;

    invoke-virtual {v0, v1}, Lcom/c/a/h/a/a;->a(Ljava/lang/Object;)J

    move-result-wide v0

    const-wide/16 v2, 0x5

    cmp-long v0, v0, v2

    if-ltz v0, :cond_3

    .line 394
    invoke-static {}, Lcom/kik/c/b;->b()Lorg/c/b;

    move-result-object v0

    const-string v1, "Retry limit exceeded, deleting: {}"

    iget-object v2, p0, Lcom/kik/c/b$c;->b:Ljava/io/File;

    invoke-interface {v0, v1, v2}, Lorg/c/b;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 395
    invoke-direct {p0}, Lcom/kik/c/b$c;->a()V

    goto :goto_0

    .line 399
    :cond_3
    iget-object v0, p0, Lcom/kik/c/b$c;->a:Lcom/kik/c/b;

    iget-object v0, v0, Lcom/kik/c/b;->a:Lcom/c/a/h/a/a;

    iget-object v1, p0, Lcom/kik/c/b$c;->b:Ljava/io/File;

    invoke-virtual {v0, v1}, Lcom/c/a/h/a/a;->b(Ljava/lang/Object;)J

    .line 400
    invoke-direct {p0}, Lcom/kik/c/b$c;->b()I

    move-result v0

    .line 402
    const/16 v1, 0xc8

    if-ne v0, v1, :cond_4

    .line 403
    invoke-direct {p0}, Lcom/kik/c/b$c;->a()V

    goto :goto_0

    .line 406
    :cond_4
    const/16 v1, 0x193

    if-eq v0, v1, :cond_5

    const/16 v1, 0x194

    if-eq v0, v1, :cond_5

    const/16 v1, 0x195

    if-ne v0, v1, :cond_6

    .line 408
    :cond_5
    invoke-static {}, Lcom/kik/c/b;->b()Lorg/c/b;

    move-result-object v1

    const-string v2, "Upload failed with code {}"

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Lorg/c/b;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 410
    :cond_6
    const/16 v1, 0x190

    if-lt v0, v1, :cond_7

    const/16 v1, 0x1f4

    if-ge v0, v1, :cond_7

    .line 411
    invoke-static {}, Lcom/kik/c/b;->b()Lorg/c/b;

    move-result-object v1

    const-string v2, "Error uploading, code {}, deleting {}"

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v3, p0, Lcom/kik/c/b$c;->b:Ljava/io/File;

    invoke-interface {v1, v2, v0, v3}, Lorg/c/b;->b(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 412
    invoke-direct {p0}, Lcom/kik/c/b$c;->a()V

    goto/16 :goto_0

    .line 414
    :cond_7
    const/16 v1, 0x1f7

    if-ne v0, v1, :cond_8

    .line 415
    invoke-static {}, Lcom/kik/c/b;->b()Lorg/c/b;

    move-result-object v0

    const-string v1, "Upload failed with 503, setting backoff"

    invoke-interface {v0, v1}, Lorg/c/b;->a(Ljava/lang/String;)V

    .line 416
    iget-object v0, p0, Lcom/kik/c/b$c;->a:Lcom/kik/c/b;

    iget-object v0, v0, Lcom/kik/c/b;->b:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-object v1, p0, Lcom/kik/c/b$c;->a:Lcom/kik/c/b;

    invoke-static {v1}, Lcom/kik/c/b;->f(Lcom/kik/c/b;)J

    move-result-wide v4

    add-long/2addr v2, v4

    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    goto/16 :goto_0

    .line 419
    :cond_8
    invoke-static {}, Lcom/kik/c/b;->b()Lorg/c/b;

    move-result-object v1

    const-string v2, "Upload failed with code {}"

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Lorg/c/b;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_0
.end method
