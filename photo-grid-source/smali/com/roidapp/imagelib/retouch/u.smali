.class public final Lcom/roidapp/imagelib/retouch/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field protected a:Ljava/lang/String;

.field final synthetic b:Lcom/roidapp/imagelib/retouch/m;

.field private c:I

.field private d:I

.field private e:Landroid/content/Context;

.field private f:I

.field private g:I


# direct methods
.method public constructor <init>(Lcom/roidapp/imagelib/retouch/m;Landroid/content/Context;III)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 507
    iput-object p1, p0, Lcom/roidapp/imagelib/retouch/u;->b:Lcom/roidapp/imagelib/retouch/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 500
    iput v1, p0, Lcom/roidapp/imagelib/retouch/u;->c:I

    .line 501
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/u;->a:Ljava/lang/String;

    .line 502
    iput v1, p0, Lcom/roidapp/imagelib/retouch/u;->d:I

    .line 508
    iput-object p2, p0, Lcom/roidapp/imagelib/retouch/u;->e:Landroid/content/Context;

    .line 509
    iput p5, p0, Lcom/roidapp/imagelib/retouch/u;->d:I

    .line 510
    iput p3, p0, Lcom/roidapp/imagelib/retouch/u;->f:I

    .line 511
    iput p4, p0, Lcom/roidapp/imagelib/retouch/u;->g:I

    .line 515
    invoke-static {p1}, Lcom/roidapp/imagelib/retouch/m;->k(Lcom/roidapp/imagelib/retouch/m;)Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 516
    invoke-static {p1}, Lcom/roidapp/imagelib/retouch/m;->k(Lcom/roidapp/imagelib/retouch/m;)Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    move-result-object v0

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->deleteImage()V

    .line 517
    :cond_0
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .prologue
    const/4 v2, 0x0

    const/4 v5, 0x0

    const/high16 v10, 0x42c80000    # 100.0f

    .line 539
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/u;->b:Lcom/roidapp/imagelib/retouch/m;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/retouch/m;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    .line 540
    if-nez v0, :cond_0

    .line 541
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/u;->b:Lcom/roidapp/imagelib/retouch/m;

    new-instance v1, Ljava/lang/Exception;

    const-string v2, "activity is finish"

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    const-string v2, ""

    invoke-static {v0, v1, v2}, Lcom/roidapp/imagelib/retouch/m;->a(Lcom/roidapp/imagelib/retouch/m;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 644
    :goto_0
    return-void

    .line 545
    :cond_0
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v1

    iget-object v3, p0, Lcom/roidapp/imagelib/retouch/u;->b:Lcom/roidapp/imagelib/retouch/m;

    iget-object v3, v3, Lcom/roidapp/imagelib/retouch/m;->b:Ljava/lang/String;

    invoke-virtual {v1, v0, v3}, Lcom/roidapp/imagelib/ImageLibrary;->a(Landroid/content/Context;Ljava/lang/String;)[Ljava/lang/Integer;

    move-result-object v4

    .line 546
    array-length v1, v4

    if-nez v1, :cond_1

    .line 547
    const-string v0, "SkinFragment"

    const-string v1, "genMinLengths length 0"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 548
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v1, "genMinLengths length 0"

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 549
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/u;->b:Lcom/roidapp/imagelib/retouch/m;

    new-instance v1, Ljava/lang/Exception;

    const-string v2, "The save length array is 0."

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/roidapp/imagelib/retouch/u;->a:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/roidapp/imagelib/retouch/m;->a(Lcom/roidapp/imagelib/retouch/m;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 550
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/u;->b:Lcom/roidapp/imagelib/retouch/m;

    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/m;->b(Lcom/roidapp/imagelib/retouch/m;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    goto :goto_0

    .line 554
    :cond_1
    iget v1, p0, Lcom/roidapp/imagelib/retouch/u;->d:I

    array-length v3, v4

    if-lt v1, v3, :cond_2

    .line 555
    const-string v0, "SkinFragment"

    const-string v1, "final OOM !!!"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 556
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v1, "ImageEditGLSFragment/SaveOOM"

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 557
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/u;->b:Lcom/roidapp/imagelib/retouch/m;

    new-instance v1, Ljava/lang/OutOfMemoryError;

    const-string v2, "Out Of Memory"

    invoke-direct {v1, v2}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/roidapp/imagelib/retouch/u;->a:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/roidapp/imagelib/retouch/m;->a(Lcom/roidapp/imagelib/retouch/m;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 558
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/u;->b:Lcom/roidapp/imagelib/retouch/m;

    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/m;->b(Lcom/roidapp/imagelib/retouch/m;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    goto :goto_0

    .line 563
    :cond_2
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/roidapp/imagelib/ImageLibrary;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/u;->a:Ljava/lang/String;

    .line 565
    iget v0, p0, Lcom/roidapp/imagelib/retouch/u;->c:I

    if-nez v0, :cond_3

    .line 566
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/u;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/u;->a:Ljava/lang/String;

    .line 569
    :cond_3
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/u;->b:Lcom/roidapp/imagelib/retouch/m;

    iget-object v1, v1, Lcom/roidapp/imagelib/retouch/m;->b:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 570
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "PhotoGrid_"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v6

    invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".jpg"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 572
    const-string v0, "SkinFragment"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Save file name "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 577
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/u;->b:Lcom/roidapp/imagelib/retouch/m;

    iget-object v0, v0, Lcom/roidapp/imagelib/retouch/m;->b:Ljava/lang/String;

    iget v1, p0, Lcom/roidapp/imagelib/retouch/u;->d:I

    aget-object v1, v4, v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget v3, p0, Lcom/roidapp/imagelib/retouch/u;->d:I

    aget-object v3, v4, v3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iget v6, p0, Lcom/roidapp/imagelib/retouch/u;->d:I

    aget-object v6, v4, v6

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    mul-int/2addr v3, v6

    invoke-static {v0, v1, v3}, Lcom/roidapp/imagelib/b/d;->a(Ljava/lang/String;II)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_6
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result-object v3

    .line 579
    :try_start_1
    const-string v0, "SkinFragment"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v6, "load bitmap size width="

    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v6

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v6, ",height="

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_d
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_b
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_9
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 580
    if-eqz v3, :cond_8

    .line 583
    :try_start_2
    new-instance v1, Ljava/io/FileInputStream;

    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/u;->b:Lcom/roidapp/imagelib/retouch/m;

    iget-object v0, v0, Lcom/roidapp/imagelib/retouch/m;->b:Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 584
    :try_start_3
    invoke-static {v1}, Ljp/co/cyberagent/android/gpuimage/util/FileType;->getTypeByStream(Ljava/io/FileInputStream;)Ljava/lang/String;

    move-result-object v0

    .line 585
    const-string v2, "gif"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 586
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    const/4 v2, 0x1

    invoke-virtual {v3, v0, v2}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 587
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_3
    .catch Ljava/io/FileNotFoundException; {:try_start_3 .. :try_end_3} :catch_10
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 595
    :goto_1
    :try_start_4
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_7
    .catch Ljava/lang/OutOfMemoryError; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4 .. :try_end_4} :catch_5
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 1520
    :goto_2
    :try_start_5
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v1, "processImage"

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 1523
    new-instance v0, Ljp/co/cyberagent/android/gpuimage/GPUImage;

    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/u;->e:Landroid/content/Context;

    invoke-direct {v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImage;-><init>(Landroid/content/Context;)V

    .line 1524
    invoke-virtual {v0, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->setImage(Landroid/graphics/Bitmap;)V

    .line 1525
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/u;->b:Lcom/roidapp/imagelib/retouch/m;

    new-instance v3, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;

    const/high16 v6, 0x41200000    # 10.0f

    const/4 v7, 0x0

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v8

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v9

    invoke-direct {v3, v6, v7, v8, v9}, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;-><init>(FFII)V

    invoke-static {v1, v3}, Lcom/roidapp/imagelib/retouch/m;->a(Lcom/roidapp/imagelib/retouch/m;Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;)Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;

    .line 1526
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/u;->b:Lcom/roidapp/imagelib/retouch/m;

    invoke-static {v1}, Lcom/roidapp/imagelib/retouch/m;->n(Lcom/roidapp/imagelib/retouch/m;)Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;

    move-result-object v1

    iget v3, p0, Lcom/roidapp/imagelib/retouch/u;->g:I

    int-to-float v3, v3

    const v6, 0x3b83126f    # 0.004f

    mul-float/2addr v3, v6

    div-float/2addr v3, v10

    invoke-virtual {v1, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->setEps(F)V

    .line 1527
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/u;->b:Lcom/roidapp/imagelib/retouch/m;

    invoke-static {v1}, Lcom/roidapp/imagelib/retouch/m;->n(Lcom/roidapp/imagelib/retouch/m;)Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;

    move-result-object v1

    iget v3, p0, Lcom/roidapp/imagelib/retouch/u;->f:I

    int-to-float v3, v3

    div-float/2addr v3, v10

    invoke-virtual {v1, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->setAlpha(F)V

    .line 1528
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/u;->b:Lcom/roidapp/imagelib/retouch/m;

    invoke-static {v1}, Lcom/roidapp/imagelib/retouch/m;->n(Lcom/roidapp/imagelib/retouch/m;)Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->setFilter(Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;)V

    .line 1529
    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->getBitmapWithFilterApplied()Landroid/graphics/Bitmap;

    move-result-object v1

    .line 1530
    if-nez v1, :cond_6

    .line 1531
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "create PBuffer failed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_5
    .catch Ljava/lang/OutOfMemoryError; {:try_start_5 .. :try_end_5} :catch_0
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_5 .. :try_end_5} :catch_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_6
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 611
    :catch_0
    move-exception v0

    .line 612
    :goto_3
    :try_start_6
    invoke-static {v2}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 613
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 614
    const-string v1, "SkinFragment"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "Meet OOM, side length="

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v5, p0, Lcom/roidapp/imagelib/retouch/u;->d:I

    aget-object v4, v4, v5

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 615
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 617
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/u;->b:Lcom/roidapp/imagelib/retouch/m;

    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/m;->e(Lcom/roidapp/imagelib/retouch/m;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x403

    iget v3, p0, Lcom/roidapp/imagelib/retouch/u;->d:I

    add-int/lit8 v3, v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0, v1, v3}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 618
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/u;->b:Lcom/roidapp/imagelib/retouch/m;

    invoke-static {v1}, Lcom/roidapp/imagelib/retouch/m;->e(Lcom/roidapp/imagelib/retouch/m;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 636
    invoke-static {v2}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 637
    invoke-static {}, Ljava/lang/System;->gc()V

    goto/16 :goto_0

    .line 591
    :catch_1
    move-exception v0

    move-object v1, v2

    :goto_4
    :try_start_7
    invoke-virtual {v0}, Ljava/io/FileNotFoundException;->printStackTrace()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 594
    if-eqz v1, :cond_4

    .line 595
    :try_start_8
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_8 .. :try_end_8} :catch_3
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_d
    .catch Ljava/lang/IllegalArgumentException; {:try_start_8 .. :try_end_8} :catch_b
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :cond_4
    move-object v2, v3

    .line 597
    goto/16 :goto_2

    .line 598
    :catch_2
    move-exception v0

    move-object v2, v3

    goto/16 :goto_2

    .line 593
    :catchall_0
    move-exception v0

    move-object v1, v2

    .line 594
    :goto_5
    if-eqz v1, :cond_5

    .line 595
    :try_start_9
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_8
    .catch Ljava/lang/OutOfMemoryError; {:try_start_9 .. :try_end_9} :catch_3
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_d
    .catch Ljava/lang/IllegalArgumentException; {:try_start_9 .. :try_end_9} :catch_b
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 597
    :cond_5
    :goto_6
    :try_start_a
    throw v0
    :try_end_a
    .catch Ljava/lang/OutOfMemoryError; {:try_start_a .. :try_end_a} :catch_3
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_d
    .catch Ljava/lang/IllegalArgumentException; {:try_start_a .. :try_end_a} :catch_b
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_9
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 611
    :catch_3
    move-exception v0

    move-object v2, v3

    goto :goto_3

    .line 603
    :cond_6
    :try_start_b
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    .line 604
    const-string v0, "SkinFragment"

    const-string v6, "process end, start to save."

    invoke-static {v0, v6}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 606
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/u;->a:Ljava/lang/String;

    sget-object v6, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-static {v1, v0, v5, v6}, Lcom/roidapp/imagelib/b/d;->a(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap$CompressFormat;)Landroid/net/Uri;

    move-result-object v0

    .line 609
    const-string v5, "SkinFragment"

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "save bitmap size width="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, ",height="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 610
    const-string v5, "SkinFragment"

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "save to "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, ", save time="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v8

    sub-long v2, v8, v2

    invoke-virtual {v6, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v5, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_b
    .catch Ljava/lang/OutOfMemoryError; {:try_start_b .. :try_end_b} :catch_f
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_e
    .catch Ljava/lang/IllegalArgumentException; {:try_start_b .. :try_end_b} :catch_c
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_a
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 636
    invoke-static {v1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 637
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 641
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/u;->b:Lcom/roidapp/imagelib/retouch/m;

    invoke-static {v1}, Lcom/roidapp/imagelib/retouch/m;->e(Lcom/roidapp/imagelib/retouch/m;)Landroid/os/Handler;

    move-result-object v1

    const/16 v2, 0x404

    invoke-static {v1, v2, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 642
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/u;->b:Lcom/roidapp/imagelib/retouch/m;

    invoke-static {v1}, Lcom/roidapp/imagelib/retouch/m;->e(Lcom/roidapp/imagelib/retouch/m;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto/16 :goto_0

    .line 620
    :catch_4
    move-exception v0

    .line 621
    :goto_7
    :try_start_c
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    .line 622
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/u;->b:Lcom/roidapp/imagelib/retouch/m;

    iget-object v3, p0, Lcom/roidapp/imagelib/retouch/u;->a:Ljava/lang/String;

    invoke-static {v1, v0, v3}, Lcom/roidapp/imagelib/retouch/m;->a(Lcom/roidapp/imagelib/retouch/m;Ljava/lang/Throwable;Ljava/lang/String;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    .line 636
    invoke-static {v2}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 637
    invoke-static {}, Ljava/lang/System;->gc()V

    goto/16 :goto_0

    .line 624
    :catch_5
    move-exception v0

    .line 625
    :goto_8
    :try_start_d
    invoke-static {v2}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 626
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 627
    invoke-virtual {v0}, Ljava/lang/IllegalArgumentException;->printStackTrace()V

    .line 628
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/u;->b:Lcom/roidapp/imagelib/retouch/m;

    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/m;->e(Lcom/roidapp/imagelib/retouch/m;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x403

    iget v3, p0, Lcom/roidapp/imagelib/retouch/u;->d:I

    add-int/lit8 v3, v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0, v1, v3}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 629
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/u;->b:Lcom/roidapp/imagelib/retouch/m;

    invoke-static {v1}, Lcom/roidapp/imagelib/retouch/m;->e(Lcom/roidapp/imagelib/retouch/m;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    .line 636
    invoke-static {v2}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 637
    invoke-static {}, Ljava/lang/System;->gc()V

    goto/16 :goto_0

    .line 631
    :catch_6
    move-exception v0

    .line 632
    :goto_9
    :try_start_e
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 633
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/u;->b:Lcom/roidapp/imagelib/retouch/m;

    iget-object v3, p0, Lcom/roidapp/imagelib/retouch/u;->a:Ljava/lang/String;

    invoke-static {v1, v0, v3}, Lcom/roidapp/imagelib/retouch/m;->a(Lcom/roidapp/imagelib/retouch/m;Ljava/lang/Throwable;Ljava/lang/String;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_1

    .line 636
    invoke-static {v2}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 637
    invoke-static {}, Ljava/lang/System;->gc()V

    goto/16 :goto_0

    .line 636
    :catchall_1
    move-exception v0

    :goto_a
    invoke-static {v2}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 637
    invoke-static {}, Ljava/lang/System;->gc()V

    throw v0

    .line 598
    :catch_7
    move-exception v0

    goto/16 :goto_2

    :catch_8
    move-exception v1

    goto/16 :goto_6

    .line 636
    :catchall_2
    move-exception v0

    move-object v2, v3

    goto :goto_a

    :catchall_3
    move-exception v0

    move-object v2, v1

    goto :goto_a

    .line 631
    :catch_9
    move-exception v0

    move-object v2, v3

    goto :goto_9

    :catch_a
    move-exception v0

    move-object v2, v1

    goto :goto_9

    .line 624
    :catch_b
    move-exception v0

    move-object v2, v3

    goto :goto_8

    :catch_c
    move-exception v0

    move-object v2, v1

    goto :goto_8

    .line 620
    :catch_d
    move-exception v0

    move-object v2, v3

    goto :goto_7

    :catch_e
    move-exception v0

    move-object v2, v1

    goto :goto_7

    .line 611
    :catch_f
    move-exception v0

    move-object v2, v1

    goto/16 :goto_3

    .line 593
    :catchall_4
    move-exception v0

    goto/16 :goto_5

    .line 591
    :catch_10
    move-exception v0

    goto/16 :goto_4

    :cond_7
    move-object v2, v3

    goto/16 :goto_1

    :cond_8
    move-object v2, v3

    goto/16 :goto_2
.end method
