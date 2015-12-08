.class public final Lcom/roidapp/imagelib/facedetector/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field protected a:Ljava/lang/String;

.field final synthetic b:Lcom/roidapp/imagelib/facedetector/a;


# direct methods
.method public constructor <init>(Lcom/roidapp/imagelib/facedetector/a;)V
    .locals 1

    .prologue
    .line 332
    iput-object p1, p0, Lcom/roidapp/imagelib/facedetector/f;->b:Lcom/roidapp/imagelib/facedetector/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 330
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/imagelib/facedetector/f;->a:Ljava/lang/String;

    .line 333
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    .line 337
    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/f;->b:Lcom/roidapp/imagelib/facedetector/a;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/roidapp/imagelib/facedetector/a;->a(Lcom/roidapp/imagelib/facedetector/a;Z)Z

    .line 341
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/facedetector/f;->a:Ljava/lang/String;

    .line 342
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/roidapp/imagelib/facedetector/f;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/Face"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/facedetector/f;->a:Ljava/lang/String;

    .line 343
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "face_"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".jpg"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 345
    const/4 v1, 0x0

    .line 347
    :try_start_0
    iget-object v2, p0, Lcom/roidapp/imagelib/facedetector/f;->b:Lcom/roidapp/imagelib/facedetector/a;

    invoke-static {v2}, Lcom/roidapp/imagelib/facedetector/a;->c(Lcom/roidapp/imagelib/facedetector/a;)Lcom/roidapp/imagelib/facedetector/LoadImageView;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/imagelib/facedetector/LoadImageView;->c()Landroid/graphics/Bitmap;

    move-result-object v1

    .line 351
    iget-object v2, p0, Lcom/roidapp/imagelib/facedetector/f;->b:Lcom/roidapp/imagelib/facedetector/a;

    invoke-virtual {v2}, Lcom/roidapp/imagelib/facedetector/a;->getActivity()Landroid/support/v4/app/FragmentActivity;

    iget-object v2, p0, Lcom/roidapp/imagelib/facedetector/f;->a:Ljava/lang/String;

    sget-object v3, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-static {v1, v2, v0, v3}, Lcom/roidapp/imagelib/b/d;->a(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap$CompressFormat;)Landroid/net/Uri;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 370
    invoke-static {v1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 371
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 374
    iget-object v1, p0, Lcom/roidapp/imagelib/facedetector/f;->b:Lcom/roidapp/imagelib/facedetector/a;

    invoke-static {v1}, Lcom/roidapp/imagelib/facedetector/a;->g(Lcom/roidapp/imagelib/facedetector/a;)Landroid/os/Handler;

    move-result-object v1

    const/4 v2, 0x3

    invoke-static {v1, v2, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 375
    iget-object v1, p0, Lcom/roidapp/imagelib/facedetector/f;->b:Lcom/roidapp/imagelib/facedetector/a;

    invoke-static {v1}, Lcom/roidapp/imagelib/facedetector/a;->g(Lcom/roidapp/imagelib/facedetector/a;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 376
    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/f;->b:Lcom/roidapp/imagelib/facedetector/a;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/roidapp/imagelib/facedetector/a;->a(Lcom/roidapp/imagelib/facedetector/a;Z)Z

    .line 377
    :goto_0
    return-void

    .line 353
    :catch_0
    move-exception v0

    .line 354
    :try_start_1
    invoke-static {v1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 355
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 356
    iget-object v2, p0, Lcom/roidapp/imagelib/facedetector/f;->b:Lcom/roidapp/imagelib/facedetector/a;

    iget-object v3, p0, Lcom/roidapp/imagelib/facedetector/f;->a:Ljava/lang/String;

    invoke-static {v2, v0, v3}, Lcom/roidapp/imagelib/facedetector/a;->a(Lcom/roidapp/imagelib/facedetector/a;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 357
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 370
    invoke-static {v1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 371
    invoke-static {}, Ljava/lang/System;->gc()V

    goto :goto_0

    .line 360
    :catch_1
    move-exception v0

    .line 362
    :try_start_2
    iget-object v2, p0, Lcom/roidapp/imagelib/facedetector/f;->b:Lcom/roidapp/imagelib/facedetector/a;

    iget-object v3, p0, Lcom/roidapp/imagelib/facedetector/f;->a:Ljava/lang/String;

    invoke-static {v2, v0, v3}, Lcom/roidapp/imagelib/facedetector/a;->a(Lcom/roidapp/imagelib/facedetector/a;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 363
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 370
    invoke-static {v1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 371
    invoke-static {}, Ljava/lang/System;->gc()V

    goto :goto_0

    .line 365
    :catch_2
    move-exception v0

    .line 366
    :try_start_3
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 367
    iget-object v2, p0, Lcom/roidapp/imagelib/facedetector/f;->b:Lcom/roidapp/imagelib/facedetector/a;

    iget-object v3, p0, Lcom/roidapp/imagelib/facedetector/f;->a:Ljava/lang/String;

    invoke-static {v2, v0, v3}, Lcom/roidapp/imagelib/facedetector/a;->a(Lcom/roidapp/imagelib/facedetector/a;Ljava/lang/Throwable;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 370
    invoke-static {v1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 371
    invoke-static {}, Ljava/lang/System;->gc()V

    goto :goto_0

    .line 370
    :catchall_0
    move-exception v0

    invoke-static {v1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 371
    invoke-static {}, Ljava/lang/System;->gc()V

    throw v0
.end method
