.class public final Lcom/roidapp/imagelib/freecrop/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field protected a:Ljava/lang/String;

.field final synthetic b:Lcom/roidapp/imagelib/freecrop/e;

.field private c:Z


# direct methods
.method public constructor <init>(Lcom/roidapp/imagelib/freecrop/e;Z)V
    .locals 1

    .prologue
    .line 494
    iput-object p1, p0, Lcom/roidapp/imagelib/freecrop/k;->b:Lcom/roidapp/imagelib/freecrop/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 492
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/k;->a:Ljava/lang/String;

    .line 495
    iput-boolean p2, p0, Lcom/roidapp/imagelib/freecrop/k;->c:Z

    .line 496
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 503
    invoke-static {}, Lcom/roidapp/imagelib/b/c;->a()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/roidapp/imagelib/freecrop/k;->a:Ljava/lang/String;

    .line 504
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/k;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/roidapp/imagelib/freecrop/k;->a:Ljava/lang/String;

    .line 505
    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/k;->a:Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 506
    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_0

    .line 507
    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 510
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "PhotoGrid_"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ".png"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 511
    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    .line 513
    iget-boolean v1, p0, Lcom/roidapp/imagelib/freecrop/k;->c:Z

    if-eqz v1, :cond_4

    .line 514
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/k;->b:Lcom/roidapp/imagelib/freecrop/e;

    invoke-static {v1}, Lcom/roidapp/imagelib/freecrop/e;->i(Lcom/roidapp/imagelib/freecrop/e;)Lcom/roidapp/imagelib/freecrop/d;

    move-result-object v1

    .line 518
    :goto_0
    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lcom/roidapp/imagelib/freecrop/l;->f()Landroid/graphics/Bitmap;

    move-result-object v1

    .line 520
    :goto_1
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v4

    if-eqz v4, :cond_9

    .line 521
    :cond_1
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/k;->b:Lcom/roidapp/imagelib/freecrop/e;

    invoke-static {v1}, Lcom/roidapp/imagelib/freecrop/e;->h(Lcom/roidapp/imagelib/freecrop/e;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 522
    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    move-object v5, v1

    move-object v1, v2

    move-object v2, v5

    .line 526
    :goto_2
    if-eqz v2, :cond_3

    .line 529
    :try_start_0
    iget-object v4, p0, Lcom/roidapp/imagelib/freecrop/k;->b:Lcom/roidapp/imagelib/freecrop/e;

    invoke-virtual {v4}, Lcom/roidapp/imagelib/freecrop/e;->getActivity()Landroid/support/v4/app/FragmentActivity;

    iget-object v4, p0, Lcom/roidapp/imagelib/freecrop/k;->a:Ljava/lang/String;

    invoke-static {v2, v4, v3, v1}, Lcom/roidapp/imagelib/b/d;->a(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap$CompressFormat;)Landroid/net/Uri;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 540
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/k;->b:Lcom/roidapp/imagelib/freecrop/e;

    invoke-static {v1}, Lcom/roidapp/imagelib/freecrop/e;->h(Lcom/roidapp/imagelib/freecrop/e;)Landroid/graphics/Bitmap;

    move-result-object v1

    if-eq v2, v1, :cond_2

    .line 541
    invoke-static {v2}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 542
    :cond_2
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/k;->b:Lcom/roidapp/imagelib/freecrop/e;

    invoke-static {v1}, Lcom/roidapp/imagelib/freecrop/e;->h(Lcom/roidapp/imagelib/freecrop/e;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-static {v1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 543
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 548
    :cond_3
    :goto_3
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/k;->b:Lcom/roidapp/imagelib/freecrop/e;

    invoke-static {v1}, Lcom/roidapp/imagelib/freecrop/e;->l(Lcom/roidapp/imagelib/freecrop/e;)Landroid/os/Handler;

    move-result-object v1

    const/16 v2, 0x401

    invoke-static {v1, v2, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 549
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/k;->b:Lcom/roidapp/imagelib/freecrop/e;

    invoke-static {v1}, Lcom/roidapp/imagelib/freecrop/e;->l(Lcom/roidapp/imagelib/freecrop/e;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 551
    :goto_4
    return-void

    .line 516
    :cond_4
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/k;->b:Lcom/roidapp/imagelib/freecrop/e;

    invoke-static {v1}, Lcom/roidapp/imagelib/freecrop/e;->m(Lcom/roidapp/imagelib/freecrop/e;)Lcom/roidapp/imagelib/freecrop/n;

    move-result-object v1

    goto :goto_0

    :cond_5
    move-object v1, v0

    .line 518
    goto :goto_1

    .line 531
    :catch_0
    move-exception v1

    .line 533
    :try_start_1
    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/k;->b:Lcom/roidapp/imagelib/freecrop/e;

    iget-object v4, p0, Lcom/roidapp/imagelib/freecrop/k;->a:Ljava/lang/String;

    invoke-static {v3, v1, v4}, Lcom/roidapp/imagelib/freecrop/e;->a(Lcom/roidapp/imagelib/freecrop/e;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 534
    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 540
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/k;->b:Lcom/roidapp/imagelib/freecrop/e;

    invoke-static {v1}, Lcom/roidapp/imagelib/freecrop/e;->h(Lcom/roidapp/imagelib/freecrop/e;)Landroid/graphics/Bitmap;

    move-result-object v1

    if-eq v2, v1, :cond_6

    .line 541
    invoke-static {v2}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 542
    :cond_6
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/k;->b:Lcom/roidapp/imagelib/freecrop/e;

    invoke-static {v1}, Lcom/roidapp/imagelib/freecrop/e;->h(Lcom/roidapp/imagelib/freecrop/e;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-static {v1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 543
    invoke-static {}, Ljava/lang/System;->gc()V

    goto :goto_3

    .line 535
    :catch_1
    move-exception v0

    .line 536
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 537
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/k;->b:Lcom/roidapp/imagelib/freecrop/e;

    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/k;->a:Ljava/lang/String;

    invoke-static {v1, v0, v3}, Lcom/roidapp/imagelib/freecrop/e;->a(Lcom/roidapp/imagelib/freecrop/e;Ljava/lang/Throwable;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 540
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/k;->b:Lcom/roidapp/imagelib/freecrop/e;

    invoke-static {v0}, Lcom/roidapp/imagelib/freecrop/e;->h(Lcom/roidapp/imagelib/freecrop/e;)Landroid/graphics/Bitmap;

    move-result-object v0

    if-eq v2, v0, :cond_7

    .line 541
    invoke-static {v2}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 542
    :cond_7
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/k;->b:Lcom/roidapp/imagelib/freecrop/e;

    invoke-static {v0}, Lcom/roidapp/imagelib/freecrop/e;->h(Lcom/roidapp/imagelib/freecrop/e;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 543
    invoke-static {}, Ljava/lang/System;->gc()V

    goto :goto_4

    .line 540
    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/k;->b:Lcom/roidapp/imagelib/freecrop/e;

    invoke-static {v1}, Lcom/roidapp/imagelib/freecrop/e;->h(Lcom/roidapp/imagelib/freecrop/e;)Landroid/graphics/Bitmap;

    move-result-object v1

    if-eq v2, v1, :cond_8

    .line 541
    invoke-static {v2}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 542
    :cond_8
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/k;->b:Lcom/roidapp/imagelib/freecrop/e;

    invoke-static {v1}, Lcom/roidapp/imagelib/freecrop/e;->h(Lcom/roidapp/imagelib/freecrop/e;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-static {v1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 543
    invoke-static {}, Ljava/lang/System;->gc()V

    throw v0

    :cond_9
    move-object v5, v1

    move-object v1, v2

    move-object v2, v5

    goto/16 :goto_2
.end method
