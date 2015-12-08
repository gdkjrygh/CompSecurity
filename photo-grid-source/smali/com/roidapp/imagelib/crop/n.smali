.class final Lcom/roidapp/imagelib/crop/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/crop/j;

.field private final b:Ljava/lang/String;

.field private c:I

.field private d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/roidapp/imagelib/crop/j;Ljava/lang/String;I)V
    .locals 1

    .prologue
    .line 810
    iput-object p1, p0, Lcom/roidapp/imagelib/crop/n;->a:Lcom/roidapp/imagelib/crop/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 806
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/imagelib/crop/n;->c:I

    .line 807
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/imagelib/crop/n;->d:Ljava/lang/String;

    .line 811
    iput-object p2, p0, Lcom/roidapp/imagelib/crop/n;->b:Ljava/lang/String;

    .line 812
    iput p3, p0, Lcom/roidapp/imagelib/crop/n;->c:I

    .line 813
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .prologue
    const/4 v1, 0x0

    const-wide v6, 0x3ff3333333333333L    # 1.2

    .line 819
    .line 821
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/n;->a:Lcom/roidapp/imagelib/crop/j;

    iget-object v0, v0, Lcom/roidapp/imagelib/crop/j;->i:[Ljava/lang/Integer;

    array-length v0, v0

    if-nez v0, :cond_0

    .line 822
    const-string v0, "ImageEditCropFragment"

    const-string v1, "genMinLengths length 0"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 823
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v1, "ImageEditCropFragment/genMinLengths length 0"

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 824
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/n;->a:Lcom/roidapp/imagelib/crop/j;

    new-instance v1, Ljava/lang/Exception;

    const-string v2, "The load length array is 0."

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/roidapp/imagelib/crop/n;->d:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/j;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 891
    :goto_0
    return-void

    .line 828
    :cond_0
    iget v0, p0, Lcom/roidapp/imagelib/crop/n;->c:I

    iget-object v2, p0, Lcom/roidapp/imagelib/crop/n;->a:Lcom/roidapp/imagelib/crop/j;

    iget-object v2, v2, Lcom/roidapp/imagelib/crop/j;->i:[Ljava/lang/Integer;

    array-length v2, v2

    if-lt v0, v2, :cond_1

    .line 829
    const-string v0, "ImageEditCropFragment"

    const-string v1, "final OOM !!!"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 830
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v1, "ImageEditCropFragment/SaveOOM"

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 831
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/n;->a:Lcom/roidapp/imagelib/crop/j;

    new-instance v1, Ljava/lang/OutOfMemoryError;

    const-string v2, "Out Of Memory"

    invoke-direct {v1, v2}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/roidapp/imagelib/crop/n;->d:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/j;Ljava/lang/Throwable;Ljava/lang/String;)V

    goto :goto_0

    .line 837
    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/n;->a:Lcom/roidapp/imagelib/crop/j;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/crop/j;->getActivity()Landroid/support/v4/app/FragmentActivity;

    iget-object v0, p0, Lcom/roidapp/imagelib/crop/n;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/roidapp/imagelib/crop/n;->a:Lcom/roidapp/imagelib/crop/j;

    iget-object v2, v2, Lcom/roidapp/imagelib/crop/j;->i:[Ljava/lang/Integer;

    iget v3, p0, Lcom/roidapp/imagelib/crop/n;->c:I

    aget-object v2, v2, v3

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object v3, p0, Lcom/roidapp/imagelib/crop/n;->a:Lcom/roidapp/imagelib/crop/j;

    iget-object v3, v3, Lcom/roidapp/imagelib/crop/j;->i:[Ljava/lang/Integer;

    iget v4, p0, Lcom/roidapp/imagelib/crop/n;->c:I

    aget-object v3, v3, v4

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iget-object v4, p0, Lcom/roidapp/imagelib/crop/n;->a:Lcom/roidapp/imagelib/crop/j;

    iget-object v4, v4, Lcom/roidapp/imagelib/crop/j;->i:[Ljava/lang/Integer;

    iget v5, p0, Lcom/roidapp/imagelib/crop/n;->c:I

    aget-object v4, v4, v5

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    mul-int/2addr v3, v4

    invoke-static {v0, v2, v3}, Lcom/roidapp/imagelib/b/d;->a(Ljava/lang/String;II)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v2

    .line 841
    :try_start_1
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/n;->a:Lcom/roidapp/imagelib/crop/j;

    invoke-static {v0}, Lcom/roidapp/imagelib/crop/j;->i(Lcom/roidapp/imagelib/crop/j;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/roidapp/imagelib/crop/n;->a:Lcom/roidapp/imagelib/crop/j;

    invoke-static {v0}, Lcom/roidapp/imagelib/crop/j;->j(Lcom/roidapp/imagelib/crop/j;)Lcom/roidapp/imagelib/filter/bi;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 843
    new-instance v0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    invoke-direct {v0, v3, v4}, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;-><init>(II)V

    .line 845
    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->destroyEGL()V

    .line 848
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    mul-int/lit8 v3, v3, 0x2

    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v3, v4}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 859
    :goto_1
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/n;->a:Lcom/roidapp/imagelib/crop/j;

    invoke-static {v0}, Lcom/roidapp/imagelib/crop/j;->h(Lcom/roidapp/imagelib/crop/j;)Landroid/os/Handler;

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

    .line 885
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_2

    .line 886
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 890
    :cond_2
    invoke-static {}, Ljava/lang/System;->gc()V

    goto/16 :goto_0

    .line 853
    :cond_3
    :try_start_2
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
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_7
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_6
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_4
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v1

    goto :goto_1

    .line 860
    :catch_0
    move-exception v0

    move-object v2, v1

    .line 861
    :goto_2
    :try_start_3
    invoke-static {v2}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 862
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 863
    const-string v2, "ImageEditCropFragment"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Meet OOM, side length="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Lcom/roidapp/imagelib/crop/n;->a:Lcom/roidapp/imagelib/crop/j;

    iget-object v4, v4, Lcom/roidapp/imagelib/crop/j;->i:[Ljava/lang/Integer;

    iget v5, p0, Lcom/roidapp/imagelib/crop/n;->c:I

    aget-object v4, v4, v5

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 864
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 865
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/n;->a:Lcom/roidapp/imagelib/crop/j;

    invoke-static {v0}, Lcom/roidapp/imagelib/crop/j;->h(Lcom/roidapp/imagelib/crop/j;)Landroid/os/Handler;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    iget v4, p0, Lcom/roidapp/imagelib/crop/n;->c:I

    add-int/lit8 v4, v4, 0x1

    invoke-static {v0, v2, v3, v4}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    move-result-object v0

    .line 866
    iget-object v2, p0, Lcom/roidapp/imagelib/crop/n;->a:Lcom/roidapp/imagelib/crop/j;

    invoke-static {v2}, Lcom/roidapp/imagelib/crop/j;->h(Lcom/roidapp/imagelib/crop/j;)Landroid/os/Handler;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 885
    if-eqz v1, :cond_4

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_4

    .line 886
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 890
    :cond_4
    invoke-static {}, Ljava/lang/System;->gc()V

    goto/16 :goto_0

    .line 867
    :catch_1
    move-exception v0

    move-object v2, v1

    .line 868
    :goto_3
    :try_start_4
    invoke-static {v2}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 869
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 870
    invoke-virtual {v0}, Ljava/lang/IllegalArgumentException;->printStackTrace()V

    .line 871
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/n;->a:Lcom/roidapp/imagelib/crop/j;

    invoke-static {v0}, Lcom/roidapp/imagelib/crop/j;->h(Lcom/roidapp/imagelib/crop/j;)Landroid/os/Handler;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    iget v4, p0, Lcom/roidapp/imagelib/crop/n;->c:I

    add-int/lit8 v4, v4, 0x1

    invoke-static {v0, v2, v3, v4}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    move-result-object v0

    .line 872
    iget-object v2, p0, Lcom/roidapp/imagelib/crop/n;->a:Lcom/roidapp/imagelib/crop/j;

    invoke-static {v2}, Lcom/roidapp/imagelib/crop/j;->h(Lcom/roidapp/imagelib/crop/j;)Landroid/os/Handler;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 885
    if-eqz v1, :cond_5

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_5

    .line 886
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 890
    :cond_5
    invoke-static {}, Ljava/lang/System;->gc()V

    goto/16 :goto_0

    .line 874
    :catch_2
    move-exception v0

    move-object v2, v1

    :goto_4
    :try_start_5
    invoke-virtual {v0}, Ljava/lang/NullPointerException;->printStackTrace()V

    .line 875
    invoke-static {v2}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 876
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 877
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/n;->a:Lcom/roidapp/imagelib/crop/j;

    invoke-static {v0}, Lcom/roidapp/imagelib/crop/j;->h(Lcom/roidapp/imagelib/crop/j;)Landroid/os/Handler;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    iget v4, p0, Lcom/roidapp/imagelib/crop/n;->c:I

    add-int/lit8 v4, v4, 0x1

    invoke-static {v0, v2, v3, v4}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    move-result-object v0

    .line 878
    iget-object v2, p0, Lcom/roidapp/imagelib/crop/n;->a:Lcom/roidapp/imagelib/crop/j;

    invoke-static {v2}, Lcom/roidapp/imagelib/crop/j;->h(Lcom/roidapp/imagelib/crop/j;)Landroid/os/Handler;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 885
    if-eqz v1, :cond_6

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_6

    .line 886
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 890
    :cond_6
    invoke-static {}, Ljava/lang/System;->gc()V

    goto/16 :goto_0

    .line 879
    :catch_3
    move-exception v0

    move-object v2, v1

    .line 880
    :goto_5
    :try_start_6
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 881
    invoke-static {v2}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 882
    iget-object v2, p0, Lcom/roidapp/imagelib/crop/n;->a:Lcom/roidapp/imagelib/crop/j;

    iget-object v3, p0, Lcom/roidapp/imagelib/crop/n;->d:Ljava/lang/String;

    invoke-static {v2, v0, v3}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/j;Ljava/lang/Throwable;Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 885
    if-eqz v1, :cond_7

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_7

    .line 886
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 890
    :cond_7
    invoke-static {}, Ljava/lang/System;->gc()V

    goto/16 :goto_0

    .line 885
    :catchall_0
    move-exception v0

    if-eqz v1, :cond_8

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v2

    if-nez v2, :cond_8

    .line 886
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 890
    :cond_8
    invoke-static {}, Ljava/lang/System;->gc()V

    throw v0

    .line 879
    :catch_4
    move-exception v0

    goto :goto_5

    .line 874
    :catch_5
    move-exception v0

    goto :goto_4

    .line 867
    :catch_6
    move-exception v0

    goto/16 :goto_3

    .line 860
    :catch_7
    move-exception v0

    goto/16 :goto_2
.end method
