.class final Lcom/roidapp/imagelib/facedetector/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/facedetector/a;

.field private final b:Ljava/lang/String;

.field private c:I

.field private d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/roidapp/imagelib/facedetector/a;Ljava/lang/String;I)V
    .locals 1

    .prologue
    .line 267
    iput-object p1, p0, Lcom/roidapp/imagelib/facedetector/d;->a:Lcom/roidapp/imagelib/facedetector/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 263
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/imagelib/facedetector/d;->c:I

    .line 264
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/imagelib/facedetector/d;->d:Ljava/lang/String;

    .line 268
    iput-object p2, p0, Lcom/roidapp/imagelib/facedetector/d;->b:Ljava/lang/String;

    .line 269
    iput p3, p0, Lcom/roidapp/imagelib/facedetector/d;->c:I

    .line 270
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .prologue
    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v6, 0x0

    .line 275
    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/d;->a:Lcom/roidapp/imagelib/facedetector/a;

    invoke-static {v0, v2}, Lcom/roidapp/imagelib/facedetector/a;->a(Lcom/roidapp/imagelib/facedetector/a;Z)Z

    .line 278
    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/d;->a:Lcom/roidapp/imagelib/facedetector/a;

    invoke-static {v0}, Lcom/roidapp/imagelib/facedetector/a;->f(Lcom/roidapp/imagelib/facedetector/a;)[Ljava/lang/Integer;

    move-result-object v0

    array-length v0, v0

    if-nez v0, :cond_0

    .line 279
    const-string v0, "ImagePreviewFragment"

    const-string v1, "genMinLengths length 0"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 280
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v1, "ImageEditCropFragment/genMinLengths length 0"

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 281
    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/d;->a:Lcom/roidapp/imagelib/facedetector/a;

    new-instance v1, Ljava/lang/Exception;

    const-string v2, "The load length array is 0."

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/roidapp/imagelib/facedetector/d;->d:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/roidapp/imagelib/facedetector/a;->a(Lcom/roidapp/imagelib/facedetector/a;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 323
    :goto_0
    return-void

    .line 285
    :cond_0
    iget v0, p0, Lcom/roidapp/imagelib/facedetector/d;->c:I

    iget-object v2, p0, Lcom/roidapp/imagelib/facedetector/d;->a:Lcom/roidapp/imagelib/facedetector/a;

    invoke-static {v2}, Lcom/roidapp/imagelib/facedetector/a;->f(Lcom/roidapp/imagelib/facedetector/a;)[Ljava/lang/Integer;

    move-result-object v2

    array-length v2, v2

    if-lt v0, v2, :cond_1

    .line 286
    const-string v0, "ImagePreviewFragment"

    const-string v1, "final OOM !!!"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 287
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v1, "ImageEditCropFragment/SaveOOM"

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 288
    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/d;->a:Lcom/roidapp/imagelib/facedetector/a;

    new-instance v1, Ljava/lang/OutOfMemoryError;

    const-string v2, "Out Of Memory"

    invoke-direct {v1, v2}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/roidapp/imagelib/facedetector/d;->d:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/roidapp/imagelib/facedetector/a;->a(Lcom/roidapp/imagelib/facedetector/a;Ljava/lang/Throwable;Ljava/lang/String;)V

    goto :goto_0

    .line 294
    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/d;->a:Lcom/roidapp/imagelib/facedetector/a;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/facedetector/a;->getActivity()Landroid/support/v4/app/FragmentActivity;

    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/d;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/roidapp/imagelib/facedetector/d;->a:Lcom/roidapp/imagelib/facedetector/a;

    invoke-static {v2}, Lcom/roidapp/imagelib/facedetector/a;->f(Lcom/roidapp/imagelib/facedetector/a;)[Ljava/lang/Integer;

    move-result-object v2

    iget v3, p0, Lcom/roidapp/imagelib/facedetector/d;->c:I

    aget-object v2, v2, v3

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object v3, p0, Lcom/roidapp/imagelib/facedetector/d;->a:Lcom/roidapp/imagelib/facedetector/a;

    invoke-static {v3}, Lcom/roidapp/imagelib/facedetector/a;->f(Lcom/roidapp/imagelib/facedetector/a;)[Ljava/lang/Integer;

    move-result-object v3

    iget v4, p0, Lcom/roidapp/imagelib/facedetector/d;->c:I

    aget-object v3, v3, v4

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iget-object v4, p0, Lcom/roidapp/imagelib/facedetector/d;->a:Lcom/roidapp/imagelib/facedetector/a;

    invoke-static {v4}, Lcom/roidapp/imagelib/facedetector/a;->f(Lcom/roidapp/imagelib/facedetector/a;)[Ljava/lang/Integer;

    move-result-object v4

    iget v5, p0, Lcom/roidapp/imagelib/facedetector/d;->c:I

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

    .line 298
    :try_start_1
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v3, v4}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 302
    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/d;->a:Lcom/roidapp/imagelib/facedetector/a;

    invoke-static {v0}, Lcom/roidapp/imagelib/facedetector/a;->g(Lcom/roidapp/imagelib/facedetector/a;)Landroid/os/Handler;

    move-result-object v0

    const/4 v3, 0x1

    invoke-virtual {v0, v3, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 316
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_2

    .line 317
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 320
    :cond_2
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 322
    :goto_1
    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/d;->a:Lcom/roidapp/imagelib/facedetector/a;

    invoke-static {v0, v6}, Lcom/roidapp/imagelib/facedetector/a;->a(Lcom/roidapp/imagelib/facedetector/a;Z)Z

    goto/16 :goto_0

    .line 303
    :catch_0
    move-exception v0

    move-object v2, v1

    .line 304
    :goto_2
    :try_start_2
    invoke-static {v2}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 305
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 306
    const-string v2, "ImagePreviewFragment"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Meet OOM, side length="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Lcom/roidapp/imagelib/facedetector/d;->a:Lcom/roidapp/imagelib/facedetector/a;

    invoke-static {v4}, Lcom/roidapp/imagelib/facedetector/a;->f(Lcom/roidapp/imagelib/facedetector/a;)[Ljava/lang/Integer;

    move-result-object v4

    iget v5, p0, Lcom/roidapp/imagelib/facedetector/d;->c:I

    aget-object v4, v4, v5

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 307
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 308
    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/d;->a:Lcom/roidapp/imagelib/facedetector/a;

    invoke-static {v0}, Lcom/roidapp/imagelib/facedetector/a;->g(Lcom/roidapp/imagelib/facedetector/a;)Landroid/os/Handler;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    iget v4, p0, Lcom/roidapp/imagelib/facedetector/d;->c:I

    add-int/lit8 v4, v4, 0x1

    invoke-static {v0, v2, v3, v4}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    move-result-object v0

    .line 309
    iget-object v2, p0, Lcom/roidapp/imagelib/facedetector/d;->a:Lcom/roidapp/imagelib/facedetector/a;

    invoke-static {v2}, Lcom/roidapp/imagelib/facedetector/a;->g(Lcom/roidapp/imagelib/facedetector/a;)Landroid/os/Handler;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 316
    if-eqz v1, :cond_3

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_3

    .line 317
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 320
    :cond_3
    invoke-static {}, Ljava/lang/System;->gc()V

    goto :goto_1

    .line 310
    :catch_1
    move-exception v0

    move-object v2, v1

    .line 311
    :goto_3
    :try_start_3
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 312
    invoke-static {v2}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 313
    iget-object v2, p0, Lcom/roidapp/imagelib/facedetector/d;->a:Lcom/roidapp/imagelib/facedetector/a;

    iget-object v3, p0, Lcom/roidapp/imagelib/facedetector/d;->d:Ljava/lang/String;

    invoke-static {v2, v0, v3}, Lcom/roidapp/imagelib/facedetector/a;->a(Lcom/roidapp/imagelib/facedetector/a;Ljava/lang/Throwable;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 316
    if-eqz v1, :cond_4

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_4

    .line 317
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 320
    :cond_4
    invoke-static {}, Ljava/lang/System;->gc()V

    goto/16 :goto_0

    .line 316
    :catchall_0
    move-exception v0

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v2

    if-nez v2, :cond_5

    .line 317
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 320
    :cond_5
    invoke-static {}, Ljava/lang/System;->gc()V

    throw v0

    .line 310
    :catch_2
    move-exception v0

    goto :goto_3

    .line 303
    :catch_3
    move-exception v0

    goto/16 :goto_2
.end method
