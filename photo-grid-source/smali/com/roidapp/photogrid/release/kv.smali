.class final Lcom/roidapp/photogrid/release/kv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/kt;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/kt;)V
    .locals 0

    .prologue
    .line 353
    iput-object p1, p0, Lcom/roidapp/photogrid/release/kv;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .prologue
    const/4 v6, 0x0

    const/16 v9, 0x15

    const/4 v8, 0x1

    const/4 v7, 0x0

    .line 357
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "%"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/roidapp/baselib/d/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "%"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 358
    const-string v3, "_data LIKE ?"

    .line 359
    new-array v4, v8, [Ljava/lang/String;

    aput-object v0, v4, v7

    .line 360
    new-array v2, v8, [Ljava/lang/String;

    const-string v0, "_data"

    aput-object v0, v2, v7

    .line 367
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kv;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/kt;->a(Lcom/roidapp/photogrid/release/kt;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    const-string v5, "date_added desc"

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move v1, v7

    .line 373
    :goto_0
    if-eqz v1, :cond_8

    .line 375
    const-wide/16 v0, 0xbb8

    :try_start_1
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1

    .line 380
    :goto_1
    :try_start_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kv;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/kt;->a(Lcom/roidapp/photogrid/release/kt;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    const-string v5, "date_added desc"

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    move-result-object v0

    move-object v3, v0

    .line 390
    :goto_2
    if-eqz v3, :cond_6

    .line 391
    invoke-interface {v3}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_3

    .line 392
    invoke-interface {v3}, Landroid/database/Cursor;->getCount()I

    move-result v0

    move v2, v0

    move-object v1, v6

    .line 394
    :goto_3
    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 395
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 396
    invoke-static {v0}, Lcom/roidapp/photogrid/release/rf;->b(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 397
    add-int/lit8 v0, v2, -0x1

    move v2, v0

    .line 398
    goto :goto_3

    .line 370
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    move v1, v8

    move-object v0, v6

    .line 371
    goto :goto_0

    .line 377
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V

    goto :goto_1

    .line 383
    :catch_2
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 384
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 385
    iput v9, v0, Landroid/os/Message;->what:I

    .line 386
    iget-object v1, p0, Lcom/roidapp/photogrid/release/kv;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/kt;->b(Lcom/roidapp/photogrid/release/kt;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 430
    :cond_0
    :goto_4
    return-void

    .line 400
    :cond_1
    if-nez v1, :cond_7

    :goto_5
    move-object v1, v0

    .line 403
    goto :goto_3

    .line 404
    :cond_2
    new-array v0, v8, [Ljava/lang/String;

    invoke-static {}, Lcom/roidapp/baselib/d/a;->a()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v0, v7

    .line 405
    new-array v4, v8, [Ljava/lang/String;

    aput-object v1, v4, v7

    .line 406
    new-array v1, v8, [Ljava/lang/Integer;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v7

    .line 408
    invoke-interface {v3}, Landroid/database/Cursor;->moveToFirst()Z

    .line 409
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 410
    const-string v5, "folders_array"

    invoke-virtual {v2, v5, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 411
    const-string v0, "first_pics"

    invoke-virtual {v2, v0, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 412
    const-string v0, "count"

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 414
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 415
    iput v9, v0, Landroid/os/Message;->what:I

    .line 416
    iput-object v2, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 417
    iget-object v1, p0, Lcom/roidapp/photogrid/release/kv;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/kt;->b(Lcom/roidapp/photogrid/release/kt;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 418
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kv;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/kt;->f(Lcom/roidapp/photogrid/release/kt;)V

    .line 427
    :goto_6
    if-eqz v3, :cond_0

    invoke-interface {v3}, Landroid/database/Cursor;->isClosed()Z

    move-result v0

    if-nez v0, :cond_0

    .line 428
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    goto :goto_4

    .line 1434
    :cond_3
    invoke-static {}, Lcom/roidapp/baselib/d/a;->a()Ljava/lang/String;

    move-result-object v0

    .line 1435
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1436
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_5

    .line 1438
    invoke-virtual {v1}, Ljava/io/File;->list()[Ljava/lang/String;

    move-result-object v1

    .line 1439
    if-eqz v1, :cond_4

    array-length v2, v1

    if-lez v2, :cond_4

    .line 1444
    array-length v2, v1

    new-array v2, v2, [Ljava/lang/String;

    .line 1445
    array-length v4, v1

    new-array v4, v4, [Ljava/lang/String;

    .line 1446
    array-length v5, v1

    new-array v5, v5, [Ljava/lang/Integer;

    .line 1447
    aput-object v0, v2, v7

    .line 1448
    array-length v6, v1

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v7

    .line 1449
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v6, "/"

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    array-length v6, v1

    add-int/lit8 v6, v6, -0x1

    aget-object v1, v1, v6

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v4, v7

    .line 1451
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 1452
    const-string v1, "folders_array"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1453
    const-string v1, "first_pics"

    invoke-virtual {v0, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1454
    const-string v1, "count"

    invoke-virtual {v0, v1, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1455
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    .line 1456
    iput v9, v1, Landroid/os/Message;->what:I

    .line 1457
    iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1458
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kv;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/kt;->b(Lcom/roidapp/photogrid/release/kt;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1459
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kv;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/kt;->f(Lcom/roidapp/photogrid/release/kt;)V

    goto :goto_6

    .line 1461
    :cond_4
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 1462
    iput v9, v0, Landroid/os/Message;->what:I

    .line 1463
    iget-object v1, p0, Lcom/roidapp/photogrid/release/kv;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/kt;->b(Lcom/roidapp/photogrid/release/kt;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1464
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kv;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/kt;->f(Lcom/roidapp/photogrid/release/kt;)V

    goto/16 :goto_6

    .line 1467
    :cond_5
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 1468
    iput v9, v0, Landroid/os/Message;->what:I

    .line 1469
    iget-object v1, p0, Lcom/roidapp/photogrid/release/kv;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/kt;->b(Lcom/roidapp/photogrid/release/kt;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1470
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kv;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/kt;->f(Lcom/roidapp/photogrid/release/kt;)V

    goto/16 :goto_6

    .line 423
    :cond_6
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 424
    iput v9, v0, Landroid/os/Message;->what:I

    .line 425
    iget-object v1, p0, Lcom/roidapp/photogrid/release/kv;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/kt;->b(Lcom/roidapp/photogrid/release/kt;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto/16 :goto_6

    :cond_7
    move-object v0, v1

    goto/16 :goto_5

    :cond_8
    move-object v3, v0

    goto/16 :goto_2
.end method
