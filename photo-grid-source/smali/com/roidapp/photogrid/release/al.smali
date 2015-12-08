.class final Lcom/roidapp/photogrid/release/al;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/BackgroundImageCrop;

.field private final b:Ljava/lang/String;

.field private c:I

.field private d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/roidapp/photogrid/release/BackgroundImageCrop;Ljava/lang/String;I)V
    .locals 1

    .prologue
    .line 535
    iput-object p1, p0, Lcom/roidapp/photogrid/release/al;->a:Lcom/roidapp/photogrid/release/BackgroundImageCrop;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 531
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/photogrid/release/al;->c:I

    .line 532
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/photogrid/release/al;->d:Ljava/lang/String;

    .line 536
    iput-object p2, p0, Lcom/roidapp/photogrid/release/al;->b:Ljava/lang/String;

    .line 537
    iput p3, p0, Lcom/roidapp/photogrid/release/al;->c:I

    .line 538
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .prologue
    const/4 v1, 0x0

    const-wide v6, 0x3ff3333333333333L    # 1.2

    const/4 v3, 0x5

    .line 544
    .line 546
    iget-object v0, p0, Lcom/roidapp/photogrid/release/al;->a:Lcom/roidapp/photogrid/release/BackgroundImageCrop;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->a:[Ljava/lang/Integer;

    array-length v0, v0

    if-nez v0, :cond_0

    .line 547
    const-string v0, "BackgroundImageCrop"

    const-string v1, "genMinLengths length 0"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 548
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v1, "BackgroundImageCrop/genMinLengths length 0"

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 549
    iget-object v0, p0, Lcom/roidapp/photogrid/release/al;->a:Lcom/roidapp/photogrid/release/BackgroundImageCrop;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->g(Lcom/roidapp/photogrid/release/BackgroundImageCrop;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Ljava/lang/Exception;

    const-string v2, "The load length array is 0."

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 597
    :goto_0
    return-void

    .line 553
    :cond_0
    iget v0, p0, Lcom/roidapp/photogrid/release/al;->c:I

    iget-object v2, p0, Lcom/roidapp/photogrid/release/al;->a:Lcom/roidapp/photogrid/release/BackgroundImageCrop;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->a:[Ljava/lang/Integer;

    array-length v2, v2

    if-lt v0, v2, :cond_1

    .line 554
    const-string v0, "BackgroundImageCrop"

    const-string v1, "final OOM !!!"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 555
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v1, "BackgroundImageCrop/SaveOOM"

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 556
    iget-object v0, p0, Lcom/roidapp/photogrid/release/al;->a:Lcom/roidapp/photogrid/release/BackgroundImageCrop;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->g(Lcom/roidapp/photogrid/release/BackgroundImageCrop;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Ljava/lang/OutOfMemoryError;

    const-string v2, "Out Of Memory"

    invoke-direct {v1, v2}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    goto :goto_0

    .line 561
    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/al;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/al;->a:Lcom/roidapp/photogrid/release/BackgroundImageCrop;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->a:[Ljava/lang/Integer;

    iget v3, p0, Lcom/roidapp/photogrid/release/al;->c:I

    aget-object v2, v2, v3

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object v3, p0, Lcom/roidapp/photogrid/release/al;->a:Lcom/roidapp/photogrid/release/BackgroundImageCrop;

    iget-object v3, v3, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->a:[Ljava/lang/Integer;

    iget v4, p0, Lcom/roidapp/photogrid/release/al;->c:I

    aget-object v3, v3, v4

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iget-object v4, p0, Lcom/roidapp/photogrid/release/al;->a:Lcom/roidapp/photogrid/release/BackgroundImageCrop;

    iget-object v4, v4, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->a:[Ljava/lang/Integer;

    iget v5, p0, Lcom/roidapp/photogrid/release/al;->c:I

    aget-object v4, v4, v5

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    mul-int/2addr v3, v4

    invoke-static {v0, v2, v3}, Lcom/roidapp/imagelib/b/d;->a(Ljava/lang/String;II)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v2

    .line 565
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

    .line 568
    sget v0, Lcom/roidapp/photogrid/common/az;->G:I

    if-eqz v0, :cond_2

    sget v0, Lcom/roidapp/photogrid/common/az;->G:I

    const/16 v3, 0x168

    if-eq v0, v3, :cond_2

    .line 569
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    sget v0, Lcom/roidapp/photogrid/common/az;->G:I

    invoke-static {v2, v0}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 571
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/al;->a:Lcom/roidapp/photogrid/release/BackgroundImageCrop;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->g(Lcom/roidapp/photogrid/release/BackgroundImageCrop;)Landroid/os/Handler;

    move-result-object v0

    const/4 v3, 0x1

    invoke-virtual {v0, v3, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 591
    if-eqz v1, :cond_3

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_3

    .line 592
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 596
    :cond_3
    invoke-static {}, Ljava/lang/System;->gc()V

    goto/16 :goto_0

    .line 572
    :catch_0
    move-exception v0

    move-object v2, v1

    .line 573
    :goto_1
    :try_start_2
    invoke-static {v2}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 574
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 575
    const-string v2, "BackgroundImageCrop"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Meet OOM, side length="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Lcom/roidapp/photogrid/release/al;->a:Lcom/roidapp/photogrid/release/BackgroundImageCrop;

    iget-object v4, v4, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->a:[Ljava/lang/Integer;

    iget v5, p0, Lcom/roidapp/photogrid/release/al;->c:I

    aget-object v4, v4, v5

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 576
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 577
    iget-object v0, p0, Lcom/roidapp/photogrid/release/al;->a:Lcom/roidapp/photogrid/release/BackgroundImageCrop;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->g(Lcom/roidapp/photogrid/release/BackgroundImageCrop;)Landroid/os/Handler;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    iget v4, p0, Lcom/roidapp/photogrid/release/al;->c:I

    add-int/lit8 v4, v4, 0x1

    invoke-static {v0, v2, v3, v4}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    move-result-object v0

    .line 578
    iget-object v2, p0, Lcom/roidapp/photogrid/release/al;->a:Lcom/roidapp/photogrid/release/BackgroundImageCrop;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->g(Lcom/roidapp/photogrid/release/BackgroundImageCrop;)Landroid/os/Handler;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 591
    if-eqz v1, :cond_4

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_4

    .line 592
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 596
    :cond_4
    invoke-static {}, Ljava/lang/System;->gc()V

    goto/16 :goto_0

    .line 579
    :catch_1
    move-exception v0

    move-object v2, v1

    .line 580
    :goto_2
    :try_start_3
    invoke-static {v2}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 581
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 582
    invoke-virtual {v0}, Ljava/lang/IllegalArgumentException;->printStackTrace()V

    .line 583
    iget-object v0, p0, Lcom/roidapp/photogrid/release/al;->a:Lcom/roidapp/photogrid/release/BackgroundImageCrop;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->g(Lcom/roidapp/photogrid/release/BackgroundImageCrop;)Landroid/os/Handler;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    iget v4, p0, Lcom/roidapp/photogrid/release/al;->c:I

    add-int/lit8 v4, v4, 0x1

    invoke-static {v0, v2, v3, v4}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    move-result-object v0

    .line 584
    iget-object v2, p0, Lcom/roidapp/photogrid/release/al;->a:Lcom/roidapp/photogrid/release/BackgroundImageCrop;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->g(Lcom/roidapp/photogrid/release/BackgroundImageCrop;)Landroid/os/Handler;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 591
    if-eqz v1, :cond_5

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_5

    .line 592
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 596
    :cond_5
    invoke-static {}, Ljava/lang/System;->gc()V

    goto/16 :goto_0

    .line 586
    :catch_2
    move-exception v0

    move-object v2, v1

    :goto_3
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 587
    invoke-static {v2}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 588
    iget-object v0, p0, Lcom/roidapp/photogrid/release/al;->a:Lcom/roidapp/photogrid/release/BackgroundImageCrop;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->g(Lcom/roidapp/photogrid/release/BackgroundImageCrop;)Landroid/os/Handler;

    move-result-object v0

    const/4 v2, 0x5

    new-instance v3, Ljava/lang/Exception;

    const-string v4, ""

    invoke-direct {v3, v4}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 591
    if-eqz v1, :cond_6

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_6

    .line 592
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 596
    :cond_6
    invoke-static {}, Ljava/lang/System;->gc()V

    goto/16 :goto_0

    .line 591
    :catchall_0
    move-exception v0

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v2

    if-nez v2, :cond_7

    .line 592
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 596
    :cond_7
    invoke-static {}, Ljava/lang/System;->gc()V

    throw v0

    .line 586
    :catch_3
    move-exception v0

    goto :goto_3

    .line 579
    :catch_4
    move-exception v0

    goto :goto_2

    .line 572
    :catch_5
    move-exception v0

    goto/16 :goto_1
.end method
