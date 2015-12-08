.class final Lcom/roidapp/imagelib/retouch/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/retouch/a;

.field private b:Landroid/graphics/Bitmap;

.field private c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/roidapp/imagelib/retouch/a;Landroid/graphics/Bitmap;)V
    .locals 1

    .prologue
    .line 514
    iput-object p1, p0, Lcom/roidapp/imagelib/retouch/g;->a:Lcom/roidapp/imagelib/retouch/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 511
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/g;->c:Ljava/lang/String;

    .line 515
    iput-object p2, p0, Lcom/roidapp/imagelib/retouch/g;->b:Landroid/graphics/Bitmap;

    .line 516
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .prologue
    .line 520
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/g;->a:Lcom/roidapp/imagelib/retouch/a;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/retouch/a;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-nez v0, :cond_1

    .line 521
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/g;->a:Lcom/roidapp/imagelib/retouch/a;

    new-instance v1, Ljava/lang/Exception;

    const-string v2, "activity is finish"

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    const-string v2, ""

    invoke-static {v0, v1, v2}, Lcom/roidapp/imagelib/retouch/a;->a(Lcom/roidapp/imagelib/retouch/a;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 550
    :cond_0
    :goto_0
    return-void

    .line 524
    :cond_1
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/g;->b:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/g;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 528
    const/4 v0, 0x0

    .line 529
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "PhotoGrid_"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ".jpg"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 530
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v2

    iget-object v3, p0, Lcom/roidapp/imagelib/retouch/g;->a:Lcom/roidapp/imagelib/retouch/a;

    invoke-virtual {v3}, Lcom/roidapp/imagelib/retouch/a;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/roidapp/imagelib/ImageLibrary;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/roidapp/imagelib/retouch/g;->c:Ljava/lang/String;

    .line 531
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/roidapp/imagelib/retouch/g;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/roidapp/imagelib/retouch/g;->c:Ljava/lang/String;

    .line 533
    :try_start_0
    iget-object v2, p0, Lcom/roidapp/imagelib/retouch/g;->a:Lcom/roidapp/imagelib/retouch/a;

    invoke-virtual {v2}, Lcom/roidapp/imagelib/retouch/a;->getActivity()Landroid/support/v4/app/FragmentActivity;

    iget-object v2, p0, Lcom/roidapp/imagelib/retouch/g;->b:Landroid/graphics/Bitmap;

    iget-object v3, p0, Lcom/roidapp/imagelib/retouch/g;->c:Ljava/lang/String;

    sget-object v4, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-static {v2, v3, v1, v4}, Lcom/roidapp/imagelib/b/d;->a(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap$CompressFormat;)Landroid/net/Uri;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 544
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/g;->a:Lcom/roidapp/imagelib/retouch/a;

    invoke-static {v1}, Lcom/roidapp/imagelib/retouch/a;->d(Lcom/roidapp/imagelib/retouch/a;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-static {v1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 545
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/g;->b:Landroid/graphics/Bitmap;

    invoke-static {v1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 546
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 548
    :goto_1
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/g;->a:Lcom/roidapp/imagelib/retouch/a;

    invoke-static {v1}, Lcom/roidapp/imagelib/retouch/a;->h(Lcom/roidapp/imagelib/retouch/a;)Landroid/os/Handler;

    move-result-object v1

    const/4 v2, 0x3

    invoke-static {v1, v2, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 549
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/g;->a:Lcom/roidapp/imagelib/retouch/a;

    invoke-static {v1}, Lcom/roidapp/imagelib/retouch/a;->h(Lcom/roidapp/imagelib/retouch/a;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto/16 :goto_0

    .line 535
    :catch_0
    move-exception v1

    .line 537
    :try_start_1
    iget-object v2, p0, Lcom/roidapp/imagelib/retouch/g;->a:Lcom/roidapp/imagelib/retouch/a;

    iget-object v3, p0, Lcom/roidapp/imagelib/retouch/g;->c:Ljava/lang/String;

    invoke-static {v2, v1, v3}, Lcom/roidapp/imagelib/retouch/a;->a(Lcom/roidapp/imagelib/retouch/a;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 538
    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 544
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/g;->a:Lcom/roidapp/imagelib/retouch/a;

    invoke-static {v1}, Lcom/roidapp/imagelib/retouch/a;->d(Lcom/roidapp/imagelib/retouch/a;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-static {v1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 545
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/g;->b:Landroid/graphics/Bitmap;

    invoke-static {v1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 546
    invoke-static {}, Ljava/lang/System;->gc()V

    goto :goto_1

    .line 539
    :catch_1
    move-exception v0

    .line 540
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 541
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/g;->a:Lcom/roidapp/imagelib/retouch/a;

    iget-object v2, p0, Lcom/roidapp/imagelib/retouch/g;->c:Ljava/lang/String;

    invoke-static {v1, v0, v2}, Lcom/roidapp/imagelib/retouch/a;->a(Lcom/roidapp/imagelib/retouch/a;Ljava/lang/Throwable;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 544
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/g;->a:Lcom/roidapp/imagelib/retouch/a;

    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/a;->d(Lcom/roidapp/imagelib/retouch/a;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 545
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/g;->b:Landroid/graphics/Bitmap;

    invoke-static {v0}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 546
    invoke-static {}, Ljava/lang/System;->gc()V

    goto/16 :goto_0

    .line 544
    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/g;->a:Lcom/roidapp/imagelib/retouch/a;

    invoke-static {v1}, Lcom/roidapp/imagelib/retouch/a;->d(Lcom/roidapp/imagelib/retouch/a;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-static {v1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 545
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/g;->b:Landroid/graphics/Bitmap;

    invoke-static {v1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 546
    invoke-static {}, Ljava/lang/System;->gc()V

    throw v0
.end method
