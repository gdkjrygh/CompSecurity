.class final Lcom/roidapp/imagelib/retouch/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/retouch/a;

.field private final b:Ljava/lang/String;

.field private c:I

.field private d:Ljava/lang/String;

.field private e:I

.field private f:I


# direct methods
.method public constructor <init>(Lcom/roidapp/imagelib/retouch/a;Ljava/lang/String;III)V
    .locals 1

    .prologue
    .line 431
    iput-object p1, p0, Lcom/roidapp/imagelib/retouch/e;->a:Lcom/roidapp/imagelib/retouch/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 425
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/imagelib/retouch/e;->c:I

    .line 426
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/e;->d:Ljava/lang/String;

    .line 432
    iput-object p2, p0, Lcom/roidapp/imagelib/retouch/e;->b:Ljava/lang/String;

    .line 433
    iput p3, p0, Lcom/roidapp/imagelib/retouch/e;->c:I

    .line 434
    iput p4, p0, Lcom/roidapp/imagelib/retouch/e;->e:I

    .line 435
    iput p5, p0, Lcom/roidapp/imagelib/retouch/e;->f:I

    .line 436
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .prologue
    const/4 v1, 0x0

    const-wide/high16 v6, 0x3ff8000000000000L    # 1.5

    .line 442
    .line 444
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/e;->a:Lcom/roidapp/imagelib/retouch/a;

    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/a;->f(Lcom/roidapp/imagelib/retouch/a;)[Ljava/lang/Integer;

    move-result-object v0

    array-length v0, v0

    if-nez v0, :cond_0

    .line 445
    const-string v0, "BlemishFragment"

    const-string v1, "genMinLengths length 0"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 446
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v1, "genMinLengths length 0"

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 447
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/e;->a:Lcom/roidapp/imagelib/retouch/a;

    new-instance v1, Ljava/lang/Exception;

    const-string v2, "The save length array is 0."

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/roidapp/imagelib/retouch/e;->d:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/roidapp/imagelib/retouch/a;->a(Lcom/roidapp/imagelib/retouch/a;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 448
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/e;->a:Lcom/roidapp/imagelib/retouch/a;

    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/a;->g(Lcom/roidapp/imagelib/retouch/a;)Z

    .line 503
    :goto_0
    return-void

    .line 452
    :cond_0
    iget v0, p0, Lcom/roidapp/imagelib/retouch/e;->c:I

    iget-object v2, p0, Lcom/roidapp/imagelib/retouch/e;->a:Lcom/roidapp/imagelib/retouch/a;

    invoke-static {v2}, Lcom/roidapp/imagelib/retouch/a;->f(Lcom/roidapp/imagelib/retouch/a;)[Ljava/lang/Integer;

    move-result-object v2

    array-length v2, v2

    if-lt v0, v2, :cond_1

    .line 453
    const-string v0, "BlemishFragment"

    const-string v1, "final OOM !!!"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 454
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v1, "BlemishFragment/LoadOOM"

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 455
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/e;->a:Lcom/roidapp/imagelib/retouch/a;

    new-instance v1, Ljava/lang/OutOfMemoryError;

    const-string v2, "Out Of Memory"

    invoke-direct {v1, v2}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/roidapp/imagelib/retouch/e;->d:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/roidapp/imagelib/retouch/a;->a(Lcom/roidapp/imagelib/retouch/a;Ljava/lang/Throwable;Ljava/lang/String;)V

    goto :goto_0

    .line 460
    :cond_1
    :try_start_0
    iget v0, p0, Lcom/roidapp/imagelib/retouch/e;->e:I

    iget v2, p0, Lcom/roidapp/imagelib/retouch/e;->c:I

    add-int/lit8 v2, v2, 0x1

    div-int/2addr v0, v2

    iput v0, p0, Lcom/roidapp/imagelib/retouch/e;->e:I

    .line 461
    iget v0, p0, Lcom/roidapp/imagelib/retouch/e;->f:I

    iget v2, p0, Lcom/roidapp/imagelib/retouch/e;->c:I

    add-int/lit8 v2, v2, 0x1

    div-int/2addr v0, v2

    iput v0, p0, Lcom/roidapp/imagelib/retouch/e;->f:I

    .line 462
    invoke-static {}, Lcom/roidapp/baselib/a/a;->a()Lcom/roidapp/baselib/a/a;

    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/e;->b:Ljava/lang/String;

    iget v2, p0, Lcom/roidapp/imagelib/retouch/e;->e:I

    iget v3, p0, Lcom/roidapp/imagelib/retouch/e;->f:I

    invoke-static {v0, v2, v3}, Lcom/roidapp/baselib/a/a;->b(Ljava/lang/String;II)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v2

    .line 468
    :try_start_1
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    int-to-double v4, v0

    mul-double/2addr v4, v6

    double-to-int v0, v4

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    int-to-double v4, v3

    mul-double/2addr v4, v6

    double-to-int v3, v4

    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v3, v4}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 472
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/e;->a:Lcom/roidapp/imagelib/retouch/a;

    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/a;->h(Lcom/roidapp/imagelib/retouch/a;)Landroid/os/Handler;

    move-result-object v0

    const/4 v3, 0x1

    invoke-virtual {v0, v3, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_7
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_6
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 497
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_2

    .line 498
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 502
    :cond_2
    invoke-static {}, Ljava/lang/System;->gc()V

    goto :goto_0

    .line 473
    :catch_0
    move-exception v0

    move-object v2, v1

    .line 474
    :goto_1
    :try_start_2
    invoke-static {v2}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 475
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 476
    const-string v2, "BlemishFragment"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Meet OOM, side length="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Lcom/roidapp/imagelib/retouch/e;->a:Lcom/roidapp/imagelib/retouch/a;

    invoke-static {v4}, Lcom/roidapp/imagelib/retouch/a;->f(Lcom/roidapp/imagelib/retouch/a;)[Ljava/lang/Integer;

    move-result-object v4

    iget v5, p0, Lcom/roidapp/imagelib/retouch/e;->c:I

    aget-object v4, v4, v5

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 477
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 478
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/e;->a:Lcom/roidapp/imagelib/retouch/a;

    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/a;->h(Lcom/roidapp/imagelib/retouch/a;)Landroid/os/Handler;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    iget v4, p0, Lcom/roidapp/imagelib/retouch/e;->c:I

    add-int/lit8 v4, v4, 0x1

    invoke-static {v0, v2, v3, v4}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    move-result-object v0

    .line 479
    iget-object v2, p0, Lcom/roidapp/imagelib/retouch/e;->a:Lcom/roidapp/imagelib/retouch/a;

    invoke-static {v2}, Lcom/roidapp/imagelib/retouch/a;->h(Lcom/roidapp/imagelib/retouch/a;)Landroid/os/Handler;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 497
    if-eqz v1, :cond_3

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_3

    .line 498
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 502
    :cond_3
    invoke-static {}, Ljava/lang/System;->gc()V

    goto/16 :goto_0

    .line 480
    :catch_1
    move-exception v0

    move-object v2, v1

    .line 481
    :goto_2
    :try_start_3
    invoke-static {v2}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 482
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 483
    invoke-virtual {v0}, Ljava/lang/IllegalArgumentException;->printStackTrace()V

    .line 484
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/e;->a:Lcom/roidapp/imagelib/retouch/a;

    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/a;->h(Lcom/roidapp/imagelib/retouch/a;)Landroid/os/Handler;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    iget v4, p0, Lcom/roidapp/imagelib/retouch/e;->c:I

    add-int/lit8 v4, v4, 0x1

    invoke-static {v0, v2, v3, v4}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    move-result-object v0

    .line 485
    iget-object v2, p0, Lcom/roidapp/imagelib/retouch/e;->a:Lcom/roidapp/imagelib/retouch/a;

    invoke-static {v2}, Lcom/roidapp/imagelib/retouch/a;->h(Lcom/roidapp/imagelib/retouch/a;)Landroid/os/Handler;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 497
    if-eqz v1, :cond_4

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_4

    .line 498
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 502
    :cond_4
    invoke-static {}, Ljava/lang/System;->gc()V

    goto/16 :goto_0

    .line 487
    :catch_2
    move-exception v0

    move-object v2, v1

    :goto_3
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/NullPointerException;->printStackTrace()V

    .line 488
    invoke-static {v2}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 489
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 490
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/e;->a:Lcom/roidapp/imagelib/retouch/a;

    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/a;->h(Lcom/roidapp/imagelib/retouch/a;)Landroid/os/Handler;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    iget v4, p0, Lcom/roidapp/imagelib/retouch/e;->c:I

    add-int/lit8 v4, v4, 0x1

    invoke-static {v0, v2, v3, v4}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    move-result-object v0

    .line 491
    iget-object v2, p0, Lcom/roidapp/imagelib/retouch/e;->a:Lcom/roidapp/imagelib/retouch/a;

    invoke-static {v2}, Lcom/roidapp/imagelib/retouch/a;->h(Lcom/roidapp/imagelib/retouch/a;)Landroid/os/Handler;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 497
    if-eqz v1, :cond_5

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_5

    .line 498
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 502
    :cond_5
    invoke-static {}, Ljava/lang/System;->gc()V

    goto/16 :goto_0

    .line 492
    :catch_3
    move-exception v0

    move-object v2, v1

    .line 493
    :goto_4
    :try_start_5
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 494
    invoke-static {v2}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 495
    iget-object v2, p0, Lcom/roidapp/imagelib/retouch/e;->a:Lcom/roidapp/imagelib/retouch/a;

    iget-object v3, p0, Lcom/roidapp/imagelib/retouch/e;->d:Ljava/lang/String;

    invoke-static {v2, v0, v3}, Lcom/roidapp/imagelib/retouch/a;->a(Lcom/roidapp/imagelib/retouch/a;Ljava/lang/Throwable;Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 497
    if-eqz v1, :cond_6

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_6

    .line 498
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 502
    :cond_6
    invoke-static {}, Ljava/lang/System;->gc()V

    goto/16 :goto_0

    .line 497
    :catchall_0
    move-exception v0

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v2

    if-nez v2, :cond_7

    .line 498
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 502
    :cond_7
    invoke-static {}, Ljava/lang/System;->gc()V

    throw v0

    .line 492
    :catch_4
    move-exception v0

    goto :goto_4

    .line 487
    :catch_5
    move-exception v0

    goto :goto_3

    .line 480
    :catch_6
    move-exception v0

    goto/16 :goto_2

    .line 473
    :catch_7
    move-exception v0

    goto/16 :goto_1
.end method
