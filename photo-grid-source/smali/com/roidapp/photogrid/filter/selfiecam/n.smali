.class public final Lcom/roidapp/photogrid/filter/selfiecam/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field protected a:Ljava/lang/String;

.field final synthetic b:Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;

.field private c:Z

.field private d:I

.field private final e:Lcom/roidapp/imagelib/filter/aq;


# direct methods
.method public constructor <init>(Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;ILcom/roidapp/imagelib/filter/aq;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 570
    iput-object p1, p0, Lcom/roidapp/photogrid/filter/selfiecam/n;->b:Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 565
    iput-boolean v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/n;->c:Z

    .line 566
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/n;->a:Ljava/lang/String;

    .line 567
    iput v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/n;->d:I

    .line 571
    iput-object p3, p0, Lcom/roidapp/photogrid/filter/selfiecam/n;->e:Lcom/roidapp/imagelib/filter/aq;

    .line 572
    invoke-interface {p3}, Lcom/roidapp/imagelib/filter/aq;->d()Z

    move-result v0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/n;->c:Z

    .line 573
    iput p2, p0, Lcom/roidapp/photogrid/filter/selfiecam/n;->d:I

    .line 574
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 12

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 578
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/n;->b:Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;

    iput-boolean v1, v0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->c:Z

    .line 581
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/n;->e:Lcom/roidapp/imagelib/filter/aq;

    invoke-interface {v0}, Lcom/roidapp/imagelib/filter/aq;->a()[Ljava/lang/Integer;

    move-result-object v5

    .line 582
    array-length v0, v5

    if-nez v0, :cond_0

    .line 583
    const-string v0, "SelfieCamImageShowActivity"

    const-string v1, "genMinLengths length 0"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 584
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v1, "genMinLengths length 0"

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 585
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/n;->b:Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;

    new-instance v1, Ljava/lang/Exception;

    const-string v3, "The save length array is 0."

    invoke-direct {v1, v3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/roidapp/photogrid/filter/selfiecam/n;->a:Ljava/lang/String;

    invoke-static {v0, v1, v3}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->a(Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 586
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/n;->b:Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;

    iput-boolean v2, v0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->c:Z

    .line 667
    :goto_0
    return-void

    .line 590
    :cond_0
    iget v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/n;->d:I

    array-length v3, v5

    if-lt v0, v3, :cond_1

    .line 591
    const-string v0, "SelfieCamImageShowActivity"

    const-string v1, "final OOM !!!"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 592
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v1, "SelfieCamSave/SaveOOM"

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 593
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/n;->b:Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;

    new-instance v1, Ljava/lang/OutOfMemoryError;

    const-string v3, "Out Of Memory"

    invoke-direct {v1, v3}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/roidapp/photogrid/filter/selfiecam/n;->a:Ljava/lang/String;

    invoke-static {v0, v1, v3}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->a(Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 594
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/n;->b:Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;

    iput-boolean v2, v0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->c:Z

    goto :goto_0

    .line 599
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/n;->e:Lcom/roidapp/imagelib/filter/aq;

    invoke-interface {v0}, Lcom/roidapp/imagelib/filter/aq;->b()Z

    move-result v6

    .line 603
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/n;->e:Lcom/roidapp/imagelib/filter/aq;

    invoke-interface {v0}, Lcom/roidapp/imagelib/filter/aq;->c()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/n;->a:Ljava/lang/String;

    .line 605
    iget-boolean v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/n;->c:Z

    if-nez v0, :cond_2

    .line 606
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/roidapp/photogrid/filter/selfiecam/n;->a:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/n;->a:Ljava/lang/String;

    .line 608
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "PhotoGrid_"

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v8

    invoke-virtual {v0, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    if-eqz v6, :cond_3

    const-string v0, ".png"

    :goto_1
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 610
    const-string v3, "SelfieCamImageShowActivity"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v7, "Save file name "

    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 613
    const/4 v3, 0x0

    .line 617
    :try_start_0
    iget-object v4, p0, Lcom/roidapp/photogrid/filter/selfiecam/n;->e:Lcom/roidapp/imagelib/filter/aq;

    iget v7, p0, Lcom/roidapp/photogrid/filter/selfiecam/n;->d:I

    aget-object v7, v5, v7

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-interface {v4, v7}, Lcom/roidapp/imagelib/filter/aq;->a(I)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v3

    .line 618
    if-nez v3, :cond_4

    :try_start_1
    new-instance v0, Ljava/lang/OutOfMemoryError;

    const-string v1, "load src bitmap failed!"

    invoke-direct {v0, v1}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 632
    :catch_0
    move-exception v0

    move-object v1, v3

    .line 633
    :goto_2
    :try_start_2
    invoke-static {v1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 634
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 635
    const-string v2, "SelfieCamImageShowActivity"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Meet OOM, side length="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v4, p0, Lcom/roidapp/photogrid/filter/selfiecam/n;->d:I

    aget-object v4, v5, v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 636
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 638
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/n;->b:Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->g(Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v2, 0x3fe

    const/4 v3, 0x0

    iget v4, p0, Lcom/roidapp/photogrid/filter/selfiecam/n;->d:I

    add-int/lit8 v4, v4, 0x1

    invoke-static {v0, v2, v3, v4}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    move-result-object v0

    .line 639
    iget-object v2, p0, Lcom/roidapp/photogrid/filter/selfiecam/n;->e:Lcom/roidapp/imagelib/filter/aq;

    iput-object v2, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 640
    iget-object v2, p0, Lcom/roidapp/photogrid/filter/selfiecam/n;->b:Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;

    invoke-static {v2}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->g(Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;)Landroid/os/Handler;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 659
    invoke-static {v1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 660
    invoke-static {}, Ljava/lang/System;->gc()V

    goto/16 :goto_0

    .line 608
    :cond_3
    const-string v0, ".jpg"

    goto :goto_1

    .line 619
    :cond_4
    :try_start_3
    const-string v4, "SelfieCamImageShowActivity"

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "load bitmap size width="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, ",height="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v4, v7}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 621
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v8

    .line 622
    const-string v4, "SelfieCamImageShowActivity"

    const-string v7, "process end, start to save."

    invoke-static {v4, v7}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 623
    if-eqz v6, :cond_5

    .line 624
    iget-object v4, p0, Lcom/roidapp/photogrid/filter/selfiecam/n;->a:Ljava/lang/String;

    sget-object v7, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-static {v3, v4, v0, v7}, Lcom/roidapp/imagelib/b/d;->a(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap$CompressFormat;)Landroid/net/Uri;

    move-result-object v0

    move-object v4, v0

    .line 630
    :goto_3
    const-string v0, "SelfieCamImageShowActivity"

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v10, "save bitmap size width="

    invoke-direct {v7, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v10

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v10, ",height="

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v10

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v0, v7}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 631
    const-string v0, "SelfieCamImageShowActivity"

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v10, "save to "

    invoke-direct {v7, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v10, ", save time="

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v10

    sub-long v8, v10, v8

    invoke-virtual {v7, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v0, v7}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 659
    invoke-static {v3}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 660
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 664
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/n;->b:Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->g(Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;)Landroid/os/Handler;

    move-result-object v3

    const/16 v5, 0x3ff

    if-eqz v6, :cond_6

    move v0, v1

    :goto_4
    invoke-static {v3, v5, v2, v0, v4}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 665
    iget-object v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/n;->b:Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;

    invoke-static {v1}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->g(Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto/16 :goto_0

    .line 627
    :cond_5
    :try_start_4
    iget-object v4, p0, Lcom/roidapp/photogrid/filter/selfiecam/n;->a:Ljava/lang/String;

    sget-object v7, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-static {v3, v4, v0, v7}, Lcom/roidapp/imagelib/b/d;->a(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap$CompressFormat;)Landroid/net/Uri;
    :try_end_4
    .catch Ljava/lang/OutOfMemoryError; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-result-object v0

    move-object v4, v0

    goto :goto_3

    .line 642
    :catch_1
    move-exception v0

    .line 643
    :try_start_5
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    .line 644
    iget-object v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/n;->b:Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;

    iget-object v2, p0, Lcom/roidapp/photogrid/filter/selfiecam/n;->a:Ljava/lang/String;

    invoke-static {v1, v0, v2}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->a(Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;Ljava/lang/Throwable;Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 659
    invoke-static {v3}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 660
    invoke-static {}, Ljava/lang/System;->gc()V

    goto/16 :goto_0

    .line 646
    :catch_2
    move-exception v0

    .line 647
    :try_start_6
    invoke-static {v3}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 648
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 649
    invoke-virtual {v0}, Ljava/lang/IllegalArgumentException;->printStackTrace()V

    .line 650
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/n;->b:Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->g(Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x3fe

    const/4 v2, 0x0

    iget v4, p0, Lcom/roidapp/photogrid/filter/selfiecam/n;->d:I

    add-int/lit8 v4, v4, 0x1

    invoke-static {v0, v1, v2, v4}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    move-result-object v0

    .line 651
    iget-object v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/n;->e:Lcom/roidapp/imagelib/filter/aq;

    iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 652
    iget-object v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/n;->b:Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;

    invoke-static {v1}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->g(Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 659
    invoke-static {v3}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 660
    invoke-static {}, Ljava/lang/System;->gc()V

    goto/16 :goto_0

    .line 654
    :catch_3
    move-exception v0

    .line 655
    :try_start_7
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 656
    iget-object v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/n;->b:Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;

    iget-object v2, p0, Lcom/roidapp/photogrid/filter/selfiecam/n;->a:Ljava/lang/String;

    invoke-static {v1, v0, v2}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->a(Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;Ljava/lang/Throwable;Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 659
    invoke-static {v3}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 660
    invoke-static {}, Ljava/lang/System;->gc()V

    goto/16 :goto_0

    .line 659
    :catchall_0
    move-exception v0

    :goto_5
    invoke-static {v3}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 660
    invoke-static {}, Ljava/lang/System;->gc()V

    throw v0

    :cond_6
    move v0, v2

    .line 664
    goto :goto_4

    .line 659
    :catchall_1
    move-exception v0

    move-object v3, v1

    goto :goto_5

    .line 632
    :catch_4
    move-exception v0

    move-object v1, v3

    goto/16 :goto_2
.end method
