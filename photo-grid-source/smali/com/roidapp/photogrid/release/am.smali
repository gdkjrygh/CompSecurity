.class public final Lcom/roidapp/photogrid/release/am;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field protected a:Ljava/lang/String;

.field final synthetic b:Lcom/roidapp/photogrid/release/BackgroundImageCrop;


# direct methods
.method public constructor <init>(Lcom/roidapp/photogrid/release/BackgroundImageCrop;)V
    .locals 1

    .prologue
    .line 605
    iput-object p1, p0, Lcom/roidapp/photogrid/release/am;->b:Lcom/roidapp/photogrid/release/BackgroundImageCrop;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 603
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/photogrid/release/am;->a:Ljava/lang/String;

    .line 606
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 613
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    iget-object v2, p0, Lcom/roidapp/photogrid/release/am;->b:Lcom/roidapp/photogrid/release/BackgroundImageCrop;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->h(Lcom/roidapp/photogrid/release/BackgroundImageCrop;)Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/roidapp/imagelib/ImageLibrary;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/am;->a:Ljava/lang/String;

    .line 614
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/roidapp/photogrid/release/am;->a:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/am;->a:Ljava/lang/String;

    .line 616
    new-instance v0, Ljava/io/File;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/am;->a:Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 617
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 619
    invoke-virtual {v0}, Ljava/io/File;->list()[Ljava/lang/String;

    move-result-object v2

    .line 620
    if-eqz v2, :cond_1

    move v0, v1

    .line 622
    :goto_0
    array-length v3, v2

    if-ge v0, v3, :cond_1

    .line 623
    new-instance v3, Ljava/io/File;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Lcom/roidapp/photogrid/release/am;->a:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    sget-object v5, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    aget-object v5, v2, v0

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 624
    invoke-virtual {v3}, Ljava/io/File;->isFile()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 625
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 622
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 631
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, ".PhotoGrid_"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ".jpg"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 635
    const/4 v2, 0x0

    .line 637
    :try_start_0
    iget-object v3, p0, Lcom/roidapp/photogrid/release/am;->b:Lcom/roidapp/photogrid/release/BackgroundImageCrop;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->i(Lcom/roidapp/photogrid/release/BackgroundImageCrop;)Lcom/roidapp/imagelib/crop/a;

    move-result-object v3

    iget-object v4, p0, Lcom/roidapp/photogrid/release/am;->b:Lcom/roidapp/photogrid/release/BackgroundImageCrop;

    invoke-static {v4}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->b(Lcom/roidapp/photogrid/release/BackgroundImageCrop;)Landroid/graphics/Bitmap;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/roidapp/imagelib/crop/a;->c(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v2

    .line 638
    :try_start_1
    iget-object v3, p0, Lcom/roidapp/photogrid/release/am;->b:Lcom/roidapp/photogrid/release/BackgroundImageCrop;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->i(Lcom/roidapp/photogrid/release/BackgroundImageCrop;)Lcom/roidapp/imagelib/crop/a;

    move-result-object v3

    iget-object v3, v3, Lcom/roidapp/imagelib/crop/a;->d:Lcom/roidapp/imagelib/crop/h;

    if-eqz v3, :cond_2

    .line 639
    iget-object v3, p0, Lcom/roidapp/photogrid/release/am;->b:Lcom/roidapp/photogrid/release/BackgroundImageCrop;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->b(Lcom/roidapp/photogrid/release/BackgroundImageCrop;)Landroid/graphics/Bitmap;

    move-result-object v3

    invoke-static {v3}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 640
    :cond_2
    iget-object v3, p0, Lcom/roidapp/photogrid/release/am;->a:Ljava/lang/String;

    sget-object v4, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-static {v2, v3, v0, v4}, Lcom/roidapp/imagelib/b/d;->a(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap$CompressFormat;)Landroid/net/Uri;
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    .line 658
    invoke-static {v2}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 659
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 661
    iget-object v2, p0, Lcom/roidapp/photogrid/release/am;->b:Lcom/roidapp/photogrid/release/BackgroundImageCrop;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->g(Lcom/roidapp/photogrid/release/BackgroundImageCrop;)Landroid/os/Handler;

    move-result-object v2

    const/4 v3, 0x3

    invoke-static {v2, v3, v1, v1, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 662
    iget-object v1, p0, Lcom/roidapp/photogrid/release/am;->b:Lcom/roidapp/photogrid/release/BackgroundImageCrop;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->g(Lcom/roidapp/photogrid/release/BackgroundImageCrop;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 663
    :goto_1
    return-void

    .line 642
    :catch_0
    move-exception v0

    move-object v1, v2

    .line 643
    :goto_2
    :try_start_2
    invoke-static {v1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 644
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 645
    iget-object v2, p0, Lcom/roidapp/photogrid/release/am;->b:Lcom/roidapp/photogrid/release/BackgroundImageCrop;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->g(Lcom/roidapp/photogrid/release/BackgroundImageCrop;)Landroid/os/Handler;

    move-result-object v2

    const/4 v3, 0x5

    new-instance v4, Ljava/lang/OutOfMemoryError;

    const-string v5, "Out Of Memory"

    invoke-direct {v4, v5}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3, v4}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v2

    invoke-virtual {v2}, Landroid/os/Message;->sendToTarget()V

    .line 646
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 658
    invoke-static {v1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 659
    invoke-static {}, Ljava/lang/System;->gc()V

    goto :goto_1

    .line 648
    :catch_1
    move-exception v0

    .line 650
    :try_start_3
    iget-object v1, p0, Lcom/roidapp/photogrid/release/am;->b:Lcom/roidapp/photogrid/release/BackgroundImageCrop;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->g(Lcom/roidapp/photogrid/release/BackgroundImageCrop;)Landroid/os/Handler;

    move-result-object v1

    const/4 v3, 0x5

    new-instance v4, Ljava/io/IOException;

    const-string v5, "IOException"

    invoke-direct {v4, v5}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3, v4}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Message;->sendToTarget()V

    .line 651
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 658
    invoke-static {v2}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 659
    invoke-static {}, Ljava/lang/System;->gc()V

    goto :goto_1

    .line 654
    :catch_2
    move-exception v0

    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 655
    iget-object v0, p0, Lcom/roidapp/photogrid/release/am;->b:Lcom/roidapp/photogrid/release/BackgroundImageCrop;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->g(Lcom/roidapp/photogrid/release/BackgroundImageCrop;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x5

    new-instance v3, Ljava/lang/Exception;

    const-string v4, ""

    invoke-direct {v3, v4}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 658
    invoke-static {v2}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 659
    invoke-static {}, Ljava/lang/System;->gc()V

    goto :goto_1

    .line 658
    :catchall_0
    move-exception v0

    :goto_3
    invoke-static {v2}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 659
    invoke-static {}, Ljava/lang/System;->gc()V

    throw v0

    .line 658
    :catchall_1
    move-exception v0

    move-object v2, v1

    goto :goto_3

    .line 642
    :catch_3
    move-exception v0

    move-object v1, v2

    goto :goto_2
.end method
