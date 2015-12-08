.class final Lcom/roidapp/imagelib/freecrop/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/freecrop/e;

.field private final b:Ljava/lang/String;

.field private c:I

.field private d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/roidapp/imagelib/freecrop/e;Ljava/lang/String;I)V
    .locals 1

    .prologue
    .line 418
    iput-object p1, p0, Lcom/roidapp/imagelib/freecrop/j;->a:Lcom/roidapp/imagelib/freecrop/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 415
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/imagelib/freecrop/j;->c:I

    .line 416
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/j;->d:Ljava/lang/String;

    .line 419
    iput-object p2, p0, Lcom/roidapp/imagelib/freecrop/j;->b:Ljava/lang/String;

    .line 420
    iput p3, p0, Lcom/roidapp/imagelib/freecrop/j;->c:I

    .line 421
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .prologue
    const/4 v1, 0x0

    .line 427
    .line 429
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/j;->a:Lcom/roidapp/imagelib/freecrop/e;

    invoke-static {v0}, Lcom/roidapp/imagelib/freecrop/e;->k(Lcom/roidapp/imagelib/freecrop/e;)[Ljava/lang/Integer;

    move-result-object v0

    array-length v0, v0

    if-nez v0, :cond_0

    .line 430
    const-string v0, "ImageEditFreeCropFragment"

    const-string v1, "genMinLengths length 0"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 431
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v1, "FreeCropFrag/length 0"

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 432
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/j;->a:Lcom/roidapp/imagelib/freecrop/e;

    new-instance v1, Ljava/lang/Exception;

    const-string v2, "The load length array is 0."

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/j;->d:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/roidapp/imagelib/freecrop/e;->a(Lcom/roidapp/imagelib/freecrop/e;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 483
    :goto_0
    return-void

    .line 436
    :cond_0
    iget v0, p0, Lcom/roidapp/imagelib/freecrop/j;->c:I

    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/j;->a:Lcom/roidapp/imagelib/freecrop/e;

    invoke-static {v2}, Lcom/roidapp/imagelib/freecrop/e;->k(Lcom/roidapp/imagelib/freecrop/e;)[Ljava/lang/Integer;

    move-result-object v2

    array-length v2, v2

    if-lt v0, v2, :cond_1

    .line 437
    const-string v0, "ImageEditFreeCropFragment"

    const-string v1, "final OOM !!!"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 438
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v1, "FreeCropFrag/SaveOOM"

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 439
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/j;->a:Lcom/roidapp/imagelib/freecrop/e;

    new-instance v1, Ljava/lang/OutOfMemoryError;

    const-string v2, "Out Of Memory"

    invoke-direct {v1, v2}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/j;->d:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/roidapp/imagelib/freecrop/e;->a(Lcom/roidapp/imagelib/freecrop/e;Ljava/lang/Throwable;Ljava/lang/String;)V

    goto :goto_0

    .line 445
    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/j;->a:Lcom/roidapp/imagelib/freecrop/e;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/freecrop/e;->getActivity()Landroid/support/v4/app/FragmentActivity;

    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/j;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/j;->a:Lcom/roidapp/imagelib/freecrop/e;

    invoke-static {v2}, Lcom/roidapp/imagelib/freecrop/e;->k(Lcom/roidapp/imagelib/freecrop/e;)[Ljava/lang/Integer;

    move-result-object v2

    iget v3, p0, Lcom/roidapp/imagelib/freecrop/j;->c:I

    aget-object v2, v2, v3

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/j;->a:Lcom/roidapp/imagelib/freecrop/e;

    invoke-static {v3}, Lcom/roidapp/imagelib/freecrop/e;->k(Lcom/roidapp/imagelib/freecrop/e;)[Ljava/lang/Integer;

    move-result-object v3

    iget v4, p0, Lcom/roidapp/imagelib/freecrop/j;->c:I

    aget-object v3, v3, v4

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iget-object v4, p0, Lcom/roidapp/imagelib/freecrop/j;->a:Lcom/roidapp/imagelib/freecrop/e;

    invoke-static {v4}, Lcom/roidapp/imagelib/freecrop/e;->k(Lcom/roidapp/imagelib/freecrop/e;)[Ljava/lang/Integer;

    move-result-object v4

    iget v5, p0, Lcom/roidapp/imagelib/freecrop/j;->c:I

    aget-object v4, v4, v5

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    mul-int/2addr v3, v4

    invoke-static {v0, v2, v3}, Lcom/roidapp/imagelib/b/d;->a(Ljava/lang/String;II)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v2

    .line 448
    if-nez v2, :cond_2

    .line 450
    :try_start_1
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/j;->a:Lcom/roidapp/imagelib/freecrop/e;

    invoke-static {v0}, Lcom/roidapp/imagelib/freecrop/e;->l(Lcom/roidapp/imagelib/freecrop/e;)Landroid/os/Handler;

    move-result-object v0

    const/4 v3, 0x0

    const/4 v4, 0x0

    iget v5, p0, Lcom/roidapp/imagelib/freecrop/j;->c:I

    add-int/lit8 v5, v5, 0x1

    invoke-static {v0, v3, v4, v5}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    move-result-object v0

    .line 451
    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/j;->a:Lcom/roidapp/imagelib/freecrop/e;

    invoke-static {v3}, Lcom/roidapp/imagelib/freecrop/e;->l(Lcom/roidapp/imagelib/freecrop/e;)Landroid/os/Handler;

    move-result-object v3

    invoke-virtual {v3, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 482
    invoke-static {}, Ljava/lang/System;->gc()V

    goto :goto_0

    .line 456
    :cond_2
    :try_start_2
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    int-to-double v4, v0

    const-wide v6, 0x400199999999999aL    # 2.2

    mul-double/2addr v4, v6

    double-to-int v0, v4

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v3, v4}, Lcom/roidapp/imagelib/b/c;->a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 458
    if-nez v1, :cond_4

    .line 460
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/j;->a:Lcom/roidapp/imagelib/freecrop/e;

    invoke-static {v0}, Lcom/roidapp/imagelib/freecrop/e;->l(Lcom/roidapp/imagelib/freecrop/e;)Landroid/os/Handler;

    move-result-object v0

    const/4 v3, 0x0

    const/4 v4, 0x0

    iget v5, p0, Lcom/roidapp/imagelib/freecrop/j;->c:I

    add-int/lit8 v5, v5, 0x1

    invoke-static {v0, v3, v4, v5}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    move-result-object v0

    .line 461
    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/j;->a:Lcom/roidapp/imagelib/freecrop/e;

    invoke-static {v3}, Lcom/roidapp/imagelib/freecrop/e;->l(Lcom/roidapp/imagelib/freecrop/e;)Landroid/os/Handler;

    move-result-object v3

    invoke-virtual {v3, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 478
    if-eqz v1, :cond_3

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_3

    .line 479
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 482
    :cond_3
    invoke-static {}, Ljava/lang/System;->gc()V

    goto/16 :goto_0

    .line 464
    :cond_4
    :try_start_3
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/j;->a:Lcom/roidapp/imagelib/freecrop/e;

    invoke-static {v0}, Lcom/roidapp/imagelib/freecrop/e;->l(Lcom/roidapp/imagelib/freecrop/e;)Landroid/os/Handler;

    move-result-object v0

    const/4 v3, 0x1

    invoke-virtual {v0, v3, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
    :try_end_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 478
    if-eqz v1, :cond_5

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_5

    .line 479
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 482
    :cond_5
    invoke-static {}, Ljava/lang/System;->gc()V

    goto/16 :goto_0

    .line 465
    :catch_0
    move-exception v0

    move-object v2, v1

    .line 466
    :goto_1
    :try_start_4
    invoke-static {v2}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 467
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 468
    const-string v2, "ImageEditFreeCropFragment"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Meet OOM, side length="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Lcom/roidapp/imagelib/freecrop/j;->a:Lcom/roidapp/imagelib/freecrop/e;

    invoke-static {v4}, Lcom/roidapp/imagelib/freecrop/e;->k(Lcom/roidapp/imagelib/freecrop/e;)[Ljava/lang/Integer;

    move-result-object v4

    iget v5, p0, Lcom/roidapp/imagelib/freecrop/j;->c:I

    aget-object v4, v4, v5

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 469
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 470
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/j;->a:Lcom/roidapp/imagelib/freecrop/e;

    invoke-static {v0}, Lcom/roidapp/imagelib/freecrop/e;->l(Lcom/roidapp/imagelib/freecrop/e;)Landroid/os/Handler;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    iget v4, p0, Lcom/roidapp/imagelib/freecrop/j;->c:I

    add-int/lit8 v4, v4, 0x1

    invoke-static {v0, v2, v3, v4}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    move-result-object v0

    .line 471
    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/j;->a:Lcom/roidapp/imagelib/freecrop/e;

    invoke-static {v2}, Lcom/roidapp/imagelib/freecrop/e;->l(Lcom/roidapp/imagelib/freecrop/e;)Landroid/os/Handler;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 478
    if-eqz v1, :cond_6

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_6

    .line 479
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 482
    :cond_6
    invoke-static {}, Ljava/lang/System;->gc()V

    goto/16 :goto_0

    .line 472
    :catch_1
    move-exception v0

    move-object v2, v1

    .line 473
    :goto_2
    :try_start_5
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 474
    invoke-static {v2}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 475
    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/j;->a:Lcom/roidapp/imagelib/freecrop/e;

    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/j;->d:Ljava/lang/String;

    invoke-static {v2, v0, v3}, Lcom/roidapp/imagelib/freecrop/e;->a(Lcom/roidapp/imagelib/freecrop/e;Ljava/lang/Throwable;Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 478
    if-eqz v1, :cond_7

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_7

    .line 479
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 482
    :cond_7
    invoke-static {}, Ljava/lang/System;->gc()V

    goto/16 :goto_0

    .line 478
    :catchall_0
    move-exception v0

    if-eqz v1, :cond_8

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v2

    if-nez v2, :cond_8

    .line 479
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 482
    :cond_8
    invoke-static {}, Ljava/lang/System;->gc()V

    throw v0

    .line 472
    :catch_2
    move-exception v0

    goto :goto_2

    .line 465
    :catch_3
    move-exception v0

    goto/16 :goto_1
.end method
